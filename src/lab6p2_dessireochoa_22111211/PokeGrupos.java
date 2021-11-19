
package lab6p2_dessireochoa_22111211;

import java.util.ArrayList;
import java.util.Date;


public class PokeGrupos {
    private String nombre;
    private ArrayList <Usuarios> miembros = new ArrayList();
    private Date fechaCreacion;
    private Usuarios lider;
    private String tipo;

    public PokeGrupos() {
    }

    public PokeGrupos(String nombre, Date fechaCreacion, Usuarios lider, String tipo) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuarios> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuarios> miembros) {
        this.miembros = miembros;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuarios getLider() {
        return lider;
    }

    public void setLider(Usuarios lider) {
        this.lider = lider;
    }

    public String getTipo() {
        if(miembros.size() <= 2){
            return tipo = "Novato";
        }else if (miembros.size() >= 3 && miembros.size() <= 6){
            return tipo = "Veterano";
        } else{
          return tipo = "Legendario";
        }

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PokeGrupos{" + "nombre=" + nombre + ", miembros=" + miembros + ", fechaCreacion=" + fechaCreacion + ", lider=" + lider + ", tipo=" + tipo + '}';
    }

    
}
