/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;


import java.io.File;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import model.Employee;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import model.EmployeeHistory;



/**
 *
 * @author shreya baliga
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistory empHistory;
    String filePath="";
    public CreateJPanel(EmployeeHistory empHistory) {
        initComponents();
        
       this.empHistory= empHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreate = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPos = new javax.swing.JLabel();
        txtPos = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jCmbBox = new javax.swing.JComboBox<>();
        lbl_profile = new javax.swing.JLabel();
        btn_choosefile = new javax.swing.JButton();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();

        lblCreate.setText("                                                                                                             CREATE");

        lblName.setText("NAME:");

        lblId.setText("EMPLOYEE ID:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        lblAge.setText("AGE:");

        lblGender.setText("GENDER:");

        lblLevel.setText("LEVEL:");

        lblTeamInfo.setText("TEAM INFO:");

        lblPos.setText("POSITION TITLE:");

        lblDate.setText("DATE:");

        jCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Gender", "FEMALE", "MALE", "OTHER" }));
        jCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbBoxActionPerformed(evt);
            }
        });

        lbl_profile.setText("PROFILE PICTURE:");

        btn_choosefile.setText("Choose picture");
        btn_choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choosefileActionPerformed(evt);
            }
        });

        lblContactNumber.setText("NUMBER:");

        jLabel1.setText("EMAIL ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_save)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPos)
                                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(jCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_choosefile, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 257, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCreate)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblId)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(jCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeamInfo)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPos)
                            .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_save)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_choosefile)
                        .addGap(377, 377, 377))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        Employee emp = empHistory.addnewEmployee();
        String name = txtName.getText();
        if ((name.equals("")) || (!name.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))) {  
            JOptionPane.showMessageDialog(this, "Enter the valid name");
            return;
        }
        
        String id=txtId.getText();
        if (!id.matches("^[a-zA-Z0-9_]*$")) {
            JOptionPane.showMessageDialog(this, "Enter a valid Id");
            return;
        }
        
        String age=txtAge.getText();
        if (!age.matches("^(?:[1-9][0-9]?|1[01][0-9]|120)$")){
            JOptionPane.showMessageDialog(this, "Enter a valid age between 0 to 120");
            return;
        }
       
        String gender=(String)jCmbBox.getSelectedItem();
        String date=txtDate.getText();
        if(!date.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])")) {
            JOptionPane.showMessageDialog(this, "Enter a valid Date");
            return;
        }
        
        String level=(String)txtLevel.getText();
        if (!level.matches("^[a-zA-Z0-9_]*$")) {
            JOptionPane.showMessageDialog(this, "Enter a valid Designation");
            return;
        }
        
        String position=txtPos.getText();
        if (!position.matches("^[A-Za-z]+$")) {
            JOptionPane.showMessageDialog(this, "Enter a valid Position");
            return;
        }
        
        String teamInfo=txtTeamInfo.getText();
        if (!teamInfo.matches("^[A-Za-z]+$")) {
            JOptionPane.showMessageDialog(this, "Enter a valid Team Information");
            return;
        }
        
        String path=filePath;
  
        String contactNumber=txtContactNumber.getText();
        if (!contactNumber.matches("^(\\+\\d{1,3}[-\\s]{1}?)?\\d{10}$")){
            JOptionPane.showMessageDialog(this, "Enter a valid Contact Information");
            return;
        }
        
        String emailId=txtEmailId.getText();
        if (!emailId.matches("^\\S+@\\S+$")){
            JOptionPane.showMessageDialog(this, "Enter a valid email-Id");
            return;
        }
        
        emp.setName(name);
        emp.setId(id);
        emp.setAge(Integer.parseInt(age));
        emp.setDate(date);
        emp.setLevel(level);
        emp.setPosTitle(position);
        emp.setTeamInfo(teamInfo);
        emp.setGender(gender);
        emp.setImage(path);
        emp.setContactNumber(Long.parseLong(contactNumber));
        emp.setEmailId(emailId);
        
        
        //JOptionPane.showMessageDialog(this, "saved successfully","SAVE", HEIGHT);
         txtName.setText("");
         txtId.setText("");
         jCmbBox.setSelectedIndex(0);
         txtAge.setText("");
         txtDate.setText("");
         txtLevel.setText("");
         txtPos.setText("");
         txtTeamInfo.setText("");
         txtContactNumber.setText("");
         txtEmailId.setText("");
         
         //lbl_picture.setText("");
//        emphist.setName(txtName.getText());
//       emphist.setId(txtId.getText());
       
       JOptionPane.showMessageDialog(this, "saved successfully","SAVE", HEIGHT);
       
    }//GEN-LAST:event_btn_saveActionPerformed

    private void jCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbBoxActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jCmbBoxActionPerformed

    private void btn_choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choosefileActionPerformed
        // TODO add your handling code here:
         filePath = retrieveImage();
//        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
//        int r = j.showOpenDialog(null);
//        j.addChoosableFileFilter(new ImageFilter());
//            j.setAcceptAllFileFilterUsed(false);
//        
//        if (r == JFileChooser.APPROVE_OPTION) {
//                // set the label to the path of the selected directory
//                File file = j.getSelectedFile();
//                lbl_picture.setText("File Selected: " + file.getName());
//            }
//            // if the user cancelled the operation
//            else
//                lbl_picture.setText("the user cancelled the operation");
//        
    }//GEN-LAST:event_btn_choosefileActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
//        String name=txtName.getText();
//        if((name.matches("^[a-zA-Z{0,30}]$"))||(name.equals(" ")) )
//                {                      
//                    return;
//                }
//        else{
//             JOptionPane.showMessageDialog(this,"Please enter a valid character");
//             return;
//        }
//        
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
//     private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)
//     {
//         emp.setName(txtName.getText());
//     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_choosefile;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> jCmbBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPos;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lbl_profile;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

   public String retrieveImage()
   {
     JFileChooser j = new JFileChooser();
     j.showOpenDialog(null);
    // j.addChoosableFileFilter(new ImageFilter());
    
    
     File file=j.getSelectedFile();
     String path=file.getAbsolutePath();
     return path;  
   }
}

