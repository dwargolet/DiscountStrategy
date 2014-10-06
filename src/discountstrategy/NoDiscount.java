
package discountstrategy;

/**
 *This is a class that implements the discount strategy interface
 * it holds no discounts
 * @author Daniel
 * @version 1.0
 */
public class NoDiscount implements DiscountStrategy{
    
    
    /**
     * overrides the method from the interface which gets the discounted price
     * in this case, since there is no discount it returns the product price
     * @param productPrice the price of the product
     * @return the product price
     */
    @Override
    public double getDiscountedPrice(double productPrice){       
        return productPrice;
    }
    
    
    /**
     * overridden method from the interface, returns the discount amount,
     * in this case it is 0
     * @return the discount amount
     */
    @Override
    public double getDiscount(){
        return 0;
    }
    
}
