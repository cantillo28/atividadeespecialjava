import java.util.Scanner;
public class Maincinco {
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);

        Double total;

        System.out.println("Entre com a velocidade inicial: ");
        Double vo = myObj.nextDouble();

        System.out.println("Entre com o espaço inicial: ");
        Double so = myObj.nextDouble();

        System.out.println("Entre com a acelereção: ");
        Double a = myObj.nextDouble();
        
        System.out.println("Entre com o instante inicial: ");
        Double t = myObj.nextDouble();

        total = so + vo * t + (a * t * a * t)/ 2;

        System.out.println("O resultado é: "+ total);

        myObj.close();

    }
}
