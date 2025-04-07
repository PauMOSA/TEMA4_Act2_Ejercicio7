/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2_ejercicio7;
import java.util.Scanner;
/**
 *
 * @GLORIA PAULINA MORENO SALDIVAR
 */
public class Act2_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        
        String Letra;
        
        
        do
        {
            System.out.print("Ingresa la letra a identificar: ");
            Letra = asignar.nextLine();
            switch (Letra)
        {
                case " ":
                    break;
            case "a":
                 System.out.println("Esta letra es vocal");
                break;
            case "e":
                 System.out.println("Esta letra es vocal");
                break;
            case "i":
                 System.out.println("Esta letra es vocal");
                break;
            case "o":
                 System.out.println("Esta letra es vocal");
                break;
            case "u":
                 System.out.println("Esta letra es vocal");
                break;
            default:
                System.out.println("Esta letra es consonante");
                break;
        }
            
        }while(Letra != " " || Letra != null);
    }
    
}
