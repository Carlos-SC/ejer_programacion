
package num_aleatorios;

public class Ejercicio_15 {
    public static void main(String[] args) {
        
        String conjunto = "";
        String nota = "";
        
        for (int i = 0; i <= (int)(Math.random()*7); i++) {
            conjunto = "";
            for (int j = 0; j < 4; j++) {
                
                int azar = (int)(Math.random()*7);
                
                switch (azar) {
                    case 0:
                        nota = "do";
                        break;
                    case 1:
                        nota = "re";
                        break;
                    case 2:
                        nota = "mi";
                        break;
                    case 3:
                        nota = "fa";
                        break;
                    case 4:
                        nota = "sol";
                        break;
                    case 5:
                        nota = "la";
                        break;
                    case 6:
                        nota = "si";
                        break;
                    default:
                }
                conjunto = conjunto+" "+nota;
            }
            System.out.print(" "+conjunto+" |");
        }
        System.out.print("|");
    }
}
