package heapSort;

public class HeapSort {
    public void sort(int arr[]){
        int n = arr.length;

        // Montar o heap (reorganizar matriz)
        for (int i = n / 2 - 1; i >= 0 ; i--) {
            heapify(arr, n, i);
        }

        // Um por um, extrai um elemento da pilha
        for (int i = n -1; i >= 0; i--){

            // Move a raiz atual para o final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Chama max heapify no heap reduzido
            heapify(arr, i, 0);
        }
    }

    // Para empilhar uma sub-árvore enraizada no nó "i" que é
    // um índice em arr []. "n" é o tamanho do heap
    void heapify(int arr[], int n, int i){
        int largest = i;    // Inicialize o maior como raiz
        int l = 2 * i + 1;  // left = 2 * i + 1
        int r = 2 * i + 2;  // right = 2 * i + 2

        // Se o filho esquerdo for maior que a raiz
        if (l < n && arr[l] > arr[largest]){
            largest = 1;
        }

        // Se o filho certo for maior que o maior até agora
        if (r < n && arr[r] > arr[largest]){
            largest = r;
        }

        // Se o maior não for raíz
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente Heapify a sub-árvore afetada
            heapify(arr, n, largest);
        }
    }

    // Uma função utilitária para imprimir matriz de tamanho "n"
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 11, 13, 5, 15, 7};
        int n = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Sorted array is: ");
        printArray(arr);
    }
}
