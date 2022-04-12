import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.println ("Fatorial");
        System.out.println ("============");
        System.out.println ("Insira o número");

        int x = myObj.nextInt();
        int f = x;

        
        while (x > 1){
            f = f *(x-1); x--;
                              }
            System.out.println(f);
        


        myObj.close();

        
        
    }
}