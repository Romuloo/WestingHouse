package domain.data;

public enum Habilidad {

    A1(0.15),
    A2(0.13),
    B1(0.11),
    B2(0.08),
    C1(0.06),
    C2(0.03),
    D(0.00),
    E1(-0.05),
    E2(-0.10),
    F1(-0.16),
    F2(-0.22);

    private double puntuacion;

    Habilidad(double s) {
        puntuacion = s;
    }

    public double getHabilidad() {
        return puntuacion;
    }
}

