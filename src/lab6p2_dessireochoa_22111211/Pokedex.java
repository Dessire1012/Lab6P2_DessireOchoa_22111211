
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
    
    
    public void addPokemonE(String nombre, float daño, String velocidad,  int vida){
         pokemones.add(new PokeElectrico(nombre, daño, velocidad, vida));
    }
    
    public void addPokemonF(String nombre, float daño, String velocidad,  int vida){
         pokemones.add(new PokeFantasma(nombre, daño, velocidad, vida));
    }
    
    public void addPokemonP(String nombre, float daño, String velocidad,  int vida){
         pokemones.add(new PokePsiquico(nombre, daño, velocidad, vida));
    }
    
    public void addPokemonV(String nombre, float daño, String velocidad,  int vida){
         pokemones.add(new PokeVenenoso(nombre, daño, velocidad, vida));
    }
    
    public double dañoPromedio(){
        return (pokemones.get(0).getDaño()+pokemones.get(1).getDaño()+pokemones.get(0).getDaño())/3 ;
    }

    @Override
    public String toString() {
        return "Pokedex";
    }
    
    
       
}
