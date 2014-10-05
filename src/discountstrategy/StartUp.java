
package discountstrategy;

/**This is the startup class, used to initialize and start the program, as well
 * as end it by utilizing the endTransaction method.
 *
 * @author Daniel
 * @version 1.00 
 */
public class StartUp {
    public static void main(String[] args) {
        
        Register r = new Register(new Receipt(new ReceiptConsoleOutput("Dr4g0n","1A1",2)));
       r.addItem("2B2", 2);
       r.endTransaction();
       
//        r.startTransaction("313Den", new FictionalDatabase ());
//       r.addItem("1A1", 2);
//       r.endTransaction();
       

        
    }
}
