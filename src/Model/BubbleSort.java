package Model;
import java.util.Comparator;
public class BubbleSort<T>{
    /**
     * Algortimo de ordenamiento tipo burbuja
     * @param arreglo Arreglo a ordenar
     * @param comparador que tipo de comparador usar
     * @return array ordenado
     */
    public T[] sort(T[] arreglo, Comparator<T> comparador) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (comparador.compare(arreglo[i], arreglo[j]) > 0) {
                    T aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
        return arreglo;
    }
}
