/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_15_3;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Principal {
    
    //

    public static void main(String[] args) {
        Alumno a1 = new Alumno(); // crea un alumno con los datos por defecto
        System.out.println("Objeto a1:\n-----------\n");
        a1.imprimir(); // imprime los datos del alumno
        System.out.println("\nLlamada al metodo prueba1(a1).\n");
        prueba1(a1);
        a1.imprimir();
        System.out.println(" ");
        Alumno a2 = new Alumno();
        System.out.println("\nObjeto a2:\n-----------\n");
        a2.imprimir();
        System.out.println("\nLlamada al metodo prueba2(a2).\n");
        prueba2(a2);
        System.out.println("\nEn main: Fuera ya del metodo prueba2. \n");
        a2.imprimir();
    }

    static void prueba1(Alumno b) { // este metodo cambia el grupo del alumno que recoge y le cambia el grupo.
        b.cambiargrupo('B');
    }

    static void prueba2(Alumno b) { // este metodo crea un nuevo alumno sobreescribiendo el alumno que recibe, le cambia el grupo a B y luego imprime los nuevos datos
        b = new Alumno();
        b.cambiargrupo('B');
        System.out.println("\nDentro del metodo prueba2. \n");
        b.imprimir();
    }
}
