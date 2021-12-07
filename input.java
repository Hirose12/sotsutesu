import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class input {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word(){
        try{
            String a = br.readLine();
            return a;
        } catch (IOException ex) {
            System.out.println("入力エラーです:E-012");
            return "error";
        }
    }
    
}
