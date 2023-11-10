//atividade 3
public class Triangulo extends Figurageometrica{

    private double base;
    private double altura;



    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @override
    public double getArea() {
        return(base * altura) / 2;
    }

    @override
    public String getDescricao() {
        return "Triangulo de base " + base + " e altura " + altura;
    }

}