package discountstrategy;

/**This class stores the information for individual "item" objects. 
 *
 * @author Daniel
 * @version 1.00 
 */
public class ProductInformation {
    
    private String productID;
    private String productDescription;    
    private double productPrice;
    private DiscountStrategy discount;

    public ProductInformation(String productID, String productDescription, double productPrice, DiscountStrategy discount) {
        this.productID = productID;
        this.productDescription = productDescription;        
        this.productPrice = productPrice;
        this.discount = discount;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    

    public double getDiscountAmount() {
        return discount.getDiscount(productPrice);
    }

    public void setDiscountAmount(DiscountStrategy discountAmount) {
        this.discount = discount;
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
