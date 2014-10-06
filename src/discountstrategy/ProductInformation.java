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


    /**
     * this is the constructor, it takes in the product ID, name, the price
     * as well as what discount strategy is being implemented
     * @param productID the products unique identifier
     * @param productDescription the name of the product
     * @param productPrice the price of the product
     * @param discountStrategy the discount strategy
     */

    public ProductInformation(String productID, String productDescription, double productPrice, DiscountStrategy discountStrategy) {
        this.productID = productID;
        this.productDescription = productDescription;        
        this.productPrice = productPrice;
        this.discountStrategy = discountStrategy;

        
    }
/**
 * method for returning the product price
 * @return the product price
 */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * method for setting the product price, does have validation
     * @param productPrice product price variable
     */
    public void setProductPrice(double productPrice) {
        if(productPrice < 1 ){
            throw new IllegalArgumentException();
        }
        this.productPrice = productPrice;
    }

    /**
     * method returns the discount strategy
     * @return the discount strategy
     */
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    /**
     * method allows you to set the type of discount
     * @param discountStrategy the variable holding the discount strategy
     */
    public void setDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    

    /**
     * method returns the discounted price. It passes the product price in, then
     * uses the discount strategy to look up the discountedPrice method
     * @param productPrice the price of the product
     * @return returns the discounted price
     */
    public double getDiscountedPrice(double productPrice) {
        return discountStrategy.getDiscountedPrice(productPrice);
    }

 
    /**
     * returns the unique product ID
     * @return the variable holding the product id
     */
    public String getProductID() {
        return productID;
    }

    /**
     * This method allows you to set the product ID, it also contains validation
     * @param productID the unique product ID
     */
    public void setProductID(final String productID) {        
       if(productID == null || productID.isEmpty()){
           throw new IllegalArgumentException();
       } 
        this.productID = productID;
    }

    /**
     * method returns the name of the product
     * @return the variable holding the product name
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * this method allows for the product name to be entered
     * @param productDescription 
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * methods turns the discount amount.
     * @return the amount of the discount
     */
    public double getDiscount(){
        return discountStrategy.getDiscount();
    }

}
