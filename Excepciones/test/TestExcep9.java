import excepciones.ExcepGeneralizada_1;
import excepciones.ExcepGeneralizada_2;
import excepciones.ExcepGeneralizada_3;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olver
 * Exercise 9:   (2) Create three new types of exceptions. Write a class with a method that throws all three.
 *                   in main( ), call the method but only use a single catch clause that will catch all 
 *                   three types of exceptions.
 */
public class TestExcep9 {
    static void excepcionesGeneralizadas(int opc) throws ExcepGeneralizada_1, ExcepGeneralizada_2, ExcepGeneralizada_3{
        switch(opc){
            case 1:
                throw new ExcepGeneralizada_1();
            case 2:
                throw new ExcepGeneralizada_2();
            case 3:
                throw new ExcepGeneralizada_3();
        }
    }
    
    @Test
    public void tresEnUno(){
        for(int i=1;i<=3;i++){
            try{
                excepcionesGeneralizadas(i);
                Assert.fail("Debio sacar al menos una excepcion");
            }catch(Exception e){
                e.printStackTrace();
            }            
        }
    }
    
}
