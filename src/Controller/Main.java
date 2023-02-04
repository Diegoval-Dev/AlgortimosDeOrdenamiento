package Controller;

import Model.BubbleSort;
import Model.ComparadorEnteros;
import Model.Generate;
import UI.UI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        int menu = ui.menu();
        int cant = ui.cant();
        switch (menu){
            case 1:
                //Gnome sort
                break;
            case 2:
                //Merge sort
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
        Generate gn = new Generate();
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
        Integer[] arrSinOrdenar = new Integer[n];
        Integer[] arrOrdenado = new Integer[n];
        arrSinOrdenar = gn.numbers(n);
        arrOrdenado = bubbleSort.sort(arrSinOrdenar,new ComparadorEnteros<Integer>());
    }
}