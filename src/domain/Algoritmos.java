package domain;
import domain.data.*;


public class Algoritmos {



    public static double calificaciones(String habilidad, String esfuerzo, String condiciones, String consistencia){

        Habilidad h = Habilidad.D;
        Esfuerzo e = Esfuerzo.D;
        Condiciones c = Condiciones.D;
        Consistencia cs = Consistencia.D;

        if(habilidad.equalsIgnoreCase("A1")) h = Habilidad.A1;
        if(habilidad.equalsIgnoreCase("A2")) h = Habilidad.A2;
        if(habilidad.equalsIgnoreCase("B1")) h = Habilidad.B1;
        if(habilidad.equalsIgnoreCase("B2")) h = Habilidad.B2;
        if(habilidad.equalsIgnoreCase("C1")) h = Habilidad.C1;
        if(habilidad.equalsIgnoreCase("C2")) h = Habilidad.C2;
        if(habilidad.equalsIgnoreCase("D")) h = Habilidad.D;
        if(habilidad.equalsIgnoreCase("E1")) h = Habilidad.E1;
        if(habilidad.equalsIgnoreCase("E2")) h = Habilidad.E2;
        if(habilidad.equalsIgnoreCase("F1")) h = Habilidad.F1;
        if(habilidad.equalsIgnoreCase("F2")) h = Habilidad.F2;

        if(esfuerzo.equalsIgnoreCase("A1")) e = Esfuerzo.A1;
        if(esfuerzo.equalsIgnoreCase("A2")) e = Esfuerzo.A2;
        if(esfuerzo.equalsIgnoreCase("B1")) e = Esfuerzo.B1;
        if(esfuerzo.equalsIgnoreCase("B2")) e = Esfuerzo.B2;
        if(esfuerzo.equalsIgnoreCase("C1")) e = Esfuerzo.C1;
        if(esfuerzo.equalsIgnoreCase("C2")) e = Esfuerzo.C2;
        if(esfuerzo.equalsIgnoreCase("D")) e = Esfuerzo.D;
        if(esfuerzo.equalsIgnoreCase("E1")) e = Esfuerzo.E1;
        if(esfuerzo.equalsIgnoreCase("E2")) e = Esfuerzo.E2;
        if(esfuerzo.equalsIgnoreCase("F1")) e = Esfuerzo.F1;
        if(esfuerzo.equalsIgnoreCase("F2")) e = Esfuerzo.F2;

        if(condiciones.equalsIgnoreCase("A")) c = Condiciones.A;
        if(condiciones.equalsIgnoreCase("B")) c = Condiciones.B;
        if(condiciones.equalsIgnoreCase("C")) c = Condiciones.C;
        if(condiciones.equalsIgnoreCase("D")) c = Condiciones.D;
        if(condiciones.equalsIgnoreCase("E")) c = Condiciones.E;
        if(condiciones.equalsIgnoreCase("F")) c = Condiciones.F;

        if(consistencia.equalsIgnoreCase("A")) cs = Consistencia.A;
        if(consistencia.equalsIgnoreCase("B")) cs = Consistencia.B;
        if(consistencia.equalsIgnoreCase("C")) cs = Consistencia.C;
        if(consistencia.equalsIgnoreCase("D")) cs = Consistencia.D;
        if(consistencia.equalsIgnoreCase("E")) cs = Consistencia.E;
        if(consistencia.equalsIgnoreCase("F")) cs = Consistencia.F;


            return h.getHabilidad() + e.getEsfuerzo() + c.getCondiciones() + cs.getConsistencia() + 1;

    }

    public static double medias(double y1,double y2,double y3,double y4){
        return (y1 + y2 + y3 + y4)/4;
    }
}
