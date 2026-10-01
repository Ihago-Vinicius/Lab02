public class RegistroTempoOnline {
    private String nomeDaDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDaDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDaDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }
    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoEsperado) {
            return true;
        }
        return false;
    }
    public String toString() {
        return nomeDaDisciplina + " " + tempoInvestidoOnline + "/" + tempoEsperado;
    }

}