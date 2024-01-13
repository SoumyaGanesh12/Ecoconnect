/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceAdmin;

import Business.Organization;
import Business.Role.InsuranceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Malini
 */
public class InsuranceeAdmin extends Organization{
    InsurancePlanDirectory insurancePlanDirectory;
    InsurancePlanDirectory orderedPlanDirectory;
    
     public InsuranceeAdmin() {
        this.insurancePlanDirectory = new InsurancePlanDirectory();
        this.orderedPlanDirectory = new InsurancePlanDirectory();
    }

    public InsurancePlanDirectory getInsurancePlanDirectory() {
        return insurancePlanDirectory;
    }
    
     public InsurancePlanDirectory getOrderedPlanDirectory() {
        return orderedPlanDirectory;
    }
    public void setInsurancePlanDirectory(InsurancePlanDirectory insurancePlanDirectory) {
        this.insurancePlanDirectory = insurancePlanDirectory;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String name;

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAdminRole());
        return roles;
    }
}
