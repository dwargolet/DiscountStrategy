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
    private DiscountStrategy discountStrategy;
//    private double discountedPrice;


    public ProductInformation(String productID, String productDescription, double productPrice, DiscountStrategy discountStrategy) {
        this.productID = productID;
        this.productDescription = productDescription;        
        this.productPrice = productPrice;
        this.discountStrategy = discountStrategy;

        
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if(productPrice < 1 ){
            throw new IllegalArgumentException();
        }
        this.productPrice = productPrice;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    

    public double getDiscountedPrice() {
        return (productPrice - discountStrategy.getDiscount());
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

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getDiscount(){
        return discountStrategy.getDiscount();
    }
    
    //testing
    public static void main(String[] args) {
       ProductInformation p = new ProductInformation("1B1", "test", 2, new EmployeeDiscount(.15));
        
        System.out.println(p.getDiscountedPrice());


    }
}
