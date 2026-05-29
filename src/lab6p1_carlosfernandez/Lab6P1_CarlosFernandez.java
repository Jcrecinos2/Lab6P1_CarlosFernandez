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

        while (opcion != 4) {
            System.out.println("=====Main Menu====");
            System.out.println("1. Drunk dazed ");
            System.out.println("2. SubArrays Manual ");
            System.out.println("3. Busqueda Lineal ");
            System.out.println("4. Salir ");
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
                    int Desde = entrada.nextInt();
                    System.out.print("Ingrese el indice HASTA: ");
                    int Hasta = entrada.nextInt();

                    CopyofRangeManual(Desde,Hasta);
//                    int SizeOriginal = 10;
//                      int[] ArrayOriginal = new int[SizeOriginal];
//                      Random Randomizador = new Random();
//                    for (int i = 0; i < SizeOriginal; i++) {
//                        ArrayOriginal[i] = Randomizador.nextInt(50)+1;
//                        System.out.print("["+ArrayOriginal[i]+"]");
//                    }
//        

                }//FIN del case 2 
                case 3 -> {
                    System.out.println("BIENVENIDO A BUSQUEDA LINEAL");
                    BusquedaLineal();
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

        int PasosTotales = 0;

        while (true) {
            Random Randomizador = new Random();
            int pasos = Randomizador.nextInt(2);
            if (pasos == 1) {
                PosicionIncicial++;
            } else {
                PosicionIncicial--;
            }//FIN del else como 0 y 1 son los unicos valores elimine el otro if y lo cambie por un else 
            PasosTotales++;
            
            if ( PosicionIncicial< 0) {
                ExtremoDeSalida = "Izquierda";
                break;
            }else if(PosicionIncicial >= Tamanio ){
                ExtremoDeSalida = "Derecha";
                break;
            }
            Caminito[PosicionIncicial] = 'x';            
            
        }//FIN DEL WHILE para determinar pasos direccion y si se salio 
        
        System.out.println("Camino Final: ");
        
        for (int i = 0; i <Tamanio ; i++) {
            System.out.print("[ " +Caminito[i] + "] ");
        }//FIN del for para imprimir el camino final

        
        System.out.println("El peaton se Salio por el extremo: "+ ExtremoDeSalida);
        System.out.println("Numero de Pasos: "+PasosTotales);


        
    }//FIN del metodo para el ejercicio 1 

    public static int[] CopyofRangeManual(int LimiteMenor, int LimiteMayor) {
        Scanner entrada = new Scanner(System.in);
        int NuevoSize = LimiteMayor - LimiteMenor;
        int[] ArrayNuevo = new int[NuevoSize];
        int SizeOriginal = 10;
        Random Randomizador = new Random();
        int[] ArrayOriginal = new int[SizeOriginal];
        System.out.println("Array Original: ");
        for (int i = 0; i < SizeOriginal; i++) {
            ArrayOriginal[i] = Randomizador.nextInt(50) + 1;
            System.out.print("[" + ArrayOriginal[i] + "]");
           
        }//FIN DEL FOR que crea el array orignal 
         System.out.println("");

        return ArrayNuevo;
    }//FIN del CopyofRangeManual

    public static boolean BusquedaLineal() {
        boolean NUMExiste = false;
        int Size = 10;
        Scanner entrada = new Scanner(System.in);
        int[] ArrayaBuscar = new int[Size];
        Random Randomizador = new Random();
        System.out.print("Array Generado: ");
        for (int i = 0; i < Size; i++) {
            ArrayaBuscar[i] = Randomizador.nextInt(50) + 1;

            System.out.print("[" + ArrayaBuscar[i] + "]");
        }//FIN DEL FOR que crea el array a buscar con numeros entre 1 y 50
        System.out.println("");
        System.out.print("Ingrese un Numero a buscar: ");
        int Buscar = entrada.nextInt();

        int Repeticiones = 0;
        int Posicion1 = -1; //-1 siempre esta afuera del arreglo entonces
        for (int i = 0; i < Size; i++) {
            if (ArrayaBuscar[i] == Buscar) {
                NUMExiste = true;
                Repeticiones++;
                if (Posicion1 == -1) {
                    Posicion1 = i;

                }//FIN del if 1
            }//FIN del if 2

        }//FIN del For para recorrer el arreglo 
        if (NUMExiste) {
            System.out.println("El Numero Fue econtrado");
            System.out.println("Primera Posicion encontrada :" + Posicion1);
            System.out.println("Cantidad de aparaciones: " + Repeticiones);

        } else {
            System.out.println("El numero no existe");
        }

        return NUMExiste;
    }//FIN del metodo de Busqueda 
}// FIN de la clase

