import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Morgado Morales
 */
class Exc1 extends Exception {
    public Exc1(String msg) { 
        super(msg); 
        System.out.println("Exception1(String msg)");
	}
}

@Test
public class Exc1 {
	public static void f() throws Exception1 {
		System.out.println("Throwing MyException de f()");
		throw new Exception1("de f()");
	}
	public static void main(String[] args) {
		try {
			f();
                        Assert.fail("Debio sacar al menos una excepcion");
		} catch(Exception1 e) {
			System.err.println("atrapada Exception1");
			e.printStackTrace();
		} finally {
			System.out.println("Hecho finalmente");
		}
		
	}	
}
