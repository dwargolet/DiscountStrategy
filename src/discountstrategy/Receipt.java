package discountstrategy;

/**
 *
 * @author Daniel
 */
public class Receipt {

    private ReceiptStrategy receipt;
  
    
    /**
     * the constructor
     * @param receipt instance of the receiptStrategy
     */
    public Receipt(ReceiptStrategy receipt) {
        this.receipt = receipt;
    }
    
    
    /**
     * this method adds a line item by taking in a productID and quantity
     * @param productID the products unique identifier
     * @param quantity the quantity being bought
     */
    public void addLineItem(String productID, int quantity){
        receipt.addLineItem(productID, quantity);
    }
    
    /**
     * this method prints the receipt
     */
    public void printReceipt(){
        receipt.printReceipt();
    }
    
}
