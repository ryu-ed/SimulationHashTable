import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //Construimos tabla hash
        Hashtable ht = new Hashtable();
        ht.put("1","One");
        ht.put("2","Two");
        ht.put("Fv","Five");
        ht.put("seis", "6");        

        String nb1 = (String) ht.get("1");
        String nb2 = (String) ht.get("2");
        String nb5 = (String) ht.get("Fv");
        String nb6 = (String) ht.get("seis");
       

 
        while (!salir) {
            System.out.println("Tabla hash");
            System.out.println("1 -> One");
            System.out.println("2 -> Two");
            System.out.println("Fv -> Five");
            System.out.println("seis -> 6");

            System.out.println("----------------------------------------------------------------------");
            System.out.println("1. Retornar la primera clave");
            System.out.println("2. Retornar la ultima clave");
            System.out.println("3. Retornar la siguiente clave");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("Indice 1 --> " + nb1);
                        System.out.println("Presione cualquier tecla para continuar...");
                        System.in.read();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Indice Fv --> " + nb5);
                        System.out.println("Presione cualquier tecla para continuar...");
                        System.in.read();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("Indice seis --> " + nb6);
                        System.out.println("Presione cualquier tecla para continuar...");
                        System.in.read();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
       
    
}


