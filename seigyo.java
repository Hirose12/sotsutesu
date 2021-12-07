public class seigyo {
    static Fileinput finp = new Fileinput();
    static Fileoutput fout = new Fileoutput();
    static input inp = new input();
        
    public static void main(String[] args){
        System.out.println("1,input\n2,output");
        int a = Integer.parseInt(inp.word());
        if(a == 1){
            System.out.println("name");
            String name = inp.word();

            System.out.println("time");
            String time = inp.word();

            System.out.println("detail");
            String detail = inp.word();

            finp.WriteFile(name,time,detail);
        }else if(a == 2){
            fout.ReadFile();
        }else{
            System.out.println("error");
        }
    }
}
