package discountstrategy;

/**
 *
 * @author Daniel
 */
public class Register {
//    private ReceiptStrategy receipt;
    
    
    private ReceiptConsoleOutput receipt;

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
