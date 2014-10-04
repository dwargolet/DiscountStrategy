package discountstrategy;

/**This is a interface, which allows for different discounts to be implemented
 *
 * @author Daniel
 * @version 1.00 
 */
public interface DiscountStrategy {
    
   /**
    * returns the dicsount type
    * @return 
    */
    public double getDiscount();
    
    /**
     * returns the discounted price
     * @param itemPrice the items normal price
     * @return the discounted price
     */
    public double getDiscountedPrice(double itemPrice);
}
