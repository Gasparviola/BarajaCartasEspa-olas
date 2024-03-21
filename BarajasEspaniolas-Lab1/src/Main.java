
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
            
        
    }
    
}
