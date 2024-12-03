package org.eduran.certificacionjava2024.fase2;

import org.eduran.certificacionjava2024.fase2.interfaces.ICarreraDirectores;
import org.eduran.certificacionjava2024.fase2.modelos.CarreraDirectores;
import org.eduran.certificacionjava2024.fase2.modelos.Carreras;
import org.eduran.certificacionjava2024.fase2.modelos.Directores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AgregarNuevasCarreras {

    private final Connection connection;

    public AgregarNuevasCarreras() throws SQLException, ClassNotFoundException {
         this.connection = (Connection) ConexionDB.getInstance();
    }

    public void insertarCarreras(String nom_car, int dur_car, String tip_car, String dir_car) throws SQLException, ClassNotFoundException {
        Carreras carrera = new Carreras(nom_car, dur_car, tip_car, dir_car);
        System.out.println(carrera.getNom_car());
        System.out.println(carrera.getDir_car());
        System.out.println(carrera.getTip_car());
        System.out.println(carrera.getDur_car());

        String sql = "INSERT INTO carreras (nom_car, tip_car, dur_car, dir_car) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = this.connection.prepareStatement(sql);
        pstmt.setString(1, carrera.getNom_car());
        pstmt.setString(2, carrera.getTip_car());
        pstmt.setInt(3, carrera.getDur_car());
        pstmt.setString(4, carrera.getDir_car());

        pstmt.executeUpdate();

    }

    public List<String> leerCarreras() throws SQLException {
        String sql = "SELECT distinct c.nom_car, d.nom_dir, d.ape_dir FROM carreras c join directores d ON d.run_dir = c.dir_car;";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        List<String> carrerasDirectores = new java.util.ArrayList<>();

        while (rs.next()) {
            CarreraDirectores carreraDirectores = new CarreraDirectores(rs.getString("nom_car"), rs.getString("nom_dir"), rs.getString("ape_dir"));
            carrerasDirectores.add(carreraDirectores.toString());
        }

        return carrerasDirectores;
    }
}
