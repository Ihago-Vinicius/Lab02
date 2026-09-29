public class RotinaDescanso {

    private int horasDeDescanso;

    private int numerosSemanas;

    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numerosSemanas = valor;
    }

    public String getStatusGeral() {
        if (horasDeDescanso < 26) {
            return "cansado";
        } else {
            return "cansado";
        }
    }
}

