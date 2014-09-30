
package discountstrategy;

/**
 *
 * @author Daniel
 */
public class EmployeeDiscount implements DiscountStrategy{

private final double employeeDiscount = .15;    
    
//get a discount off each item    
@Override    
public double getDiscount(double productCost){
    return (productCost * employeeDiscount);
}
        
    
}
