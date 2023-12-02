public class Estudiantes {
    public String nombre;
    public String materia;
    public int edad;

    public Estudiantes(String nombre, String materia, int edad) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public int getNota() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNota(int edad) {
        this.edad = edad;
    }
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Materia: " + materia);
        System.out.println("Edad: " + edad);
        System.out.println();
    }
    public void modificarMateria(int nuevaMateria) {
        this.edad = nuevaMateria;
    }

    public void modificarEdad(double nuevoEdad) {
        this.edad = (int) nuevoEdad;
    }
}
