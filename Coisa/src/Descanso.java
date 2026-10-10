 /**
 * Representa a rotina de descanso do aluno.
 * Gerencia informações sobre o descanso, como horas de descanso.
 *
 * @author Ihago Vincius
 */

public class Descanso {

    /** Hroas destinadas ao descanso. */
    private int horasDeDescanso;
    /** Quantidade de semanas nas quais dividem as horas. */
    private int numerosSemanas;

    /**
     * Método construtor da classe.
     */
    public Descanso() {
        this.horasDeDescanso = 0;
        this.numerosSemanas = 1;
    }

    /**
     * Define horas de descanso.
     * @param valor quantidade de horas de descanso.
     */
    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }

    /**
     * Define o numero de semanas.
     * @param valor quantidade de semanas.
     */
        public void defineNumeroSemanas(int valor) {
        this.numerosSemanas = valor;
    }

    /**
     * Retorna o status de descanso do aluno.
     * @return 'cansado' se o aluno tiver descansado menos de 26 horas por semnana, ou 'descansado' se tiver descansado 26 horas ou mais..
     */
    public String getStatusGeral() {
        if (horasDeDescanso / numerosSemanas < 26) {
            return "cansado";
        } else {
            return "descansado";
        }
    }
}