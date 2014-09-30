package discountstrategy;

/**
 *
 * @author Daniel
 */
public class LineItem {
    private ProductInformation product;
    private int quantity;
    private FictionalDatabase db;

    
    
    
    public LineItem(ProductInformation product, int quantity, FictionalDatabase db) {
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
