package boletin18;

public class MetodosArray {

    public static void numRandom(int[] num, int numMax) {
        for (int i = 0; i < num.length; i++) {
            int numRandom = (int) (Math.random() * numMax + 1);
            num[i] = numRandom;
        }
    }

    public static void visualizar(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void imprimirArrayReves(int[] num) {
        for (int i = (num.length - 1); i >= 0; i--) {
            System.out.println("elemento: " + (i + 1) + " --> " + num[i]);
        }
    }

    public static void numAprobados(int[] notas) {
        int aprobados = 0, suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
    }

    public static void notaMedia(int[] notas) {
        int totalNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            totalNotas = totalNotas + notas[i];
        }
        System.out.println("Meda de notas: " + totalNotas / notas.length);
    }

    public static void notaMax(int[] notas) {
        int aux = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > aux) {
                aux = notas[i];

            }
        }
        System.out.println("Nota maxima: " + aux);
    }

}
