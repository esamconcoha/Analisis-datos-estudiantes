

package proyecto2;


import java.util.Scanner;

public class Proyecto2 {

     
    public static void main(String[] args) {
        Scanner x= new Scanner (System.in);
        //declaración de variables
       String nombres;
       String apellidos;
       int carne;
       int edad;
       char sexo;
       String carrera;
       float totalC;
       int op1;
       int op2;
               
       
       // menu principal
        System.out.println("Analisis de datos de estudiantes");
        System.out.println("1. Ingreso de datos");
        System.out.println("2. Análisis de datos");
        System.out.println("3. salir");
        System.out.println("Elija una opción");
        op1= x.nextInt();
        
        switch (op1){// se crea el switch para realizar acciones segun el numero de opcion que hayan elegido
            case 1: // al elegir la opcion 1, se ingresan datos del estudiante, cursos aprobados y reprobados
                 System.out.println("---Ingrese los datos del estudiante---");
        
        System.out.println("Nombres : ");
        nombres = x.next();
        
        System.out.println("Apellidos: ");
        apellidos= x.next();
        
        System.out.println("Número de carné: ");
        carne= x.nextInt();
        
        System.out.println("Edad: ");
        edad= x.nextInt();
        
        System.out.println("Sexo (m/f): ");
        sexo= x.next().charAt(0);
    
        System.out.println("carrera a la que pertenece: ");
        carrera= x.next();
        
        System.out.println("Total de creditos obtenidos: ");
        totalC= x.nextFloat();
       
       Estudiante nuevo = new Estudiante(nombres, apellidos, carne, edad, sexo, carrera, totalC);
       nuevo.recoleccion();
       
        System.out.println(nuevo.toString());
        
            case 2:// se despliega segudno meú
                System.out.println("1. datos personales");
                System.out.println("2. Cantidad de estudiantes masculinos o femeninos");
                System.out.println("3. Mejor promedio de cada carrera");
                System.out.println("4. Datos académicos de estudiantes");
                System.out.println("5. Constancia de cursos aprobados ");
                System.out.println("6. Salir");
                op2= x.nextInt();
                // hasta aquí llega mi conocimiento inge :c
                
                
                
            case 3:
                System.out.println("Fin de programa");// salida del probgrama
                
                }
        }
        
        
       
    }
    

