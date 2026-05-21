#include <iostream>
#include <string>

using namespace std;

// Clase Estudiante
class Estudiante {
private:
    // Atributos privados
    string cedula;
    string nombre;
    string apellido;
    float nota1;
    float nota2;
    float nota3;
    float promedio;

public:

    // Constructor
    Estudiante(string c, string n, string a,
               float n1, float n2, float n3) {

        cedula = c;
        nombre = n;
        apellido = a;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;

        promedio = calcularPromedio();
    }

    // Métodos GET
    string getCedula() {
        return cedula;
    }

    string getNombre() {
        return nombre;
    }

    string getApellido() {
        return apellido;
    }

    float getPromedio() {
        return promedio;
    }

    // Métodos SET
    void setNombre(string n) {
        nombre = n;
    }

    void setApellido(string a) {
        apellido = a;
    }

    // Método para calcular promedio
    float calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar estado
    string verificarEstado() {
        if (promedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    // Método para mostrar información
    void mostrarInformacion() {

        cout << "\n============================\n";
        cout << "Cedula: " << cedula << endl;
        cout << "Nombre: " << nombre << endl;
        cout << "Apellido: " << apellido << endl;
        cout << "Nota 1: " << nota1 << endl;
        cout << "Nota 2: " << nota2 << endl;
        cout << "Nota 3: " << nota3 << endl;
        cout << "Promedio: " << promedio << endl;
        cout << "Estado: " << verificarEstado() << endl;
    }
};

// Función para validar notas
float validarNota() {

    float nota;

    do {
        cin >> nota;

        if (nota < 0 || nota > 10) {
            cout << "Error. Ingrese una nota entre 0 y 10: ";
        }

    } while (nota < 0 || nota > 10);

    return nota;
}

int main() {

    Estudiante* estudiantes[5];

    int aprobados = 0;
    int reprobados = 0;

    string cedula, nombre, apellido;
    float n1, n2, n3;

    // Registro de estudiantes
    for (int i = 0; i < 5; i++) {

        cout << "\n===== ESTUDIANTE "
             << i + 1 << " =====\n";

        cout << "Cedula: ";
        cin >> cedula;

        cout << "Nombre: ";
        cin >> nombre;

        cout << "Apellido: ";
        cin >> apellido;

        cout << "Nota 1: ";
        n1 = validarNota();

        cout << "Nota 2: ";
        n2 = validarNota();

        cout << "Nota 3: ";
        n3 = validarNota();

        estudiantes[i] = new Estudiante(
            cedula, nombre, apellido,
            n1, n2, n3
        );

        if (estudiantes[i]->getPromedio() >= 7) {
            aprobados++;
        } else {
            reprobados++;
        }
    }

    // Mostrar estudiantes
    cout << "\n\n===== LISTADO DE ESTUDIANTES =====\n";

    for (int i = 0; i < 5; i++) {
        estudiantes[i]->mostrarInformacion();
    }

    // Resultados finales
    cout << "\n============================\n";
    cout << "Aprobados: " << aprobados << endl;
    cout << "Reprobados: " << reprobados << endl;

    return 0;
}