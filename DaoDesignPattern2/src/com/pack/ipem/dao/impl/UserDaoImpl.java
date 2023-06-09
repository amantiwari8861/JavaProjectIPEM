package com.pack.ipem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pack.ipem.bean.User;
import com.pack.ipem.dao.ConnectionProvider;
import com.pack.ipem.dao.UserDao;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private Connection con = null;

    public UserDaoImpl() {
        con = ConnectionProvider.getConnection();
    }

    @Override
    public boolean addUser(User user) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into allusers values(?,?,?,?);");
            ps.setInt(1, user.getId());
            ps.setString(2, user.getName());
            ps.setDouble(3, user.getSalary());
            ps.setLong(4, user.getPhoneno());
//			System.out.println(ps);

            int status = ps.executeUpdate();
            return status > 0 ? true : false;
        } catch (SQLException e) {
            System.out.println("unable to insert data!");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from allusers;");
            ArrayList<User> usersList = new ArrayList<>();
            
            while (rs.next()) 
            {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString(2));
                user.setSalary(rs.getDouble(3));
                user.setPhoneno(rs.getLong(4));
                usersList.add(user);
            }
            return usersList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUser(User newuser) {

        try {
            PreparedStatement ps = con.prepareStatement("update allusers set name=?,salary=?,phone=? where id=?;");
            ps.setString(1, newuser.getName());
            ps.setDouble(2, newuser.getSalary());
            ps.setLong(3, newuser.getPhoneno());
            ps.setInt(4, newuser.getId());

            return (ps.executeUpdate() > 0) ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteUser(int id) {

        try {
            PreparedStatement ps = con.prepareStatement("delete from allusers where id=?;");
            ps.setInt(1, id);
            return (ps.executeUpdate() > 0) ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public User findUserById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User deleteUserByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }
}
