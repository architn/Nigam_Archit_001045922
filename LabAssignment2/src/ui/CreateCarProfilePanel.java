/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AppConstants;
import model.CarProfile;
import model.CarRecords;
import model.ValidationLogic;

/**
 *
 * @author architnigam
 */
public class CreateCarProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCarProfilePanel
     */
    CarRecords carRecords; 
    CarProfile carProfile;
    ValidationLogic validationLogic = new ValidationLogic();
    AppConstants AppConstants = new AppConstants();
    public CreateCarProfilePanel(CarRecords carRecords) {
        initComponents();
        this.carRecords = carRecords;
        ddManufactureYear.setMaximum(Calendar.getInstance().get(Calendar.YEAR));
        dateChooserLicenseExpiryDate.setMinSelectableDate(new Date());
        populateRecords();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateCarName = new javax.swing.JLabel();
        lblCreateCarBrand = new javax.swing.JLabel();
        lblCreateManufactureYear = new javax.swing.JLabel();
        lblCreateSeatingCapacity = new javax.swing.JLabel();
        lblCreateSerialNumber = new javax.swing.JLabel();
        lblCreateModelNumber = new javax.swing.JLabel();
        lblCreateCity = new javax.swing.JLabel();
        lblCreateLicenseExpiry = new javax.swing.JLabel();
        lblCreateAvailability = new javax.swing.JLabel();
        btnSaveCarDetails = new javax.swing.JButton();
        lblLabel = new javax.swing.JLabel();
        txtDriverName = new javax.swing.JTextField();
        ddCarBrand = new javax.swing.JComboBox<>();
        txtCreateMaxSeatingCapacity = new javax.swing.JTextField();
        txtCreateSerialNumber = new javax.swing.JTextField();
        txtCreateModelNumber = new javax.swing.JTextField();
        txtCreateCity = new javax.swing.JTextField();
        checkBoxCreateAvailability = new javax.swing.JCheckBox();
        ddManufactureYear = new com.toedter.calendar.JYearChooser();
        dateChooserLicenseExpiryDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();

        lblCreateCarName.setText("Driver Name: ");

        lblCreateCarBrand.setText("Car Brand: ");

        lblCreateManufactureYear.setText("Manufacture Year:");

        lblCreateSeatingCapacity.setText("Maximum Seating Capacity:");

        lblCreateSerialNumber.setText("Vehicle Number Index:");

        lblCreateModelNumber.setText("Model Number:");

        lblCreateCity.setText("Location of Car:");

        lblCreateLicenseExpiry.setText("License Expiry Date:");

        lblCreateAvailability.setText("Available for Use:");

        btnSaveCarDetails.setText("Save Car Details");
        btnSaveCarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCarDetailsActionPerformed(evt);
            }
        });

        lblLabel.setText("                                                      NEW CAR INFORMATION:");

        txtDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriverNameActionPerformed(evt);
            }
        });

        ddCarBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "BMW", "Audi", "Chevrolet", "Nissan", "Honda", "Hyundai", "Mercedes", "Ford", "Dodge", "Skoda", "KIA" }));

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Driver Name", "Car Name", "Vehicle Number", "Car"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCars);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCreateCarName)
                                    .addComponent(lblCreateCarBrand)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCreateManufactureYear)
                                        .addGap(82, 82, 82)
                                        .addComponent(ddManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateAvailability)
                    .addComponent(lblCreateSerialNumber)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSaveCarDetails)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCreateSeatingCapacity)
                                            .addComponent(lblCreateModelNumber))
                                        .addComponent(lblCreateCity, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCreateLicenseExpiry)
                                    .addGap(65, 65, 65)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCreateModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCreateSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCreateMaxSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCreateCity, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateChooserLicenseExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBoxCreateAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ddCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCarName)
                    .addComponent(txtDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCarBrand)
                    .addComponent(ddCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateManufactureYear)
                    .addComponent(ddManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateSeatingCapacity)
                    .addComponent(txtCreateMaxSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateSerialNumber)
                    .addComponent(txtCreateSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateModelNumber)
                    .addComponent(txtCreateModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreateCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreateCity))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCreateLicenseExpiry)
                    .addComponent(dateChooserLicenseExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxCreateAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSaveCarDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCarDetailsActionPerformed
        // TODO add your handling code here:
       if(validationLogic.EnsureNoFieldIsEmpty(txtDriverName, ddCarBrand, ddManufactureYear, txtCreateMaxSeatingCapacity, txtCreateModelNumber, 
               txtCreateSerialNumber, txtCreateCity, dateChooserLicenseExpiryDate)
               && validationLogic.EnsureThatVehicleNumberIsUnique(txtCreateSerialNumber, tblCars)
               && validationLogic.EnsureThatMaxSeatingCapacityIsANumber(txtCreateMaxSeatingCapacity))
       {
       String driverName = txtDriverName.getText();
       String carBrand = ddCarBrand.getSelectedItem().toString();
       int manufactureYear = ddManufactureYear.getYear();
       String maximumCapacityOfCar = txtCreateMaxSeatingCapacity.getText();
       String vehicleNumber = txtCreateSerialNumber.getText();
       String modelNumber = txtCreateModelNumber.getText();
       String city = txtCreateCity.getText();
       Date licenseExpiryDate = dateChooserLicenseExpiryDate.getDate();
       boolean isCarAvailable = checkBoxCreateAvailability.isSelected();
       
       CarProfile carProfile = carRecords.addNewCarRecord();
       
       carProfile.setCarID(carRecords.GenerateCarID());
       carProfile.setDriverName(driverName);
       carProfile.setCarBrand(carBrand);
       carProfile.setCarManufactureYear(manufactureYear);
       carProfile.setMaximumSeatingCapacity(Integer.parseInt(maximumCapacityOfCar));
       carProfile.setCarModelNumber(modelNumber);
       carProfile.setCarSerialNumber(vehicleNumber);
       carProfile.setCarLocatedInCity(city);
       carProfile.setCarExpirationDate(licenseExpiryDate);
       carProfile.setIsCarAvailableOrNot(isCarAvailable);
       carProfile.setCreateUpdateTimeStamp(new Date());
       carProfile.setModeOfAddition(AppConstants.modeOfAdditionUI);
       if(isCarAvailable)
       {
           carProfile.setAvailabilityStatus(AppConstants.CarIsAvailableForRide);
       }
       else{
           carProfile.setAvailabilityStatus(AppConstants.CarIsUnavailableForRide);
       }
       JOptionPane.showMessageDialog(this, AppConstants.SuccessMessageForCarAddition);
       
       // Clearing fields
       txtDriverName.setText("");
       ddCarBrand.setSelectedIndex(0);
       ddManufactureYear.setYear(Calendar.getInstance().get(Calendar.YEAR));
       txtCreateMaxSeatingCapacity.setText("");
       txtCreateSerialNumber.setText("");
       txtCreateModelNumber.setText("");
       txtCreateCity.setText("");
       }
    }//GEN-LAST:event_btnSaveCarDetailsActionPerformed

    private void txtDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDriverNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDriverNameActionPerformed
    
    private void populateRecords()
    {
         DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
         model.setRowCount(0);
        
        for(CarProfile cp : carRecords.getCarRecords())
        {
            Object[] row = new Object[5];
            row[0] = cp.getCarID();
            row[1] =  cp.getDriverName();
            row[2] =  cp.getCarBrand() + " "+ cp.getCarModelNumber();
            row[3] = cp.getCarSerialNumber();
            row[4] = cp;
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveCarDetails;
    private javax.swing.JCheckBox checkBoxCreateAvailability;
    private com.toedter.calendar.JDateChooser dateChooserLicenseExpiryDate;
    private javax.swing.JComboBox<String> ddCarBrand;
    private com.toedter.calendar.JYearChooser ddManufactureYear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateAvailability;
    private javax.swing.JLabel lblCreateCarBrand;
    private javax.swing.JLabel lblCreateCarName;
    private javax.swing.JLabel lblCreateCity;
    private javax.swing.JLabel lblCreateLicenseExpiry;
    private javax.swing.JLabel lblCreateManufactureYear;
    private javax.swing.JLabel lblCreateModelNumber;
    private javax.swing.JLabel lblCreateSeatingCapacity;
    private javax.swing.JLabel lblCreateSerialNumber;
    private javax.swing.JLabel lblLabel;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtCreateCity;
    private javax.swing.JTextField txtCreateMaxSeatingCapacity;
    private javax.swing.JTextField txtCreateModelNumber;
    private javax.swing.JTextField txtCreateSerialNumber;
    private javax.swing.JTextField txtDriverName;
    // End of variables declaration//GEN-END:variables
}
