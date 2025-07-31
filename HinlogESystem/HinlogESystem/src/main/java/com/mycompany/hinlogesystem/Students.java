/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

public class Students extends HinlogESystem{
    int studId;
    String studName, studAddress, studContact, studCourse, studGender, studYrLvl;
    
    Students(){
        connectDB();
    }
    
    public void connectDB(){
        DBConnect();
        StudentsForm form = new StudentsForm();
    }
    
    public void saveRecord(int id, String name, String address, String contact, String course, String gender, String yrLvl){
        String query = "insert into 1stSem_Sy2025_2026.students values(" + id + ",'" + name + "','" + address + "','" + contact + "','" + course + "','" + gender + "','" + yrLvl + "');";
        
        try {
            st.executeUpdate(query);
            System.out.println("Insert Success");
        } catch (Exception ex){
            System.out.println("Failed to Insert: " + ex);
        }
    }
    
    public void deleteRecord(int id){
        String query = "delete from 1stSem_Sy2025_2026.students where studId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
        }
    }
    public void updateRecord(int id, String name, String address, String contact, String course, String gender, String yrLvl){
        String query = "UPDATE 1stSem_Sy2025_2026.students SET " +
               "studName = '" + name + "', " +
               "studAddress = '" + address + "', " +
               "studContact = '" + contact + "', " +
               "studCourse = '" + course + "', " +
               "studGender = '" + gender + "', " +
               "studYrLvl = '" + yrLvl + "' " +
               "WHERE studId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Update Success");
        } catch (Exception ex){
            System.out.println("Failed to Update: " + ex);
        }
    }
}
