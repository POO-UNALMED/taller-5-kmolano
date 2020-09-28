package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zona {

    //Atributos de clase
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales = new ArrayList<>();


    //Constructores

    public Zona() {
    }
    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }


    //Metodos GET AND SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public List<Animal> getAnimales() {
        return this.animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    //Metodos
    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }
    //editar
    public int cantidadAnimales() {
        return animales.size();
    }



}
