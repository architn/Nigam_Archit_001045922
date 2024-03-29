/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.AppConstants;
import model.CarProfile;
import model.CarRecords;

/**
 *
 * @author architnigam
 */

public class SearchByManufactureYear extends javax.swing.JPanel {

    /**
     * Creates new form SearchByManufactureYear
     */
    CarRecords carRecords;
    AppConstants AppConstants = new AppConstants();
    public SearchByManufactureYear(CarRecords carRecords) {
        initComponents();
        this.carRecords = carRecords;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManufactureYear = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JYearChooser();
        btnSearch = new javax.swing.JButton();
        lblNoRecordsFound = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManufactureYears = new javax.swing.JTable();

        lblManufactureYear.setText("Manufacture Year:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblManufactureYears.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Driver Name", "Car Name", "Vehicle Number", "Availability", "Location", "Maximum Capacity"
            }
        ));
        jScrollPane1.setViewportView(tblManufactureYears);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNoRecordsFound, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblManufactureYear)
                                .addGap(18, 18, 18)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblManufactureYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(lblNoRecordsFound, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        lblNoRecordsFound.setText("");
        DefaultTableModel model = (DefaultTableModel) tblManufactureYears.getModel();
        model.setRowCount(0);
        int manufactureYear = dateChooser.getYear();
        
        for(CarProfile cp : carRecords.getCarRecords())
        {
            if(manufactureYear == cp.getCarManufactureYear())
            {
            Object[] row = new Object[6];
            row[0] =  cp.getDriverName();
            row[1] =  cp.getCarBrand() + " " + cp.getCarModelNumber();
            row[2] = cp.getCarSerialNumber();
            row[3] = cp.getAvailabilityStatus();
            row[4] = cp.getCarLoctatedInCity();
            row[5] = cp.getMaximumSeatingCapacity();
            model.addRow(row);
            }
        }
        if(tblManufactureYears.getRowCount() == 0)
        {
            lblNoRecordsFound.setText(AppConstants.NoRecordsFound);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JYearChooser dateChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblNoRecordsFound;
    private javax.swing.JTable tblManufactureYears;
    // End of variables declaration//GEN-END:variables
}
