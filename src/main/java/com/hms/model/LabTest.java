
package com.hms.model;

/**
 *
 * @author Muhammad Mushfiq at SIMEC Systems
 */
public abstract class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;
    //protected String labTestType;
    
    public LabTest() {}
    public LabTest(String title,
                    double cost,
                    boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable; 
    }
    
    public String returnLabTestInfo(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                + "Availability: "+this.isAvailable;
        return output;
    }
    
    //public abstract boolean deliverReport();

}
