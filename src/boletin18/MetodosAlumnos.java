package boletin18;

import javax.swing.JOptionPane;

public class MetodosAlumnos {

    public static String nombresRandom(int[] nom) {
        char[] letras = new char[5];
        for (int i = 0; i < letras.length; i++) {
            int numRandom = (int) (Math.random() * 122 + 97);
            char letra = (char) numRandom;
            letras[i] = letra;
        }
        String nombre = String.copyValueOf(letras);
        return nombre;

    }

    public static void notaAlumno(String[] alumno, int[] notas) {
        String nombre = JOptionPane.showInputDialog("Nombre");
        boolean encontrado = false;
        for (int i = 0; i < alumno.length; i++) {
            encontrado = alumno[i].equals(nombre);
            if (encontrado == true) {
                System.out.println("Alumno " + alumno[i] + " con nota: " + notas[i]);
                break;
            }

        }
        if (encontrado == false) {
            System.out.println("Alumno no encontrado");
        }
    }

    public static void alumnoAprobado(String[] alumnos, int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(alumnos[i] + notas[i]);
            }
        }
    }

    public static void ordenarNotas(int[] notas, String[] alumnos) {
        int aux, cambio = 0;
        String auxAlumnos;

        do {
            cambio = 0;
            for (int i = 0; i < notas.length - 1; i++) {
                if (notas[i] > notas[i + 1]) {
                    aux = notas[i];
                    notas[i] = notas[i + 1];
                    notas[i + 1] = aux;

                    auxAlumnos = alumnos[i];
                    alumnos[i] = alumnos[i + 1];
                    alumnos[i + 1] = auxAlumnos;

                    cambio = 1;
                }
            }
        } while (cambio != 0);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno: " + alumnos[i] + " Nota: " + notas[i]);
        }
    }
}
