package pkg24550326_examen_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int empate = 0, favor = 0, contra = 0;
        
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
                empate++;
            } else if ((respuesta == 1 && compu == 3) ||
                       (respuesta== 2 && compu == 1) || 
                       (respuesta == 3 && compu == 2)) {
                
                
                
                System.out.println("Yei, Ganaste");
                favor++;
            } else {
                System.out.println("Vuelve a intentarlo ");
                contra++;
            }
            System.out.println("Desea seguir jugando? SI = 1, NO = 2");
            jugar = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Es una lastima");
        System.out.println("Contador Final: ");
        System.out.println("Empate = " + empate);
        System.out.println("Tu = " + favor);
        System.out.println("Computadora = " + contra);
        System.out.println("Bai :P ");
    }
    }
