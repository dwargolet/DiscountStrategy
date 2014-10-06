
package discountstrategy;

/**
 *Lower class that implements the StoreInformation interface
 * @author Daniel
 * @version 1.0
 */
public class StoreDelafield implements StoreInformationStrategy{
    private final String address = "3105 Golf Rd, Delafield, WI 53018";
    private final String storeNumber = "44321";
    private final String contactNum = "(262)646-7000";
    
    
    
    private void gatherStoreInfo(){
        System.out.println(getStoreNumber());
        System.out.println(getStoreAddress());
        System.out.println(getStoreContact());
    }
   
    
    
    @Override
    public String getStoreNumber(){
       return storeNumber;
    }
    
    @Override
    public String getStoreAddress(){
     return address;   
    }
    
    @Override
    public String getStoreContact(){
     return contactNum;   
    }

//    @Override
    public void printStoreInfo(){
       gatherStoreInfo();
    }
    
}
