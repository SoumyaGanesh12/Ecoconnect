/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabAdmin;

import java.util.ArrayList;

/**
 *
 * @author Malini
 */
public class TestDirectory {
    ArrayList<Test> testList = new ArrayList<>();
    ArrayList<Test> bookedtestlist = new ArrayList<>();

    public ArrayList<Test> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<Test> testList) {
        this.testList = testList;
    }
     public ArrayList<Test> getBookedtestlist() {
        return bookedtestlist;
    }

    public void setBookedtestlist(ArrayList<Test>bookedtestlist) {
        this.bookedtestlist = bookedtestlist;
    }
    public void addTest(Test t) {
        testList.add(t);
    }
    
     public Test findTest(String name){
        
         
         for(Test t : testList){
             if(t.getName().equals(name)){
                 return t;
             }
         }
         return null;
     }
}
