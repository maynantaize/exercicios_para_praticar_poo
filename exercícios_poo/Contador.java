public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        System.out.println(contador.getValor()); // Deve imprimir 2
    }
}

