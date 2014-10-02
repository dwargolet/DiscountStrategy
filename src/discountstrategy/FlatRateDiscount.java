
package discountstrategy;

/**This class implements the DiscountStrategy interface, it utilizes a flat rate
 *discount, which can be changed at any time.
 * 
 * @author Daniel
 * @version 1.00 
 */
public class FlatRateDiscount implements DiscountStrategy{
    
    //Set a flat rate variable
    private double flateRateDiscount = 3;

    public FlatRateDiscount() {
    }

    
    
    public double getFlateRateDiscount() {
        return flateRateDiscount;
    }
    
    public void setFlateRateDiscount(double flateRateDiscount) {
        this.flateRateDiscount = flateRateDiscount;
    }
    
    
    
    //curently takes a flat rate off each product
    @Override
    public double getDiscount(double productCost){
        return (productCost - flateRateDiscount);
    }
}
