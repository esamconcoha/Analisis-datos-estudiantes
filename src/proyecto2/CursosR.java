
package proyecto2;

/**
 *
 * @author user123
 */
public class CursosR {
    private int semestreR;// declaración de variables
    private String nombrecursoR;
    private int codigocursoR;
    private int zonaobtenidaR;
    private int notaexamenR;
    private String fechareprocurso;

    
    // creación de constructores
    public CursosR(int semestreR, String nombrecursoR, int codigocursoR, int zonaobtenidaR, int notaexamenR, String fechareprocurso) {
        this.semestreR = semestreR;
        this.nombrecursoR = nombrecursoR;
        this.codigocursoR = codigocursoR;
        this.zonaobtenidaR = zonaobtenidaR;
        this.notaexamenR = notaexamenR;
        this.fechareprocurso = fechareprocurso;
    }

    
    
    // creación de getters y setters
    public int getSemestreR() {
        return semestreR;
    }

    public void setSemestreR(int semestreR) {
        this.semestreR = semestreR;
    }

    public String getNombrecursoR() {
        return nombrecursoR;
    }

    public void setNombrecursoR(String nombrecursoR) {
        this.nombrecursoR = nombrecursoR;
    }

    public int getCodigocursoR() {
        return codigocursoR;
    }

    public void setCodigocursoR(int codigocursoR) {
        this.codigocursoR = codigocursoR;
    }

    public int getZonaobtenidaR() {
        return zonaobtenidaR;
    }

    public void setZonaobtenidaR(int zonaobtenidaR) {
        this.zonaobtenidaR = zonaobtenidaR;
    }

    public int getNotaexamenR() {
        return notaexamenR;
    }

    public void setNotaexamenR(int notaexamenR) {
        this.notaexamenR = notaexamenR;
    }

    public String getFechareprocurso() {
        return fechareprocurso;
    }

    public void setFechareprocurso(String fechareprocurso) {
        this.fechareprocurso = fechareprocurso;
    }
    
    // asignación de datos a variables
    @Override
    public String toString(){
        StringBuilder gg = new StringBuilder();
        gg.append("\nSemestre al que pertenece el curso reprobado: ");
        gg.append(semestreR);
        gg.append("\nNombre del curso reprobado: ");
        gg.append(nombrecursoR);
        gg.append("\nCondigo del curso reprobado: ");
        gg.append(codigocursoR);
        gg.append("\nZona obtenida en el examen final del curso reprobado: ");
        gg.append(zonaobtenidaR);
        gg.append("\nNota obtenida en el examen final del curso reprobado: ");
        gg.append(notaexamenR);
        gg.append("\nFecha de reprobación de curso: ");
        gg.append(fechareprocurso);
        return gg.toString();
    }
    
}
