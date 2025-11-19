package com.example.dto;

//@allArgsConstructor
//@NoArgsConstructor
//es el equivalente a hacer un get y set 
//@Data 
// //si se agrega data solito reconoce geters y setters
public class RequestCadena {


    String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public RequestCadena() {
    }

    

    

}
