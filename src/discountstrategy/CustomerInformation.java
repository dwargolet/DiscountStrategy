package discountstrategy;

/**
 *
 * @author Daniel
 */
public class CustomerInformation {
    
    private String customerFullName;
    private String customerID;

    public CustomerInformation(String customerFullName, String customerID) {
        this.customerFullName = customerFullName;
        this.customerID = customerID;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getCustomerID() {
        return customerID;
    }

    
    public void setCustomerID(final String customerID) {
        if(customerID == null || customerID.isEmpty()){
           throw new IllegalArgumentException();
       } 
        
        this.customerID = customerID;
    }
    
   
    
}
