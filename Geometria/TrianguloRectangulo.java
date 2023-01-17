package Geometria;

public class TrianguloRectangulo extends Triangulo{

    public TrianguloRectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double perimetro(){
        double hipotenusa = Math.sqrt(Math.pow(this.base,2)+Math.pow(this.altura,2));
        return this.base+this.altura+hipotenusa;
    }

    @Override
    public String toString(){
        return  "Triángulo rectángulo: (base: "+this.base+", altura: "+this.altura+")";
    }
    
}