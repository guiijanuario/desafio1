import java.text.DecimalFormat;
import java.util.Scanner;

public class desafioModulo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0");

        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        double random = (int)(Math.random() * range - 1);

        System.out.println("Numero Random: " + formatador.format(random));
    }
}
