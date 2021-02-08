package examen3;

public class ejercicio1 {

    public static void main(String[] args) {
        int[][] tabla = new int[9][9];
        int[] diagPrincipal = new int[9];
        int[] diagSecundaria = new int[9];
        int[] filaCentral = new int[9];
        int[] columnaCentral = new int[9];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                int azar = (int) (Math.random() * 2);
                if (azar == 0) {
                    tabla[i][j] = (int) (Math.random() * -50 - 1);
                } else {
                    tabla[i][j] = (int) (Math.random() * 50 + 1);
                }

                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < tabla.length; i++) {
            diagPrincipal[i] = tabla[i][i];
            System.out.print(diagPrincipal[i] + " ");
        }

        System.out.println("");
        System.out.print("Diagonal secundaria: ");
        int j = 8;
        for (int i = 0; i < tabla.length; i++) {
            diagSecundaria[i] = tabla[i][j];
            j--;
            System.out.print(diagSecundaria[i] + " ");
        }

        System.out.println("");
        System.out.print("Fila central: ");
        j = 4;
        for (int i = 0; i < tabla[j].length; i++) {
            filaCentral[i] = tabla[j][i];
            System.out.print(filaCentral[i] + " ");
        }

        System.out.println("");
        System.out.print("Columna central: ");
        j = 4;
        for (int i = 0; i < tabla.length; i++) {
            columnaCentral[i] = tabla[i][j];
            System.out.print(columnaCentral[i] + " ");
        }
    }
}
