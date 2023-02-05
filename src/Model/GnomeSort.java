package Model;

public class GnomeSort {
    /**
     * Codigo extraido de: https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
     * implementado por: Diego Valenzuela
     * @param arr array a ordenar
     * @param n tamaño del array
     * @return array ordenado
     */
    public static Integer[] gnomeSort(Integer arr[], int n) {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return arr;
    }
}
