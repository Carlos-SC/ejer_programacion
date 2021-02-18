
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num;
        
        System.out.println("Introduce un número de 10 dígitos");
        do {
            num = s.nextLine();
        } while (num.length() < 10);

        long dig = Long.parseLong(num) % 97;

        if (dig >= 10) {
            System.out.println(num + " " + dig);
        } else if (dig >= 0 && dig <= 9) {
            System.out.println(num + " 0" + dig);
        }
    }
}
