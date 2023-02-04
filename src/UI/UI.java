package UI;

import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    public int read(){
        int i = sc.nextInt();
        return i;
    }
    public void print(String n){
        System.out.println(n);
    }
    public int menu(){
        System.out.println("----MENU----");
        System.out.println("Seleccione el algoritmo de ordenamiento que usara");
        System.out.println("1. Gnome sort");
        System.out.println("2. Merge sort");
        System.out.println("3. Quick sort");
        System.out.println("4. Radix sort");
        System.out.println("5. Bubble sort");
        System.out.println("");
        int i = sc.nextInt();
        return i;
    }
    public int cant(){
        System.out.println("ingrese la cantidad de elementos:");
        System.out.println("");
        int i = sc.nextInt();
        return i;
    }
}
