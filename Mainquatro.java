import java.util.Scanner;
public class Mainquatro {
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);
        int total;

        System.out.println("Insira o número de termos: ");
        int n = myObj.nextInt();

        System.out.println("Insira o valor inicial:");
        int a1 = myObj.nextInt();

        System.out.println("Insira a razão");
        int q = myObj.nextInt();

        int s = 1;

        for (int i = 1; i<= n; i++){
            s = s * q;
        }


        total = a1 * (s - 1)/ q - 1;

        System.out.println("O resultado é: "+ total);
        
        myObj.close();



    }
}
