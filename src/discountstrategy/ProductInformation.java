package discountstrategy;

/**
 *
 * @author Daniel
 */
public class ProductInformation {
    
    private String productID;
    private String productDescription;
    private int quantity;
    private double productPrice;
    private DiscountStrategy ds;

    public ProductInformation(String productID, String productDescription, int quantity, double productPrice, DiscountStrategy ds) {
        this.productID = productID;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.ds = ds;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
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
