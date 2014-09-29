
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
    
    
    
    
    
}
