package discountstrategy;

/**
 *
 * @author Daniel
 */
public class Register {
    
       
    private ReceiptConsoleOutput receipt;

   
    
    public void startTransaction(CustomerInformation custID){
        receipt = new ReceiptConsoleOutput(custID);
    }
    
    public void endTransaction(){
        
    }
    
}
