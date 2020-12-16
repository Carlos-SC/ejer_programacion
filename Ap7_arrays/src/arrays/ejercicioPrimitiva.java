package arrays;

public class ejercicioPrimitiva {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print("\nCombinación "+(i+1)+": ");
            int[] loteria = new int[7];
            
            for (int j = 0; j < loteria.length; j++) {
                int azar = (int) (Math.random() * 49) + 1;
                boolean repe = false;

                for (int z = 0; z <= j; z++) {
                    if (loteria[z] == azar) {
                        j--;
                        z = j;
                        repe = true;
                    }
                }

                if (!repe) {
                    loteria[j] = azar;
                }
            }
            
            for (int j = 0; j < 6; j++) {
                System.out.print(loteria[j]+" ");
            }
            System.out.print(" Complementario: "+loteria[6]);
            
            int azar = (int)(Math.random()*9);
            System.out.print(" Reintegro: "+azar);
        }
    }
}
