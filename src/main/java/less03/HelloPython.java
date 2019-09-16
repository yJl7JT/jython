package less03;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class HelloPython {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("D:/zz.py");
        PyFunction function = (PyFunction)interpreter.get("fib",PyFunction.class);
        PyObject o = function.__call__(new PyInteger(8));
        System.out.println(o.toString());
    }
}
