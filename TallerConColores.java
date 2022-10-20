package Clase20;

import clase10.Estudiante;

public class TallerConColores {
    public static void main(String[] args){
        GafaNadal e1 = new GafaNadal("Rafael Nadal Parera", 36, 185, 92);
        e1.Competir();
        System.err.println("El tenista se llama " + e1.getNombre());
    }
}
