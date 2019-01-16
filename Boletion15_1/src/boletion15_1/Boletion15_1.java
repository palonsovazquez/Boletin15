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
public class Boletion15_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CodigoException {
        Factura fact = new Factura();
        Producto[] prod = {new Producto("C1",24d),new Producto("H23",234d),new Producto("M30",109d)};
        fact.setListaProductos(prod);
        
        System.out.println(fact.toString());
        fact.setProducto(new Producto("K123",247d), 2);
        System.out.println(fact.toString());
        Producto x = new Producto("A55",55d);
        x.setCodigo("56");
        System.out.println(x.toString());
        
    }
    
}
