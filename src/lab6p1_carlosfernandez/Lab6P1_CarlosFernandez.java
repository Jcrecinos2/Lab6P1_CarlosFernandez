/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_carlosfernandez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cdfer
 */
public class Lab6P1_CarlosFernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=====Main Menu====");
        System.out.println("1. Drunk dazed ");
        System.out.println("2. SubArrays Manual ");
        System.out.println("3. Busqueda Lineal ");
        System.out.println("4. Salir ");
        
        

        while (opcion != 4) {
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("BIENVENIDO A DRUNKDAZED");
                    DrunkDazed();
                }//FIN del case 1 
                case 2 -> {
                    System.out.println("BIENVENIDO A SUBARRAYS MANUAL");
                    System.out.print("Ingrese el indice DESDE: ");
                    System.out.print("Ingrese el indice HASTA: ");
                    
                    
                }//FIN del case 2 
                case 3 -> {
                    System.out.println("BIENVENIDO A BUSQUEDA LINEAL");
                }//FIN DEL CASE 3

                case 4 -> {
                    System.out.println("SALIENDO.......");
                }//FIN DEL CASE 4
                default -> {
                    System.out.println("ERROR ESTA OPCION NO EXISTE");
                }

            }//FIN del switch

        }//FIN del while 

       
        
    }//FIN del main 
    
    public static void DrunkDazed() {
        int Tamanio = 11;

        char[] Caminito = new char[Tamanio];
        for (int i = 0; i < Tamanio; i++) {
            Caminito[i] = '_';

        }// FIN del for para imprimir el arreglo vacio
        int PosicionIncicial = Tamanio / 2;
        Caminito[PosicionIncicial] = 'x';
        String ExtremoDeSalida = "";

        while (true) {
            int posicion = 0;
            Random Randomizador = new Random();
            int pasos = Randomizador.nextInt(2);
            
            if (pasos == 1) {
                posicion++;
            }else if (pasos == 0) {
                posicion -- ;
            }
        }
        


        
    }//FIN del metodo para el ejercicio 1 

    public static int[] CopyofRangeManual( int LimiteMenor, int LimiteMayor){
      int NuevoSize = LimiteMayor - LimiteMenor; 
      int[] ArrayNuevo = new int[NuevoSize]; 
      int SizeOriginal = 10;
      Random Randomizador = new Random();
     int[] ArrayOriginal = new int[SizeOriginal];
     
        for (int i = 0; i <SizeOriginal ; i++) {
            ArrayOriginal[i] =Randomizador.nextInt(1,50);
            System.out.println(ArrayOriginal);
        }
        
      
      
      return ArrayNuevo;
    }//FIN del CopyofRangeManual
}// FIN de la clase
