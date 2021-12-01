import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Fileoutput {
    BufferedReader br;
    void ReadFile(){
        try{
            File file = new File("timer.txt");

            for(int i = 0;;i++){
                br = new BufferedReader(new FileReader(file));
                String line = br.readLine();
                if(line == null){
                    break;
                }
                StringTokenizer st = new StringTokenizer(line," ");
                System.out.println(i + ":" + st.nextToken() + ":" + st.nextToken() + ":" + st.nextToken());
            }
        } catch (IOException ex){
            System.out.println("you cannot read file");
        }
    }
}
