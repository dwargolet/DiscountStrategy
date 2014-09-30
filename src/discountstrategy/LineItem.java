package discountstrategy;

/**
 *
 * @author Daniel
 */
public class LineItem {
    private ProductInformation product;
//    private LineItem [] lineItems;
    
    
    private FictionalDatabase db;

    
    
    
    public LineItem(ProductInformation product, FictionalDatabase db) {
        this.product = product;
        
        this.db = db;
    }
    
    

    public ProductInformation getProduct() {
        return product;
    }

    public void setProduct(ProductInformation product) {
        this.product = product;
    }
    
    public String getProductDescription() {
        return product.getProductDescription();
    }

    public String getProductID() {
        return product.getProductID();
    }
    
    public double getProductPrice() {
        return product.getProductPrice();
    }

    
//    public int getQuantity() {
//        return product.getQuantity();
//    }
    
//    public double getProductTotal(){
//       return product.getProductPrice() * product.getQuantity();
//    }
//    
    
//    public void writeLineItem(){
//        System.out.println(product.getProductDescription() +
//                " " + product.getProductID() + 
//                " " + product.getProductPrice() +
//                " " + product.getQuantity() +
//                " " + getProductTotal());
//    }
}
