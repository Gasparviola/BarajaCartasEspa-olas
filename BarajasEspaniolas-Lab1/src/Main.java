
public class Main {


    public static void main(String[] args) {
        
            //Creamos una baraja
           Baraja baraja = new Baraja();
            
           System.out.println("Barajando el mazo de cartas...");
           //Barajamos
           baraja.barajar();
           System.out.println("");
           
           System.out.println("La baraja ha quedado asi: ");
           //Mostramos la baraja
           baraja.mostrarBaraja();
           System.out.println("");
           
           
           //Comprobamos si al barajar  3 cartas(en este caso)  se remueven de la lista
            System.out.println("Barajamos 3 cartas");
            baraja.siguienteCarta();
            baraja.siguienteCarta();
            baraja.siguienteCarta();
            System.out.println("");
            
            //Comprobando lo anteriormente dicho
            System.out.println("Mostramos las cartas disponibles");
            System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles()); 
            System.out.println("");
            
            baraja.darCartas(12);
            System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles()); 
           
        
    }
    
}
