package org.example;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("La lista esta vacia " + pila);
        System.out.println("¿La lista esta vacia? " + pila.isEmpty());



        //Metodo PUSH
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Metodo de busqueda
        for(Integer dato : pila){
            System.out.println(dato);
        }

        //Metodo PEEK
        System.out.println("Ultimo elemento agregado a la pila: " + pila.peek());

        //Metodo POP
        System.out.println("Lista con el ultimo elemento elimininado");
        pila.pop();
        for(Integer dato : pila){
            System.out.println(dato);
        }

        //Metodo Dequeue











    }
}
