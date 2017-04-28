package lab2_ricardosanchez;

/**
 *
 * @author Ricardo
 */
public class AlumnosD_Progra2 {
    String Apodo;
    int NumCuenta;
    int edad;
    int recistencia;
    String TipoDArma;
    String GradoAcademico;

    public AlumnosD_Progra2(String Apodo, int NumCuenta, int edad, int recistencia, String TipoDArma, String GradoAcademico) {
        this.Apodo = Apodo;
        this.NumCuenta = NumCuenta;
        this.edad = edad;
        this.recistencia = recistencia;
        this.TipoDArma = TipoDArma;
        this.GradoAcademico = GradoAcademico;
    }

    public String getApodo() {
        return Apodo;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public int getRecistencia() {
        return recistencia;
    }

    public String getTipoDArma() {
        return TipoDArma;
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRecistencia(int recistencia) {
        this.recistencia = recistencia;
    }

    public void setTipoDArma(String TipoDArma) {
        this.TipoDArma = TipoDArma;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }
    
    
}
