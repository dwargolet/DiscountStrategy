
package discountstrategy;

/**This class implements the DiscountStrategy interface, it utilizes a
 * percent discount. It originally was final, though decided to allow it to be 
 * changed as it has come to my attention that employee discounts can change
 *
 * @author Daniel
 * @version 1.00 
 */
public class EmployeeDiscount implements DiscountStrategy{

private double employeeDiscount = .15;    
    

/**
 * The overridden method from the interface
 * @param productCost the cost of the product
 * @return the discount amount
 */

@Override    
public double getDiscount(double productCost){
    return (productCost * employeeDiscount);
}
        
    
}
