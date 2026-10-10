import java.util.Arrays;

/**
 * Representa uma Disciplina academica.
 * Gerencia informações sobre a disciplina, como cadastrar horas e notas.
 *
 * @author Ihago Vincius
 */
public class Disciplina {
    /** Nome da disciplina. */
    private final String nomeDaDisciplina;
    /** Quantidade de horas de estudo para essa disciplina. */
    private int horasDeEstudo;
    /** Notas tiradas pelo aluno. */
    private final double[] notas;
    /** Pesos de cada nota */
    private final int[] pesos;

    /**
     * Método básico construtor da classe.
     * @param nomeDisciplina nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
        this.horasDeEstudo = 0;
        this.nomeDaDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.pesos = new int[4];
        Arrays.fill(this.pesos, 1);
    }

    /**
     * Método construtor da classe. Passa a quantidade de notas também.
     * @param nomeDaDisciplina nome da disciplina.
     * @param quantidadeNotas quantidade de notas.
     */
    public Disciplina(String nomeDaDisciplina, int quantidadeNotas) {
        this.horasDeEstudo = 0;
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.notas = new double[quantidadeNotas];
        this.pesos = new int[quantidadeNotas];
        Arrays.fill(this.pesos, 1);
    }

    /**
     * Método construtor da classe. Passa a quantidade de notas e o peso de cada uma delas.
     * @param nomeDaDisciplina nome da disciplina.
     * @param quantidadeNotas quantidade de notas.
     * @param pesos pesos de cada nota.
     */
    public Disciplina(String nomeDaDisciplina, int quantidadeNotas, int[] pesos) {
        this.horasDeEstudo = 0;
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.notas = new double[quantidadeNotas];
        this.pesos = pesos;
    }

    /**
     * Cadastra o número de horas daquela disciplina .
     * @param horas quantidade de horas.
     */
    public void cadastraHoras(int horas) {
        this.horasDeEstudo = horas;
    }

    /**
     * Cadastra 1 nota daquela disciplina.
     * @param nota qual nota que deve ser cadastrada.
     * @param valorNota valor da nota que deve ser cadastrada.
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public double media() {
        double totalNotas = 0;
        double somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            totalNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return totalNotas / somaPesos;
    }

    /**
     * Verifica se o aluno está aprovado.
     * @return true se a média do aluno for maior ou igual a 7, ou false se a média do aluno for menor que 7.
     */
    public boolean aprovado() {
        return media() >= 7;
    }

    /**
     * Representação textual da disciplina.
     * @return nome, quantidade de horas de estudo, media e notas do aluno.
     */
    @Override
    public String toString() {
        return nomeDaDisciplina + " " + horasDeEstudo + " " + media() +  " " + Arrays.toString(notas);
    }
}