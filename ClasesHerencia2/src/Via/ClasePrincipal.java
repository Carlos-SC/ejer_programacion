package Via;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ClasePrincipal {

    static Scanner s = new Scanner(System.in);
    static ArrayList<Via> vias = new ArrayList<Via>();

    public static void main(String[] args) {
        int salir = 0;

        do {
            System.out.print("\nSelecciona una opción: "
                    + "\n1. Listar vías."
                    + "\n2. Añadir vía."
                    + "\n3. Eliminar vía."
                    + "\n4. Salir."
                    + "\nOpción: ");

            int resp = s.nextInt();
            switch (resp) {
                case 1:
                    listarVias();

                    break;
                case 2:
                    addVia();

                    break;
                case 3:
                    System.out.print("Código de la via a eliminar: ");
                    String codigo = s.next();

                    eliminarVia(codigo);
                    break;
                default:
                    salir = 1;
                    System.out.println("Saliendo...");
            }
        } while (salir == 0);

    }

    /*----------------------------------------------------------------------------------*/
    public static void addVia() {
        System.out.print("Seleccione tipo de vía:"
                + "\n1. Ciclovia."
                + "\n2. Sendero."
                + "\n3. Estrada."
                + "\nSeleccón: ");
        int via = s.nextInt();

        while (via < 1 || via > 3) {
            System.out.print("Haz una selección válida: ");
            via = s.nextInt();
        }

        System.out.print("Código de la vía: ");
        String codigo = s.next();
        System.out.print("Titular de la vía: ");
        String titular = s.next();
        System.out.print("Número de KM: ");
        double numKm = s.nextDouble();
        System.out.print("Número de KM deficientes: ");
        double numKmDef = s.nextDouble();
        System.out.print("Ancho en metros: ");
        int ancho = s.nextInt();
        System.out.print("Fecha de Inauguración(dd/mm/yyyy): ");
        String[] fech = s.next().split("/");
        LocalDate fecha = LocalDate.of(Integer.parseInt(fech[2]), Integer.parseInt(fech[1]), Integer.parseInt(fech[0]));

        switch (via) {
            case 1:
                System.out.print("Color de la ciclovía (hexadecimal): ");
                String color = s.next();

                Via ciclovia = new Ciclovia(codigo, titular, numKm, numKmDef, ancho, fecha, color);
                vias.add(ciclovia);
                break;
            case 2:
                System.out.print("¿Está pavimentado el sendero?(si/no): ");
                String resp = s.next();
                boolean pavimentado = false;
                if (resp.toLowerCase().equals("si")) {
                    pavimentado = true;
                }

                Via sendero = new Sendero(codigo, titular, numKm, numKmDef, ancho, fecha, pavimentado);
                vias.add(sendero);
                break;
            case 3:
                System.out.print("Número de carriles de la estrada: ");
                int numCarriles = s.nextInt();

                Via estrada = new Estrada(codigo, titular, numKm, numKmDef, ancho, fecha, numCarriles);
                vias.add(estrada);
                break;
            default:
        }

    }

    public static void listarVias() {
        System.out.println("\n----LISTA----");
        System.out.println("");
        for (int i = 0; i < vias.size(); i++) {
            System.out.println(vias.get(i).toString());
            System.out.println("");
        }
    }

    public static void eliminarVia(String codigo) {
        for (int i = 0; i < vias.size(); i++) {
            if (vias.get(i).getCodigo().equals(codigo)) {
                vias.remove(i);
                i = vias.size();
            }
        }
    }

    public static String viaMasAntigua() {
        int pos = 0;
        long mayor = 0;
        for (int i = 0; i < vias.size(); i++) {
            if (vias.get(i).aniosDeFuncionamiento() > mayor) {
                mayor = vias.get(i).aniosDeFuncionamiento();
                pos = i;
            }
        }

        return vias.get(pos).toString();
    }
}
