package com.example.demos.service;

import org.springframework.stereotype.Service;

@Service
public class SortService {

    public int[] sort(int[] arr){
        int n = arr.length;

        // Recorremos desde la segunda posición hasta el final
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // Valor actual a insertar
            int j = i - 1;

            // Movemos los elementos mayores que "key" una posición adelante
            // para hacer espacio donde debe ir "key"
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insertamos el valor en la posición correcta
            arr[j + 1] = key;
        }

        return arr;
    }
}
