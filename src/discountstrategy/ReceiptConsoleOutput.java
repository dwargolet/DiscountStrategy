package discountstrategy;
import java.util.Date;
import java.text.NumberFormat;

/**
 *This class implements a receipt interface, allowing for flexibility. This 
 * specific class prints to the console
 * @author Daniel
 * @version 1.00 
 */

public class ReceiptConsoleOutput implements ReceiptStrategy{
    
   private LineItem[] lineItems = new LineItem[0];
   private LineItem temp = new LineItem();
   private CustomerInformation customer;
   private double grandTotal;
   private  double totalDiscount;
   private double subTotal;
   private FakeDatabaseStrategy db = new  FictionalDatabase();
   private Date date = new Date(); 
   private String customerID;
   private NumberFormat nf = NumberFormat.getCurrencyInstance();
   private double tax = .05;
   private double taxes;
//   private StoreInformationStrategy store = new StoreDelafield();
   
    public ReceiptConsoleOutput(String customerID, String productID, int quantity) {
        addLineItem(productID, quantity);
        this.customerID = customerID;
        lookupCustomer();
        
    }
   
    /**
     * this method is inherited from the ReceiptStrategy and adds a line item
     * to the array, which is cycled through in the receipt
     * @param item the item being added
     */
    @Override
    public void addToLineItemArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    /**
     * method looks up the customer by their unique identifier
     */
    public void lookupCustomer(){
        customer = db.findCustomer(customerID);
    }
  
    /**
     * this method is inherited from the ReceiptStrategy and adds a line item
     * to the receipt
     * @param productID the unique product identifier
     * @param quantity how many items are being bought
     */
    @Override
    public void addLineItem(String productID, int quantity ){
        temp = temp.addLineItem(productID,quantity);
        addToLineItemArray(temp);
    }
       
   
    /**
     * this method is inherited from the ReceiptStrategy and prints the receipt,
     * by cycling through the lineItems array
     */
    @Override
    public void printReceipt(){
       System.out.println("          KOHLS    ");
//       System.out.println(store.printStoreInfo());
       System.out.println("  " + date.toString());
       System.out.println("   Welcome back " + customer.getCustomerFullName() + "!");
       System.out.println("-------------------------------");
      for(int i = 0; i < lineItems.length; i++){
        
        System.out.println(lineItems[i].getLineItemData());
        subTotal += lineItems[i].getDiscountedPrice();
        totalDiscount += lineItems[i].getDiscount();
        }
      System.out.println("-------------------------------");
      System.out.println("               Subtotal: " + nf.format(subTotal));
      taxes = subTotal * tax;
      System.out.println("               Tax " + tax + "%  " + nf.format(taxes));
      grandTotal = subTotal + taxes;
      System.out.println("            Your Savings: " + nf.format(totalDiscount));
      System.out.println("       Total Amount Due: " + nf.format(grandTotal));
   }
      
 
       
   }
    
    
    

