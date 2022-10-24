
import java.util.Arrays;

public class Vetor {
    private int tamanho;
    private int[] vetor;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int[this.tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public void preencheVetor() {
        for (int i = 0; i < tamanho; i++) {
            Arrays.fill(vetor, 0);
        }
    }

    public void mostraVetor() {
        System.out.println(Arrays.toString(vetor));
    }

    public void insere(int valor, int posicao) {
        if (posicao >= 0 && posicao < this.tamanho) {
            vetor[posicao] = valor;
        } else {
            System.out.println("Valor 0 adicionado.");
        }
    }

    public void remove(int posicao) {
        int aux;
        if (posicao >= 0 && posicao < this.tamanho) {
            aux = vetor[posicao];
            vetor[posicao] = 0;
            for (int i = posicao; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = 0;
                if (vetor[i + 1] == this.tamanho) {
                    i = (tamanho - 1);
                    vetor[i] = 0;
                }
            }
            System.out.println("Valor " + aux + " removido.");
        } else {
            System.out.println("Valor 0 removido!");
        }

    }

    public void buscaElemento(int posicao) {
        System.out.println("Posição específica do vetor: " + vetor[posicao]);
    }
}
