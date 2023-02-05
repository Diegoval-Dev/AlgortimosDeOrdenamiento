package Controller;

import Model.*;
import UI.UI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static UI ui = new UI();
    public static Generate gn = new Generate();
    public static void main(String[] args) {
        int menu = ui.menu();
        int cant = ui.cant();
        switch (menu){
            case 1:
                GnomeSort(cant);
                break;
            case 2:
                MergeSort(cant);
                break;
            case 3:
                //Quick sort
                break;
            case 4:
                //Radix sort
                break;
            case 5:
                BubbleSort(cant);
                break;
        }
    }
    public static void BubbleSort(int n){
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
        Integer[] arrSinOrdenar = new Integer[n];
        Integer[] arrOrdenado = new Integer[n];
        arrSinOrdenar = gn.numbers(n);
        ui.print("Numeros desordenados");
        imprimirArray(arrSinOrdenar);
        ui.print("Ordenando...");
        arrOrdenado = bubbleSort.sort(arrSinOrdenar,new ComparadorEnteros<Integer>());
        ui.print("Numeros ordenados");
        imprimirArray(arrOrdenado);
    }
    public static void GnomeSort(int n){
        GnomeSort gnS = new GnomeSort();
        Integer[] arrSinOrdenar = new Integer[n];
        Integer[] arrOrdenado = new Integer[n];
        arrSinOrdenar = gn.numbers(n);
        ui.print("Numeros desordenados");
        imprimirArray(arrSinOrdenar);
        ui.print("Ordenando...");
        arrOrdenado = gnS.gnomeSort(arrSinOrdenar, arrSinOrdenar.length);
        ui.print("Numeros ordenados");
        imprimirArray(arrOrdenado);
    }
    public static void MergeSort(int n){
        MergeSort mergeSort = new MergeSort();
        Integer[] arrSinOrdenar = new Integer[n];
        Integer[] arrOrdenado = new Integer[n];
        arrSinOrdenar = gn.numbers(n);
        ui.print("Numeros desordenados");
        imprimirArray(arrSinOrdenar);
        ui.print("Ordenando...");
        arrOrdenado = mergeSort.sort(arrSinOrdenar, 0, arrSinOrdenar.length - 1);
        ui.print("Numeros ordenados");
        imprimirArray(arrOrdenado);
    }
    public static void QuickSort(int n){
        QuickSort quickSort = new QuickSort();
        Integer[] arrSinOrdenar = new Integer[n];
        Integer[] arrOrdenado = new Integer[n];
        arrSinOrdenar = gn.numbers(n);
        ui.print("Numeros desordenados");
        imprimirArray(arrSinOrdenar);
        ui.print("Ordenando...");
        arrOrdenado = quickSort.quickSort(arrSinOrdenar, 0, n - 1);
        ui.print("Numeros ordenados");
        imprimirArray(arrOrdenado);
    }
    public static void imprimirArray(Integer[] arr){

        for(int i = 0; i < arr.length; i++){
            ui.print(String.valueOf(arr[i]));
        }
    }
}