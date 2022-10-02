/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author shreya baliga
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeHistory empHistory;
    Employee emp;
    public ViewJPanel(EmployeeHistory empHistory) {
        initComponents();
        this.empHistory=empHistory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_view = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPos = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtPos = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtGender = new javax.swing.JTextField();
        lblPic = new javax.swing.JLabel();
        jbtnSaveAfterUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnUpdatePicture = new javax.swing.JButton();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();

        setName("viewjpanel"); // NOI18N

        lbl_view.setText("                                                       VIEW THE EMPLOYEE DETAILS");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NAME:", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        lblName.setText("NAME:");

        lblId.setText("ID:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblDate.setText("DATE:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblGender.setText("GENDER:");

        lblLevel.setText("LEVEL:");

        lblTeamInfo.setText("TEAM INFO:");

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        lblPos.setText("POSITION TITLE:");

        lblAge.setText("AGE:");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPic.setText("PROFILE PICTURE:");

        jbtnSaveAfterUpdate.setText("SAVE");
        jbtnSaveAfterUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveAfterUpdateActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setText("SEARCH:");

        btnUpdatePicture.setText("UPDATE PICTURE");
        btnUpdatePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePictureActionPerformed(evt);
            }
        });

        lblContactNumber.setText("NUMBER:");

        lblEmailId.setText("EMAIL ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPic)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnUpdatePicture))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnSaveAfterUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnView)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete)
                                        .addGap(13, 13, 13)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPos)
                            .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPos))
                        .addGap(561, 561, 561))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtContactNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailId)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_view)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(jbtnSaveAfterUpdate)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePicture))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lblGender)
                        .addGap(29, 29, 29)
                        .addComponent(lblLevel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a row to view");
            return;
        }
        
        DefaultTableModel mod = (DefaultTableModel)table.getModel();
        
        Employee selectedemployee = (Employee)mod.getValueAt(selectedRowIndex,0);
        txtName.setText(selectedemployee.getName());
        txtId.setText(selectedemployee.getId());
        txtGender.setText(selectedemployee.getGender());
        txtAge.setText(Integer.toString(selectedemployee.getAge()));
         txtDate.setText(selectedemployee.getDate());
         txtLevel.setText(selectedemployee.getLevel());
         txtPos.setText(selectedemployee.getPosTitle());
         txtTeamInfo.setText(selectedemployee.getTeamInfo());
         txtContactNumber.setText(Long.toString(selectedemployee.getContactNumber()));
         txtEmailId.setText(selectedemployee.getEmailId());

         
         Image im =Toolkit.getDefaultToolkit().createImage(selectedemployee.getImage());
         im=im.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
         ImageIcon ii=new ImageIcon(im);
         lblPic.setIcon(ii);
         
       
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        
        DefaultTableModel mod = (DefaultTableModel)table.getModel();
        
        Employee selectedemployee = (Employee)mod.getValueAt(selectedRowIndex,0);
        empHistory.deleteEmployee(selectedemployee);
        
        JOptionPane.showMessageDialog(this,"Employee details deleted");
        txtName.setText("");
         txtId.setText("");
         txtAge.setText("");
         txtDate.setText("");
         txtLevel.setText("");
         txtPos.setText("");
         txtTeamInfo.setText("");
         txtGender.setText("");
         txtContactNumber.setText("");
         txtEmailId.setText("");
         
        populateTable();
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a row to Update");
            return;
        }
        
        DefaultTableModel mod = (DefaultTableModel)table.getModel();
        
        Employee selectedEmployee = (Employee)mod.getValueAt(selectedRowIndex,0);
        
    
        String name = txtName.getText();
        String id=txtId.getText();
        String age=(String)txtAge.getText();
        String gender=(String)txtGender.getText();
        String date=txtDate.getText();
        String level=txtLevel.getText();
        String position=txtPos.getText();
        String teaminfo=txtTeamInfo.getText();
        String contactNumber=txtContactNumber.getText();
        String emailId=txtEmailId.getText();
        //String image = emp.getImage();
        
        
        selectedEmployee.setName(name);
        selectedEmployee.setId(id);
        selectedEmployee.setAge(Integer.parseInt(age));
        selectedEmployee.setGender(gender);
        selectedEmployee.setDate(date);
        selectedEmployee.setLevel(level);
        selectedEmployee.setPosTitle(position);
        selectedEmployee.setTeamInfo(teaminfo);
        selectedEmployee.setContactNumber(Long.parseLong(contactNumber));
        selectedEmployee.setEmailId(emailId);
        //selectedEmployee.setImage(image);
        
//        for(Employee employee:empList)
//        {
//            if(employee.getId)
//            {
//            employee.setName(name);
//            employee.setId(id);
//            employee.setGender(gender);
//            employee.setDate(date);
//            employee.setAge(Integer.parseInt(age));
//            employee.setLevel(Integer.parseInt(level));
//            employee.setPos_title(position);
//            employee.setTeam_info(teaminfo);
//            }
//        }
        
        
         
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void jbtnSaveAfterUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveAfterUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a row to Update");
            return;
        }
        
        DefaultTableModel mod = (DefaultTableModel)table.getModel();
        
        Employee selectedEmployee = (Employee)mod.getValueAt(selectedRowIndex,0);
        
    
        String name = txtName.getText();
        String id=txtId.getText();
        String age=(String)txtAge.getText();
        String gender=(String)txtGender.getText();
        String date=txtDate.getText();
        String level=txtLevel.getText();
        String position=txtPos.getText();
        String teaminfo=txtTeamInfo.getText();
        String contactNumber=txtContactNumber.getText();
        String emailId=txtEmailId.getText();
       // String path = filePath;
        
        
        selectedEmployee.setName(name);
        selectedEmployee.setId(id);
        selectedEmployee.setAge(Integer.parseInt(age));
        selectedEmployee.setGender(gender);
        selectedEmployee.setDate(date);
        selectedEmployee.setLevel(level);
        selectedEmployee.setPosTitle(position);
        selectedEmployee.setTeamInfo(teaminfo);
         selectedEmployee.setContactNumber(Long.parseLong(contactNumber));
        selectedEmployee.setEmailId(emailId);
       // selectedEmployee.setImage(image);
       
        populateTable();
    }//GEN-LAST:event_jbtnSaveAfterUpdateActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel mod = (DefaultTableModel)table.getModel();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(mod);
//        table.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
        
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnUpdatePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePictureActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = table.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a row to Update");
            return;
        }
        
        DefaultTableModel mod = (DefaultTableModel)table.getModel();
        
        Employee selectedEmployee = (Employee)mod.getValueAt(selectedRowIndex,0);
        JFileChooser j = new JFileChooser();
        j.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter= new FileNameExtensionFilter("*.Images","jpg","gif");
        j.addChoosableFileFilter(filter);
        int r=j.showSaveDialog(null);
        if(r==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=j.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            selectedEmployee.setImage(path);
            lblPic.setIcon(ResizeImage(path));
        }
        else if(r==JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(this,"No file Selected");
        }
        
        
    }//GEN-LAST:event_btnUpdatePictureActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
         // TODO add your handling code here:
        DefaultTableModel mod = (DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(mod);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdatePicture;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnSaveAfterUpdate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblPos;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lbl_view;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel mod = (DefaultTableModel)table.getModel();
         mod.setRowCount(0);
         for(Employee emp:empHistory.getHistory())
         {
             Object[] row = new Object[12];
             row[0]=emp;
             row[1] = emp.getId();
             row[2] = emp.getAge();
             row[3]=emp.getGender();
             row[4] = emp.getLevel();
             row[5] = emp.getTeamInfo();
            row[6] = emp.getPosTitle();
            row[7] = emp.getDate();
            row[9]=emp.getImage();
            row[10]=emp.getContactNumber();
            row[11]=emp.getEmailId();
            
             mod.addRow(row);
             
         }
    }

    public ImageIcon ResizeImage(String path) {
       ImageIcon image= new ImageIcon(path);
       Image im= image.getImage();
       Image newimage=im.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
       ImageIcon img=new ImageIcon(newimage);
       return img;
    }

    
}
