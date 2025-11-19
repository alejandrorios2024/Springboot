package com.example.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.RequestCadena;
import com.example.service.SortService;

//esta se encarga de recibir las peticinoes


@RestController//configuracion de controlador (por tag)
@RequestMapping("/api/sort") //configuracion del endpoint de la api
public class SortController {

    @Autowired
    SortService service;

    @PostMapping("/burbuja")
    public int[] bubbleSort(@RequestBody RequestCadena request){

        //@RequestBody manda formato en json


        String[] partes = request.getCadena().split("");//recibes el string y lo conviertes a un array de string
        //con el metodo split los se separa por comas
        int[] numeros = new int[partes.length]; //declaracion de el arreglo de numeros
        for (int i = 0; i < partes.length; i++) {
            try {
                numeros[i] = Integer.parseInt(partes[i]); 
            } catch (Exception e) {
                numeros[i] = 0;
            }
            
        }


        return service.sort(numeros);
    }

}
