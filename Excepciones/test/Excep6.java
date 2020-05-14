import excepciones.ExcepLogger6_1;
import excepciones.ExcepLogger6_2;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author olver
 */
public class Excep6 {
    static void excepcionConLogger_1() throws ExcepLogger6_1{
        throw new ExcepLogger6_1();
    }
    static void excepcionConLogger_2() throws ExcepLogger6_2{
        throw new ExcepLogger6_2();
    }
    
    @Test
    public void testExcepcionConLogger(){
        try{
            excepcionConLogger_1();
        }catch(Exception ExcepLogger6_1){}
        try{
            excepcionConLogger_2();
        }catch(Exception ExcepLogger6_2){}
    }
}
