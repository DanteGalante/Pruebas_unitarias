package excepciones;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author olver
 */
public class ExcepLogger6_1 extends Exception{
    private static Logger primerLogger = Logger.getLogger("Primera excepcion con logger");

    public ExcepLogger6_1(){
        StringWriter rastro = new StringWriter();
        printStackTrace(new PrintWriter(rastro));
        primerLogger.severe(rastro.toString());
    }     
}
