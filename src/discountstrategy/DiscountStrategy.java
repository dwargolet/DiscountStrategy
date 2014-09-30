package discountstrategy;

/**
 *
 * @author Daniel
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount(double productCost);
}
