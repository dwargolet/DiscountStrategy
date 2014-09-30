package discountstrategy;

/**
 *
 * @author Daniel
 */
public class ReceiptConsoleOutput {
    
   private LineItem lineItem;
   private int quantity;
   private CustomerInformation customer;
   private double total;

   private FakeDatabaseStrategy db;

    public ReceiptConsoleOutput(CustomerInformation customerID) {
        this.customer = db.findCustomer(customerID);
    }
   
    
   
   
   public void totalSales(LineItem lineItem){
      total = lineItem.getProductPrice() * quantity;
       
   }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
   
   
//    public LineItem[] getLineItems() {
//        return lineItems;
//    }
//   
    public void addLineItem(int quantity, LineItem lineItem){
        
  
    }    
    
    

        
   
   
   
    
   
   
   /**
    * This method will print the receipt
    * @param lineItem all of the data listed inside the lineItem
    */ 
//   public void printReciept(LineItem lineItem){
       
   }
    
    
    
    

