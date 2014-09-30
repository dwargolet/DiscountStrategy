
package discountstrategy;

/**
 *This class is responsible for storing, finding, and adding
 * Customer and Product Objects.  It is a fake database and implements
 * a fake database interface, allowing for flexibility.
 *
 * @author Daniel
 * @version 1.00 
 * 
 */


public class FictionalDatabase implements FakeDatabaseStrategy{
    
    private CustomerInformation[] customers = {
        new CustomerInformation ("Denzel Washington", "313Den"),
        new CustomerInformation ("Bruce Lee", "Dr4g0n")       
    };
    
    
    CustomerInformation customer;
    
    @Override
    public void findCustomer(String customerID){
        for(CustomerInformation cust : customers){
            if(customerID.equals(customer.getCustomerID())){
                customer = cust;
                break;
            }
        }
    }
    
    @Override
    public void addCustomerToDataBase(final CustomerInformation customer){
        CustomerInformation[] tempCustomers = new CustomerInformation[customers.length + 1];
        System.arraycopy(customers, 0, tempCustomers, 0, customers.length);
        tempCustomers[customers.length] = customer;
        customers = tempCustomers;
    }
    
    
    private ProductInformation[] products = {
        new ProductInformation ("1A1", "T-shirt", 4.99, new FlatRateDiscount()),
        new ProductInformation ("2B2", "Skirt", 9.99, new EmployeeDiscount()),      
    };
    
    ProductInformation product;
    
    @Override
      public void findProduct(String productID){
          
          
        for(ProductInformation p : products){
            if(productID.equals(product.getProductID())){
                product = p;
                break;
            }
        }
    }
    
      @Override
      public void addProductToDataBase(final ProductInformation product){      
        ProductInformation [] tempItems = new ProductInformation[products.length + 1];
        System.arraycopy(products, 0, tempItems, 0, products.length);
        tempItems[products.length] = product;
        products = tempItems;
      }
}
