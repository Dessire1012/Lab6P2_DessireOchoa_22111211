
package lab6p2_dessireochoa_22111211;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;


public class Usuarios {
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contraseña;
    private Date edad;
    private Color colorFavorito;
    private ArrayList <Pokedex> pokedex = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String nombreUsuario, String contraseña, Date edad, Color colorFavorito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.edad = edad;
        this.colorFavorito = colorFavorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public Color getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(Color colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public ArrayList<Pokedex> getPokedex() {
        return pokedex;
    }
    
    public  Pokedex get1Pokedex(int posicion){
        return pokedex.get(posicion);
    }

    public void setPokedex(ArrayList<Pokedex> pokedex) {
        if (pokedex.size() <= 2){
            this.pokedex = pokedex;
        }
    }
    
    public void addPokedex (){
        pokedex.add(new Pokedex());
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + ", colorFavorito=" + colorFavorito + ", pokedex=" + pokedex + '}';
    }
    
    
    
}
