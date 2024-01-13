/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;




import Business.Doctor.DoctorDirectory;
import Business.Patient.PatientDirectory;
import Business.HospitalAdmin.HospitalDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Malini
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
    }

    public boolean checkIfUserIsUnique(String userName){
       return false;
    }
}
