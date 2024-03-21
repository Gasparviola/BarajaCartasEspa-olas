
import java.util.ArrayList;
import java.util.List;


//Esta clase va a ser la que va a manejar una baraja de cartas, aqui metemos todos los metodos
public class Baraja {
        
        private List<Carta> cartas;
        
        public Baraja(){
            cartas = new ArrayList<>();
            //Aca vamos a iniciar la bara con las 40 cartas españolas
            String[] palos = {"Espada", "Basto", "Oro", "Copa"}; //Aca tenemos los palos para las cartas, utilizamos un arreglo
          
            //Hacemos un for para que asigne un palo a cada carta
           for(String palo : palos){
               //Usa
               for(int numero = 1; numero <= 12; numero++){
                   if(numero != 8 && numero != 9){
                       cartas.add(new Carta(numero,palo));
                   }
               }
           }           
        }
        
        
        
        
}
