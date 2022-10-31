/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CommunityWorkArea;

import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Hospital;

/**
 *
 * @author Shreya Baliga*/
public class ViewCommunity extends javax.swing.JPanel {

    /**
     * Creates new form SystemViewHospital
     */
    Community community;
    public ViewCommunity(Community community) {
        initComponents();
        initCityCmbx();
        this.community = community;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSearchHospital = new javax.swing.JLabel();
        btnSearchHospital = new javax.swing.JButton();
        comboCity = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        communityListItems = new javax.swing.JList<>();

        setBackground(new java.awt.Color(0, 153, 153));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Community");

        lblSearchHospital.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchHospital.setText("View Community By City :");

        btnSearchHospital.setText("Search");
        btnSearchHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchHospitalMouseClicked(evt);
            }
        });
        btnSearchHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHospitalActionPerformed(evt);
            }
        });

        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        communityListItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(communityListItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(comboCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHospitalActionPerformed
        // TODO add your handling code here
        
//        populateDataByHospitalName();
    }//GEN-LAST:event_btnSearchHospitalActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCityActionPerformed

    private void btnSearchHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchHospitalMouseClicked
        // TODO add your handling code here:
        
        String city = (String) comboCity.getSelectedItem();
        this.community.getLstCommunity().forEach((cityName, communityList) ->{
            
            if(city.matches(cityName.toString())){
                
                Object data[][] = new Object[1][communityList.length];
                
                for(int i =0 ; i < communityList.length; i++){
                    System.out.println(communityList[i]);
                    data[0][i] = communityList[i];
                }
                
                
                communityListItems.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = communityList;
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });
            
            }
        });
    }//GEN-LAST:event_btnSearchHospitalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchHospital;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JList<String> communityListItems;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSearchHospital;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    
    
    private void initCityCmbx() {
       comboCity.removeAllItems();
       int count = 0;
        City[] cities = City.values();
        for (City city_ : cities) {
            comboCity.addItem(cities[count++].toString());
        }
        
        populateData();
    }

    private void populateData() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{ "Hospital Id"},0);
    }
}