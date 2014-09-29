
package discountstrategy;

/**
 *
 * @author Daniel
 */
public class FictionalDatabase {
    
    private CustomerInformation[] customers = {
        new CustomerInformation ("Denzel Washington", "313Den"),
        new CustomerInformation ("Bruce Lee", "Dr4g0n")    
    };
    
    
    CustomerInformation customer;
    
    public void findCustomer(String customerID){
        for(CustomerInformation cust : customers){
            if(customerID.equals(customer.getCustomerID())){
                customer = cust;
            }
        }
    }
    
    
    
    private ProductInformation[] products = {
        new ProductInformation ("1A1", "T-shirt", 1, 4.99, new FlatRateDiscount()),
        new ProductInformation ("2B2", "Skirt", 3, 9.99, new EmployeeDiscount())    
    };
    
    ProductInformation product;
    
      public void findProduct(String productID){
        for(ProductInformation p : products){
            if(productID.equals(product.getProductID())){
                product = p;
            }
        }
    }
    
    
}
