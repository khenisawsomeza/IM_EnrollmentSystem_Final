/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hinlogesystem;

import javax.swing.table.DefaultTableModel;

public class StudentsForm extends javax.swing.JFrame {

    public StudentsForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        studId = new javax.swing.JTextField();
        studName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        studCourse = new javax.swing.JTextField();
        studGender = new javax.swing.JTextField();
        studYrLvl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        studContact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        teacherMenu = new javax.swing.JMenu();
        teachMenu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        subMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student ID");

        studAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Address");

        studId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        studName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        studCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        studGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        studYrLvl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Year Level");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Gender");

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.setToolTipText("");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        studContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Contact");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studYrLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studContact, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studYrLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("STUDENT REGISTRATION");

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Address", "Contact", "Course", "Gender", "Year Level"
            }
        ));
        studentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentsTable);

        jMenuBar1.setBackground(new java.awt.Color(59, 89, 152));

        teacherMenu.setForeground(new java.awt.Color(255, 255, 255));
        teacherMenu.setText("MENU");

        teachMenu.setText("Teachers");
        teachMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachMenuActionPerformed(evt);
            }
        });
        teacherMenu.add(teachMenu);
        teacherMenu.add(jSeparator2);

        subMenu.setText("Subjects");
        subMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuActionPerformed(evt);
            }
        });
        teacherMenu.add(subMenu);
        teacherMenu.add(jSeparator1);

        jMenuBar1.add(teacherMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Students student = new Students();
        student.deleteRecord(Integer.valueOf(studId.getText()));
        showRecords();
        resetFields();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Students student = new Students();
        student.saveRecord(Integer.valueOf(studId.getText()), studName.getText(), studAddress.getText(), studContact.getText(), studCourse.getText(), studGender.getText(), studYrLvl.getText());
        showRecords();
        resetFields();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Students student = new Students();
        student.updateRecord(Integer.valueOf(studId.getText()), studName.getText(), studAddress.getText(), studContact.getText(), studCourse.getText(), studGender.getText(), studYrLvl.getText());
        showRecords();
        resetFields();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Students student = new Students();
        showRecords();
    }//GEN-LAST:event_formWindowOpened
    
    private void studentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsTableMouseClicked
        int row = studentsTable.getSelectedRow();
        
        studId.setText(studentsTable.getValueAt(row, 0).toString());
        studName.setText(studentsTable.getValueAt(row, 1).toString());
        studAddress.setText(studentsTable.getValueAt(row, 2).toString());
        studContact.setText(studentsTable.getValueAt(row, 3).toString());
        studCourse.setText(studentsTable.getValueAt(row, 4).toString());
        studGender.setText(studentsTable.getValueAt(row, 5).toString());
        studYrLvl.setText(studentsTable.getValueAt(row, 6).toString());
    }//GEN-LAST:event_studentsTableMouseClicked

    private void teachMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachMenuActionPerformed
        TeachersForm Tform = new TeachersForm();
        Tform.setVisible(true);
        Tform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_teachMenuActionPerformed

    private void subMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuActionPerformed
        SubjectsForm Suform = new SubjectsForm();
        Suform.setVisible(true);
        Suform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_subMenuActionPerformed

    public void resetFields(){
        studId.setText(null);
        studName.setText(null);
        studAddress.setText(null);
        studContact.setText(null);
        studCourse.setText(null);
        studGender.setText(null);
        studYrLvl.setText(null);
    }
    
    public void showRecords(){
        DefaultTableModel tblmodel = (DefaultTableModel) studentsTable.getModel();
        tblmodel.setRowCount(0);
        HinlogESystem system = new HinlogESystem();
        system.DBConnect();
        
        try{
            String query = "select * from 1stSem_Sy2025_2026.students;";
            system.rs = system.st.executeQuery(query);
            while (system.rs.next())
            {
                String id = system.rs.getString("studid");
                String name = system.rs.getString("studName");
                String add = system.rs.getString("studAddress");
                String cont = system.rs.getString("studContact");
                String course = system.rs.getString("studCourse");
                String gend = system.rs.getString("studGender");
                String yr = system.rs.getString("studYrLvl");
                
                String[] item = {id, name, add, cont, course, gend, yr};
                tblmodel.addRow(item);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField studAddress;
    private javax.swing.JTextField studContact;
    private javax.swing.JTextField studCourse;
    private javax.swing.JTextField studGender;
    private javax.swing.JTextField studId;
    private javax.swing.JTextField studName;
    private javax.swing.JTextField studYrLvl;
    private javax.swing.JTable studentsTable;
    private javax.swing.JMenuItem subMenu;
    private javax.swing.JMenuItem teachMenu;
    private javax.swing.JMenu teacherMenu;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
