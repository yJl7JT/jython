package less04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HelloPython {
    public static void main(String[] args) {
        Process p;
        String cmd = "python ExecByJava.py \"Hello\" \"World\"";//利用CMD命令调用python，包含两个参数
        try {
            p = Runtime.getRuntime().exec(cmd);
            InputStream fis = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            System.out.println(" ==>"+br.readLine());
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
