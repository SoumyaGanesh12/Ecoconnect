/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.InsuranceAdmin.InsurancePlan;

/**
 *
 * @author Soumya
 */
public class BuyInsuranceWorkRequest extends WorkRequest{
    InsurancePlan plan;

    public InsurancePlan getPlan() {
        return plan;
    }

    public void setPlan(InsurancePlan plan) {
        this.plan = plan;
    }
    
    
}
