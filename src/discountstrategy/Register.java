package discountstrategy;

/**This is a superclass, it manages the work by calling on the other classes
 * 
 * @author Daniel
 * @version 1.00 
 */
public class Register {
    private ReceiptStrategy receipt;


    
    
    /**
     * This method creates a new receipt
     * @param customerID
     * @param database 
     */
    public void startTransaction(String customerID, FakeDatabaseStrategy database){
        receipt = new Receipt(customerID, database);
    }
    
    
    
    
    /**
     * this method allows the user to add an item to the receipt
     * @param productID the items unique identifier
     * @param quantity  how many instances of the item there are
     */
    
    public void addItem(String productID, int quantity){
        receipt.addLineItem(productID, quantity);
    }
    
    
    /**
     * This method prints out the receipt with all of the information and ends
     * the transaction
     */
    public void endTransaction(){
        receipt.printReceipt();
    }
    
}
