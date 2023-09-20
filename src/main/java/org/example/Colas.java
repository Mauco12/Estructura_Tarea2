package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Colas {

    public static void main(String[] args) {

        //Metodo Enqueue

        Queue<Integer> cola = new LinkedList<>();

        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);

        //Metodo de busqueda
        for(Integer dato : cola){
            System.out.println(dato);
        }

        //Metodo PEEK
        System.out.println("Primer elemento agregado");
        System.out.println(cola.peek());


        //Metodo DEQUEUE
        System.out.println("La lista con el primer elemento eliminado ");
        cola.poll();
        for(Integer dato : cola){
            System.out.println(dato);
        }





    }
}
