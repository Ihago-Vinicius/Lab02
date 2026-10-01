import java.util.Arrays;

public class Disciplina {
    private String nomeDaDisciplina;
    private int horasDeEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.horasDeEstudo = 0;
        this.nomeDaDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }
    public void cadastraHoras(int horas) {
        this.horasDeEstudo = horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }
    public boolean aprovado() {
        if ((notas[0] + notas[1] + notas[2] + notas[3]) / 4 >= 7) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return nomeDaDisciplina + " " + horasDeEstudo + " " + (notas[0] + notas[1] + notas[2] + notas[3]) / 4 +  " " + Arrays.toString(notas);
    }
}