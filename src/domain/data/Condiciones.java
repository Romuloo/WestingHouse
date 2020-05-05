package domain.data;

public enum Condiciones {

    A(0.06),
    B(0.04),
    C(0.02),
    D(0.00),
    E(-0.03),
    F(-0.07);

    private double puntuacion;

    Condiciones(double s){
        puntuacion = s;
    }

    public double getCondiciones(){
        return puntuacion;
    }

}
