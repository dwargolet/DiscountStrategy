package discountstrategy;

/**
 *
 * @author Daniel
 */
public class Receipt {
    
    
    private CustomerInformation customer;
    private LineItem[] lineItems;
    private ReceiptStrategy output;
    private FakeDatabaseStrategy db;
    
    public Receipt(CustomerInformation customer, LineItem[] lineItems, ReceiptStrategy output, FakeDatabaseStrategy db) {
        this.customer = customer;
        this.lineItems = lineItems;
        this.output = output;
        this.setDb(db);
    }
    
    
    
    
    
}
