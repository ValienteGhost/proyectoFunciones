package com.mycompany.proyectofunciones;

import static com.mycompany.proyectofunciones.Funciones.buscarsueldosmayor;
import static com.mycompany.proyectofunciones.Funciones.descuentoslegales;
import static com.mycompany.proyectofunciones.Funciones.ingresardatos;
import static com.mycompany.proyectofunciones.Funciones.menu;
import static com.mycompany.proyectofunciones.Funciones.mostrarArray;
import static com.mycompany.proyectofunciones.Funciones.rangodevalores;
import static com.mycompany.proyectofunciones.Funciones.reemplazarsueldos;
import java.util.Scanner;

public class Proyectofunciones {

    
    public static void main(String[] args) {
        int sueldos []={3800000,450000,5400000,4200000,6800000,5800000,
                        3600000,525000,475000,6200000,658000,468000};
   
        int opcion = 0;Scanner sc = new Scanner(System.in);
        do{
            opcion = menu();
            switch(opcion){
                case 0:
                System.out.print("Hasta Luego");
                break;
                case 1:
                    ingresardatos(sueldos,sc);
                    break;
                case 2:
                    mostrarArray(sueldos);
                    break;
                case 3:
                    int min = 0;
                    int max = 0;
                    System.out.print("Ingrese valor Minimo");
                    min = sc.nextInt();
                    System.out.print("Ingrese valor Maximo");
                    max = sc.nextInt();
                    rangodevalores(sueldos,min,max);
                    break;
                case 4:
                    int buscar;
                    int reemplazar;
                    System.out.print("Ingrese sueldo a buscar");
                    buscar = sc.nextInt();
                    System.out.print("Ingrese sueldo a remplazar");
                    reemplazar = sc.nextInt();
                    reemplazarsueldos(sueldos,buscar,reemplazar);
                    break;
                case 5:
                    buscarsueldosmayor(sueldos);
                    break;
                case 6:
                    descuentoslegales(sueldos);
                    break;
                    default:
                    System.out.print("opcion no valida");
                    
    }
        
    }while(opcion!=0);
       
    }    
  }
