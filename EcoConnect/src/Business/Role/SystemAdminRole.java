/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.Administrator.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Soumya
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, business,account);
    }
    
}
