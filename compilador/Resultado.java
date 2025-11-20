import java.util.Scanner;
public class Resultado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 10;
        double y = 5.5;
        boolean ativo = true;
        System.out.println(x);
        if (x > 5) {
        System.out.println(y);
        }
        else {
        System.out.println(0);
        }
        while (x > 0) {
        x = x - 1;
        System.out.println(x);
        }
        scanner.close();
    }
}

