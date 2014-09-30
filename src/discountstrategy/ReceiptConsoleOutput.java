package discountstrategy;

/**
 *
 * @author Daniel
 */
public class ReceiptConsoleOutput implements ReceiptStrategy{
    
   private LineItem[] lineItems = new LineItem[0];
   private int quantity;
   private CustomerInformation customer;
   private double grandTotal;
   private  double totalWithoutDiscount;
   private FakeDatabaseStrategy db;
   
   
    public ReceiptConsoleOutput(String customerID, FakeDatabaseStrategy db) {
        this.db = db;
        customer = findCustomer(customerID);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
//    private CustomerInformation locateCustomer(String customerID){
//        return db.findCustomer(customerID);
//    }
//   
    
    private void addToLineItemArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
  
    public void addLineItem(String productID, int quantity){
        LineItem item = new LineItem(productID,db,quantity);
        addToLineItemArray(item);
    }
    
   
    
    
   /**
   * This method is inherited from the interface and will print the receipt
   * to the console.
   * @param lineItem all of the data listed inside the lineItem
   */ 
   @Override
   public void printReceipt(){
       System.out.println(" ");
      for(LineItem item : lineItems){
          System.out.println(item.getLineItemData());
      }
   }
    
    

       
       
   }
    
    
    
    

