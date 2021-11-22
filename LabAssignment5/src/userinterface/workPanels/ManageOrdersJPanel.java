/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.workPanels;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.ValidationLogic;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author architnigam
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    ArrayList<Restaurant> restaurantList;
    String restaurantName;

    public ManageOrdersJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateTable();
    }
    
    public ManageOrdersJPanel(JPanel userProcessContainer,EcoSystem ecosystem, String restaurantName) {
        initComponents();
        populateTable();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.restaurantName = restaurantName;
        populateTable();
        Font font = new Font("Helvetica", Font.BOLD,12);
        jLabel1.setFont(font);
        jLabel2.setFont(font);
        txtAssignedTo.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAssignedTo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        checkboxOrderDelivery = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Order Delivered", "Ordered At", "Ordered By", "Assigned To", "Order Amount", "Order"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Order Delivered: ");

        jLabel2.setText("Assigned To: ");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(31, 31, 31)
                .addComponent(btnDelete)
                .addGap(414, 414, 414))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(txtAssignedTo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxOrderDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(checkboxOrderDelivery))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAssignedTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnSave)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(334, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblOrders.getSelectedRow();
        if(selectedIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
        }
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        Order selectedOrder = (Order) model.getValueAt(selectedIndex, 6);
        if(selectedOrder.isIsOrderDelivered())
        {
            JOptionPane.showMessageDialog(this, "Cannot change status of delivered order!");
        }
        else{
            checkboxOrderDelivery.setSelected(selectedOrder.isIsOrderDelivered());
        }
        txtAssignedTo.setText(selectedOrder.getDeliveryMan().getDeliveryManName());
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblOrders.getSelectedRow();
        
        boolean orderStatus = checkboxOrderDelivery.isSelected();
        String newOrderDeliveryPerson= txtAssignedTo.getText();
        ValidationLogic validationLogic = new ValidationLogic(ecosystem);
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        Order selectedOrder = (Order) model.getValueAt(selectedIndex, 6);
        
        if(validationLogic.ValidateIfDeliveryPersonExists(newOrderDeliveryPerson))
        {
            Order editedOrder = ecosystem.getOrderDirectory().updateOrder(selectedOrder);
            editedOrder.getDeliveryMan().setDeliveryManName(newOrderDeliveryPerson);
            editedOrder.setIsOrderDelivered(orderStatus);
        
            editedOrder.setDeliveryMan(editedOrder.getDeliveryMan());
            JOptionPane.showMessageDialog(this, "Order Details updated successfully");
            populateTable();
            txtAssignedTo.setText("");
            checkboxOrderDelivery.setSelected(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "Delivery Person with name '"+newOrderDeliveryPerson+"'"
                    + " does not exist in system");
        }
        
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblOrders.getSelectedRow();
 
        ecosystem.getOrderDirectory().deleteOrder(selectedIndex);
        JOptionPane.showMessageDialog(this, "Delete successful!");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox checkboxOrderDelivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtAssignedTo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        try{
            
            for(int index = 0; index < ecosystem.getOrderDirectory().getOrderhist().size(); index++)
            {
                Order presentOrder = ecosystem.getOrderDirectory().getOrderhist().get(index);
                Object[] row = new Object[7];
                row[0] =  presentOrder.getOrderID();
                if(presentOrder.isIsOrderDelivered())
                {
                    row[1] = "Yes";
                }
                else{
                    row[1] = "No";
                }
                row[2] = presentOrder.getOrderTime();
                row[3] = presentOrder.getCustomerUsername();
                row[4] = presentOrder.getDeliveryMan();
                row[5] = presentOrder.getOrderAmount();
                row[6] = presentOrder;
                model.addRow(row);
            }   
        }
        catch(Exception ex)
        {
            
        }
    }
}
