package umg.demostracion;

import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IExpr;

public class IntegralPorPartes {

    public static void main(String[] args) {
        //evaluador de expresiones
        ExprEvaluator eval = new ExprEvaluator();

        //Funcion a integrar
        String integralPorPartes = "Integrate(x * Sin(x), x)";

        //Evaluar la expresion
        IExpr result = eval.eval(integralPorPartes);

        //resultado
        System.out.println("El resultado de la integral es: " + result);
    }
}