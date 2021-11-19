/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Organization;

import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
      
        populateTable();
    }
    
    public String findDeliveryManName(String name){
        for(DeliveryMan deliveryMan : business.getDeliveryManDirectory().getDeliveryMan()){
            if(name.equals(deliveryMan.getDeliveryusername())){
                return deliveryMan.getDeliveryManName();
            }
        }
        return "NOT FOUND";   
    }
    
    
    private void populateTable(){
//        try
//        {
            DefaultTableModel model1 = (DefaultTableModel) tblOrdersAssigned.getModel();
            model1.setRowCount(0);
            Order ordersHistory = new Order();
            String deliveryManName = findDeliveryManName(userAccount.getUsername());
            
            DeliveryMan deliveryManObject = new DeliveryMan();
            for(int index = 0; index < business.getOrderDirectory().getOrderhist().size(); index++)
            {
                ordersHistory = business.getOrderDirectory().getOrderhist().get(index);
                Organization customer = findCustomer(ordersHistory.getCustomerUsername());
                Object[] row = new Object[7];
                if(ordersHistory.getDeliveryMan().getDeliveryManName().equals(deliveryManName))
                {
                    row[0] = ordersHistory.getOrderID();
                    row[1] = customer.getName();
                    row[2] = customer.getAddress();
                    row[3] = customer.getPhoneNumber();
                    row[4] = ordersHistory.getOrderTime();
                    row[5] = ordersHistory.getOrderStatus();
                    row[6] = ordersHistory;
                    model1.addRow(row);
                }
            }
        //}
//        catch(Exception ex)
//        {
//            
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrdersAssigned = new javax.swing.JTable();
        txtOrderStatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Orders assigned to me: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        tblOrdersAssigned.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Address", "Phone Number", "Order Time", "Status", "Order"
            }
        ));
        jScrollPane2.setViewportView(tblOrdersAssigned);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 750, 140));
        add(txtOrderStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 30));

        jLabel2.setText("Order Status: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        btnUpdate.setText("Update Order Status");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblOrdersAssigned.getSelectedRow();
        if(selectedIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
        }
        DefaultTableModel model = (DefaultTableModel) tblOrdersAssigned.getModel();
        Order selectedOrder = (Order) model.getValueAt(selectedIndex, 6);
        txtOrderStatus.setText(selectedOrder.getOrderStatus());
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblOrdersAssigned.getSelectedRow();
        
        String newOrderStatus = txtOrderStatus.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblOrdersAssigned.getModel();
        Order selectedOrder = (Order) model.getValueAt(selectedIndex, 6);
        
        Order editedOrder = business.getOrderDirectory().updateOrder(selectedIndex, selectedOrder);
        editedOrder.setOrderStatus(newOrderStatus);
        populateTable();
        JOptionPane.showMessageDialog(this, "Order Details updated successfully");
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrdersAssigned;
    private javax.swing.JTextField txtOrderStatus;
    // End of variables declaration//GEN-END:variables

    private Organization findCustomer(String username) {
        for(Organization customer : business.getCustomerDirectory().getOrganizationList()){
            if(username.equals(customer.getUsername())){
                return customer;
            }
        }
        return null; 
    }
}
