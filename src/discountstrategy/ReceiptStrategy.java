package discountstrategy;

/**This is an interface that allows for flexibility. Different types of receipts
 * are able to utilize these methods
 *
 * @author dworgolet
 * @version 1.00 
 */
public interface ReceiptStrategy {
    public abstract void printReceipt();
    public abstract void addLineItem(String productID, int quantity);
    public abstract void addToLineItemArray(LineItem item);
    
}
