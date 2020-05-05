package domain.data;

public enum Esfuerzo  {

    A1(0.13),
    A2(0.12),
    B1(0.10),
    B2(0.08),
    C1(0.05),
    C2(0.02),
    D(0.00),
    E1(-0.04),
    E2(-0.08),
    F1(-0.12),
    F2(-0.17);

    private double puntuacion;

    Esfuerzo(double s){
        puntuacion = s;
    }

    public double getEsfuerzo(){
        return puntuacion;
    }
}