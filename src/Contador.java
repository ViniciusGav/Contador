public class Contador {
    private int valor;

    public Contador(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor++;
    }

    public void decrementar(){
        this.valor--;
    }

    public void exibirValor(){
        System.out.println("valor atual do contador é: " + this.valor);
    }


}
