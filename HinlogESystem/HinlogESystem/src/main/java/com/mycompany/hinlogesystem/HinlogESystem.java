package com.mycompany.hinlogesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class HinlogESystem {
    
    static Connection con;
    static Statement st;
    static ResultSet rs;
    
    static String db;
    static String uname;
    static String pswd;

    public static void main(String[] args) {
        StudentsForm form = new StudentsForm();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    }  
    
    public static void DBConnect(){
        db = "1stSem_Sy2025_2026";
        uname = "root";
        pswd = "@Lemeosa1221";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL", uname, pswd);
            st = con.createStatement();
            System.out.println("Connected");
        } catch (Exception ex){
            System.out.println("Failed to Connect" + ex);
        }
    }
}
