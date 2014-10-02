
package discountstrategy;

/**This is the startup class, used to initialize and start the program, as well
 * as end it by utilizing the endTransaction method.
 *
 * @author Daniel
 * @version 1.00 
 */
public class StartUp {
    public static void main(String[] args) {
        
        
       Register r = new Register();
       r.startTransaction("Dr4g0n", new FictionalDatabase ());
//       r.addItem("1A1", 2);
       r.endTransaction();
       
        r.startTransaction("313Den", new FictionalDatabase ());
//       r.addItem("1A1", 2);
       r.endTransaction();
       

        
    }
}
