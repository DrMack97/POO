package OOencapsulacion;

public class rectanguloBuilder {
    // atributos
    public int base;
    public int altura;
    public int area;
    public int perimetro;
    
    // constructor con parametros
    public rectanguloBuilder(int base, int altura) {
        setBase(base);
        setAltura(altura);
    }
    // constructor
    public rectanguloBuilder() {
        base = 0;
        altura = 0;
    }

    //metodos
    public int area ( int base,int altura){
        area = base*altura;
        return area;
    }

    public int perimetro (int base,int altura){ //largo y ancho = altura y base
        perimetro = 2*(altura+base);
        return perimetro;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + base;
        result = prime * result + altura;
        result = prime * result + area;
        result = prime * result + perimetro;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        rectanguloBuilder other = (rectanguloBuilder) obj;
        if (base != other.base)
            return false;
        if (altura != other.altura)
            return false;
        if (area != other.area)
            return false;
        if (perimetro != other.perimetro)
            return false;
        return true;
    }
    // toString se genera solo
    @Override
    public String toString() {
        return "rectanguloBuilder [base=" + base + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro
                + "]";
    }
    public int getBase() {
        return this.base;
    }
    public void setBase(int base) {
        if (base >=0) this.base = base; //verifica que base no sea negativo
        else this.base = 0;             //de lo contrario base sera = 0
        area(base, altura);
        perimetro(base, altura);
    }
    public void setAltura(int altura) {
        if (altura>=0) {
        this.altura = altura;
        } else {
            this.altura = 0;
        }
        area(base, altura);
        perimetro(base, altura);
    }
}
