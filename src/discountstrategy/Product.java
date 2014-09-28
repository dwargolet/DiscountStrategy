package discountstrategy;

/**
 *
 * @author Daniel
 */
public class Product {
    
    private String productID;
    private String productDescription;
    private int quantity;
    private DiscountStrategy ds;

    public Product(String productID, String productDescription, int quantity, DiscountStrategy ds) {
        this.productID = productID;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.ds = ds;
    }

    public DiscountStrategy getDs() {
        return ds;
    }

    public void setDs(DiscountStrategy ds) {
        this.ds = ds;
    }
    
    
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
    
}
