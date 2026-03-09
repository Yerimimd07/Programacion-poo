public class Celular {

    //atributos
    String marca;
    String modelo;
    int bateria = 100;

    //METODO
    /*
    *Firma del metodo
    *publico
    * void --> no retorna
    * el metodo tiene como nombre llamar
    * tiene un parametro y un entero
    */


    public void llamar(String numero){
        System.out.println("Lamar al " + numero + "..." + "La bateria esta en " + bateria);
        this.bateria -= 5;
    }
    
}