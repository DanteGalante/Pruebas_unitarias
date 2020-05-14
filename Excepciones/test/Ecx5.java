import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
/**import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Alan Morgado Morales
 */
public class Exc5 {
    private static int[] ia = new int[2];
    static int x = 5;
    
    @Test
    public Exc5() {
        	
        while(true) {
            try {
                ia[x] = 1;
                System.out.println(ia[x]);
                break;	
            } catch(ArrayIndexOutOfBoundsException e) {
                System.err.println(
                        "Se ha atrapado ArrayIndexOutOfBoundsException");
                e.printStackTrace();
                x--;
            } finally {
                System.out.println("Termino?");		
            }
        }
        System.out.println("Esta hecho");
    }	
}