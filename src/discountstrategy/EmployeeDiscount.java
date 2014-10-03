
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
private double productPrice;

    public EmployeeDiscount(double employeeDiscount) {
         setEmployeeDiscount(employeeDiscount);
    }

    public double getEmployeeDiscount() {
        return employeeDiscount;
    }

    public void setEmployeeDiscount(double employeeDiscount) {
        if(employeeDiscount < 0 || employeeDiscount > 1){
            throw new IllegalArgumentException();
        }    
        this.employeeDiscount = employeeDiscount;
    }

    @Override
    public double getDiscountedPrice(double productPrice){
        this.productPrice = productPrice;
        discountedPrice = productPrice - (productPrice * employeeDiscount);
        return discountedPrice;
    }



/**
 * The overridden method from the interface
 * @param productCost the cost of the product
 * @param employeeDiscount is the percent of the discount
 * @return the discount amount
 */

@Override    
public double getDiscount(){
    return (productPrice * employeeDiscount);
}
        
    
}
