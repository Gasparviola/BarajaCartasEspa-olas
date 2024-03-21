
import java.util.ArrayList;
import java.util.Collections;
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
               //Usamos otro for para asignar un numero (del 1 al 12, saltando al 8 y 9) a la carta
               for(int numero = 1; numero <= 12; numero++){
                   if(numero != 8 && numero != 9){
                       cartas.add(new Carta(numero,palo));//Aqui se envia el parametro de numero y palo a la carta.
                   }
               }
           }           
        }
        
        //Con este metodo mezclamos la coleccion de cartas, "barajamos" justamente
        public void barajar(){
            //Este metodo se utiliza para barajar (o mezclar) los elementos de una colección. 
            //En este caso, cartas es la colección que queremos barajar.
            Collections.shuffle(cartas);
        }
        
        
        
        //Con este metodo devolvemos la siguiente carta en la baraja
        public Carta siguienteCarta(){
            
            //Verifica si la baraja de cartas (cartas) no está vacía utilizando el método isEmpty() de la colección cartas. 
            //Si la baraja no está vacía, procede a lo siguiente.
            if(!cartas.isEmpty()){
                
                //Utiliza el método remove(0) para eliminar y devolver la primera carta de la lista cartas. 
                //Esto simula sacar la carta de la parte superior de la baraja.
                return cartas.remove(0);
            }else{
                //Si la baraja está vacía, imprime un mensaje indicando que no hay más cartas disponibles y devuelve null.
                System.out.println("No hay mas cartas en la baraja");
                return null;
            }
        }
        
            //Con este metodo recorremos la lista y mostramos las cartas
            public void mostrarBaraja() {
            for (Carta carta : cartas) {
                System.out.println(carta);
                }
            }
        
        
        
}
