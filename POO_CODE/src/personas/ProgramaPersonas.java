package personas;
import cuentas.*;

import java.util.Scanner;

public class ProgramaPersonas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        String nombre = s.nextLine();
        System.out.print("Introduce un DNI: ");
        String dni = s.nextLine();
        System.out.print("Introduce una edad: ");
        int edad = s.nextInt();     
        
        Persona alguien = new Persona(nombre,edad,dni);
        
        System.out.println(alguien.mostrar());
        
        if (alguien.esMayorDeEdad()) {
            System.out.println(alguien.getNombre()+" es mayor de edad");
        } else {
            System.out.println(alguien.getNombre()+" no es mayor de edad");
        }
        
        Cuenta cuenta1 = new CuentaJoven(alguien, 100,(byte)1);
    
        cuenta1.retirar(50);
        System.out.println("DATOS DE LA CUENTA: ");
        System.out.println(cuenta1.mostrar());
    }
}
