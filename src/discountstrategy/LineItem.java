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
}
