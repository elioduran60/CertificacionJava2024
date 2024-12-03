package org.eduran.certificacionjava2024.fase2;

import org.eduran.certificacionjava2024.fase2.modelos.Directores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectoresService {

    private final Connection connection;

    public DirectoresService() throws SQLException, ClassNotFoundException {
        this.connection = (Connection) ConexionDB.getInstance();
    }

    public void insertarDirectores(String run_dir, String nom_dir, String ape_dir, String pro_dir) throws SQLException, ClassNotFoundException {
        Directores directores = new Directores();
        directores.setRun_dir(run_dir);
        directores.setNom_dir(nom_dir);
        directores.setApe_dir(ape_dir);
        directores.setPro_dir(pro_dir);

        String sql = "INSERT INTO directores (run_dir, nom_dir, ape_dir, pro_dir) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, directores.getRun_dir());
        pstmt.setString(2, directores.getNom_dir());
        pstmt.setString(3, directores.getApe_dir());
        pstmt.setString(4, directores.getPro_dir());

        pstmt.executeUpdate();
    }

    public Directores leerDirectores(String run_dir) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM directores WHERE run_dir = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, run_dir);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            Directores director = new Directores();
            director.setRun_dir(rs.getString("run_dir"));
            director.setNom_dir(rs.getString("nom_dir"));
            director.setApe_dir(rs.getString("ape_dir"));
            director.setPro_dir(rs.getString("pro_dir"));
            return director;
        }

        return null;
    }
}
