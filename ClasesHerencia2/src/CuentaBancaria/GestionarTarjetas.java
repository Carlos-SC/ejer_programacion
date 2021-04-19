package CuentaBancaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GestionarTarjetas {

    static Scanner s = new Scanner(System.in);
    static ArrayList<Tarjeta> listaTarjetas = new ArrayList<Tarjeta>();

    public static void main(String[] args) {
        crearDatos();

        String[] opciones = {"Transferencia", "Listar tarjetas", "Eliminar tarjetas", "Salir"};
        int salir = 1;
        int opc = 0;

        do {
            /*
            System.out.println("Seleccione una opción: "
                    + "\n1. Transferencia."
                    + "\n2. Listar tarjetas."
                    + "\n3. Eliminar tarjetas."
                    + "\n4. Salir.");
            System.out.print("\n-->");
            opc = s.nextInt();
             */
            opc = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (opc) {
                case 0:
                    System.out.println("Seleccione dos tarjetas: ");
                    for (int i = 0; i < listaTarjetas.size(); i++) {
                        System.out.println((i + 1) + ". " + listaTarjetas.get(i).getNumeroTarjeta());
                    }
                    int t1 = s.nextInt();
                    int t2 = s.nextInt();

                    transferencia(listaTarjetas.get(t1 - 1), listaTarjetas.get(t2 - 1));
                    break;
                case 1:
                    /*
                    System.out.println("Indique que tipo de tarjetas quiere listar: "
                            + "\n1. CREDITO"
                            + "\n2. DEBITO"
                            + "\n3. MONEDERO"
                            + "\n4. FINANCIACION");
                    System.out.print("-->");
                    opc = s.nextInt();
                     */
                    String[] tiposTarj = {"CREDITO", "DEBITO", "MONEDERO", "FINANCIACION"};
                    opc = JOptionPane.showOptionDialog(null, "Selecciona un tipo de tarjeta", "Listar tarjetas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tiposTarj, tiposTarj[0]);
                    switch (opc) {
                        case 0:
                            listarTarjetas(Tarjeta.TipoTarjeta.valueOf("CREDITO"));
                            break;
                        case 1:
                            listarTarjetas(Tarjeta.TipoTarjeta.valueOf("DEBITO"));
                            break;
                        case 2:
                            listarTarjetas(Tarjeta.TipoTarjeta.valueOf("MONEDERO"));
                            break;
                        case 3:
                            listarTarjetas(Tarjeta.TipoTarjeta.valueOf("FINANCIACION"));
                            break;
                        default:
                            listarTarjetas(Tarjeta.TipoTarjeta.valueOf("CREDITO"));
                    }
                    break;
                case 2:
                    System.out.println("Indique el número de tarjeta a eliminar: ");
                    String num = s.next();
                    eliminarTarjeta(num);
                    System.out.println("");
                    break;
                default:
                    salir = 0;
            }
        } while (salir == 1);

    }

    public static void crearDatos() {
        int cont = 0;
        while (listaTarjetas.size() < 10) {
            cont++;
            String nombreCliente = "Cliente" + cont;
            String numCuenta = "";
            LocalDate fechaApertura = LocalDate.now();
            double interes = 0;
            double saldo = 0;
            String numTarjeta = "";
            String nombre = "VISA";
            Tarjeta.TipoTarjeta tipoTarjeta;

            for (int i = 0; i < 11; i++) {
                numTarjeta += (int) (Math.random() * 10) + "";
            }

            switch ((int) (Math.random() * 4)) {
                case 0:
                    tipoTarjeta = Tarjeta.TipoTarjeta.valueOf("CREDITO");
                    break;
                case 1:
                    tipoTarjeta = Tarjeta.TipoTarjeta.valueOf("DEBITO");
                    break;
                case 2:
                    tipoTarjeta = Tarjeta.TipoTarjeta.valueOf("MONEDERO");
                    break;
                case 3:
                    tipoTarjeta = Tarjeta.TipoTarjeta.valueOf("FINANCIACION");
                    break;
                default:
                    throw new AssertionError();
            }

            for (int i = 0; i < 20; i++) {
                numCuenta += (int) (Math.random() * 10) + "";
            }
            saldo = (double) (Math.random() * 10000);

            Tarjeta tarjeta = new Tarjeta(numTarjeta, nombre, tipoTarjeta, nombreCliente, numCuenta, fechaApertura, interes, saldo);
            listaTarjetas.add(tarjeta);
        }
    }

    public static void transferencia(Tarjeta Tcargo, Tarjeta Tabono) {
        System.out.println("Cantidad a retirar/ingresar: ");
        double cant = s.nextDouble();

        if (Tcargo.reintegro(cant)) {
            System.out.println("Dinero retirado con éxito.");
            if (Tabono.ingreso(cant)) {
                System.out.println("Dinero ingresado con éxito.");
            } else {
                System.out.println("Fallo al ingresar el dinero.");
            }
        } else {
            System.out.println("La operación de retirada falló.");
        }
    }

    public static void listarTarjetas(Tarjeta.TipoTarjeta tipo) {
        for (int i = 0; i < listaTarjetas.size(); i++) {
            if (listaTarjetas.get(i).getTipoTarjeta().equals(tipo)) {
                System.out.println(listaTarjetas.get(i).visualizaDatos());
                System.out.println("");
            }
        }
    }

    public static void eliminarTarjeta(String numTarjeta) {
        for (int i = 0; i < listaTarjetas.size(); i++) {
            if (listaTarjetas.get(i).getNumeroTarjeta().equals(numTarjeta)) {
                listaTarjetas.remove(i);
                i = listaTarjetas.size();
            }
        }
    }
}
