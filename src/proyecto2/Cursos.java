/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author user123
 */
public class Cursos {
    
    // declaración de variables
    int CantidadCursosAp;
    int semestres;
    String nombrecurso;
    int codigocurso;
    float zonaobtenida;
    float notaexamenf;
    String fechaaprocurso;

    
    //creación de constructor
    public Cursos(int CantidadCursosAp, int semestres, String nombrecurso, int codigocurso, float zonaobtenida, float notaexamenf, String fechaaprocurso) {
        this.CantidadCursosAp = CantidadCursosAp;
        this.semestres = semestres;
        this.nombrecurso = nombrecurso;
        this.codigocurso = codigocurso;
        this.zonaobtenida = zonaobtenida;
        this.notaexamenf = notaexamenf;
        this.fechaaprocurso = fechaaprocurso;
    }

    
    
    // getters y setters
    public Cursos() {
    }

    public int getCantidadCursosAp() {
        return CantidadCursosAp;
    }

    public void setCantidadCursosAp(int CantidadCursosAp) {
        this.CantidadCursosAp = CantidadCursosAp;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public int getCodigocurso() {
        return codigocurso;
    }

    public void setCodigocurso(int codigocurso) {
        this.codigocurso = codigocurso;
    }

    public float getZonaobtenida() {
        return zonaobtenida;
    }

    public void setZonaobtenida(float zonaobtenida) {
        this.zonaobtenida = zonaobtenida;
    }

    public float getNotaexamenf() {
        return notaexamenf;
    }

    public void setNotaexamenf(float notaexamenf) {
        this.notaexamenf = notaexamenf;
    }

    public String getFechaaprocurso() {
        return fechaaprocurso;
    }

    public void setFechaaprocurso(String fechaaprocurso) {
        this.fechaaprocurso = fechaaprocurso;
    }

    // asignación de datos a variables
     @Override
    public String toString(){
        StringBuilder gg = new StringBuilder();
        gg.append("\nCantidad de cursos: ");
        gg.append(CantidadCursosAp);
        gg.append("\nSemestre al que pertenece el curso: ");
        gg.append(semestres);
        gg.append("\nNombre del curso: ");
        gg.append(nombrecurso);
        gg.append("\nCondigo del curso: ");
        gg.append(codigocurso);
        gg.append("\nZona obtenida en el examen final: ");
        gg.append(zonaobtenida);
        gg.append("\nNota obtenida en el examen final: ");
        gg.append(notaexamenf);
        gg.append("\nFecha de aprobación de curso: ");
        gg.append(fechaaprocurso);
        return gg.toString();
    }
    
}
