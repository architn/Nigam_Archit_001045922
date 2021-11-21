

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.workPanels.AddMenuItemJPanel;
import userinterface.workPanels.ManageOrdersJPanel;
import userinterface.workPanels.ManageRestaurantsJPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem ecosystem;
    Organization organization;
    String restaurantName;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.organization = organization;
        
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageRestaurants = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnManageRestaurants.setText("Manage Restaurant Info");
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });
        add(btnManageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, -1));

        btnMenu.setText("Manage menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, -1));

        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });
        add(btnManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        // TODO add your handling code here:
        String restaurantName = findRestaurantName(account.getUsername());
        ManageRestaurantsJPanel manageRestaurant = new ManageRestaurantsJPanel(userProcessContainer, ecosystem, organization, restaurantName);
        userProcessContainer.add("Manage Restaurants", manageRestaurant);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        String restaurantName = findRestaurantName(account.getUsername());
        AddMenuItemJPanel addMenuItemJPanel = new AddMenuItemJPanel(userProcessContainer, ecosystem, organization, restaurantName);
        userProcessContainer.add("Add Menu Item", addMenuItemJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        ManageOrdersJPanel manageOrderJPanel = new ManageOrdersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manager Order", manageOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrdersActionPerformed
    
    public String findRestaurantName(String name){
        for(Restaurant restaurant : ecosystem.getRestaurantDirectory().getRestaurantList()){
            if(name.equals(restaurant.getUsername())){
                return restaurant.getName();
            }
        }
        return "NOT FOUND";   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
