package discountstrategy;

/**
 *
 * @author Daniel
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
        this.quantity = quantity;
    }

    
    public int getQuantity() {
        return quantity;
    }
       
    
    public String getLineItemData(){
        return product.getProductDescription() +
                "  " + product.getProductID() + 
                "  " + product.getProductPrice() +
                "  " + quantity
                ;
    }
    
    public static void main(String[] args) {
        LineItem receipt = new LineItem("1A1", 2, new FictionalDatabase());
        System.out.println(receipt.getLineItemData());


    }
    
}
