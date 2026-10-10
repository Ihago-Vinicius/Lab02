/**
 * Representação de um resumo.
 *
 * @author Ihago Vinicius
 */
public class Resumo {
    /** Representação em String do tema*/
    private final String tema;
    /** Representação em String do conteúdo*/
    private final String conteudo;

    /**
     * Classe construtora de Resumo.
     * @param tema tema do Resumo.
     * @param conteudo conteudo do Resumo.
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Pega o tema do Resumo e devolve para o usuário.
     * @return tema do Resumo.
     */
    public String getTema() {
        return tema;
    }

    /**
     * Pega o conteúdo do Resumo e devolve para o usuário.
     * @return conteúdo de resumo.
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Representação textual do resumo.
     * @return tema + conteudo do resumo
     */
    @Override
    public String toString() {
        return tema + ": " + conteudo;
    }
}
