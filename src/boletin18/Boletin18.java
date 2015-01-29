package boletin18;

public class Boletin18 {

    public static void main(String[] args) {
        int[] numeros = new int[6];
        //int[] notas = new int [30];
        int[] notas = {8, 6, 2, 5};
        String[] alumnos = {"aa", "bb", "ee", "ff"};

        MetodosArray.numRandom(numeros, 50);
        MetodosArray.imprimirArrayReves(numeros);

        //MetodosArray.numRandom(notas,10);
        MetodosArray.imprimirArrayReves(notas);

        MetodosArray.numAprobados(notas);
        MetodosArray.notaMedia(notas);
        MetodosArray.notaMax(notas);

        //MetodosAlumnos.nombresRandom(notas);
        MetodosAlumnos.notaAlumno(alumnos, notas);
        MetodosAlumnos.alumnoAprobado(alumnos, notas);
        MetodosAlumnos.ordenarNotas(notas, alumnos);
        MetodosAlumnos.notaAlumno(alumnos, notas);

    }

}
