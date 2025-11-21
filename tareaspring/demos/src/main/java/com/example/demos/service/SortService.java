package com.example.demos.service;

import org.springframework.stereotype.Service;

@Service
public class SortService {
    

    public int[] sort(int[] arr){
        int n = arr.length;

        // Recorremos todo el arreglo
        for (int i = 0; i < n - 1; i++) {

            // Suponemos que la posición actual es el mínimo
            int minIndex = i;

            // Buscamos el índice del elemento más pequeño en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Si encontramos uno menor, hacemos el swap
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }
}
