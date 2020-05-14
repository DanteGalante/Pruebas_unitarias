import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Morgado Morales
 */
public class Exc2 {
    
    public Exc2() {
      
@Test
        private static Integer i = null;	
		try {
			System.out.println(i.toString());
                         Assert.fail("Debio sacar al menos una excepcion");
		} catch(NullPointerException e) {
			System.err.println("Error capturado");
			e.printStackTrace();
		} 
		try {
			i = 10;
			System.out.println(i.toString());
                         Assert.fail("Debio sacar al menos una excepcion");
		} catch(NullPointerException e) {
			System.err.println("Error capturado");
			e.printStackTrace();
		} finally {
			System.out.println("Todo Ok");
		}
	}
}