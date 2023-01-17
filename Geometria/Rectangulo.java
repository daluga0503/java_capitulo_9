package Geometria;

public class Rectangulo extends Figura{
    protected int base;
    protected int altura;
    public Rectangulo(int base, int altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return this.base*this.altura;
    }

    @Override
    public double perimetro() {
        return 2*this.base+2*this.altura;
    }

    @Override
    public String toString(){
        return "Rectángulo: (base: "+this.base+", altura: "+this.altura+")";
    }
    
}
