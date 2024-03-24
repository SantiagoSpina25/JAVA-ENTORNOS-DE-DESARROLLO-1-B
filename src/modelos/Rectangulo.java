package modelos;


/**
 * 
 */
public class Rectangulo extends Figura{




    private int base;


    private int altura;
    
    /**
     * Constructor rectangulo por defecto
     */
    public Rectangulo() {
    	base = 1;
    	altura = 1;
    }

    /**
     * Constructor rectangulo. Parametros: base (int) y altura (int)
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


    public int getBase() {
        return base;
    }


    public void setBase(int base) {
        this.base = base;
    }


    public int getAltura() {
        // TODO implement here
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "base=" + base + ", altura=" + altura;
    }

    /**
     * @return area del rectangulo
     */
    @Override
    public double getArea() {
        return base * altura;
    }

    /**
     * @return perimetro del rectangulo
     */
    @Override
    public double getPerimetro() {
        return (2*base) + (2*altura);
    }

}