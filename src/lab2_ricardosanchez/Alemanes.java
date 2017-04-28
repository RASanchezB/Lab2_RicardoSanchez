package lab2_ricardosanchez;

/**
 *
 * @author Ricardo
 */
public class Alemanes {
    String Alias;
    int edad;
    String Casta;
    String Rango;
    int resistencia;
    String TipoDArma;

    public Alemanes(String Alias, int edad, String Casta, String Rango, int resistencia, String TipoDArma) {
        this.Alias = Alias;
        this.edad = edad;
        this.Casta = Casta;
        this.Rango = Rango;
        this.resistencia = resistencia;
        this.TipoDArma = TipoDArma;
    }

    public String getAlias() {
        return Alias;
    }

    public int getEdad() {
        return edad;
    }

    public String getCasta() {
        return Casta;
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

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasta(String Casta) {
        this.Casta = Casta;
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
    
}
