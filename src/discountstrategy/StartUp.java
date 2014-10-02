
package discountstrategy;

/**
 *
 * @author Daniel
 */
public class StartUp {
    public static void main(String[] args) {
        
        
       Register r = new Register();
       r.startTransaction("Dr4g0n", new FictionalDatabase ());
//       r.addItem("1A1", 2);
       r.endTransaction();
       
        

        
    }
}
