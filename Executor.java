public class Executor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.mostraVetor();
        System.out.println("O primeiro valor do vetor é 0");
        vetor.insere(1, 0);
        vetor.insere(2, 1);
        vetor.insere(3, 2);
        vetor.insere(4, 3);
        vetor.insere(5, 4);
        vetor.mostraVetor();
        vetor.remove(1);
        vetor.mostraVetor();
        vetor.insere(6, 4);
        vetor.mostraVetor();
        vetor.remove(3);
        vetor.mostraVetor();
    }
}
