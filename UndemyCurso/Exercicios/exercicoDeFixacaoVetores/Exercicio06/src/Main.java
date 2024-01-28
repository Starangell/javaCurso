import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        int[] vectC = new int[n];

        for (int i = 0; i < n; i++) {
            vectC[i] = vectA[i] + vectB[i];

        }
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vectC[i]);

        }


        sc.close();
    }
}

/*
 *Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 *terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 *o vetor C gerado.
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetores.java
 */


