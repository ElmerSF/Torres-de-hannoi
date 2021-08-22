/*
Resumen del algoritmo
 Entrada: Tres varillas origen A, auxiliar B, destino C, con la varilla A origen ordenada

Salida: La varilla destino C

sí varilla A origen =={1\} entonces:
mover el disco 1 de  la varilla A de origen a la Varila C de destino (insertarlo arriba de la varilla de destino)
terminar
si no
    hanoi(Varilla A origen, Varilla C destino, Varilla C auxiliar)     //mover todas las fichas menos la más grande (n) a la varilla auxiliar
mover disco n a varilla C destino                //mover la ficha grande hasta la varilla final
hanoi (Varilla B auxiliar, Varilla A origen,  Varilla C destino)          //mover todas las fichas restantes, 1...n–1, encima de la ficha grande (n)
terminar
 */
package tareahanoi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elmer
 */
public class Algoritmo {
    File archivo; //para poder manipular el archivo
    public FileWriter escribir;//para poder llenar los datos
    public PrintWriter reglon;//para agregar un nuevo reglon con información
    public int discos =6;
     public void Solucionpasoapaso(){ //funcion para crear un archivo de texto con la solución al problema para después presentarlo en pantalla
    
        try {
                             
                archivo = new File("Solucion Hanoi.txt");
                escribir = new FileWriter(archivo, true);
                reglon = new PrintWriter(escribir);
                reglon.print("\n SOLUCION PARA HANOI CON: " + discos + " discos \n\n" );
                Hanoi(discos, 1, 2, 3);
                reglon.print("\n FINAL DE LA SOLUCION \n\n" );
                reglon.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Algoritmo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void Hanoi(int discos, int A, int B, int C)
    {
        
        if (discos == 1)//caso base
        {
            
            reglon.println("Pasar disco de la varilla: " + A + " a la varilla: " + C);
        }
        else{
            
            Hanoi(discos-1, A, C, B );
            
            reglon.println("Pasar disco de la varilla: " + A + " a la varilla: " + C);  
            Hanoi(discos-1, B, A, C);
            
        }
    }
    
}
