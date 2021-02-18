package examen3;

public class ejercicio2_A {

    public static void main(String[] args) {
        String Letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Numeros = "0123456789";
        String Signos = ".,;!¡";

        int[] cont = new int[4];
        String contra = "";
        while (cont[0] < 2 || cont[1] < 4 || cont[2] < 2 || cont[3] < 1) {
            int azar = (int) (Math.random()*4);
            
            if (azar == 0 && cont[0] < 2) {
                int azar2 = (int)(Math.random()*26);
                contra += Letras.charAt(azar2);
                cont[0]++;
            } else if (azar == 1 && cont[1] < 4) {
                int azar2 = (int)(Math.random()*26);
                contra += Letras.toLowerCase().charAt(azar2);
                cont[1]++;
            } else if (azar == 2 && cont[2] < 2) {
                int azar2 = (int)(Math.random()*10);
                contra += Numeros.charAt(azar2);
                cont[2]++;
            } else if (azar == 3 && cont[3] < 1) {
                int azar2 = (int)(Math.random()*5);
                contra += Signos.charAt(azar2);
                cont[3]++;
            }
        }
        System.out.println(contra);
    }
}
