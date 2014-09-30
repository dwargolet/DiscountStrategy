
package discountstrategy;

/**
 *
 * @author Daniel
 */
public class FlatRateDiscount implements DiscountStrategy{
    
    //Set a flat rate variable
    private final double flateRateDiscount = 3;
    
    
    
    //curently takes a flat rate off each product
    @Override
    public double getDiscount(double productCost){
        return (productCost - flateRateDiscount);
    }
}
