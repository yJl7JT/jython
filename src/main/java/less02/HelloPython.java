package less02;

import org.python.util.PythonInterpreter;

public class HelloPython {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("D:/zz.py");
    }
}