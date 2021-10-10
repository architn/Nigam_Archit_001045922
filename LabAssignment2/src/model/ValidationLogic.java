/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author architnigam
 */
public class ValidationLogic {
    CarRecords carRecords = new CarRecords();
    AppConstants AppConstants = new AppConstants();
    JFrame frame;
    
    public boolean EnsureNoFieldIsEmpty(JTextField txtName, JComboBox ddState, JYearChooser ddManufactureYear, 
            JTextField txtMaxSeatingCapacity, JTextField txtVehicleNumber, JTextField txtModelNumber, 
            JTextField txtCity, JDateChooser dateChooser)
    {
        boolean allFieldsAreFilled = ( !(txtName.getText().equals(""))
                     && !ddState.getSelectedItem().equals("") && ! (ddManufactureYear.getYear() == 0)                  
                     && !txtMaxSeatingCapacity.getText().equals("") && !txtVehicleNumber.getText().equals("")
                     && !txtModelNumber.getText().equals("") && !txtCity.getText().equals("")
                     && !(dateChooser.getDate().equals(""))
                
                ) ? true : false;
        
        return allFieldsAreFilled;
    }
    
    public boolean EnsureThatVehicleNumberIsUnique(JTextField txtVehicleNumber, JTable tblCars)
    {
        boolean isVehicleNumberUnique = true;
        int numberOfDuplicateRecords = 0;
        String inputVehicleNumber = txtVehicleNumber.getText();

        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int index = 0; index < model.getRowCount(); index++)
        {
            String selectedCarIndexNumber = String.valueOf(model.getValueAt(index, 3));
             if(selectedCarIndexNumber.equals(inputVehicleNumber))
            {
                numberOfDuplicateRecords++;
            } 
        }

        if( numberOfDuplicateRecords == 0 ) 
        {
             return isVehicleNumberUnique;
        }
        else
        {
             isVehicleNumberUnique = false;
             JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageForVehicleNumberNotBeingUnique);
             return isVehicleNumberUnique;
        }
    }
    
//     public boolean EnsureThatVehicleNumberIsUniqueForUpdate(JTextField txtVehicleNumber, JTable tblCars)
//    {
//        boolean isVehicleNumberUnique = true;
//        int numberOfDuplicateRecords = 0;
//        String inputVehicleNumber = txtVehicleNumber.getText();
//
//        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
//        for(int index = 0; index < model.getRowCount(); index++)
//        {
//            String selectedCarIndexNumber = String.valueOf(model.getValueAt(index, 3));
//             if(selectedCarIndexNumber.equals(inputVehicleNumber))
//            {
//                numberOfDuplicateRecords++;
//            } 
//        }
//
//        if( numberOfDuplicateRecords == 0 ) 
//        {
//             return isVehicleNumberUnique;
//        }
//        else
//        {
//             isVehicleNumberUnique = false;
//             JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageForVehicleNumberNotBeingUnique);
//             return isVehicleNumberUnique;
//        }
//    }
    
    public boolean EnsureThatMaxSeatingCapacityIsANumber(JTextField txtMaximumSeatingCapacity)
    {
        String input = txtMaximumSeatingCapacity.getText();
        boolean numbersOnlyValidation = true;
        if(input.length() >= 1 && !(input.equals("0")))
        {
            if(! input.matches(AppConstants.RegularExpressionForNumericFields))
            {
                numbersOnlyValidation = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageForMaximumSeatingCapacity);
            }
            else
            {
                numbersOnlyValidation = true;
            }
        }
        else
        {
                numbersOnlyValidation = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageForMaxSeatingValue);
        }
        return numbersOnlyValidation;
    }
}
