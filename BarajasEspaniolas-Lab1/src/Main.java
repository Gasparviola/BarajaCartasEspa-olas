
import java.util.List;


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
//            System.out.println("Barajamos 3 cartas");
//            baraja.siguienteCarta();
//            baraja.siguienteCarta();
//            baraja.siguienteCarta();
//            System.out.println("");
 

            //Barajamos una carta
            System.out.println("Siguiente Carta");
            System.out.println(baraja.siguienteCarta());
            System.out.println("");
            
            
            //Comprobando lo anteriormente dicho
            System.out.println("Mostramos las cartas disponibles");
            System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles()); 
            System.out.println("");
            
//            baraja.darCartas(12);
//            System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles()); 

            System.out.println("Repartiendo 5 cartas");
            List<Carta> cartasRepartidas = baraja.darCartas(5);
            for(Carta carta : cartasRepartidas){
                System.out.println(carta);
            }
            System.out.println("");
            
            
            System.out.println("Cartas en el monton");
            List<Carta> monton = baraja.cartasMonton();
            if(monton.isEmpty()){
                System.out.println("No se han repartido cartas aun");
            }else{
                for(Carta carta : monton){
                    System.out.println(carta);
                }
            }   
            
    }
    
}
