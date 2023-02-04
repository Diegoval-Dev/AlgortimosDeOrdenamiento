package Test;

import Model.Generate;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        Generate generate = new Generate();
        ArrayList<Integer> arr;
        arr = generate.numbers(100);
        System.out.println(arr);
    }
}