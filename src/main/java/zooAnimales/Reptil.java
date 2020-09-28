package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{

    //Atributos de clase
    private static List<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    //Constructores

    public Reptil() {
        listado.add(this);
    }
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setColorEscamas(colorEscamas);
        this.setLargoCola(largoCola);
    }

    //Metodos GET AND SET

    public static List<Reptil> getListado() {
        return listado;
    }

    public static void setListado(List<Reptil> listado) {
        Reptil.listado = listado;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    //Metodos
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil.iguanas += 1;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil.serpientes += 1;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    }
    public String movimiento() {
        return "reptar";
    }
}
