/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hinlogesystem;

/**
 *
 * @author khenshi
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class HinlogESystem {
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    String db;
    String uname;
    String pswd;

    public static void main(String[] args) {
        StudentForm form = new StudentForm();
        form.setVisible(true);
        
    }  
    
    public void DBConnect(){
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
