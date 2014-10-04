package discountstrategy;

/**This is a interface, allowing for the implementation of multiple databases
 *
 * @author dworgolet
 * @version 1.00 
 */
public interface FakeDatabaseStrategy {
    
    /**
     * a method for each database to find a customer
     * @param customerID the customers unique ID
     * @return 
     */
     public abstract CustomerInformation findCustomer(String customerID);
     
     /**
      * a method for each database to find a product
      * @param productID the products unique ID
      * @return 
      */
     public abstract ProductInformation findProduct(String productID);
     
     
     
     
//     public abstract void addCustomerToDataBase(CustomerInformation Customer);
//     public abstract void addProductToDataBase(ProductInformation product);
}
