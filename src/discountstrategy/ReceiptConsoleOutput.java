package discountstrategy;
import java.util.Date;
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
   
   
    public ReceiptConsoleOutput(String customerID, String productID, int quantity) {
        addLineItem(productID, quantity);
        this.customerID = customerID;
        lookupCustomer();
        
    }
   
    @Override
    public void addToLineItemArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public void lookupCustomer(){
        customer = db.findCustomer(customerID);
    }
  
    @Override
    public void addLineItem(String productID, int quantity ){
        temp = temp.addLineItem(productID,quantity);
        addToLineItemArray(temp);
    }
       
   
    
    @Override
    public void printReceipt(){
       System.out.println(date.toString());
       System.out.println(" Welcome back " + customer.getCustomerFullName());
       System.out.println("--------------------------");
      for(int i = 0; i < lineItems.length; i++){
        subTotal += lineItems[i].getDiscountedPrice();
        System.out.println(lineItems[i].getLineItemData()+" $" + subTotal);
        totalDiscount += lineItems[i].getDiscount();
        }
      grandTotal = subTotal;
      System.out.println(" Your Savings: $" + totalDiscount);
      System.out.println("Total Amount Due: $" + grandTotal);
   }
      
    
    
   //testing
    public static void main(String[] args) {
//        ReceiptConsoleOutput receipt = new ReceiptConsoleOutput("Dr4g0n",new FictionalDatabase());
//        receipt.addLineItem("1A1", 2);
        ReceiptConsoleOutput receipt = new ReceiptConsoleOutput("Dr4g0n", "1A1", 6);
        receipt.addLineItem("2B2", 2);
        receipt.printReceipt();


    }

        
       
       
   }
    
    
    

