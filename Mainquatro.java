import java.util.Scanner;
public class Mainquatro {
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);
        Double total;

        System.out.println("Insira o número de termos: ");
        Double n = myObj.nextDouble();

        System.out.println("Insira o valor inicial:");
        Double a1 = myObj.nextDouble();

        System.out.println("Insira a razão");
        Double q = myObj.nextDouble();

        Double s; s = Math.pow(q, n);

        total = a1 * (s - 1)/ q - 1;

        System.out.println("O resultado é: "+ total);
        
        myObj.close();



    }
}
