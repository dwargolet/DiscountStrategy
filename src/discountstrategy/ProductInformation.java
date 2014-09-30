package discountstrategy;

/**
 *
 * @author Daniel
 */
public class ProductInformation {
    
    private String productID;
    private String productDescription;    
    private double productPrice;
    private DiscountStrategy ds;

    public ProductInformation(String productID, String productDescription, double productPrice, DiscountStrategy ds) {
        this.productID = productID;
        this.productDescription = productDescription;        
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

    
    public void setProductID(final String productID) {        
       if(productID == null || productID.isEmpty()){
           throw new IllegalArgumentException();
       } 
        this.productID = productID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(final String productDescription) {
        this.productDescription = productDescription;
    }

    
}
