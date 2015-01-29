
package boletin18;


public class ModArray {
    public static void borrarElemento(int[]notas, int posicion){
        for(int i=posicion;i<notas.length-1;i++){
            notas[i]=notas[i+1];
            notas[notas.length]=0;  
        }
        
    }
}
