/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

public class Teachers extends HinlogESystem{
    int teachId;
    String teachName, teachAddress, teachContact, teachEmail, teachDepartment;
    
    Teachers(){
        connectDB();
    }
    
    public void connectDB(){
        DBConnect();
        TeachersForm form = new TeachersForm();
    }
    
    public void saveRecord(int id, String name, String address, String contact, String email, String department){
        String query = "insert into 1stSem_Sy2025_2026.teachers values(" + id + ",'" + name + "','" + address + "','" + contact + "','" + email +"','" + department + "');";
        
        try {
            st.executeUpdate(query);
            System.out.println("Insert Success");
        } catch (Exception ex){
            System.out.println("Failed to Insert: " + ex);
        }
    }
    
    public void deleteRecord(int id){
        String query = "delete from 1stSem_Sy2025_2026.teachers where teachId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
        }
    }
    public void updateRecord(int id, String name, String address, String contact, String email, String department){
        String query = "UPDATE 1stSem_Sy2025_2026.teachers SET " +
               "teachId = '" + id + "', " +
               "teachName = '" + name + "', " +
               "teachAddress = '" + address + "', " +
               "teachContact = '" + contact + "', " +
               "teachEmail = '" + email + "', " +
               "teachDepartment = '" + department + "' " +
               "WHERE teachId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Update Success");
        } catch (Exception ex){
            System.out.println("Failed to Update: " + ex);
        }
    }
}
