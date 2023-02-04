package Controller;

import Model.Generate;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Generate generate = new Generate();
        ArrayList<Integer> arr;
        int cc = sc.nextInt();
        arr = generate.numbers(cc);
        System.out.println(arr);
        int aa = sc.nextInt();
    }
}