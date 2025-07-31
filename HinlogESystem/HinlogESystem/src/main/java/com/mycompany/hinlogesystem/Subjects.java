/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

public class Subjects extends HinlogESystem {
    int subId, subUnits;
    String subCode, subDescription, subSchedule;
    
    Subjects(){
        connectDB();
    }
    
    public void connectDB(){
        DBConnect();
        StudentsForm form = new StudentsForm();
    }
    
    public void saveRecord(int id, int units, String code, String description, String schedule){
        String query = "insert into 1stSem_Sy2025_2026.subjects values(" + id + "," + units + ",'" + code + "','" + description + "','" + schedule +"');";
        
        try {
            st.executeUpdate(query);
            System.out.println("Insert Success");
        } catch (Exception ex){
            System.out.println("Failed to Insert: " + ex);
        }
    }
    
    public void deleteRecord(int id){
        String query = "delete from 1stSem_Sy2025_2026.subjects where subId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
        }
    }
    public void updateRecord(int id, int units, String code, String description, String schedule){
        String query = "UPDATE 1stSem_Sy2025_2026.subjects SET " +
               "subId = '" + id + "', " +
               "subUnits = '" + units + "', " +
               "subCode = '" + code + "', " +
               "subDescription = '" + description + "', " +
               "subSchedule = '" + schedule + "' " +
               "WHERE subId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Update Success");
        } catch (Exception ex){
            System.out.println("Failed to Update: " + ex);
        }
    }
}
