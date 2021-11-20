
package lab6p2_dessireochoa_22111211;


public class Pokemones {
    private String nombre;
    private float daño;
    private String velocidad;
    private int vida;

    public Pokemones(String nombre, float daño, String velocidad, int vida) {
        this.nombre = nombre;
        this.daño = daño;
        this.velocidad = velocidad;
        this.vida = vida;
    }


    public Pokemones() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    @Override
    public String toString() {
        return "Pokemon";
    }

   
    
}
