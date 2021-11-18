/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;


import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Menu.MenuItems;
import Business.Order.Order;
import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    Organization organization;
    private UserAccount userAccount;
    EcoSystem system;
    DB4OUtil db4O;
    ArrayList<MenuItems> menuItemsInCart = new ArrayList<MenuItems>();
    Random rand = new Random();
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.setSize(1680, 1050);
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        lblName.setText(userAccount.getUsername());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenuItems = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnOrder = new javax.swing.JToggleButton();
        lblCustomerName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAddToOrder = new javax.swing.JButton();

        tblMenuItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Cost", "Menu"
            }
        ));
        jScrollPane1.setViewportView(tblMenuItems);

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menu Item", "Cost"
            }
        ));
        jScrollPane2.setViewportView(tblCart);

        btnOrder.setText("ORDER");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jLabel2.setText("Restauarant: ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("Welcome! ");

        btnAddToOrder.setText("Add to cart");
        btnAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(476, 476, 476)
                                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnAddToOrder)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnSearch))))
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String restaurantName = txtRestaurantName.getText();
        Restaurant searchedRestaurant;
        searchedRestaurant = system.getRestaurantDirectory().findRestaurant(restaurantName);
        DefaultTableModel model = (DefaultTableModel) tblMenuItems.getModel();
        model.setRowCount(0);
        for(int index = 0; index < searchedRestaurant.getMenuItems().size(); index++)
        {
            MenuItems menuItems = searchedRestaurant.getMenuItems().get(index);
            if(menuItems.isAvailability())
            {
                Object[] row = new Object[3];
                row[0] = menuItems.getItemName();
                row[1] = menuItems.getItemPrice();
                row[2] = menuItems;
                model.addRow(row);
            }
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        double totalOrderAmount = 0;
        MenuItems menuItem = new MenuItems();
        ArrayList<MenuItems> orderedItems = new ArrayList<MenuItems>();
        Order order = new Order();
        ArrayList<Order> orderhist = new ArrayList<Order>();
        DefaultTableModel model1 = (DefaultTableModel) tblCart.getModel();
        for(int acrossRow = 0; acrossRow < model1.getRowCount(); acrossRow++)
        {
            menuItem.setItemName(model1.getValueAt(acrossRow, 0).toString());
            double price = Double.parseDouble(model1.getValueAt(acrossRow, 1).toString());
            menuItem.setItemPrice(price);
            totalOrderAmount += price;
        }
        DeliveryMan assignedDeliveryMan = new DeliveryMan();
        int upperbound = system.getDeliveryManDirectory().getDeliveryMan().size();
        if(upperbound != 0)
        {
           int returnedIndex = rand.nextInt(upperbound);
           assignedDeliveryMan = system.getDeliveryManDirectory().getDeliveryMan().get(returnedIndex);
           orderedItems.add(menuItem);
            int orderId = order.generateOrderID();
            order.setOrderID(orderId);
            order.setOrdersByCustomer(orderedItems);
            order.setCustomerUsername(userAccount.getUsername());
            order.setOrderTime(new Date());
            order.setDeliveryMan(assignedDeliveryMan);
            order.setOrderStatus("Order Accepted");
            order.setOrderAmount(totalOrderAmount);
            orderhist.add(order);
            system.getOrderDirectory().setOrderhist(orderhist);
            JOptionPane.showMessageDialog(this, "Order successfully placed! Total amount is: "+totalOrderAmount);
        }
        else{
            JOptionPane.showMessageDialog(this, "Order cannot be placed if there is no delivery person in system! "
                    + "Please add one before proceding!");
        }
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToOrderActionPerformed
        // TODO add your handling code here:
        int rowCount = tblCart.getRowCount();
            
            int selectedIndex = tblMenuItems.getSelectedRow();
            if(selectedIndex < 0)
            {
                JOptionPane.showMessageDialog(this, "Select a row");
            }
            DefaultTableModel model = (DefaultTableModel) tblMenuItems.getModel();
            MenuItems selectedMenuItem = (MenuItems) model.getValueAt(selectedIndex, 2);
            menuItemsInCart.add(selectedMenuItem);
            JOptionPane.showMessageDialog(this, "Added to cart!");
            populateCart(menuItemsInCart);
    }//GEN-LAST:event_btnAddToOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToOrder;
    private javax.swing.JToggleButton btnOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMenuItems;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables

    private void populateCart(ArrayList<MenuItems> itemsInCart) {
        DefaultTableModel model1 = (DefaultTableModel) tblCart.getModel();
        model1.setRowCount(0);
        for(int index = 0; index < menuItemsInCart.size(); index++)
        {
            MenuItems menuItem = menuItemsInCart.get(index);
            Object[] row = new Object[2];
            row[0] = menuItem.getItemName();
            row[1] = menuItem.getItemPrice();
            model1.addRow(row);
        }
    }

    private void populateDropdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
