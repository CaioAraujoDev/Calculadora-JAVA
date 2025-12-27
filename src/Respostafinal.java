import java.util.Scanner;

public class Respostafinal {
    public static String resf(Scanner entusua){
        entusua.nextLine();
        while (true){
            String o = entusua.nextLine();
            if(o.equalsIgnoreCase("s") || o.equalsIgnoreCase("n")){
                return o;
            }
            System.out.println("Resposta invalida tente novamente");
        }
    }
}
