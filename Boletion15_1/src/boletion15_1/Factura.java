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
public class Factura {

   
    
    Producto[] listaProductos = new Producto[3];

    

    public Producto[] getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void setProducto(Producto prod,int x){
    
        if((x < 1 && x >= (listaProductos.length))){
            System.out.println("posicion del producto erronea");
    }else{
        this.listaProductos[x-1] = prod;
        
        }
    
    }

    @Override
    public String toString() {
        String stAux ="";
       
        for (int i = 0; i <  listaProductos.length;i++){
            
       stAux =  stAux.concat(""+listaProductos[i].toString());
         
         if(i < (listaProductos.length-1)){
       stAux = stAux.concat(" , ");
         }
            
        }
        
        return "( " + stAux + " )";
    }
    
    
}
