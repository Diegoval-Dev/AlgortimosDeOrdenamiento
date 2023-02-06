package Model;

import java.util.ArrayList;
import java.util.Random;

public class Generate {
    /**
     * Generador de numeros aleatoreos
     * @param cant cantidad de numeros aleatoreos
     * @return array con numeros aleatoreos
     */
    public Integer[] numbers(int cant){
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        Integer[] arrReturn = new Integer[cant];
        int num;
        for (int i = 0; i < cant; i++) {
            num = rand.nextInt(999);
            arr.add(num);
            arrReturn[i] = num;
        }
        return arrReturn;
    }

}