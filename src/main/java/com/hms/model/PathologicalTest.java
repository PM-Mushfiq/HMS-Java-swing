
package com.hms.model;

/**
 *
 * @author Mushfiq
 */
public class PathologicalTest extends LabTest {
//    private String title;
//    private double cost;
//    private boolean isAvailable;
    private String reagent;
    
    public PathologicalTest(){}
    public PathologicalTest(String title, double cost){
        this.title = title;
        this.cost = cost;
    }
    public PathologicalTest(String title, int cost){
        this.title = title;
        this.cost = cost;
    }
    public PathologicalTest(double cost, String name){
        this.title = name;
        this.cost = cost;
    }
    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable,
                    String reagent){
        super(title,cost,isAvailable); 
        this.reagent = reagent;
    }
    
    @Override
    public String returnLabTestInfo(){
        String output = super.returnLabTestInfo()+"\n"
                + "Reagent: "+this.reagent+"\n";
        return output;
    }

    public double calcCost() {
        double totalCost=0;// = this.cost- this.cost* ;
        
        return totalCost;
    }
}
