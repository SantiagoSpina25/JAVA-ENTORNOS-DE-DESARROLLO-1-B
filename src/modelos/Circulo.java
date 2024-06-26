package modelos;



public class Circulo extends Figura {
	
	private int radio;
	

    /**
     * Constructor circulo por defecto
     */
    public Circulo() {
    	radio = 1;
    }

    /**
     * Constructor circulo. Parametro: radio (int)
     */
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    
    
    public int getRadio() {
        return radio;
    }


    public void setRadio(int radio) {
        this.radio = radio;
    }



    @Override
    public String toString() {
        return "radio=" + radio ;
    }

    /**
     * @return area del circulo
     */
    @Override
    public double getArea() {
        return Math.PI* (radio * radio);
    }

    /**
     * @return perimetro del circulo
     */
    @Override
    public double getPerimetro() {
    	return (2 * Math.PI) * radio;
    }

}