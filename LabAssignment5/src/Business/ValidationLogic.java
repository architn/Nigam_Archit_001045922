/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.JTextField;

/**
 *
 * @author architnigam
 */
public class ValidationLogic {
    
    public boolean validateIfAllFieldsAreFilled_3(JTextField field1, JTextField field2, JTextField field3)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    public boolean validateIfAllFieldsAreFilled_4(JTextField field1, JTextField field2, JTextField field3, 
            JTextField field4)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        String field4Value = field4.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals("")
                || field4Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    public boolean validateIfAllFieldsAreFilled_5(JTextField field1, JTextField field2, JTextField field3, 
            JTextField field4, JTextField field5)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        String field4Value = field4.getText();
        String field5Value = field5.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals("")
                || field4Value.equals("") || field5Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    public boolean validateIfAllFieldsAreFilled_6(JTextField field1, JTextField field2, JTextField field3, 
            JTextField field4, JTextField field5, JTextField field6)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        String field4Value = field4.getText();
        String field5Value = field5.getText();
        String field6Value = field5.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals("")
                || field4Value.equals("") || field5Value.equals("") || field6Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    
    public boolean validateIfFieldIsNumeric(JTextField field)
    {
        boolean isFilledNumeric = true;
        String fieldValue = field.getText();
        if(!fieldValue.matches("[0-9]+"))
        {
            isFilledNumeric = false;
        }
        return isFilledNumeric;
    }
}
