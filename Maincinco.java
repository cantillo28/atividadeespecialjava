import java.util.Scanner;
public class Maincinco {
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);

        int total;

        System.out.println("Entre com a velocidade inicial: ");
        int vo = myObj.nextInt();

        System.out.println("Entre com o espaço inicial: ");
        int so = myObj.nextInt();

        System.out.println("Entre com a aceleração: ");
        int a = myObj.nextInt();
        
        System.out.println("Entre com o instante inicial: ");
        int t = myObj.nextInt();

        int c;
        c = a*t;

        int s = 1;

        for (int i = 1; i<= c; i++){
            s = s * 2;
        }

        total = so + vo * t + s / 2;

        System.out.println("O resultado é: "+ total);

        

        myObj.close();

    }
}
