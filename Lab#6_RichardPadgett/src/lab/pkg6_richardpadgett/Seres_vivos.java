
package lab.pkg6_richardpadgett;


public class Seres_vivos {
    String raza;
    int ki;
    int edad;
    String planeta;

    public Seres_vivos() {
    }

    public Seres_vivos(String raza, int ki, int edad, String planeta) {
        this.raza = raza;
        this.ki = ki;
        this.edad = edad;
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "raza: " + raza + "\n ki: " + ki +"\n planeta: " + planeta;
    }
    
}
