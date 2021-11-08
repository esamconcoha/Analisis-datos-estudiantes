
package proyecto2;

import java.util.List;
import java.util.Scanner;



public class Estudiante {
    Scanner g = new Scanner (System.in);
    
    //declaración de variables
    private  String nombres;
    private  String apellidos;
    private  int carne;
    private  int edad;
    private  char sexo;
    private  String carrera;
    private  float totalC;
    private  String colector;
    private  String convertidor;
    
    //constructores
    public Estudiante(String nombres, String apellidos, int carne, int edad, char sexo, String carrera, float totalC) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carne = carne;
        this.edad = edad;
        this.sexo = sexo;
        this.carrera = carrera;
        this.totalC = totalC;
      
        
        
        //getters y setters
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getTotalC() {
        return totalC;
    }

    public void setTotalC(float totalC) {
        this.totalC = totalC;
    }

  public String recoleccion(){
      int CantidadCursosAp;
      int reprobados;
     
      //se halla la cantidad de cursos aprobados y reprobados
      System.out.println("Ingrese la cantidad de cursos aprobados");
      CantidadCursosAp= g.nextInt();
      reprobados = 5-CantidadCursosAp;
      Cursos aprobado []= new Cursos [CantidadCursosAp];
      
      
      
      
      
      
      
     // ingreso de datos sobre los cursos aprobados 
      for (int i = 0; i < CantidadCursosAp; i++) {
 
          int semestres;// declaracion de variables
          String nombrecurso;
          int codigocurso;
          float zonaobtenida;
          float notaexamenf;
          String fechaaprocurso;
          
          System.out.println("Ingrese el semestre al que pertenece el curso");
          semestres= g.nextInt();
          
          System.out.println("Ingrese el nombre del curso");
          nombrecurso = g.next();
          
          System.out.println("Ingrese codigo de curso");
          codigocurso= g.nextInt();
          
          System.out.println("Ingrese la zona obtenida");
          zonaobtenida= g.nextFloat();
          
          System.out.println("Ingrese la nota obtenida en el examen final");
          notaexamenf= g.nextFloat();
          
          System.out.println("Ingrese la fecha de aprobación del curso (DD/MM/AA)");
          fechaaprocurso= g.next();
          
        aprobado [i] = new Cursos(CantidadCursosAp, semestres, nombrecurso, codigocurso, zonaobtenida, notaexamenf, fechaaprocurso); // se "invoca" la clase cursos
        
      }
      CursosR reprobado []= new CursosR [reprobados];
      
      
      
      
      
      // obteniendo los datos de los cursos reprobados
      for (int i = 0; i < reprobados; i++) {
          
          int semestreR;// declaración de variables
          String nombrecursoR;
          int codigocursoR;
          int zonaobtenidaR;
          int notaexamenR;
          String fechareprocurso;
          
          System.out.println("Ingrese el semestre al que pertenece el curso reprobado");
          semestreR= g.nextInt();
          
          System.out.println("Ingrese el nombre del curso reprobado");
          nombrecursoR= g.next();
          
          System.out.println("Ingrese el codigo del curso reprobado");
          codigocursoR= g.nextInt();
          
          System.out.println("Ingrese la zona obtenida del curso reprobado");
          zonaobtenidaR= g.nextInt();
          
          System.out.println("Ingrese la nota obtenida en el examen final del curso reprobado");
          notaexamenR= g.nextInt();
          
          System.out.println("Ingrese la fecha de reprobacion del curso (DD/MM/AA)");
          fechareprocurso= g.next();
          
        reprobado [i] =new CursosR(semestreR,nombrecursoR, codigocursoR, zonaobtenidaR, notaexamenR, fechareprocurso);  //se "invoca" la clasa CursosR
      }
      
         for (int i = 0; i < aprobado.length; i++) {
             
          colector = aprobado [i].toString();// se almacena el colector de los datos ingresados
          convertidor = convertidor+colector;
      }
         
       convertidor = convertidor+ "\nCursos reprobados: "; 
       for (int i = 0; i < reprobado.length; i++) {
          colector= reprobado [i].toString(); 
          convertidor= convertidor+colector;
          
      }
         
         
         
         
         
      return convertidor;
      }
   @Override
    public String toString(){
        StringBuilder gg = new StringBuilder();
        gg.append("\nnombres: ");
        gg.append(nombres);
        gg.append("\nApellidos: ");
        gg.append(apellidos);
        gg.append("\nNumero de carné: ");
        gg.append(carne);
        gg.append("\nEdad: ");
        gg.append(edad);
        gg.append("\nsexo: ");
        gg.append(sexo);
        gg.append("\nCarrera a la que pertenece: ");
        gg.append(carrera);
        gg.append("\nTotal de creditos obtenidos: ");
        gg.append(totalC);
        gg.append("\n");
        gg.append(convertidor);
        return gg.toString();
    }
  }

