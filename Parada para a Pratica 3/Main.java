//atividade 5

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        
        retangulo.setBase(10);
        retangulo.setAltura(5);

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(8);
        triangulo.setAltura(6);

        Circulo circulo = new Circulo();
        circulo.setRaio(4);

    List<Figurageometrica> listaFigurasGeometricas = new ArrayList<>() ;
    listaFigurasGeometricas.add( retangulo );
    listaFigurasGeometricas.add( triangulo );
    listaFigurasGeometricas.add( circulo );

        for (Figurageometrica Figura : listaFigurasGeometricas) {
            System.out.println(Figura.getNome() + ": " + Figura.getDescricao() + ", Área: " + Figura.getArea());
        }
    }
}