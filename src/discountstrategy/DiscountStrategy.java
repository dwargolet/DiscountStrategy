package discountstrategy;

/**This is a interface, which allows for different discounts to be implemented
 *
 * @author Daniel
 * @version 1.00 
 */
public interface DiscountStrategy {
    
   
    public double getDiscount();
    public double getDiscountedPrice(double itemPrice);
}
