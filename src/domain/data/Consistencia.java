package domain.data;

public enum Consistencia {

    A(0.04),
    B(0.03),
    C(0.01),
    D(0.00),
    E(-0.02),
    F(-0.04);

  private double puntuacion;

    Consistencia(double s){
        puntuacion = s;
    }

    public double getConsistencia(){
        return puntuacion;
    }

}
