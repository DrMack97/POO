package carpetaClasesBancarias;

public class ingreso extends operacion {
    private String origen; // transferencia, efectivo, cheue

    public ingreso(double cantidad, String descripcion, String origen){
        super(cantidad, descripcion); // que es super?
        this.origen = origen;
    }
    @Override
    public String getTipoOperacion(){
        return "INGRESO";
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "ingreso [origen=" + origen + "]";
    }
}
