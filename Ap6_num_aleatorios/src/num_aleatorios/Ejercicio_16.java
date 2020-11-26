package num_aleatorios;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;
        
        for (int i = 0; i < 3; i++) {
            int azar = (int)(Math.random()*5);
            
            switch (azar) {
                case 0:
                    System.out.print("Corazon ");
                    break;
                case 1:
                    System.out.print("Diamante ");
                    break;
                case 2:
                    System.out.print("Herradura ");
                    break;
                case 3:
                    System.out.print("Campana ");
                    break;
                case 4:
                    System.out.print("Limon ");
                    break;
                default:
            }
            
            if (i==0) {
                figura1 = azar;
            } else if (i==1) {
                figura2 = azar;
            } else  if (i==2) {
                figura3 = azar;
            }
        }
        
        if ((figura1==figura2) && (figura1==figura3)) {
            System.out.println("\nEnhorabuena. has ganado 10 monedas.");
        } else if ((figura1==figura2) || (figura1==figura3) || (figura2==figura3)) {
            System.out.println("\nBien, has recuperado tu moneda.");
        } else {
            System.out.println("\nLo siento, has periddo.");
        }
    }
}
