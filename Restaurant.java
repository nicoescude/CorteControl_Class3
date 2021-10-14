package Clases_3;

import java.util.ArrayList;

public class Restaurant {
    ArrayList<Mesa> mesas;
    float totalDiario=0f;

    public Restaurant(int mesas){
        this.mesas = new ArrayList<Mesa>();
        for (int i=0;i<mesas;i++){
            this.mesas.add(new Mesa(10));
        }
    }

    public void mostrarMesas(){
        for (int i=0;i<mesas.size();i++){
            System.out.println("Mesa:"+i+" ->> Sentados: "+mesas.get(i).getPersonas_sentadas()+
            "|  Cuenta: "+mesas.get(i).getCuenta()+
            "|  Capacidad: "+mesas.get(i).getCapacidad_max());
        }
    }

    public void tomarMesa(int mesa, int personas){
        if (mesa >= 0 && mesa < mesas.size()){
            Mesa m = mesas.get(mesa);
            if (m.getPersonas_sentadas()!=0)
            System.out.println("Error: Mesa ya tomada");
            else{
                if (personas > m.getCapacidad_max())
                    System.out.println("Error: Demasiadas personas");
                else{
                    m.setPersonas_sentadas(personas);
                    System.out.println("Mesa tomada correctamente");
                }
            }
        }
        else
            System.out.println("Error: Mesa invalida");
    }

    public void pedirComida(int mesa, Comida pedido){
        Mesa m = mesas.get(mesa);
        if (m != null){
            if (m.getPersonas_sentadas() == 0)
                System.out.println("Error: No hay personas sentadas");
            else{
                m.addComida(pedido);
                m.cuenta+=pedido.precio;
            }
        }
    }

    public void pagarCuenta(int mesa){
        Mesa m = mesas.get(mesa);
        m.setPersonas_sentadas(0);
        totalDiario+=m.getCuenta();
        m.setCuenta(0f);
    }

    public void mostrarTotalDiario(){
        System.out.println("El total recaudado hoy es de: "+totalDiario);
    }
}
