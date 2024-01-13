/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyAdmin;

import Business.Organization;
import Business.Role.EmergencyAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Malini
 */
public class Emergency extends Organization{
    String emergencyUnitName;
    String address;
    String phoneNumber;
    String emergencyId;

  

    public String getEmergencyUnitName() {
        return emergencyUnitName;
    }

    public void setEmergencyUnitName(String emergencyUnitName) {
        this.emergencyUnitName = emergencyUnitName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(String emergencyId) {
        this.emergencyId = emergencyId;
    }

    public Emergency(String emergencyUnitName, String address, String phoneNumber, String emergencyId) {
//        setUsername(username);
//        setPassword(password);
        this.emergencyUnitName = emergencyUnitName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emergencyId = emergencyId;
    }
    
    public Emergency(String name){
        this.emergencyUnitName = name;
    }

    public Emergency() {
    }

    @Override
    public String toString() {
        return emergencyUnitName ;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
               ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyAdminRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
