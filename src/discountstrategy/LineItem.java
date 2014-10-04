package discountstrategy;

/**This class takes all of the information of a "item" object and sets it as a
 * line item, putting the information into a line like format for the receipt
 *
 * @author Daniel
 * @version 1.00 
 */
public class LineItem {
    private ProductInformation product;
    private int quantity;
    private final FakeDatabaseStrategy db = new FictionalDatabase();

    
    
    
    public LineItem(ProductInformation product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
        
    }

    public LineItem(){
        
    }
    
    /**
     * method to add another line item to the receipt item
     * @param productID the products unique identifier
     * @param quantity how many instances of a product are being bought
     * @return 
     */
    public LineItem addLineItem(String productID, int quantity){
        LineItem lineItem = new LineItem(db.findProduct(productID), quantity);
        return lineItem;
    }
    
    
    /**
     * sets the quantity of an item being bought, implements validation
     * @param quantity the amount of an item being entered
     */
    public void setQuantity(int quantity) {
        
        if(quantity < 1 || quantity > 100){
           throw new IllegalArgumentException();
       } 
        
        this.quantity = quantity;
    }
    
    /**
     * retrieves the quantity of an individual product
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    
    
    /**
     * sets the product to the line item, includes validation to make sure an
     * item is entered.
     * @param product an instance of the productInformation class
     */
    
    public void setProduct(ProductInformation product){
        if(product == null){
            throw new IllegalArgumentException();
        }
        this.product = product;
    }
    
    /**
     * retrieves the product
     * @return the product
     */
    public ProductInformation getProduct(){
        return product;
    }
    
    
     /**
     * retrieves the product ID
     * @return the product unique identifier
     */
    public String getProductID(){
        return product.getProductID();
    }
    
    /**
     * retrieves the product description/name
     * @return the product description
     */
    public String getProductDescription(){
        return product.getProductDescription();
    }
    
    
    /**
     * retrieves the product price
     * @return 
     */
    public double getProductPrice(){
        return product.getProductPrice() * quantity;
    }
    
    
    /**
     * returns the products price with the discount applied
     * @return discounted price per item
     */
    public double getDiscountedPrice(){
        return product.getDiscountedPrice() * quantity;
    }
    
    /**
     * method returns the discount amount
     * @return the product discount
     */
    public double getDiscount(){
        return product.getDiscount() * quantity;
    }
   
    /**
     * returns the line item and all of the data associated
     * @return each of the above methods are included in this method
     */
    public String getLineItemData(){
        return product.getProductDescription() +
                "  " + product.getProductID() + 
                "  " + product.getProductPrice() +
                "  " + quantity + 
                "  " + getDiscount()
                ;
    }
    
    
}
