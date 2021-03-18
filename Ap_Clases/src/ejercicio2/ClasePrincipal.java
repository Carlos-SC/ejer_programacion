package ejercicio2;

public class ClasePrincipal {

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(8, 3, 2021);

        fecha1.imprimete();
        fecha1.incrementate(34);
        fecha1.imprimete();

        Fecha[] fechas = new Fecha[100];
        rellenarArray(fechas);
        
        mostrarAnyo(fechas, 2002);
    }

    /**
     *
     * @param array
     */
    public static void rellenarArray(Fecha[] array) {
        int dia = 0;
        int mes = 0;
        int anyo = 0;

        for (int i = 0; i < array.length; i++) {
            mes = (int) (Math.random() * 12) + 1;
            anyo = (int) (Math.random() * 21) + 2000;
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dia = (int) (Math.random() * 31) + 1;
                    break;
                case 2:
                    dia = (int) (Math.random() * 28) + 1;
                    break;
                default:
                    dia = (int) (Math.random() * 30) + 1;
            }

            array[i] = new Fecha(dia, mes, anyo);
        }
    }
    
    public static void visualizarArray(Fecha[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].imprimete();
        }
    }
    
    public static void mostrarAnyo(Fecha[] array, int anyo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAnyo() == anyo) {
                array[i].imprimete();
            }
        }
    }
}
