/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletion15_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Producto {

    public String codigo;
    public Double precio;

    public Producto(String codigo, Double precio) throws CodigoException {
        setCodigo(codigo);
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    private boolean verificarCodigo(String codigo) {
        boolean aux = false;
        
        if (codigo.toUpperCase().charAt(0) >= 65 && codigo.toUpperCase().charAt(0) <= 90) {
            aux = true;

        }
        return aux;
    }

    public void setCodigo(String codigo) throws CodigoException{
        if (verificarCodigo(codigo) ) {
            this.codigo = codigo;
        }else{
            throw new CodigoException("Codigo Erroneo, tiene que seguir el siguiente formato, LetraNumeros");
        }
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "(codigo: " + codigo + ", precio: " + precio + " euros)";
    }

}
