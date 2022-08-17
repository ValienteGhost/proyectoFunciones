package com.mycompany.proyectofunciones;

import java.util.Scanner;

public class Funciones {
     public static int menu(){
    int opc = 0;    
    Scanner sc = new Scanner(System.in);
    System.out.print("0 salir");
    System.out.print("1 ingresar sueldos");
    System.out.print("2 mostrar sueldos");
    System.out.print("3 mostrar un rango de sueldos");
    System.out.print("4 remplazar un sueldo");
    System.out.print("5 obtener el sueldo mayor");
    System.out.print("6 realizar descuentos legales");
    opc = sc.nextInt();
    return opc;
    }
    public static void ingresardatos(int sueldos[],Scanner sc){
        
    }
    public static void mostrarArray(int sueldos[]){
        
    }
    public static void rangodevalores(int sueldos[],int min,int max){
        
    }
    public static boolean reemplazarsueldos(int sueldos[],int buscar,int reemplazar){
        
        return true;
        
    }
    public static void buscarsueldosmayor(int sueldos[]){
        
    }
    public static void descuentoslegales(int sueldos[]){
        
    }
    
}
