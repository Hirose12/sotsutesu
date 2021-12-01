import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileinput {
    BufferedWriter bw;
    void WriteFile(String name,String time,String detail){
        try{
            File file = new File("timer.txt");
            bw = new BufferedWriter(new FileWriter(file));
            String line;
            line = name + " " + time + " " + detail;
            
            bw.write(line);
            bw.newLine();
        } catch (IOException ex){
            System.out.println("you cannot write in file.");
        }
    }
}
