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
public class SearchByModelNumber extends javax.swing.JPanel {

    /**
     * Creates new form SearchByModelNumber
     */
    CarRecords carRecords;
    AppConstants AppConstants = new AppConstants();
    public SearchByModelNumber(CarRecords carRecords) {
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

        jLabel1 = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModelNumber = new javax.swing.JTable();
        lblNoRecordsFound = new javax.swing.JLabel();

        jLabel1.setText("Model Number: ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblModelNumber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Driver Name", "Car Brand", "Car Model", "Vehicle Number", "Location", "Maximum capacity", "Certificate Expiry"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblModelNumber);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoRecordsFound)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(2, 2, 2)
                .addComponent(lblNoRecordsFound)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        lblNoRecordsFound.setText("");
         DefaultTableModel model = (DefaultTableModel) tblModelNumber.getModel();
         model.setRowCount(0);
         String carModelNumber = txtModelNumber.getText();
        
        for(CarProfile cp : carRecords.getCarRecords())
        {
            if(carModelNumber.equals(cp.getCarModelNumber()))
            {
                Object[] row = new Object[7];
                row[0] =  cp.getDriverName();
                row[1] =  cp.getCarBrand();
                row[2] = cp.getCarModelNumber();
                row[3] = cp.getCarSerialNumber();
                row[4] = cp.getCarLoctatedInCity();
                row[5] = cp.getMaximumSeatingCapacity();
                row[6] = cp.getCarExpirationDate();
                model.addRow(row);
            }
        }
       
        if(tblModelNumber.getRowCount() == 0)
        {
             lblNoRecordsFound.setText(AppConstants.NoRecordsFound);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNoRecordsFound;
    private javax.swing.JTable tblModelNumber;
    private javax.swing.JTextField txtModelNumber;
    // End of variables declaration//GEN-END:variables
}