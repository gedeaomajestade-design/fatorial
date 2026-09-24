import java.util.Scanner;
public class Fatorial{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("=========================");
        System.out.println(" FARTORIAL " );
        System.out.println("=========================");

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int fatorial = 1;

        for (int i = numero ; i >= 1; i -- ) {
            fatorial = fatorial * i;
        }

            System.out.println("o fatorial de " + numero + " é " + fatorial );





    }
}