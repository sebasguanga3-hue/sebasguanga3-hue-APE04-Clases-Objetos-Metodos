public class Estudiante {

    // Atributos privados
    private String cedula;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    // Constructor
    public Estudiante(String cedula,
                       String nombre,
                       String apellido,
                       double nota1,
                       double nota2,
                       double nota3) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

        promedio = calcularPromedio();
    }

    // Métodos GET
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    // Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método calcular promedio
    public double calcularPromedio() {

        return (nota1 + nota2 + nota3) / 3;
    }

    // Método verificar estado
    public String verificarEstado() {

        if (promedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    // Método mostrar información
    public void mostrarInformacion() {

        System.out.println("\n======================");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + verificarEstado());
    }
}