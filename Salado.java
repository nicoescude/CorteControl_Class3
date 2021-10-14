package Clases_3;

public class Salado extends Comida{
    int cant_sal;

    public Salado(float precio, String desc, int cant_sal){
        super(precio, desc);
        this.cant_sal = cant_sal;
    }
}
