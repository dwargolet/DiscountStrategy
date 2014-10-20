
package discountstrategy;

/**This class implements the DiscountStrategy interface, it utilizes a
 * percent discount. It originally was final, though decided to allow it to be 
 * changed as it has come to my attention that employee discounts can change
 *
 * @author Daniel
 * @version 1.00 
 */
public class EmployeeDiscount implements DiscountStrategy{

private double employeeDiscount;    
private double discountedPrice;
private double maxDiscount = 99;
private final int minDiscount = 0;


/**
 * this is the constructor for this class, it takes in the employee discount, 
 * which requires you to set it
 * @param employeeDiscount employee discount
 */
    public EmployeeDiscount(double employeeDiscount) {        
         setEmployeeDiscount(employeeDiscount);
    }

    
    /**
     * getter method for employee discount
     * @return returns the employee discount
     */
    public double getEmployeeDiscount() {
        return employeeDiscount;
    }

    
    /**
     * set the amount desired for the employee discount, has validation
     * @param employeeDiscount the employee discount amount
     */
    
    public void setEmployeeDiscount(double employeeDiscount) throws IllegalArgumentException {
        if(employeeDiscount < minDiscount || employeeDiscount > maxDiscount){
            throw new IllegalArgumentException("Discount must be between 0 and 99");
        }    
        this.employeeDiscount = employeeDiscount;
    }

    /**
     * Override the method from the discount interface, returns the discounted price
     * @param productPrice the normal cost of the product
     * @return the new product cost with the discount applied
     */
    @Override
    public double getDiscountedPrice(double productPrice){       
        discountedPrice = productPrice - (productPrice * employeeDiscount);
        return discountedPrice;
    }



/**
 * The overridden method from the interface, returns the discount amount
 * @return the discount amount
 */

@Override    
public double getDiscount(){
    return employeeDiscount;
}
        
    
}
