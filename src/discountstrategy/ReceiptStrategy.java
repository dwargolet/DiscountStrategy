package discountstrategy;

/**
 *
 * @author dworgolet
 */
public interface ReceiptStrategy {
    public abstract void printReceipt();
    public abstract void addLineItem(String productID, int quantity);
}
