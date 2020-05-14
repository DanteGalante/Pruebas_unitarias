package excepciones;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 *
 * @author olver
 */
public class ExcepLogger6_2 extends Exception{
    private static Logger segundoLogger = Logger.getLogger("Segunda excepcion con logger");
    
    public ExcepLogger6_2(){
        StringWriter rastro = new StringWriter();
        printStackTrace(new PrintWriter(rastro));
        segundoLogger.severe(rastro.toString());
    }
}
