package Clase20;

public class GafaNadal {
    private String nombre;
    private int edad;
    private int estatura;
    private int titulos;

    public GafaNadal(String nombre, int edad, int estatura, int titulos) {
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
        this.titulos=titulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
    public void Competir(){
        System.out.println(nombre + " está en la final..");
    }
    public void IrAEntrenar(){
        System.out.println(nombre + " se dirige al centro de entrenamiento");
    }
    public void Ganar(){
        System.out.println(nombre + " no sabe que es perder");
    }
}
