package discountstrategy;

/**
 *
 * @author Daniel
 */
public class Register {
    
    private FictionalDatabase db;
    private DiscountStrategy ds;
    private Receipt receipt;
    CustomerInformation customer;
    ProductInformation product;
    
    LineItem [] lineItems = new LineItem[0];

    public CustomerInformation getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerInformation customer) {
        this.customer = customer;
    }
    
    
    
    
    
}
