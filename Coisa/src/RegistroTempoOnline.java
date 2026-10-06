/**
 *  Representação do tempo investido no estudo de uma disciplina por um aluno.
 *  Gerencia informações como o tempo de estudo esperado para a disciplina.
 *
 * @author Ihago Vinicius
 */
public class RegistroTempoOnline {
    /** nome da disciplina */
    private final String nomeDaDisciplina;
    /** tempo investido online de estudos sobre essa disciplina do aluno */
    private int tempoInvestidoOnline;
    /** tempo esperado de estudos sobre essa disciplina. */
    private final int tempoEsperado;

    /**
     * Método construtor da classe.
     * Nesse método construtor não precisa passsar o tempo investido esperado, ele já vem padrão.
     * @param nomeDisciplina nome da disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDaDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }

    /**
     * Método construtor da classe.
     * Nesse método construtor precisa passar o tempo investido esperado.
     * @param nomeDisciplina nome da disciplina
     * @param tempoOnlineEsperado tempo investido esperado de estudos
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDaDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoOnlineEsperado;
    }

    /**
     * Adiciona tempo investido online.
     * @param tempo quantidade de tempo a ser adicionada.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }

    /**
     * Verifica se atingiu o temmpo investido esperado para a disciplina.
     * @return true se conseguiu atingir o tempo investido esperado, ou false se não conseguiu.
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoInvestidoOnline >= tempoEsperado;
    }

    /**
     * Rrepresentação textual da classe.
     * @return nome da disciplina, o tempo investido e o tempo esperado.
     */
    @Override
    public String toString() {
        return nomeDaDisciplina + " " + tempoInvestidoOnline + "/" + tempoEsperado;
    }

}