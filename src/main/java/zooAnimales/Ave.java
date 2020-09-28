package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{

    //Atributos de clase
    private static List<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    //Constructores

    public Ave() {
        listado.add(this);
    }
    public Ave(String nombre, int edad, String genero){
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setGenero(genero);
    }
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        this(nombre, edad, genero);
        this.setHabitat(habitat);
        this.colorPlumas = colorPlumas;
    }
    //Metodos GET AND SET

    public static List<Ave> getListado() {
        return listado;
    }

    public static void setListado(List<Ave> listado) {
        Ave.listado = listado;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }


    //Metodos
    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave.halcones += 1;
        return new Ave(nombre,edad,"montañas",genero,"cafe glorioso");
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave.aguilas += 1;
        return new Ave(nombre,edad,"montañas",genero,"blanco y amarillo");
    }
    public String movimiento() {
        return "volar";
    }
}
