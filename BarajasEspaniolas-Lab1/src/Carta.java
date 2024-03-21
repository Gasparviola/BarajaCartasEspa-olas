
//Esta clase va a representar una carta
public class Carta {
        
        private int numero; 
        private String palo;
        
        public Carta(int numero, String palo){
            this.numero = numero;
            this. palo = palo;
        }
        
        //Con el Override sobreescribimos el metodo toString() de la clase Object
        //Gracias a esto podemos decirle como representar una carta como cadena de texto.
        //En este caso queremos que la representacion de una carta sea el numero de la carta seguido =>
        // => del palo de la misma.
        @Override
        public String toString(){
            return numero +  " de "  + palo;
        }
        
}
