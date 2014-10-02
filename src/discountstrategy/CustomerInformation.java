package discountstrategy;

/**
 *
 * This class is responsible for obtaining Customer information
 * such as their full name and a customer ID.
 * 
 * 
 * @author Daniel
 * @version 1.00 
 */
public class CustomerInformation {
    
    private String customerFullName;
    private String customerID;

    public CustomerInformation(String customerFullName, String customerID) {
        this.customerFullName = customerFullName;
        this.customerID = customerID;
    }

    /**
     * returns the string containing the customers full name
     * @return variable for the customers full name
     */
    public String getCustomerFullName() {
        return customerFullName;
    }

    
    /**
     * sets the customers full name
     * @param customerFullName variable for the customers name
     */
    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    
    /**
     * for retrieving the customer ID
     * @return the customer ID is returned
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * sets the customer ID
     * @param customerID variable for the customer ID
     */
    
    /**
     * method sets the customer ID, validates that a number is entered
     * @param customerID variable for the customer ID
     */
    
    public void setCustomerID(final String customerID) {
        if(customerID == null || customerID.isEmpty()){
           throw new IllegalArgumentException();
       } 
        
        this.customerID = customerID;
    }
    
   
    
}
