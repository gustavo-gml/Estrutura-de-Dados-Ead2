public class Pilha<T> {

    private int topo;
    private T[] elementos;

    public Pilha(int capacidade){
        this.topo = -1;
        this.elementos = (T[]) new Object[capacidade];
    }

    public boolean isFull(){
        return this.elementos.length -1 == topo;
    }

    public boolean push(T elemento){
        if (!isFull()) {
            this.topo++;
            this.elementos[topo] = elemento;
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return this.topo == -1;
    }

    public T pop(){
        T elementoRemovido;
        if(!isEmpty()){
            elementoRemovido = elementos[topo];
            elementos[topo] = null;
            topo--;
            return elementoRemovido;
        }

        return null;
    }

}
