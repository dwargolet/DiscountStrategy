package discountstrategy;

/**
 *This class implements a receipt interface, allowing for flexibility. This 
 * specific class prints to the console
 * @author Daniel
 * @version 1.00 
 */
public class ReceiptConsoleOutput implements ReceiptStrategy{
    
   private LineItem[] lineItems = new LineItem[0];
   
   private CustomerInformation customer;
//   private double grandTotal;
//   private  double totalWithoutDiscount;
   private FakeDatabaseStrategy db;

   
    public ReceiptConsoleOutput(String customerID, FakeDatabaseStrategy db) {
        this.db = db;
        customer = db.findCustomer(customerID);
    }
   
    
    private void addToLineItemArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
  
    @Override
    public void addLineItem(String productID, int quantity ){
        LineItem item = new LineItem (productID,quantity, db);
        addToLineItemArray(item);
    }
       
   
    @Override
    public void printReceipt(){
       System.out.println(customer.getCustomerFullName());
      
      for(LineItem item : lineItems){
          System.out.println(item.getLineItemData());
      }
   }
      
   //testing
    public static void main(String[] args) {
        ReceiptConsoleOutput receipt = new ReceiptConsoleOutput("Dr4g0n",new FictionalDatabase());
//        receipt.addLineItem("1A1", 2);
        receipt.printReceipt();


    }

        
       
       
   }
    
    
    

