package discountstrategy;

/**
 *
 * @author Daniel
 */
public class ReceiptConsoleOutput {
    
   private LineItem[] lineItems = new LineItem[0];
   private int quantity;
   private CustomerInformation customer;
   private double grandTotal;
   private  double totalWithoutDiscount;
   private FakeDatabaseStrategy db;
   
   
    public ReceiptConsoleOutput(String customerID, FakeDatabaseStrategy) {
        this.database = db;
        customer = findCustomer(customerID);
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
    
  

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
   public void printReceipt(){
       System.out.println(" ");
      for(LineItem item : lineItems){
          System.out.println(item.getLineItemData());
      }
   }
    
    

        
   
   
   
    
   
   
   /**
    * This method will print the receipt
    * @param lineItem all of the data listed inside the lineItem
    */ 
//   public void printReciept(LineItem lineItem){
       
   }
    
    
    
    

