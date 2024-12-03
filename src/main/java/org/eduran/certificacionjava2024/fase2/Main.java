package org.eduran.certificacionjava2024.fase2;
import org.eduran.certificacionjava2024.fase2.modelos.AlumnosCarrera;
import org.eduran.certificacionjava2024.fase2.modelos.Carreras;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner leer = new Scanner(System.in);

        System.out.println("--------------- Instituto Tecnologico ---------------");
        System.out.println("1. Agregar Carrera");
        System.out.println("2. Total Alumnos");
        System.out.println("3. Salir");
        System.out.println("Ingrese opción:");
        int op = leer.nextInt();
        leer.nextLine();

        while (true) {
            switch (op) {
                case 1:
                    System.out.println("Ingrese los datos de la nueva Carrera: ");
                    System.out.println("--------------- Ingrese Nombre de la Carrera---------------");
                    String nom_car = leer.nextLine();

                    System.out.println("--------------- Ingrese Duración de la Carrera---------------");
                    int dur_car = leer.nextInt();
                    leer.nextLine();

                    System.out.println("--------------- Ingrese Tipo de la Carrera---------------");
                    String tip_car = leer.nextLine();

                    System.out.println("Ingrese los datos del nuevo Director: ");

                    System.out.println("--------------- Ingrese el Nombre del Director---------------");
                    String nom_dir = leer.nextLine();

                    System.out.println("--------------- Ingrese el Apellido del Director---------------");
                    String ape_dir = leer.nextLine();

                    System.out.println("--------------- Ingrese el Run del Director---------------");
                    String run_dir = leer.nextLine();

                    System.out.println("--------------- Ingrese la Profesion del Director---------------");
                    String pro_dir = leer.nextLine();

                    DirectoresService directoresService = new DirectoresService();
                    directoresService.insertarDirectores(run_dir, nom_dir, ape_dir, pro_dir);

                    AgregarNuevasCarreras agregarNuevasCarreras = new AgregarNuevasCarreras();
                    agregarNuevasCarreras.insertarCarreras(nom_car, dur_car, tip_car, run_dir);

                    System.out.println("¡Carrera creada con éxito! A continuación se mostrará un listado de todas las\n" +
                            " carreras junto a sus directores de carrera:");

                    List<String> resultado = agregarNuevasCarreras.leerCarreras();
                    for (String s : resultado) {
                        System.out.println(s);
                    }

                    break;
                case 2:
                    System.out.println("--------------- Total Alumnos--------------- ---------------");

                    CursosService cursosService = new CursosService();
                    String totalAlumnos = cursosService.contarAlumnosTotales();
                    System.out.println("El total de alumnos es: " + totalAlumnos);

                    CarreraService carreraService = new CarreraService();
                    List<AlumnosCarrera> totalAlumnosPorCarrera = carreraService.cantidadDeAlumnosPorCarrera();

                    for (AlumnosCarrera alumnosCarrera : totalAlumnosPorCarrera) {
                        System.out.println("La carrera " + alumnosCarrera.getCarrera() + " tiene " + alumnosCarrera.getCantidad_alumnos() + " alumnos.");
                    }

                    break;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("--------------- Instituto Tecnologico ---------------- ---------------");
                    System.out.println("--------------- PROGRAMA TERMINADO ---------------");
                    System.out.println("--------------- VUELVA PRONTO ---------------");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            if (op == 3) {
                break;
            }
            System.out.println("--------------- Instituto Tecnologico ---------------");
            System.out.println("1. Agregar Carrera");
            System.out.println("2. Total Alumnos");
            System.out.println("3. Salir");
            System.out.println("Ingrese opción:");
            op = leer.nextInt();
            leer.nextLine();
        }
    }
}



