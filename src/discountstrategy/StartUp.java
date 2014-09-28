
package discountstrategy;

/**
 *
 * @author Daniel
 */
public class StartUp {
    public static void main(String[] args) {
        
        
        
        
        DiscountStrategy a = new EmployeeDiscount();
        Product ball = new Product("ABCD", "A Ball", 3, a);
        
        
        System.out.println(ball.getProductDescription() + " " + ball.getProductID());
    }
}
