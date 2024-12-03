package org.eduran.certificacionjava2024.fase2;

import org.eduran.certificacionjava2024.fase2.modelos.AlumnosCarrera;
import org.eduran.certificacionjava2024.fase2.modelos.CarreraDirectores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarreraService {

    private final Connection connection;

    public CarreraService() throws SQLException, ClassNotFoundException {
        this.connection = (Connection) ConexionDB.getInstance();
    }

    public List<AlumnosCarrera> cantidadDeAlumnosPorCarrera() throws SQLException {
        String sql = "SELECT\n" +
                "    c.nom_car AS carrera,\n" +
                "    COUNT(a.run_alu) AS cantidad_alumnos\n" +
                "FROM\n" +
                "    carreras c\n" +
                "INNER JOIN alumnos a ON c.id_car = a.car_alu\n" +
                "GROUP BY\n" +
                "    c.nom_car;";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        List<AlumnosCarrera> carrerasDirectores = new java.util.ArrayList<>();

        while (rs.next()) {
            AlumnosCarrera alumnosCarrera = new AlumnosCarrera(rs.getString("carrera"), rs.getString("cantidad_alumnos"));
            carrerasDirectores.add(alumnosCarrera);
        }

        return carrerasDirectores;


    }



}
