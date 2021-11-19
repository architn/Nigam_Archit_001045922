/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.workPanels;

import Business.DB4OUtil.DB4OUtil;
import Business.Menu.MenuItems;
import Business.EcoSystem;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.Restaurant.Restaurant;
import Business.ValidationLogic;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author architnigam
 */
public class AddMenuItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddMenuItemJPanel
     */
    private JPanel userProcessContainer;
    EcoSystem system;
    private UserAccount userAccount;
    DB4OUtil db4O;
    ArrayList<MenuItems> menuItemList = new ArrayList<MenuItems>();
    Organization organization;
    String nameOfRestaurant;
    ValidationLogic validationLogic = new ValidationLogic();
    public AddMenuItemJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        Font font = new Font("Helvetica", Font.BOLD,12);
        jLabel1.setFont(font);
        jLabel2.setFont(font);
        jLabel3.setFont(font);
        jLabel4.setFont(font);
        jLabel5.setFont(font);
        
    }
    public AddMenuItemJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization, String nameOfRestaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        this.nameOfRestaurant = nameOfRestaurant;
        txtRestaurantName.setText(nameOfRestaurant);
        txtRestaurantName.setEditable(false);
        Font font = new Font("Helvetica", Font.BOLD,12);
        jLabel1.setFont(font);
        jLabel2.setFont(font);
        jLabel3.setFont(font);
        jLabel4.setFont(font);
        jLabel5.setFont(font);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        txtDishName = new javax.swing.JTextField();
        btnSaveDish = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        checkboxAvailable = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSearchRestaurant = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Dish Name: ");

        jLabel2.setText("Cost: ");

        jLabel3.setText("Available");

        jLabel4.setText("Add New Item to Menu: ");

        btnSaveDish.setText("Save Dish");
        btnSaveDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDishActionPerformed(evt);
            }
        });

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Menu Item", "Cost", "Availability"
            }
        ));
        jScrollPane1.setViewportView(tblMenu);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Restaurant: ");

        jButton3.setText("Back");

        jLabel6.setText("Restaurant: ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton3)
                            .addGap(95, 95, 95)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDishName)
                                .addComponent(btnSaveDish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCost, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(txtRestaurantName)
                                .addComponent(checkboxAvailable)
                                .addComponent(txtSearchRestaurant))
                            .addGap(31, 31, 31)
                            .addComponent(btnSearch))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDishName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkboxAvailable))
                .addGap(29, 29, 29)
                .addComponent(btnSaveDish)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSearchRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(60, 60, 60))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDishActionPerformed
        // TODO add your handling code here:
        String restaurantName = txtRestaurantName.getText();
        String dishName = txtDishName.getText();
        String dishCost = txtCost.getText();
        boolean isAvailable = checkboxAvailable.isSelected();
        
        if(validationLogic.validateIfAllFieldsAreFilled_3(txtRestaurantName, txtDishName, txtCost))
        {
            Restaurant searchedRestaurant = system.getRestaurantDirectory().findRestaurant(restaurantName);
            searchedRestaurant.addMenuItemToARestaurant(dishName, Double.parseDouble(dishCost), isAvailable);
            JOptionPane.showMessageDialog(this, "Menu Dish added!");
        }
        else{
            JOptionPane.showMessageDialog(this, "All fields must be filled!");
        }
    }//GEN-LAST:event_btnSaveDishActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveDish;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox checkboxAvailable;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDishName;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtSearchRestaurant;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
        String searchedRestaurant = txtSearchRestaurant.getText();
        Restaurant restaurantFound = system.getRestaurantDirectory().findRestaurant(searchedRestaurant);
        ArrayList<MenuItems> menuItems = restaurantFound.getMenuItems();
        for(MenuItems menuItem : menuItems)
        {
            Object[] row = new Object[4];
            row[0] = menuItem.getItemName();
            row[1] = menuItem.getItemPrice();
            boolean isAvailable = menuItem.isAvailability();
            if(isAvailable)
            {
                row[2] = "Yes";
            }
            else{
                row[2] = "No";
            }
            row[3] = menuItem;
            model.addRow(row);
        }
    }
}
