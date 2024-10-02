package umg.demostracion;

import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.math.MathException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class IntegralPorPartes {
    private final ExprEvaluator evaluador;

    public IntegralPorPartes(){
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "OFF");
        Logger.getLogger("org.matheclipse").setLevel(Level.OFF);
        this.evaluador = new ExprEvaluator();
    }

    public String integrar(String funcion, String variable) throws SyntaxError, MathException {
        IExpr derivada = evaluador.eval("Integrate[" + funcion + "," + variable + "]");
        return derivada.toString();
    }
}

