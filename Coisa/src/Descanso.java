public class Descanso {

    private int horasDeDescanso;
    private int numerosSemanas;

    public Descanso() {
        this.horasDeDescanso = 0;
        this.numerosSemanas = 1;
    }
    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        this.numerosSemanas = valor;
    }
    public String getStatusGeral() {
        if (horasDeDescanso / numerosSemanas < 26) {
            return "cansado";
        } else {
            return "descansado";
        }
    }
}

