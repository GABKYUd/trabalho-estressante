//ATIVIDADE 4

public class Circulo extends Figurageometrica {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String getDescricao() {
        return "Circulo de raio " + raio;
    }
}
