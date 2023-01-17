package Geometria;

public class FigurasGeometricas {
    public static final int N = 20;
    public static void main(String[] args){
        Figura[] figuras = new Figura[N];
        for(int i =0; i < N; i++){
            int figura = (int)(Math.random()*4);
            switch(figura){
                case 0: // Rectángulo;
                    figuras[i]= new Rectangulo((int)(Math.random()*100),(int)(Math.random()*100));
                break;
                case 1: // Cuadrado
                    figuras[i]= new Cuadrado((int)(Math.random()*100));
                break;
                case 2: // Triángulo Equilatero;
                    figuras[i]= new TrianguloEquilatero((int)(Math.random()*100),(int)(Math.random()*100));
                break;
                case 3: // Triángulo Equilatero;
                    figuras[i]= new TrianguloRectangulo((int)(Math.random()*100),(int)(Math.random()*100));
                break;
            }
        }
        for (Figura figura : figuras) {
            System.out.println(figura);
        }

    }
}
