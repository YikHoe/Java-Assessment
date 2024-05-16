/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.project.ui.administrator;

import com.project.common.utils.DateTimeUtils;
import com.project.common.utils.Dialog;
import com.project.common.utils.JsonHandler;
import com.project.controller.IntakesController;
import com.project.controller.ProjectModuleController;
import com.project.controller.UserAccountController;
import org.json.simple.JSONObject;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dell Technologies
 */
public class intakeManagement extends javax.swing.JInternalFrame {
    List<String> modules = new ArrayList<>();
    String selectedModule1, selectedModule2, selectedModule3, selectedModule4, newIntake, intakeStartDate, intakeEndDate;

    /**
     * Creates new form intakeManagement
     */
    public intakeManagement() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        initForm();
    }
    
    private void initForm() {
        intakeCode.setEnabled(false);
        datePicker1.setEnabled(false);
        datePicker2.setEnabled(false);
        backBtn1.setEnabled(false);
        backBtn2.setEnabled(false);
        nextBtn2.setEnabled(false);
        saveBtn.setEnabled(false);

        JsonHandler PMs = UserAccountController.getPMs();
        for (int i = 0; i < PMs.getAll().size(); i++) {
            String projectManager = PMs.getObject(i).get("first_name") + " " + PMs.getObject(i).get("last_name") + "-" + PMs.getObject(i).get("id");
            PM1.addItem(projectManager);
            PM2.addItem(projectManager);
            PM3.addItem(projectManager);
            PM4.addItem(projectManager);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        module3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PM3 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        module1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        PM1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        module4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        PM4 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        module2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        PM2 = new javax.swing.JComboBox<>();
        nextBtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        intakeCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nextBtn2 = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        backBtn1 = new javax.swing.JButton();
        backBtn2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1093, 695));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-properties-24.png"))); // NOI18N
        jLabel5.setText("NEW MODULES");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 35));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bill-24x24.png"))); // NOI18N
        jLabel10.setText("Module 3");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/officer-24x24.png"))); // NOI18N
        jLabel6.setText("Project Manager :");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 35));

        module3.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        module3.setForeground(new java.awt.Color(1, 1, 1));
        module3.setBorder(null);
        module3.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        module3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                module3KeyReleased(evt);
            }
        });
        jPanel5.add(module3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 35));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/document-24.png"))); // NOI18N
        jLabel12.setText("Module Name :");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setOpaque(true);
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 35));

        PM3.setBackground(new java.awt.Color(254, 254, 254));
        PM3.setFont(new java.awt.Font("Alibaba PuHuiTi M", 0, 12)); // NOI18N
        PM3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Project Managers --" }));
        PM3.setToolTipText("Select Project Manager");
        PM3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PM3.setFocusable(false);
        jPanel5.add(PM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, 35));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 440, 240));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bill-24x24.png"))); // NOI18N
        jLabel13.setText("Module 1");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/officer-24x24.png"))); // NOI18N
        jLabel14.setText("Project Manager :");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 35));

        module1.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        module1.setForeground(new java.awt.Color(1, 1, 1));
        module1.setBorder(null);
        module1.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        module1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                module1KeyReleased(evt);
            }
        });
        jPanel6.add(module1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 35));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/document-24.png"))); // NOI18N
        jLabel15.setText("Module Name :");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 35));

        PM1.setBackground(new java.awt.Color(254, 254, 254));
        PM1.setFont(new java.awt.Font("Alibaba PuHuiTi M", 0, 12)); // NOI18N
        PM1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Project Managers --" }));
        PM1.setToolTipText("Select Project Manager");
        PM1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PM1.setFocusable(false);
        jPanel6.add(PM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, 35));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 440, 240));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bill-24x24.png"))); // NOI18N
        jLabel16.setText("Module 4");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/officer-24x24.png"))); // NOI18N
        jLabel17.setText("Project Manager :");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setOpaque(true);
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 35));

        module4.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        module4.setForeground(new java.awt.Color(1, 1, 1));
        module4.setBorder(null);
        module4.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        module4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                module4KeyReleased(evt);
            }
        });
        jPanel7.add(module4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 35));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/document-24.png"))); // NOI18N
        jLabel18.setText("Module Name :");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setOpaque(true);
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 35));

        PM4.setBackground(new java.awt.Color(254, 254, 254));
        PM4.setFont(new java.awt.Font("Alibaba PuHuiTi M", 0, 12)); // NOI18N
        PM4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Project Managers --" }));
        PM4.setToolTipText("Select Project Manager");
        PM4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PM4.setFocusable(false);
        jPanel7.add(PM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, 35));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 440, 240));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bill-24x24.png"))); // NOI18N
        jLabel19.setText("Module 2");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/officer-24x24.png"))); // NOI18N
        jLabel20.setText("Project Manager :");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.setOpaque(true);
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 35));

        module2.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        module2.setForeground(new java.awt.Color(1, 1, 1));
        module2.setBorder(null);
        module2.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        module2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                module2KeyReleased(evt);
            }
        });
        jPanel8.add(module2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 35));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/document-24.png"))); // NOI18N
        jLabel21.setText("Module Name :");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.setOpaque(true);
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 35));

        PM2.setBackground(new java.awt.Color(254, 254, 254));
        PM2.setFont(new java.awt.Font("Alibaba PuHuiTi M", 0, 12)); // NOI18N
        PM2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Project Managers --" }));
        PM2.setToolTipText("Select Project Manager");
        PM2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PM2.setFocusable(false);
        jPanel8.add(PM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, 35));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 440, 240));

        nextBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/forward-button-24.png"))); // NOI18N
        nextBtn1.setText("Next");
        nextBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        nextBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtn1MouseClicked(evt);
            }
        });
        jPanel2.add(nextBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, 110, 40));

        jTabbedPane1.addTab("Modules", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        intakeCode.setFont(new java.awt.Font("Alibaba PuHuiTi R", 0, 12)); // NOI18N
        intakeCode.setBorder(null);
        intakeCode.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        intakeCode.setForeground(new java.awt.Color(1, 1, 1));
        intakeCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                intakeCodeKeyReleased(evt);
            }
        });
        jPanel3.add(intakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 290, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/new-copy-24.png"))); // NOI18N
        jLabel1.setText("NEW INTAKE");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 35));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 10, 630));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendar-24x24.png"))); // NOI18N
        jLabel2.setText("Start Date :");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 35));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendar-24x24.png"))); // NOI18N
        jLabel3.setText(" End Date :");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 35));

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save-24.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });
        jPanel3.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 110, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Intake Code :");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 100, 35));

        nextBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/forward-button-24.png"))); // NOI18N
        nextBtn2.setText("Next");
        nextBtn2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        nextBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtn2MouseClicked(evt);
            }
        });
        jPanel3.add(nextBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 110, 40));
        jPanel3.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 290, 35));
        jPanel3.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 290, 35));

        backBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back-arrow-24.png"))); // NOI18N
        backBtn1.setText("Back");
        backBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtn1MouseClicked(evt);
            }
        });
        jPanel3.add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 110, 40));

        backBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back-arrow-24.png"))); // NOI18N
        backBtn2.setText("Back");
        backBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtn2MouseClicked(evt);
            }
        });
        jPanel3.add(backBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 630));

        jTabbedPane1.addTab("Intakes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtn2MouseClicked
        String newIntakeCode = intakeCode.getText();
        LocalDate startDate = datePicker2.getDate();
        LocalDate endDate = datePicker1.getDate();

        if (newIntakeCode.equals("") || startDate == null || endDate == null) {
            Dialog.ErrorDialog("No empty fields are allowed!");
        } else {
            if (IntakesController.validateNewIntakeCode(newIntakeCode) && ChronoUnit.YEARS.between(startDate, endDate) >= 1) {
                newIntake = newIntakeCode;
                intakeStartDate = DateTimeUtils.formatStrDate(startDate);
                intakeEndDate = DateTimeUtils.formatStrDate(endDate);

                modules = ProjectModuleController.getModulesCode();

                List<String> tmpList = new ArrayList<>(modules);
                for (String m : tmpList) {
                    PM3.addItem(m);
                }

                intakeCode.setEnabled(false);
                datePicker1.setEnabled(false);
                datePicker2.setEnabled(false);
                nextBtn2.setEnabled(false);
                PM3.setEnabled(true);
                saveBtn.setEnabled(true);
                backBtn1.setEnabled(true);
            } else if (!IntakesController.validateNewIntakeCode(newIntakeCode)) {
                Dialog.ErrorDialog("\"" + newIntakeCode + "\"" + " already exists!");
            } else {
                Dialog.ErrorDialog("The period between start date and end date must be at least 1 year");
            }

        }
    }//GEN-LAST:event_nextBtn2MouseClicked

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        if (selectedModule1 != null && selectedModule2 != null && selectedModule3 != null && selectedModule4 != null) {
            List<String> modules = new ArrayList<>();
            modules.add(selectedModule1);
            modules.add(selectedModule2);
            modules.add(selectedModule3);
            modules.add(selectedModule4);

            JSONObject newIntakeObj = new JSONObject();
            newIntakeObj.put("intakeCode", newIntake);
            newIntakeObj.put("modules", String.join(",", modules));
            newIntakeObj.put("startDate", intakeStartDate);
            newIntakeObj.put("endDate", intakeEndDate);

            System.out.println(newIntakeObj);
        } else {
            Dialog.ErrorDialog("All modules are required!");
        }


    }//GEN-LAST:event_saveBtnMouseClicked

    private void intakeCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_intakeCodeKeyReleased
        intakeCode.setText(intakeCode.getText().toUpperCase());
    }//GEN-LAST:event_intakeCodeKeyReleased

    private void backBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtn1MouseClicked
        
    }//GEN-LAST:event_backBtn1MouseClicked

    private void module3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_module3KeyReleased
        module3.setText(module3.getText().toUpperCase());
    }//GEN-LAST:event_module3KeyReleased

    private void module1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_module1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_module1KeyReleased

    private void module4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_module4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_module4KeyReleased

    private void module2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_module2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_module2KeyReleased

    private void nextBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtn1MouseClicked
        JsonHandler assignedModules = new JsonHandler();
        JSONObject moduleObj = new JSONObject();
    }//GEN-LAST:event_nextBtn1MouseClicked

    private void backBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtn2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PM1;
    private static javax.swing.JComboBox<String> PM2;
    private static javax.swing.JComboBox<String> PM3;
    private static javax.swing.JComboBox<String> PM4;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton backBtn2;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JTextField intakeCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField module1;
    private javax.swing.JTextField module2;
    private javax.swing.JTextField module3;
    private javax.swing.JTextField module4;
    private javax.swing.JButton nextBtn1;
    private javax.swing.JButton nextBtn2;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
