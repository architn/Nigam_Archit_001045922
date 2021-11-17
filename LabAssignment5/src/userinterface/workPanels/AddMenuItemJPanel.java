/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.workPanels;

import Business.DB4OUtil.DB4OUtil;
import Business.Menu.MenuItems;
import Business.EcoSystem;
import Business.Menu.MenuItemsDirectory;
import Business.UserAccount.UserAccount;
import Business.Restaurant.Restaurant;
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
    ArrayList<MenuItems> menuItemList;
    
    public AddMenuItemJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = system;
        
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
        checkBoxAvailaibility = new javax.swing.JCheckBox();
        btnSaveDish = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();

        jLabel1.setText("Dish Name: ");

        jLabel2.setText("Cost: ");

        jLabel3.setText("Availability: ");

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

        jButton1.setText("Update");

        jButton2.setText("Delete");

        jLabel5.setText("Restaurant: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDishName)
                                    .addComponent(checkBoxAvailaibility, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSaveDish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCost, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtRestaurantName))))
                        .addGap(0, 408, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDishName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3))
                    .addComponent(checkBoxAvailaibility))
                .addGap(32, 32, 32)
                .addComponent(btnSaveDish)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDishActionPerformed
        // TODO add your handling code here:
        String restaurantName = txtRestaurantName.getText();
        String dishName = txtDishName.getText();
        String dishCost = txtCost.getText();
        boolean isDishAvailable = checkBoxAvailaibility.isSelected();
        
        MenuItems menuItem = new MenuItems();
        
        menuItem.setMenuItemName(dishName);
        menuItem.setMenuItemCost(Double.parseDouble(dishCost));
        menuItem.setMenuItemAvailability(isDishAvailable);

  
        Restaurant searchedRestaurant = system.getRestaurantDirectory().FindRestaurantByName(restaurantName);
        System.out.println("resto "+searchedRestaurant.getRestaurantName());
        if(searchedRestaurant == null)
        {
            MenuItemsDirectory menuItemsDirectory = new MenuItemsDirectory();
            ArrayList<MenuItems> menuDirectory  = new ArrayList<MenuItems>();
            menuDirectory.add(menuItem);
            menuItemsDirectory.setMenuItemRecords(menuItemList);
            searchedRestaurant.setMenuDirectory(menuItemsDirectory);
            JOptionPane.showMessageDialog(this, "Menu Dish added!");
        }
        else{
            MenuItemsDirectory menuDirectory = searchedRestaurant.getMenuDirectory();
            menuItemList = searchedRestaurant.getMenuDirectory().getMenuItemRecords();
            menuItemList.add(menuItem);
            menuDirectory.setMenuItemRecords(menuItemList);
            searchedRestaurant.setMenuDirectory(menuDirectory);
        }
        //populateTable();

    }//GEN-LAST:event_btnSaveDishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveDish;
    private javax.swing.JCheckBox checkBoxAvailaibility;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDishName;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
//        for(MenuItems menuItem: system.getMenuItemsDirectory().getMenuItemRecords())
//        {
//                Object[] row = new Object[3];
//                row[0] =  menuItem.getMenuItemName();
//                row[1] =  String.valueOf(menuItem.getMenuItemCost());
//                if(menuItem.isMenuItemAvailability())
//                {
//                    row[2] = "Yes";
//                }
//                else{
//                    row[2] = "No";
//                }
//                model.addRow(row);
//        }
    }
}
