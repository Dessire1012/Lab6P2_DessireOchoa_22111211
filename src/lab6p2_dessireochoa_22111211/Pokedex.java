
package lab6p2_dessireochoa_22111211;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList <Pokemones> pokemones = new ArrayList();

    public Pokedex() {
    }

    public ArrayList<Pokemones> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemones> pokemones) {
        this.pokemones = pokemones;
    }
    
    public void addPokemon(String nombre, float daño, String velocidad){
         pokemones.add(new Pokemones(nombre, daño, velocidad));
    }
    
    public double dañoPromedio(){
        return (pokemones.get(0).getDaño()+pokemones.get(1).getDaño()+pokemones.get(0).getDaño())/3 ;
    }

    @Override
    public String toString() {
        return "Pokedex{" + "pokemones=" + pokemones + '}';
    }
    
    
       
}
