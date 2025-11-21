package com.example.demos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demos.dto.RequestCadena;
import com.example.demos.service.SortService;


@RestController
@RequestMapping("/appi/sort") //configuracion  del endpoint api
public class SortController {
 @Autowired
 SortService service;
@PostMapping("/selection")//end point 
public int[] bubbleSort(@RequestBody RequestCadena request) {
    


    String[] partes=request.getCadena().split(","); //recibimos String y lo convertimos a un array de strings
    int []numeros=new int[partes.length];//declaracion de el arreglo de numeros
    for (int i = 0; i < partes.length; i++) {
        numeros[i]=Integer.parseInt(partes[i]);
    }
    
    return service.sort(numeros);
}


}
