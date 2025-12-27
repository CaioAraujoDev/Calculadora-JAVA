import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       float n1, n2, resultado;
       int escolha;
       String rf;
       Scanner entusua = new Scanner(System.in);
       while(true) {
           System.out.println("CALCULADORA BASICA\n\n");
           System.out.println("Qual operação você ira fazer ?\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");
           escolha = entusua.nextInt();
           if(escolha > 4){
               System.out.println("Numero invalido tente novamente");
               continue;
           }
           System.out.println("Escreva seu primeiro numero:");
           n1 = Execao.lerFloat(entusua);
           System.out.println("Escreva seu segundo numero:");
           n2 = Execao.lerFloat(entusua);

           switch (escolha) {
               case 1:
                   resultado = n1 + n2;
                   System.out.println("O resultado da soma é: " + resultado);
                   break;
               case 2:
                   resultado = n1 - n2;
                   System.out.println("O resultado da subtração é: " + resultado);
                   break;
               case 3:
                   resultado = n1 * n2;
                   System.out.println("O resultado da multiplicação é: " + resultado);
                   break;
               case 4:
                   try {
                       resultado = n1 / n2;
                   }catch(ArithmeticException e){
                       System.out.println("Divisão por 0 não existe, tente novamente");
                       entusua.close();
                       continue;
                   }
                   System.out.println("O resultado da divisão é: " + resultado);
           }
           System.out.println("Deseja fazer outro calculo ?(S/N)");
           rf = Respostafinal.resf(entusua);
           if (rf.equalsIgnoreCase("N")){
               System.exit(0);
           }

       }

    }
}