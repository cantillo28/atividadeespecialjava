
public class Maindois {
    public static void main(String[] args){
        
        int resultado = 0;
        
        for(int i = 0; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                resultado += i;
            }
        }
        
        System.out.println("A soma dos multiplos de 3 e 5 abaixo de 1000: " + resultado);
    }
}