
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {
    
    
    String nombre = "Juan Salvador",
                apellido_paterno = "Emba",
                apellido_materno = "Campos";
        String numero_de_cuenta = "2271028";
        String semestres = "2do Semtre";
        String materias = "  Calculo,      Programacion,       circuitos ";
        String horarios = " 7:00 a 9:00,  10:00 a 12:30,    12:30 a 14:30";

    
  
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("El numero de cuenta es : " + numero_de_cuenta );
        System.out.println("El semestre es : " + semestres);
        System.out.println("Las materia son: " + materias);
        System.out.println("Los horarios son: " + horarios);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
