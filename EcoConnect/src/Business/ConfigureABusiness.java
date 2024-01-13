package Business;

import Business.Employee.Employee;
import Business.Role.EmergencyAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.InsuranceAdminRole;
import Business.Role.LabAdminRole;
import Business.Role.PharamacyAdminRole;
import Business.Role.SupplierAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

/**
 *
 * @author Soumya
 */
public class ConfigureABusiness {
    
    
        
       private static List<String> uniqueNames = new ArrayList<>();
 
    public static EcoSystem initialize(){
        EcoSystem business = EcoSystem.getInstance();
        Faker faker = new Faker();
         // Onboarding admin
        Employee employee = business.getEmployeeDirectory().createEmployee("admin");
        UserAccount ua = business.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        // Generate 6 unique random names for different admins
        generateUniqueRandomNames(6, 4, faker);
        // Onboarding hospital admin
        String hosAd = uniqueNames.get(0);
        Employee hospemp = business.getEmployeeDirectory().createEmployee("Hospital");
        hospemp.setLocation("Brigham");
        String hosun = generateSecureUsername(hosAd, faker);
        String hospwd = generateSecurePassword(hosun);
        UserAccount hospua = business.getUserAccountDirectory().createUserAccount(hosun, hospwd, hospemp, new HospitalAdminRole());
 
        business.getEnterpriseDirectory().createAndAddEnterprise(hospemp.getName(), Enterprise.EnterpriseType.Hospital);
        System.out.println("Created hospital and onboarded hospital admin: " + hosun + " " + hospwd);
        
        // Onboarding pharmacy admin
        String phaAd = uniqueNames.get(1);
        Employee phaemp = business.getEmployeeDirectory().createEmployee("Pharmacy");
        phaemp.setLocation("Longwood");
        String phaun = generateSecureUsername(phaAd, faker);
        String phapwd = generateSecurePassword(phaun);
        UserAccount phaua = business.getUserAccountDirectory().createUserAccount(phaun, phapwd, phaemp, new PharamacyAdminRole());
 
        business.getEnterpriseDirectory().createAndAddEnterprise(phaemp.getName(), Enterprise.EnterpriseType.Pharmacy );
        business.getEnterpriseDirectory().findEnterprise(phaemp.getName()).getOrganizationDirectory().createOrganization(phaemp.getName(), Organization.Type.PharamacyAdmin, "Test");
        System.out.println("Created pharmacy and onboarded pharmacy admin: " + phaun + " " + phapwd);
        
        // Onboarding lab admin
        String labAd = uniqueNames.get(2);
        Employee labemp = business.getEmployeeDirectory().createEmployee("Lab");
        labemp.setLocation("Fenway");
        String labun = generateSecureUsername(labAd, faker);
        String labpwd = generateSecurePassword(labun);
        UserAccount labua = business.getUserAccountDirectory().createUserAccount(labun, labpwd, labemp, new LabAdminRole());
 
        business.getEnterpriseDirectory().createAndAddEnterprise(labemp.getName(), Enterprise.EnterpriseType.Lab);
        business.getEnterpriseDirectory().findEnterprise(labemp.getName()).getOrganizationDirectory().createOrganization(labemp.getName(), Organization.Type.LabAdmin, "Test");
        System.out.println("Created lab and onboarded lab admin: " + labun + " " + labpwd);
        
        // Onboarding supplier admin
        String supAd = uniqueNames.get(3);
        Employee supemp = business.getEmployeeDirectory().createEmployee("Supplier");
        supemp.setLocation("Cambridge");
        String supun = generateSecureUsername(supAd, faker);
        String suppwd = generateSecurePassword(supun);
        UserAccount supua = business.getUserAccountDirectory().createUserAccount(supun, suppwd, supemp, new SupplierAdminRole());
 
        business.getEnterpriseDirectory().createAndAddEnterprise(supemp.getName(), Enterprise.EnterpriseType.Supplier);
        business.getEnterpriseDirectory().findEnterprise(supemp.getName()).getOrganizationDirectory().createOrganization(supemp.getName(), Organization.Type.SupplierAdmin, "Test");
        System.out.println("Created supplier company and onboarded supplier admin: " + supun + " " + suppwd);
        
        // Onboarding insurance admin
        String insAd = uniqueNames.get(4);
        Employee insemp = business.getEmployeeDirectory().createEmployee("Insurance");
        insemp.setLocation("Cambridge");
        String insun = generateSecureUsername(insAd, faker);
        String inspwd = generateSecurePassword(insun);
        UserAccount insua = business.getUserAccountDirectory().createUserAccount(insun, inspwd, insemp, new InsuranceAdminRole());
 
        business.getEnterpriseDirectory().createAndAddEnterprise(insemp.getName(), Enterprise.EnterpriseType.Insurance );
        business.getEnterpriseDirectory().findEnterprise(insemp.getName()).getOrganizationDirectory().createOrganization(insemp.getName(), Organization.Type.InsuranceAdmin, "Test");
        System.out.println("Created insurance company and onboarded insurance admin: " + insun + " " + inspwd);
        
        // Onboarding emergency admin
        String emeAd = uniqueNames.get(5);
        Employee emeemp = business.getEmployeeDirectory().createEmployee("Emergency");
        emeemp.setLocation("Brookline");
        String emeun = generateSecureUsername(emeAd, faker);
        String emepwd = generateSecurePassword(emeun);
        UserAccount emeua = business.getUserAccountDirectory().createUserAccount(emeun, emepwd, emeemp, new EmergencyAdminRole());
 
        business.getEnterpriseDirectory().createAndAddEnterprise(emeemp.getName(), Enterprise.EnterpriseType.Emergency );
        business.getEnterpriseDirectory().findEnterprise(emeemp.getName()).getOrganizationDirectory().createOrganization(emeemp.getName(), Organization.Type.EmergencyAdmin, "Test");
        System.out.println("Created emergency unit and onboarded emergency admin: " + emeun + " " + emepwd);
        return business;
    
    }
    
    private static String generateSecureUsername(String name, Faker faker) {
        String lowercaseName = name.toLowerCase();
        char firstLetter = lowercaseName.charAt(0);
        String username = Character.toUpperCase(firstLetter) + lowercaseName.substring(1) + faker.number().numberBetween(10, 99);
        return username + "!";
    }
 
    private static String generateSecurePassword(String username) {
        String password = username;
        return password;
    }
 
    private static void generateUniqueRandomNames(int count, int length, Faker faker) {
        while (uniqueNames.size() < count) {
            String randomName = generateRandomName(length, faker);
            // Ensure uniqueness before adding to the list
            if (!uniqueNames.contains(randomName)) {
                uniqueNames.add(randomName);
            }
        }
    }
 
    private static String generateRandomName(int length, Faker faker) {
        String randomName;
        do {
            randomName = faker.name().firstName();
        } while (randomName.length() < length);
 
        // Trim the name to the desired length
        return randomName.substring(0, length);
    }
}
