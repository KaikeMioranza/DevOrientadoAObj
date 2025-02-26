
import java.util.Scanner;

public class Hello{
    
    public static void HelloWorld(){
        System.out.println("Hello World!");
    }
    public static void OlaMundo(){
        System.out.println("Ola Mundo!");
    }
    public static void HolaQueTal(){
        System.out.println("Hola, que tal");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            
        
            System.out.println("Digite um dos números abaixo para executar um metodo:\n"
                            + "[1]Para imprimir a palavra 'Hello World'\n"
                            + "[2]Para imprimir a palavra 'Olá mundo'\n"
                            + "[3]Para imprimir a palavra 'Hola que tal`\n" 
                            + "[0]Para sair");
            int executar = sc.nextInt();
            
            switch (executar) {
                case 1:
                    HelloWorld();
                    break;
                case 2:
                    OlaMundo();
                break;
                case 3:
                    HolaQueTal();
                break;
                case 0 :
                    System.out.println("Saindo!");
                    sair = true;
                break;
                default:
                    System.out.println("Você não digitou o número correto! Tente novamente");                    
                    
            }   
            
        }
        sc.close();
    }
}