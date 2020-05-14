import excepciones.ExcepLogger6_1;
import excepciones.ExcepLogger6_2;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author olver
 * 
 * Exercise 6:   (1) Create two exception classes, each of which performs its own logging automatically. Demonstrate that these work. 
 */
public class TestExcep6 {
    static void excepcionConLogger_1() throws ExcepLogger6_1{
        throw new ExcepLogger6_1();
    }
    static void excepcionConLogger_2() throws ExcepLogger6_2{
        throw new ExcepLogger6_2();
    }
    
    @Test
    public void testExcepcionConLogger_1(){
        try{
            excepcionConLogger_1();
        }catch(ExcepLogger6_1 e){}
    }
    @Test
    public void testExcepcionConLogger_2(){
        try{
            excepcionConLogger_2();
        }catch(Exception ExcepLogger6_2){}
    }
}
