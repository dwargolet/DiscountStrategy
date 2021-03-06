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

    
    /**
     * this method finds the customer by matching the customerID
     * @param customerID the unique string that is used to locate the customer
     * @return the customer that matches the customerID
     */
    CustomerInformation customer;
    @Override
    public CustomerInformation findCustomer(String customerID){
       
        for(CustomerInformation cust : customers){
            if(customerID.equals(cust.getCustomerID())){
                customer = cust;
                break;
            }
        }
        return customer;
    }
    
    
//    @Override
//    public void addCustomerToDataBase(final CustomerInformation customer){
//        CustomerInformation[] tempCustomers = new CustomerInformation[customers.length + 1];
//        System.arraycopy(customers, 0, tempCustomers, 0, customers.length);
//        tempCustomers[customers.length] = customer;
//        customers = tempCustomers;
//    }
    
    
    private final ProductInformation[] products = {
        new ProductInformation ("1A1", "Pants", 4.99, new FlatRateDiscount(2)),
        new ProductInformation ("2B2", "Skirt", 9.99, new EmployeeDiscount(.15)), 
        new ProductInformation ("3C3", "Shoes", 6.99, new NoDiscount())
    };
    
   
    ProductInformation product;
    
    /**
     * This method loops through the products array, matches the product id and
     * returns the corresponding product
     * @param productID the unique identifier
     * @return 
     */
    
    @Override
    public ProductInformation findProduct(String productID){            
        for(ProductInformation p : products){
            if(productID.equals(p.getProductID())){
                product = p;
                break;
            }
        }
        return product;
        
    }
    
//      @Override
//      public void addProductToDataBase(final ProductInformation product){      
//        ProductInformation [] tempItems = new ProductInformation[products.length + 1];
//        System.arraycopy(products, 0, tempItems, 0, products.length);
//        tempItems[products.length] = product;
//        products = tempItems;
//      }
}
