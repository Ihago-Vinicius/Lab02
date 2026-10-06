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

    /**
     * Método construtor da classe.
     * @param nomeDisciplina nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
        this.horasDeEstudo = 0;
        this.nomeDaDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }

    /***
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

    /**
     * Verifica se o aluno está aprovado.
     * @return true se a média do aluno for maior ou igual a 7, ou false se a média do aluno for menor que 7.
     */
    public boolean aprovado() {
        return (notas[0] + notas[1] + notas[2] + notas[3]) / 4 >= 7;
    }

    /**
     * Representação textual da disciplina.
     * @return nome, quantidade de horas de estudo, media e notas do aluno.
     */
    @Override
    public String toString() {
        return nomeDaDisciplina + " " + horasDeEstudo + " " + (notas[0] + notas[1] + notas[2] + notas[3]) / 4 +  " " + Arrays.toString(notas);
    }
}