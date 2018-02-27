/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Anime {

    /**
     * @param args the command line arguments
     */
    private static int arraySize = 3;
    private static Animes arregloAnime[] = new Animes[arraySize];
    private static Scanner leer = new Scanner(System.in);
    
    private static boolean cheackArraySize() {
        for (int i = 0; i < arraySize; i++) {
            if (arregloAnime[i] == null) {
                return true;

            }

        }
        return false;
    }
    
    private static int getArrayPosition (){
        for (int i = 0; i < arraySize; i++){
            if (arregloAnime[i] == null){
                return i;
            }
        }
        return -1;
    }

    public static void opcionEstudios() {
        if (cheackArraySize() == true){
        
        
        Scanner leer = new Scanner(System.in);
        String nombreanime = "";
        String horarioanime = "";
        String creadordelanime = "";

        System.out.println("........Menu de Estudio...............");
        //leer.nextLine();
        System.out.println("Ingrese nombre de Anime");
        nombreanime = leer.nextLine();
        System.out.println("Ingrese horario del Anime (Inicio 16:00 -  Fin 21:00 )");
        horarioanime = leer.nextLine();
        System.out.println("Ingrese Estudio creadora del anime");
        creadordelanime = leer.nextLine();
                     
        Animes anime = new Animes(nombreanime, horarioanime, creadordelanime);
        arregloAnime [getArrayPosition()] = anime;
    } else {
            System.out.print ("Ya no hay horarios disponibls para su anime");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;

        do {
            try {
                System.out.println(".....................");
                System.out.println("________Menu_________");
                System.out.println("#1 *Estudios*");
                System.out.println("#2 *Televisora*");
                System.out.println("#3 *Salir*");
                System.out.println("_____________________");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        opcionEstudios();

                        

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                }

            } catch (InputMismatchException ex) {
                System.out.println("ERROR - Ingrese un valor numerico - ");
            }

        } while (opcion != 3);

    }

}
