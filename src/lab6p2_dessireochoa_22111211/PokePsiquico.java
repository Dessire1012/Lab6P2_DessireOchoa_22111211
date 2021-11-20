
package lab6p2_dessireochoa_22111211;

public class PokePsiquico extends Pokemones{

    public PokePsiquico(String nombre, float daño, String velocidad) {
        super(nombre, daño, velocidad);
    }

    public PokePsiquico() {
    }

    @Override
    public String toString() {
         return super.toString()+ " Psiquico"; 
    }
    
    
    
}
