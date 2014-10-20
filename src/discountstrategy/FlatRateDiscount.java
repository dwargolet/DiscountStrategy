
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
    private double maxDiscount = 99;
    private final int minDiscount = 0;
    /**
     * this is the constructor, it takes in the discount amount
     * @param discount 
     */
    
    public FlatRateDiscount(double discount) {
        this.discount = discount;
    }

    
    /**
     * sets the discount amount and uses validation
     * @param discount the flat rate discount amount
     */
    public void setDiscount(double discount) throws IllegalArgumentException {
        if(discount < minDiscount|| discount > maxDiscount){
            throw new IllegalArgumentException("Discount must be between 0 and 99");
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
