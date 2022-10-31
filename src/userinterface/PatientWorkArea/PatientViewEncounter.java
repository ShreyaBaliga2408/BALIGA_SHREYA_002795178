/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PatientWorkArea;

import userinterface.SystemWorkArea.Encounters.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author Shreya Baliga
 */
public class PatientViewEncounter extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    PatientDirectory patientDirectory;
    String username;
    
    public PatientViewEncounter(String username, PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.username = username;
        populateEncountersData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncountersList = new javax.swing.JTable();

        setBackground(new java.awt.Color(191, 172, 224));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Encounters");

        tblEncountersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EncounterId", "Date", "Patient ID", "Doctor ID", "Blood Pressure", "Pulse", "Temperature"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncountersList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEncountersList;
    // End of variables declaration//GEN-END:variables

    
    private void populateEncountersData() {
        try{
   
            var patients = patientDirectory.getPatients();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "PatientID","EncounterID" ,"Encounter Date", "PatientName","DoctorID","Date Of Vitals", "Blood Pressure","Pulse","Temperature"}, 0);
            if(patients!=null && !patients.isEmpty())
            {
                
                for(Patient patient: patients){
                    int patientId=0;
                    int doctorId =0;
                    int encounterId =0;
                    String encounterDate = null;
                    String dateOfVitals = null;
                    String patientName=patient.getName();
                    
                    int bloodpressure = 0;
                    int pulse =0;
                    int temperature =0;
                    
                    System.out.println(patient.getPatientHistoryMap().entrySet());
                    
                    for (Map.Entry<Integer, EncounterHistory> pair : patient.getPatientHistoryMap().entrySet())
                    {
                        
                        patientId= pair.getKey();       
                        
                        if(username.equals(String.valueOf(pair.getKey()))){
                        
                            ArrayList<Encounter> encounters = pair.getValue().getPatientEncounterHistory();
                        
                        for(Encounter e: encounters){
                            encounterId = e.getEncounterId();
                         
                            VitalSigns vitalSigns = null;  
                            doctorId = e.getDoctorId();
                            Map<Date, VitalSigns> vitalSignMap = e.getPatientEncounter();
                            
                            for(Map.Entry m: vitalSignMap.entrySet()){  
                                            
                                 try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                    encounterDate = simpleDateFormat.format((Date)m.getKey());
                                } catch (Exception ex) {
                                    System.out.println("Date is null");
                                    System.out.println(ex);
                                }
                                
                                vitalSigns = (VitalSigns) m.getValue();
                            }

                            try {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                dateOfVitals = simpleDateFormat.format(vitalSigns.getDateOfVitals());
                             
                            } catch (Exception ex) {
                               System.out.println("Date is null");
                            }
                            
                            bloodpressure = vitalSigns.getBloodPressure();
                            pulse = vitalSigns.getPulse();
                            temperature = vitalSigns.getTemperature();
                            
                            model.addRow(new Object[]
                            {patientId,encounterId,encounterDate,patientName,doctorId,dateOfVitals,bloodpressure,pulse,temperature});
                            
                        }
                        
                        }
                        
                    } 
             
                }
                
            tblEncountersList.setModel(model);
            }
            
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
