/**
 * Representa um registo de reumos do aluno.
 * Manipula informações como quantidade de resumos e os próprios resumos.
 *
 * @author Ihago Vinicius
 */
public class RegistroResumos {
    /** array composto pelos resumos cadastrados */
    private final String[] resumos;
    /** array composto apenas pelos temas dos resumos cadastrados. */
    private final String[] resumosTemas;
    /** indice que acompanha o local que se deve adicionar o resumo. */
    private int indice;
    /** índide que acompanha quantos resumos foram adicionados. */
    private int contaResumos;

    /**
     * Método construtor da classe.
     * @param numeroDeResumos quantidade máxima de resumos.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new String[numeroDeResumos];
        this.resumosTemas = new String[numeroDeResumos];
        this.indice = 0;
        this.contaResumos = 0;
    }

    /**
     * Adiciona um resumo ao array resumos.
     * Caso o array já esteja cheio substitui o primeiro  continua a partir dai.
      * @param tema tema do resumo.
     * @param conteudo conteudo do resumo.
     */
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

    /**
     * Retorna o array de resumos.
     * @return array de resumos.
     */
    public String[] pegaResumos() {
        return resumos;
    }

    /**
     * Imprime a quantidade de resumos e o array de temas de resumos formatado para o usuário.
     * @return string formatada do array de temas de resumos.
     */
    public String imprimeResumos() {
        StringBuilder saida = new StringBuilder("- ");
        for (int i = 0; i < contaResumos; i++) {
            if (i < contaResumos - 1) {
                saida.append(resumosTemas[i]).append(" | ");
            } else {
                saida.append(resumosTemas[i]);
            }
        }
        return "- " + contaResumos + " resumo(s) cadastrado(s)\n" +
                saida;
    }

    /**
     * Retorna quantos resumos estão cadastrados.
     * @return quantidade de resumos ccadastrados.
     */
    public int conta() {
        return contaResumos;
    }

    /**
     * Faz uma busca linear pelos temas de resumos procurando se o tema passado como parâmetro já existe.
     * @param tema tema a ser procurado.
     * @return true se o tema for encontrado, ou false se o tema não for encontrado.
     * */
    public boolean temResumo(String tema) {
        for (int i = 0; i < contaResumos; i++) {
            if (tema.equals(resumosTemas[i])) {
                return true;
            }
        }
        return false;
    }
}