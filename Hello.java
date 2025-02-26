
import java.util.Scanner;

public class Hello{
    
    public static void HelloWorld(){
        System.out.println("Hello World!");
    }
    public static void OlaMundo(){
        System.out.println("Ola Mundo!");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" [1]Para imprimir a palavra Hello World \n [2]Para imprimir a palavra Olá mundo\n" );
        int executar = sc.nextInt();
        
        switch (executar) {
            case 1:
                HelloWorld();
                break;
            case 2:
            OlaMundo();
            break;
            default:
                System.out.println("Você não digitou o número correto!");
        }
        sc.close();
    }
}