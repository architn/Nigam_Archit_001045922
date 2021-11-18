/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Menu.MenuItemsDirectory;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.CustomerRole.CustomerAreaJPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import userinterface.workPanels.AddCustomerJPanel;
import userinterface.workPanels.AddRestaurantJPanel;
import userinterface.workPanels.AddDeliveryManJPanel;
import userinterface.workPanels.AddMenuItemJPanel;
import userinterface.workPanels.ManageConsumerJPanel;
import userinterface.workPanels.ManageOrdersJPanel;
import userinterface.workPanels.ManageRestaurantsJPanel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Organization customerOrganization;
    Organization deliveryorganization;
    Organization organization;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnAddRestaurant = new javax.swing.JButton();
        btnAddMenuItem = new javax.swing.JButton();
        btnAddDeliveryMan = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        btnManageRestaurant = new javax.swing.JButton();
        btnAddCustomer = new javax.swing.JButton();
        btnManageConsumers = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane.setLeftComponent(jPanel1);

        btnAddRestaurant.setText("Add Restaurant");
        btnAddRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRestaurantActionPerformed(evt);
            }
        });

        btnAddMenuItem.setText("Add Menu Item");
        btnAddMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMenuItemActionPerformed(evt);
            }
        });

        btnAddDeliveryMan.setText("Add Delivery Man");
        btnAddDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeliveryManActionPerformed(evt);
            }
        });

        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });

        btnManageRestaurant.setText("Manage Restaurant");
        btnManageRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantActionPerformed(evt);
            }
        });

        btnAddCustomer.setText("Add Customer");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnManageConsumers.setText("Manage Consumers");
        btnManageConsumers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageConsumersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageConsumers)
                    .addComponent(btnManageOrders)
                    .addComponent(btnAddCustomer)
                    .addComponent(btnAddRestaurant)
                    .addComponent(btnAddMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageRestaurant))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAddRestaurant)
                .addGap(29, 29, 29)
                .addComponent(btnAddCustomer)
                .addGap(31, 31, 31)
                .addComponent(btnAddMenuItem)
                .addGap(34, 34, 34)
                .addComponent(btnAddDeliveryMan)
                .addGap(33, 33, 33)
                .addComponent(btnManageRestaurant)
                .addGap(18, 18, 18)
                .addComponent(btnManageConsumers)
                .addGap(18, 18, 18)
                .addComponent(btnManageOrders)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMenuItemActionPerformed
           
        AddMenuItemJPanel addMenuItemJPanel = new AddMenuItemJPanel(userProcessContainer, ecosystem, organization);
        jSplitPane.setRightComponent(addMenuItemJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddMenuItemActionPerformed

    private void btnAddDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeliveryManActionPerformed
        AddDeliveryManJPanel addDeliveryManPanel = new AddDeliveryManJPanel(userProcessContainer, ecosystem, organization);
        jSplitPane.setRightComponent(addDeliveryManPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddDeliveryManActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        ManageOrdersJPanel manageOrdersJPanel = new ManageOrdersJPanel(userProcessContainer, ecosystem);
        jSplitPane.setRightComponent(manageOrdersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrdersActionPerformed

    private void btnAddRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRestaurantActionPerformed
        // TODO add your handling code here:
        AddRestaurantJPanel addRestaurantPanel = new AddRestaurantJPanel(userProcessContainer, ecosystem, organization);
        jSplitPane.setRightComponent(addRestaurantPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddRestaurantActionPerformed

    private void btnManageRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantActionPerformed
        // TODO add your handling code here:
        ManageRestaurantsJPanel manageRestaurantsPanel = new ManageRestaurantsJPanel(userProcessContainer, ecosystem, organization);
        jSplitPane.setRightComponent(manageRestaurantsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestaurantActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        // TODO add your handling code here:
        AddCustomerJPanel addCustomerPanel = new AddCustomerJPanel(userProcessContainer, ecosystem, organization);
        jSplitPane.setRightComponent(addCustomerPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnManageConsumersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageConsumersActionPerformed
        // TODO add your handling code here:
        ManageConsumerJPanel manageConsumerJPanel = new ManageConsumerJPanel();
        jSplitPane.setRightComponent(manageConsumerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageConsumersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddDeliveryMan;
    private javax.swing.JButton btnAddMenuItem;
    private javax.swing.JButton btnAddRestaurant;
    private javax.swing.JButton btnManageConsumers;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnManageRestaurant;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    private void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
          
        DefaultMutableTreeNode restaurant = new DefaultMutableTreeNode("Enterprises/Restaurants");
        DefaultMutableTreeNode customers = new DefaultMutableTreeNode("Customers");
        DefaultMutableTreeNode delivery = new DefaultMutableTreeNode("Delivery Men");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(restaurant, 0);
        root.insert(customers,1);
        root.insert(delivery, 2);
        DefaultMutableTreeNode restNode;
        DefaultMutableTreeNode custNode;
        DefaultMutableTreeNode delvNode;
     

        for(int i=0; i < ecosystem.getRestaurantDirectory().getRestaurantList().size() ; i++){
            Restaurant resname = ecosystem.getRestaurantDirectory().getRestaurantList().get(i);
            restNode = new DefaultMutableTreeNode(resname.getName());
            restaurant.insert(restNode,i);
        }
        for(int i=0; i < ecosystem.getCustomerDirectory().getOrganizationList().size() ; i++){
            Organization cust = ecosystem.getCustomerDirectory().getOrganizationList().get(i);
            custNode = new DefaultMutableTreeNode(cust.getName());
            customers.insert(custNode,i);
        }
//        for(int i=0; i < ecosystem.getDeliveryManDirectory().getDeliveryMan().size() ; i++){
//            DeliveryMan dm = ecosystem.getDeliveryManDirectory().getDeliveryMan().get(i);
//            delvNode = new DefaultMutableTreeNode(dm.getDeliveryManName());
//            delivery.insert(delvNode,i);
//        }

        model.reload();
    }
}
