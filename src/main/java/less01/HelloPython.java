package less01;

import org.python.core.Py;
import org.python.core.PyFile;
import org.python.core.PySystemState;
import org.python.util.PythonInterpreter;

public class HelloPython {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("print('hello')");
    }
}