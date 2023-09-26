package Pilas;

public class Ejemplo_Pilas {
    public static void main(String[] args) {

        //Metodo PUSH
        Pila nuevaPila = new Pila();
        nuevaPila.apilar(1);
        nuevaPila.apilar(2);
        nuevaPila.apilar(3);
        nuevaPila.apilar(4);
        nuevaPila.apilar(5);
    }
}
class Pila {

    class Nodo{
        int valor;
        Nodo next;
        Nodo (int valor){
            this.valor=valor;
        }
    }


    private Nodo cabeza = null;
    private boolean vacia(){
        if(cabeza==null){
            System.out.println("La pila esta vacia");
        }
        return false;

    }

    public void apilar(int valor){
        if (vacia()) {
            cabeza=new Nodo(valor);
            return;
        }

        Nodo viejo=cabeza;
        Nodo nuevo = new Nodo(valor);
        nuevo.next=viejo;
        cabeza=nuevo;
        return;

    }
        //METODO PEEK
    public Nodo ultimoElemento(){
        if(vacia()){
            System.out.println("La pila esta vacia");
        }

        Nodo viejo=cabeza;
        Nodo nuevo=cabeza.next;
        cabeza=nuevo;
        return viejo;
    }
    //METODO BUSQUEDA
    public void mostrar(){
        if(vacia()){
            System.out.println("La pila esta vacia");
        }
        Nodo iterador=cabeza;
        while(iterador!=null){
            System.out.println("\n" + iterador.valor);
            iterador=iterador.next;
        }
    }

}
