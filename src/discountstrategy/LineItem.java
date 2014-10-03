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
    private FakeDatabaseStrategy db;

    
    
    
    public LineItem(String productID, int quantity, FakeDatabaseStrategy db) {
        this.product = db.findProduct(productID);
        this.quantity = quantity;
        this.db = db;
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
       
    public String getProductID(){
        return product.getProductID();
    }
    
    public String getProductDescription(){
        return product.getProductDescription();
    }
    
    
    public String getLineItemData(){
        return product.getProductDescription() +
                "  " + product.getProductID() + 
                "  " + product.getProductPrice() +
                "  " + quantity
                ;
    }
    
    
    //testing
    public static void main(String[] args) {
        LineItem receipt = new LineItem("1A1", 2, new FictionalDatabase());
        System.out.println(receipt.getLineItemData());


    }
    
}
