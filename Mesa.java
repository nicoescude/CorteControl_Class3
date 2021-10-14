package Clases_3;

import java.util.ArrayList;

public class Mesa {
    int personas_sentadas;
    int capacidad_max;
    float cuenta;
    ArrayList<Comida> comidas;

    public Mesa(int capacidad_max){
        this.personas_sentadas = 0;
        this.capacidad_max = capacidad_max;
        this.cuenta = 0f;
        this.comidas = new ArrayList<Comida>();
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public float getCuenta() {
        return cuenta;
    }

    public void setCuenta(float cuenta) {
        this.cuenta = cuenta;
    }

    public int getPersonas_sentadas() {
        return personas_sentadas;
    }

    public void setPersonas_sentadas(int personas_sentadas) {
        this.personas_sentadas = personas_sentadas;
    }

    public void addComida(Comida comida){
        this.comidas.add(comida);
    }

    // public static Mesa obtenerMesa(){
    //     Mesa m = new Mesa(0,10,0f,new ArrayList<Comida>());
    //     return m;
    // }
}
