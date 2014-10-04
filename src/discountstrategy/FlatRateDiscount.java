
package discountstrategy;

/**This class implements the DiscountStrategy interface, it utilizes a flat rate
 *discount, which can be changed at any time.
 * 
 * @author Daniel
 * @version 1.00 
 */
public class FlatRateDiscount implements DiscountStrategy{
   
    private double discount;
    private double discountedPrice;
    
    public FlatRateDiscount(double discount) {
        this.discount = discount;
    }

    
    /**
     * sets the discount amount and uses validation
     * @param discount the flat rate discount amount
     */
    public void setDiscount(double discount) {
        if(discount < 0|| discount > 99){
            throw new IllegalArgumentException();
        }
        this.discount = discount;
    }


    /**
     * Override the method from the discount interface, returns the discounted price
     * @param productPrice the normal cost of the product
     * @return the new product cost with the discount applied
     */
    @Override
    public double getDiscountedPrice(double productPrice){
        discountedPrice = productPrice - discount;
        return discountedPrice;
    }
      
    /**
     *  The overridden method from the interface, returns the discount amount
     * @return the discount amount
     */
    @Override
    public double getDiscount(){
        return discount;
    }
}
