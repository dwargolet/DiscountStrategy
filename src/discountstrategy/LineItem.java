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
    private final FakeDatabaseStrategy db;

    
    
    
    public LineItem(ProductInformation product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
        
    }

    public LineItem addLineItem(String productID, int quantity){
        LineItem lineItem = new LineItem(db.findProduct(productID), quantity);
        return lineItem;
    }
    
    
    public void setQuantity(int quantity) {
        
        if(quantity < 1 || quantity > 100){
           throw new IllegalArgumentException();
       } 
        
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setProduct(ProductInformation product){
        if(product == null){
            throw new IllegalArgumentException();
        }
        this.product = product;
    }
    
    public ProductInformation getProduct(){
        return product;
    }
    
    public String getProductID(){
        return product.getProductID();
    }
    
    public String getProductDescription(){
        return product.getProductDescription();
    }
    
    public double getProductPrice(){
        return product.getProductPrice() * quantity;
    }
    
    public double getDiscountedPrice(){
        return product.getDiscountedPrice() * quantity;
    }
       
    public double getDiscount(){
        return product.getDiscount() * quantity;
    }
   
    
    public String getLineItemData(){
        return product.getProductDescription() +
                "  " + product.getProductID() + 
                "  " + product.getProductPrice() +
                "  " + quantity + 
                "  " + getDiscount()
                ;
    }
    
    
//    //testing
//    public static void main(String[] args) {
//        LineItem receipt = new LineItem("1A1", 2, new FictionalDatabase());
//        System.out.println(receipt.getLineItemData());
//
//
//    }
    
}
