import java.util.Scanner;

public class alanCevre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int r;
        double pi=3.14;

        System.out.print("Dairenin r'sini giriniz: ");
        r= input.nextInt();

        double Alan = pi * r * r;
        double Cevre = 2 * pi * r;

        System.out.println("Alan: " + Alan);
        System.out.print("Cevre: " + Cevre);
    }
}
