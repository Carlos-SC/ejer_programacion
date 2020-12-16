package arrays;

public class ejercicioDados {

    public static void main(String[] args) {
        int[] frecuencia = new int[6];
        int mayor = 0;
        
        for (int i = 0; i < 10000; i++) {
            int dados = (int)(Math.random()*6)+1;
            
            frecuencia[dados-1]++;
        }
        
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.println((i+1)+": "+frecuencia[i]+" ");
            
            if (mayor<frecuencia[i]) {
                mayor = frecuencia[i];
            }
        }
        
        System.out.println("El mayor es: "+mayor);
    }
}
