package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import com.darwinsys.sql.ConnectionUtil;
import com.darwinsys.sql.SQLUtils;

/**
 * Set autoCommit(false), make some changes,
 * then sleep for a while to allow you to examine
 * the state of a given database while transactions
 * are pending but uncommitted (e.g., to test whether
 * a database product's dump facility includes
 * uncommitted stuff)
 */
public class ManualTransactionCommit {

	public static void main(String[] av) throws Throwable {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	    try {

			System.out.println("Getting Connection");
			conn = ConnectionUtil.getConnection("ecom");

			// Turn off auto-commit
			conn.setAutoCommit(false);

			// Any warnings generated by the connect?
			checkForWarning(conn.getWarnings());

			System.out.println("Creating Statement");
			stmt = conn.createStatement();

			System.out.println("Creating table");
			stmt.executeUpdate(
					"create table test (id int, name varchar)");

			System.out.println("Executing Insert");
			stmt.executeUpdate(
					"insert into test values(42, 'ian');");

			System.out.println("Sleeping...");
			Thread.sleep(60 * 1000);

			System.out.println("** Committing **");
			conn.commit();

			System.out.println("Re-reading table");
			rs = stmt.executeQuery("select * from test");
			int i = 0;
			while (rs.next()) {

				System.out.println("Retrieving ID");
				int x = rs.getInt(1);
				System.out.println("Retrieving Name");
				String s = rs.getString(2);

				System.out.println("ROW " + ++i + ": " +
					x + "; " + s + "; " + ".");
			}

			System.out.println("Removing table");
			stmt.executeUpdate("drop table test");
	    } finally {
			SQLUtils.cleanup(rs, stmt, conn);

	    }
	}

	// Format and print any warnings from the connection
	private static void checkForWarning(SQLWarning warn) throws SQLException  {

	     // If a SQLWarning object was given, display the
	     // warning messages.  Note that there could be
	     // multiple warnings chained together

	     if (warn != null) {
		     System.out.println("*** Warning ***\n");
		     while (warn != null) {
			     System.out.println("SQLState: " +
				     warn.getSQLState());
			     System.out.println("Message:  " +
				     warn.getMessage());
			     System.out.println("Vendor:   " +
				     warn.getErrorCode());
			     System.out.println("");
			     warn = warn.getNextWarning();
		     }
	     }
     }
}
