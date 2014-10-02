package discountstrategy;

/**This is a superclass, it manages the work by calling on the other classes
 * 
 * @author Daniel
 * @version 1.00 
 */
public class Register {
    private ReceiptStrategy receipt;
    

    public void startTransaction(String customerID, FakeDatabaseStrategy database){
        receipt = new ReceiptConsoleOutput(customerID, database);
    }
    
    public void addItem(String productID, int quantity){
        receipt.addLineItem(productID, quantity);
    }
    
    public void endTransaction(){
        receipt.printReceipt();
    }
    
}
