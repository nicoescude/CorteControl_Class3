package Clases_3;

public class ComidaBuilder {
    public static Comida build(String comida){
        Comida myComida;
        comida = comida.toLowerCase();
        switch(comida){
            case "cafe":
                myComida = new Cafe();
                break;
            case "hamburguesa":
                myComida = new Hamburguesa();
                break;
            default:
                myComida = null;
        }
        return myComida;
    }
}
