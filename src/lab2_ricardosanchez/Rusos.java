package lab2_ricardosanchez;

/**
 *
 * @author Ricardo
 */
public class Rusos {
    String Nombre;
    int ID;
    int edad;
    String Rango;
    int resistencia;
    String TipoDArma;

    public Rusos(String Nombre, int ID, int edad, String Rango, int resistencia, String TipoDArma) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.edad = edad;
        this.Rango = Rango;
        this.resistencia = resistencia;
        this.TipoDArma = TipoDArma;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public String getRango() {
        return Rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getTipoDArma() {
        return TipoDArma;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setTipoDArma(String TipoDArma) {
        this.TipoDArma = TipoDArma;
    }

    @Override
    public String toString() {
        return "Rusos{" + "Nombre=" + Nombre + ", ID=" + ID + ", edad=" + edad + ", Rango=" + Rango + ", resistencia=" + resistencia + ", TipoDArma=" + TipoDArma + '}';
    }
    
}
