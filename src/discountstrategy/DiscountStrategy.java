package discountstrategy;

/**This is a interface, which allows for different discounts to be implemented
 *
 * @author Daniel
 * @version 1.00 
 */
public interface DiscountStrategy {
    
    
    /**
     * This method has each discount class return a discount
     * @param productCost the cost of each product object
     * @return returns the discount
     */
    public abstract double getDiscount(double productCost);
}
