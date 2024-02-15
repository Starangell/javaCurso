import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int sum = 0, pares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                pares++;
                sum += vect[i];
            }
        }

        if (sum != 0) {
            double resuts = (double) sum / pares;
            System.out.printf("MEDIA DOS PARES = %.1f", resuts);

        } else {
            System.out.println("NEMHUM NUMERO PAR ");
        }
        sc.close();

    }
}


/*
 *Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 *aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 *digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/media_pares.java
 */
//OBS: Tive ajuda de thisiscleverson


