package Colas;

public class Ejemplo_Colas {
    public node cabecera;
    private node cola;
    private int longitud;

    public Cola(){
        cabecera = cola = null;
        longitud=0;
    }

    public int longitud(){
        return longitud;
    }
    public boolean Vacia(){
        return (cabecera==null);
    }

    //Queue
    public void agregar(Object o){
        Nodo n = new Nodo (o,null);
        if (longitud == 0 ) cabecera = n;
        else cola.cambiarSiguiente(n);
        cola = n;
        longitud++;
    }

    //Deque
    public Object eliminar(){
        Object aux;
        if(Vacia())return null;
        aux = cabecera.Elemento();
        cabecera = cabecera.siguiente();
        longitud--;
        if(longitud==0) cola=null;
        retur aux;
    }
    public Object Cabecera(){
        if (Vacia()) return null;
        else return cabecera.Elemento();
    }

}
