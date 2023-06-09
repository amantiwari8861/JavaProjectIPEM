package com.ipem.main;

import com.formdev.flatlaf.IntelliJTheme;
import com.pack.ipem.ui.AddUser;
import com.pack.ipem.ui.AllUsers;
import com.pack.ipem.ui.HomePage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFile {

    public static void main(String[] args) {
        try {
//            UIManager.setLookAndFeel( new FlatDarculaLaf());
            IntelliJTheme.setup(AddUser.class.getResourceAsStream("/Xcode-Dark.theme.json"));
//            WebLookAndFeel.install ();
        } catch (Exception e) {
            e.printStackTrace();
        }
         new HomePage(0).setVisible(true);
    }
}
