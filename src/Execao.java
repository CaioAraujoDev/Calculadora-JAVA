import java.util.Scanner;

public class Execao {
    public static float lerFloat(Scanner entusua) {
        while (!entusua.hasNextFloat()) {
            System.out.println("Valor invalido tente novamente");
            entusua.next();

        }
        return entusua.nextFloat();
    }
}

