public class RegistroResumos {
    private String[] resumos;
    private String[] resumosTemas;
    private int indice;
    private int contaResumos;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new String[numeroDeResumos];
        this.resumosTemas = new String[numeroDeResumos];
        this.indice = 0;
        this.contaResumos = 0;
    }
    public void adiciona(String tema, String conteudo) {
        if (indice < resumosTemas.length) {
            this.resumosTemas[indice] = tema;
            this.resumos[indice] = tema + ": " + conteudo;
            indice++;
        } else {
            this.indice = 0;
            this.resumosTemas[indice] = tema;
            this.resumos[indice] = tema + ": " + conteudo;
        }
        if (contaResumos < resumosTemas.length) {
            contaResumos++;
        }
    }
    public String[] pegaResumos() {
        return resumos;
    }
    public String imprimeResumos() {
        String saida = "- ";
        for (int i = 0; i < contaResumos; i++) {
            if (i < contaResumos - 1) {
                saida += resumosTemas[i] + " | ";
            } else {
                saida += resumosTemas[i];
            }
        }
        return "- " + contaResumos + " resumo(s) cadastrado(s)\n" +
                saida;
    }
    public int conta() {
        return contaResumos;
    }
    public boolean temResumo(String tema) {
        for (int i = 0; i < contaResumos; i++) {
            if (tema.equals(resumosTemas[i])) {
                return true;
            }
        }
        return false;
    }
}