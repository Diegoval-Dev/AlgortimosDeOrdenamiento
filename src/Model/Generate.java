package Model;

import java.util.ArrayList;
import java.util.Random;

public class Generate {
    public ArrayList<Integer> numbers(int cant){
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        int num;
        for (int i = 0; i < cant; i++) {
            num = rand.nextInt(999);
            arr.add(num);
        }
        return arr;
    }

}