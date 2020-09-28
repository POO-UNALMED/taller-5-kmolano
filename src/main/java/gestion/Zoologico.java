package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    //Atributos de clase
    private String nombre;
    private String ubicacion;
    private static List<Zona> zona = new ArrayList<>();


    //Constructores
    public Zoologico() {
    }
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    //Metodos GET AND SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Zona> getZona() {
        return zona;
    }

    public void setZona(List<Zona> zona) {
        this.zona = zona;
    }

    //Metodos
    public void agregarZonas(Zona zona){
        Zoologico.zona.add(zona);
    }


    //editar
    public int cantidadTotalAnimales(){
        return zona.get(0).getAnimales().size()+zona.get(1).getAnimales().size();
    }
}


