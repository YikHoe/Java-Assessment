/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.project.ui.administrator;

import com.project.common.constants.UserRoleType;
import com.project.common.utils.Dialog;
import com.project.common.utils.JsonHandler;
import com.project.controller.IntakesController;
import com.project.controller.UserAccountController;
import org.json.simple.JSONObject;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.List;
import java.util.Random;

/**
 * add student - Admin
 * @author AU YIK HOE
 * @version 1.0, Last edited on 2024-05-20
 * @since 2024-05-01
 */
public class AddStudent extends javax.swing.JInternalFrame {
    int newId;
    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);

        setupForm();
    }

    public void setupForm() {
        List<String> intakeCodes = IntakesController.getUpToDateIntakeCodes();

        if (!intakeCodes.isEmpty()) {
            for (String intake : intakeCodes) {
                intakes.addItem(intake);
            }
        } else {
            Dialog.ErrorDialog("No available intakes found!\nPlease create new intakes to register students.");
        }

        newId = UserAccountController.getNewUserId();
    }

    public String randomGenerator(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        
        return sb.toString();  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        intakes = new javax.swing.JComboBox<>();
        password = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        generateBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1093, 695));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setEditable(false);
        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(1, 1, 1));
        username.setBorder(null);
        username.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        username.setFocusable(false);
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 290, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/student-registration-24.png"))); // NOI18N
        jLabel4.setText("NEW STUDENT");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 70));

        firstName.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        firstName.setForeground(new java.awt.Color(1, 1, 1));
        firstName.setBorder(null);
        firstName.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameKeyReleased(evt);
            }
        });
        jPanel1.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 290, 35));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("First Name :");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, 35));

        lastName.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        lastName.setForeground(new java.awt.Color(1, 1, 1));
        lastName.setBorder(null);
        lastName.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameKeyReleased(evt);
            }
        });
        jPanel1.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 290, 35));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last Name :");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 35));

        email.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(1, 1, 1));
        email.setBorder(null);
        email.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 290, 35));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email :");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 100, 35));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Intake Code :");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, 35));

        intakes.setBackground(new java.awt.Color(254, 254, 254));
        intakes.setFont(new java.awt.Font("Alibaba PuHuiTi M", 0, 12)); // NOI18N
        intakes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Intakes --" }));
        intakes.setToolTipText("d");
        intakes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        intakes.setFocusable(false);
        jPanel1.add(intakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 290, 35));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(1, 1, 1));
        password.setBorder(null);
        password.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        password.setFocusable(false);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 290, 35));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Password :");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 100, 35));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Username :");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, 35));

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel-24x24.png"))); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 110, 40));

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-24.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, 110, 40));

        generateBtn.setBackground(new java.awt.Color(153, 204, 255));
        generateBtn.setForeground(new java.awt.Color(0, 0, 0));
        generateBtn.setText("Generate");
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(generateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 90, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        
    }//GEN-LAST:event_usernameKeyReleased

    private void firstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyReleased
        String pmsEmail = "@pms.edu";

        String newUserEmail = firstName.getText().replace(" ", "").toLowerCase() + newId+ pmsEmail;
        email.setText(newUserEmail);
        String newUsername = firstName.getText().replace(" ", "") + newId;
        username.setText(newUsername);
    }//GEN-LAST:event_firstNameKeyReleased

    private void lastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyReleased
        String pmsEmail = "@pms.edu";

        String newUserEmail = firstName.getText().replace(" ", "").toLowerCase() + lastName.getText().replace(" ", "").toLowerCase() + newId + pmsEmail;
        email.setText(newUserEmail);
        String newUsername = firstName.getText().replace(" ", "") + lastName.getText().replace(" ", "") + newId;
        username.setText(newUsername);
    }//GEN-LAST:event_lastNameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyReleased

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        AdminGui.ButtonClicked("student");
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        if (!username.getText().isEmpty() && !firstName.getText().isEmpty() && !lastName.getText().isEmpty() && !password.getText().isEmpty() && !intakes.getSelectedItem().equals("-- Intakes --")) {
            JsonHandler newStudentJson = new JsonHandler();
            JSONObject newStudentObj = new JSONObject();
            newStudentObj.put("username", username.getText());
            newStudentObj.put("first_name", firstName.getText());
            newStudentObj.put("last_name", lastName.getText());
            newStudentObj.put("email", email.getText());
            newStudentObj.put("password", password.getText());
            newStudentObj.put("intake", intakes.getSelectedItem().toString());
            newStudentJson.setObject(newStudentObj);

            if (UserAccountController.addStudent(newStudentJson)) {
                Dialog.SuccessDialog("Student registered successfully!\nPlease send login credentials to student.\n\tUsername: " + username.getText() + "\n\tEmail: " + email.getText() + "\n\tPassword: " + password.getText());
                AdminGui.ButtonClicked("student");
            } else {
                Dialog.ErrorDialog("An unexpected error has occurred. Please contact technical department for this issue");
            }

        } else {
            Dialog.ErrorDialog("No empty fields are allowed! Check:\n1. Ensure password is generated\n2. Intake is selected\n3. No empty fields");
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtnActionPerformed
        password.setText(randomGenerator(15));
    }//GEN-LAST:event_generateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton generateBtn;
    private static javax.swing.JComboBox<String> intakes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
