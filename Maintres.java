import java.util.Scanner;
public class Maintres {
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);
        Double total;
        System.out.println ("Ativade c");
        System.out.println ("============");
        System.out.println ("Insira o número de termos");
        Double n = myObj.nextDouble();

        System.out.println ("Insira o valor inicial");
        double a1 = myObj.nextDouble();

        System.out.println ("Insira o valor final");
        double an = myObj.nextDouble();

        total = n * (a1 + an)/ 2;

        System.out.println ("O resultado foi: "+ total);

        myObj.close();


    }
    
}
