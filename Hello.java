
import java.util.Scanner;

public class Hello{
    public static void HelloWorld(){
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("[1]Para imprimir a palavra Hello World");
        int executar = sc.nextInt();
        
        switch (executar) {
            case 1:
                HelloWorld();
                break;
            default:
                System.out.println("Você não digitou o número correto!");
        }
        sc.close();
    }
}