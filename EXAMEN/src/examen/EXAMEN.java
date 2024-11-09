import java.util.Scanner;
import java.util.Random;

public class EXAMEN {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("¿Desea jugar?");
        System.out.println("""
                           1) si
                           2) No
                           """);
        int jugar=scanner.nextInt();
        
        while(jugar==1){
           
            System.out.println("Bienvenido a Piedra, Papel o Tijeras!");
            System.out.println("Elige tu opción: ");
            System.out.println("1 - Piedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tijeras");

            
            int respuesta = scanner.nextInt();
            

            if (respuesta < 1 || respuesta > 3) {
                System.out.println("Opción inválida --> Inténtalo de nuevo");
              
            }

            int compu = random.nextInt(3);

            System.out.println("Tu elección: " + respuesta);
            System.out.println("Elección de la computadora: " + compu);

            
            if (respuesta == compu) {
                System.out.println("Lo siento, es un empate");
            
            } else if ((respuesta == 1 && compu == 3) ||
                       (respuesta== 2 && compu == 1) || 
                       (respuesta == 3 && compu == 2)) {
                
                System.out.println("Yei, Ganaste");
           
            } else {
                System.out.println("Vuelve a intentarlo ");
            }
            
        }
        System.out.println("Es una lastima");
        System.out.println("Bai :P ");
    }
}

    
    

