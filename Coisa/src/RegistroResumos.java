import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Representa um registo de reumos do aluno.
 * Manipula informações como quantidade de resumos e os próprios resumos.
 *
 * @author Ihago Vinicius
 */
public class RegistroResumos {
    /**
     * array composto pelos resumos cadastrados
     */
    private final Resumo[] resumos;
    /**
     * indice que acompanha o local que se deve adicionar o resumo.
     */
    private int indice;
    /**
     * índide que acompanha quantos resumos foram adicionados.
     */
    private int contaResumos;

    /**
     * Método construtor da classe.
     *
     * @param numeroDeResumos quantidade máxima de resumos.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    /**
     * Adiciona um resumo ao array resumos.
     * Caso o array já esteja cheio substitui o primeiro  continua a partir dai.
     *
     * @param tema     tema do resumo.
     * @param conteudo conteudo do resumo.
     */
    public void adiciona(String tema, String conteudo) {
        if (!temResumo(tema)) {
            if (indice < resumos.length) {
                this.resumos[indice] = new Resumo(tema, conteudo);
                indice++;
            } else {
                this.indice = 0;
                this.resumos[indice] = new Resumo(tema, conteudo);
            }
            if (contaResumos < resumos.length) {
                contaResumos++;
            }
        }
    }

    /**
     * Retorna o array de resumos.
     *
     * @return array de resumos.
     */
    public String[] pegaResumos() {
        String[] res = new String[contaResumos];
        for (int i = 0; i < contaResumos; i++) {
            res[i] = resumos[i].toString();
        }
        return res;
    }

    /**
     * Retorna a quantidade de resumos e os temas de resumos para o usuário.
     *
     * @return string de temas de resumos formatado.
     */
    public String imprimeResumos() {
        StringBuilder saida = new StringBuilder("- ");
        for (int i = 0; i < contaResumos; i++) {
            if (i < contaResumos - 1) {
                saida.append(resumos[i].getTema()).append(" | ");
            } else {
                saida.append(resumos[i].getTema());
            }
        }
        return "- " + contaResumos + " resumo(s) cadastrado(s)\n" +
                saida;
    }

    /**
     * Retorna quantos resumos estão cadastrados.
     *
     * @return quantidade de resumos ccadastrados.
     */
    public int conta() {
        return contaResumos;
    }

    /**
     * Faz uma busca linear pelos temas de resumos procurando se o tema passado como parâmetro já existe.
     *
     * @param tema tema a ser procurado.
     * @return true se o tema for encontrado, ou false se o tema não for encontrado.
     *
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < contaResumos; i++) {
            if (tema.equals(resumos[i].getTema())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Faz uma busca nos conteúdos com a chave passada pelo usuário.
     *
     * @param chave o que deve ser buscado.
     * @return temas que foram encontrados ocorrências, organizados em ordem alfabética.
     */
    public List<String> busca(String chave) {
        List<String> resultado = new ArrayList<>();
        for (int i = 0; i < contaResumos; i++) {
            if (resumos[i].getConteudo().contains(chave.toLowerCase())) {
                resultado.add(resumos[i].getTema());
            }
        }
        resultado.sort(null);
        return resultado;
    }
}