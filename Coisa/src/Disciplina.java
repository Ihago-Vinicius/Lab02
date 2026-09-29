public class Disciplina {

    private String nomeDaDisciplina;

    private int horasDeEstudo;

    private double[] notas;

    public Disciplina(String nomeDisciplina) {

    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota] = valorNota;
    }

    public boolean aprovado() {

    }

    public String toString() {

    }

}