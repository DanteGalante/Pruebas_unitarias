import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olver
 * 
 * Exercise 3:   (1) Write code to generate and catch an ArraylndexOutOfBoundsException. 
 */
public class TestExcep3 {
    
    @Test
    public void testExcep3_1 (){
        try{
            int[] array = new int[3];
            array[3] = 3;
            Assert.fail("Deberia lanzar una excepcion");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Se ha intendado acceder posicion fuera de rango\n");
            e.printStackTrace();
        }
    }
    @Test
    public void testExcep3_2 (){
        try{
            int[] array = new int[5];
            array[-1] = 3;
            Assert.fail("Deberia lanzar una excepcion");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Se ha intendado acceder posicion fuera de rango\n");
            e.printStackTrace();
        }
    }
    
}
