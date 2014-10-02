package discountstrategy;

/**
 *
 * @author Daniel
 */
public class ReceiptConsoleOutput implements ReceiptStrategy{
    
   private LineItem[] lineItems = new LineItem[0];

   private CustomerInformation customer;
   private double grandTotal;
   private  double totalWithoutDiscount;
   private FakeDatabaseStrategy db;
   
   
    public ReceiptConsoleOutput(String customerID, FakeDatabaseStrategy db) {
        this.db = db;
        customer = locateCustomer(customerID);
    }

    
    private CustomerInformation locateCustomer(String customerID){
        return db.findCustomer(customerID);
    }
   
    
    private void addToLineItemArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
  
    public void addLineItem(String productID, int quantity){
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
    
    

       
       
   }
    
    
    
    

