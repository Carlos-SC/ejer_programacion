package num_aleatorios;

public class Ejercicio_11 {

    public static void main(String[] args) {
        int contSuspenso = 0;
        int contSuficiente = 0;
        int contBien = 0;
        int contNotable = 0;
        int contSobresaliente = 0;
        
        for (int i = 0; i < 20; i++) {

            int azar = (int) (Math.random() * 11);
            
            switch (azar) {
                case 0:
                    System.out.println(azar + " : Suspenso");
                    contSuspenso += 1;
                    break;
                case 5:
                    System.out.println(azar + " : Suficiente");
                    contSuficiente += 1;
                    break;
                case 6:
                    System.out.println(azar + " : Bien");
                    contBien += 1;
                    break;
                case 7:
                    System.out.println(azar + " : Notable");
                    contNotable += 1;
                    break;
                case 9:
                    System.out.println(azar + " : Sobresaliente");
                    contSobresaliente += 1;
                    break;
                default:
            }
        }
        
        System.out.println("Suspensos: "+contSuspenso);
        System.out.println("Suficientes: "+contSuficiente);
        System.out.println("Bienes: "+contBien);
        System.out.println("Notables: "+contNotable);
        System.out.println("Sobresalientes: "+contSobresaliente);
    }
}
