/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hinlogesystem;

import javax.swing.table.DefaultTableModel;

public class SubjectsForm extends javax.swing.JFrame {

    public SubjectsForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        subId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        subSchedule = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        subDescription = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        subUnits = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        studMenu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        teachMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(833, 441));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("SUBJECTS FORM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Subject ID");

        subCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Code");

        subId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Units");

        subSchedule.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Schedule");

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

        subDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Description");

        subUnits.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subCode, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(subId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(subUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subject ID", "Units", "Code", "Description", "Schedule"
            }
        ));
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjectTable);

        jMenuBar1.setBackground(new java.awt.Color(59, 89, 152));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("MENU");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        studMenu.setText("Students");
        studMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studMenuActionPerformed(evt);
            }
        });
        jMenu1.add(studMenu);
        jMenu1.add(jSeparator3);

        teachMenu.setText("Teachers");
        teachMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachMenuActionPerformed(evt);
            }
        });
        jMenu1.add(teachMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studMenuActionPerformed
        StudentsForm form = new StudentsForm();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_studMenuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void teachMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachMenuActionPerformed
        TeachersForm form = new TeachersForm();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_teachMenuActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Subjects subject = new Subjects();
        subject.deleteRecord(Integer.valueOf(subId.getText()));
        showRecords();
        resetFields();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Subjects subject = new Subjects();
        subject.saveRecord(Integer.valueOf(subId.getText()), Integer.valueOf(subUnits.getText()), subCode.getText(), subDescription.getText(), subSchedule.getText());
        showRecords();
        resetFields();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Subjects subject = new Subjects();
        subject.updateRecord(Integer.valueOf(subId.getText()), Integer.valueOf(subUnits.getText()), subCode.getText(), subDescription.getText(), subSchedule.getText());
        showRecords();
        resetFields();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Subjects subject = new Subjects();
        showRecords();
    }//GEN-LAST:event_formWindowOpened

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectTableMouseClicked
        int row = subjectTable.getSelectedRow();

        subId.setText(subjectTable.getValueAt(row, 0).toString());
        subUnits.setText(subjectTable.getValueAt(row, 1).toString());
        subCode.setText(subjectTable.getValueAt(row, 2).toString());
        subDescription.setText(subjectTable.getValueAt(row, 3).toString());
        subSchedule.setText(subjectTable.getValueAt(row, 4).toString());
    }//GEN-LAST:event_subjectTableMouseClicked
    
    public void resetFields(){
        subId.setText(null);
        subUnits.setText(null);
        subCode.setText(null);
        subDescription.setText(null);
        subSchedule.setText(null);
    }
    
    public void showRecords(){
        DefaultTableModel tblmodel = (DefaultTableModel) subjectTable.getModel();
        tblmodel.setRowCount(0);
        HinlogESystem system = new HinlogESystem();
        system.DBConnect();
        
        try{
            String query = "select * from 1stSem_Sy2025_2026.subjects;";
            system.rs = system.st.executeQuery(query);
            while (system.rs.next())
            {
                String id = system.rs.getString("subId");
                String units = system.rs.getString("subUnits");
                String code = system.rs.getString("subCode");
                String desc = system.rs.getString("subDescription");
                String sched = system.rs.getString("subSchedule");

                String[] item = {id, units, code, desc, sched};
                tblmodel.addRow(item);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton saveButton;
    private javax.swing.JMenuItem studMenu;
    private javax.swing.JTextField subCode;
    private javax.swing.JTextField subDescription;
    private javax.swing.JTextField subId;
    private javax.swing.JTextField subSchedule;
    private javax.swing.JTextField subUnits;
    private javax.swing.JTable subjectTable;
    private javax.swing.JMenuItem teachMenu;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
