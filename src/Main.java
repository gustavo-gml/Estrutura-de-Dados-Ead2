
public class Main{
    static void main(String[] args){
        //testes
        Pilha<String> pilhaNome = new Pilha<>(10);
        System.out.println(pilhaNome.isEmpty());

        pilhaNome.push("Gustavo");
        pilhaNome.push("Ericleuson");

        String nomeRemovido = pilhaNome.pop();

        System.out.println(nomeRemovido);
    }
}