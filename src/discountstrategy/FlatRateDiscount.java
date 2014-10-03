
package discountstrategy;

/**This class implements the DiscountStrategy interface, it utilizes a flat rate
 *discount, which can be changed at any time.
 * 
 * @author Daniel
 * @version 1.00 
 */
public class FlatRateDiscount implements DiscountStrategy{
    
    //Set a flat rate variable

    private double discount;
    private double discountedPrice;
    
    public FlatRateDiscount(double discount) {
        this.discount = discount;
    }

    public void setDiscount(double discount) {
        if(discount < 0|| discount > 99){
            throw new IllegalArgumentException();
        }
        this.discount = discount;
    }


    @Override
    public double getDiscountedPrice(double productPrice){
        discountedPrice = productPrice - discount;
        return discountedPrice;
    }
      
    //curently takes a flat rate off each product
    @Override
    public double getDiscount(){
        return discount;
    }
}
