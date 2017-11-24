
package lab.pkg6_richardpadgett;

import java.util.ArrayList;


public class Universo {
    String nombre;
    ArrayList<Seres_vivos> sv = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seres_vivos> getSv() {
        return sv;
    }

    public void setSv(ArrayList<Seres_vivos> sv) {
        this.sv = sv;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", sv=" + sv + '}';
    }
    
}
