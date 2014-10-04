package discountstrategy;

/**
 *
 * @author Daniel
 */
public class Receipt {

    private ReceiptStrategy receipt;
  
    public Receipt(ReceiptStrategy receipt) {
        this.receipt = receipt;
    }
    
    public void addLineItem(String productID, int quantity){
        receipt.addLineItem(productID, quantity);
    }
    
    public void printReceipt(){
        receipt.printReceipt();
    }
    
}
