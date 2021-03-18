package examen4;

import examen4.Carretera;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        Carretera[] carreteras = new Carretera[50];
        
        rellenarArray(carreteras);
        visualizarCarreteras(carreteras);
    }

    public static void rellenarArray(Carretera[] array) {
        String codigo = "";
        String titular = "";
        double numKm = 0;
        double numKmDeficientes = 0;
        int anchoMetros = 0;
        int numCarriles = 0;

        for (int i = 0; i < array.length; i++) {
            codigo = "carretera" + i;
            switch ((int) (Math.random() * 4)) {
                case 0:
                    titular = "estatal";
                    break;
                case 1:
                    titular = "autonomico";
                    break;
                case 2:
                    titular = "provincial";
                    break;
                case 3:
                    titular = "local";
                    break;
            }
            numKm = (int) (Math.random() * 481) + 20;
            numKmDeficientes = (int) (Math.random() * numKm);
            anchoMetros = (int) (Math.random() * 16) + 3;
            numCarriles = (int) (Math.random() * 5) + 2;
            
            array[i] = new Carretera(codigo, titular, numKm, numKmDeficientes, anchoMetros, numCarriles, "");
        }
    }
    
    public static void visualizarCarreteras(Carretera[] array) {
        double suma = 0;
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i].getNumKmDeficientes();
        }
        
        media = suma/array.length;
        System.out.println("Carreteras con KM deficientes inferiores a "+media+" km:");
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNumKmDeficientes() < media) {
                System.out.println(array[i].toString()+"\n");
            }
        }
    }
}
