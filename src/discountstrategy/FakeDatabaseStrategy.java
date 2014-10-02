package discountstrategy;

/**This is a interface, allowing for the implementation of multiple databases
 *
 * @author dworgolet
 * @version 1.00 
 */
public interface FakeDatabaseStrategy {
     public abstract CustomerInformation findCustomer(String customerID);
     public abstract ProductInformation findProduct(String productID);
     public abstract void addCustomerToDataBase(CustomerInformation Customer);
     public abstract void addProductToDataBase(ProductInformation product);
}
