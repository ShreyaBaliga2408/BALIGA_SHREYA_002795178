package ui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import model.Sys;

/**
 *
 * @author  Shreya Baliga
 */
public class HomeScreen extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private Sys sys;
    HomePanel homePanel;
    public HomeScreen(JPanel userProcessContainer,Sys sys,HomePanel homePanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.sys = sys;
        this.homePanel = homePanel;
        setSize(1040, 544);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAddPatient = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblAddEncounter = new javax.swing.JLabel();
        lblAddPerson1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");

        lblAddPatient.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblAddPatient.setText("Add patient");
        lblAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddPatientMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddPatientMousePressed(evt);
            }
        });

        lblDashboard.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("Encounter Histories");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDashboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDashboardMousePressed(evt);
            }
        });

        lblAddEncounter.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblAddEncounter.setForeground(new java.awt.Color(255, 255, 255));
        lblAddEncounter.setText("Add Encounter");
        lblAddEncounter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddEncounterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddEncounterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddEncounterMousePressed(evt);
            }
        });

        lblAddPerson1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblAddPerson1.setForeground(new java.awt.Color(255, 255, 255));
        lblAddPerson1.setText("Communities");
        lblAddPerson1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddPerson1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddPerson1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddPerson1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddPerson1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddPerson1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/AED_ASS_4_logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPatientMouseEntered
        // TODO add your handling code here:
        lblAddPatient.setForeground(Color.black);
    }//GEN-LAST:event_lblAddPatientMouseEntered

    private void lblAddPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPatientMouseExited
        // TODO add your handling code here:
        lblAddPatient.setForeground(Color.white);
    }//GEN-LAST:event_lblAddPatientMouseExited

    private void lblDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseEntered
        // TODO add your handling code here:
        lblDashboard.setForeground(Color.black);
    }//GEN-LAST:event_lblDashboardMouseEntered

    private void lblDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseExited
        // TODO add your handling code here:
        lblDashboard.setForeground(Color.white);
    }//GEN-LAST:event_lblDashboardMouseExited

    private void lblAddEncounterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddEncounterMouseEntered
        // TODO add your handling code here:
        lblAddEncounter.setForeground(Color.black);
    }//GEN-LAST:event_lblAddEncounterMouseEntered

    private void lblAddEncounterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddEncounterMouseExited
        // TODO add your handling code here:
        lblAddEncounter.setForeground(Color.white);
    }//GEN-LAST:event_lblAddEncounterMouseExited

    private void lblAddPatientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPatientMousePressed
        // TODO add your handling code here:
        homePanel.clickPatient(this);
    }//GEN-LAST:event_lblAddPatientMousePressed

    private void lblAddEncounterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddEncounterMousePressed
        // TODO add your handling code here:
        homePanel.clickAddEncounter(this);
    }//GEN-LAST:event_lblAddEncounterMousePressed

    private void lblDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMousePressed
        // TODO add your handling code here:
        
        homePanel.clickDashboard(this);
    }//GEN-LAST:event_lblDashboardMousePressed

    private void lblAddPerson1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPerson1MouseEntered
        // TODO add your handling code here:
        lblAddPerson1.setForeground(Color.black);
        
    }//GEN-LAST:event_lblAddPerson1MouseEntered

    private void lblAddPerson1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPerson1MouseExited
        // TODO add your handling code here:
        lblAddPerson1.setForeground(Color.white);
    }//GEN-LAST:event_lblAddPerson1MouseExited

    private void lblAddPerson1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPerson1MousePressed
        // TODO add your handling code here:
        homePanel.clickTerritories(this);
    }//GEN-LAST:event_lblAddPerson1MousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddEncounter;
    private javax.swing.JLabel lblAddPatient;
    private javax.swing.JLabel lblAddPerson1;
    private javax.swing.JLabel lblDashboard;
    // End of variables declaration//GEN-END:variables

    
}
