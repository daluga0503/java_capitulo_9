package Geometria;

public abstract class Triangulo extends Figura {
    protected int base;
    protected int altura;
    public Triangulo(int base, int altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base*this.altura / 2;
    }

    @Override
    public double perimetro() throws MethodNotImplementedException{
        throw new MethodNotImplementedException();
    }

    @Override
    public String toString(){
        return "Triangulo";
    }
    
}
