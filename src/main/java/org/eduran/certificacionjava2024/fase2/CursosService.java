package org.eduran.certificacionjava2024.fase2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CursosService {


    private final Connection connection;

    public CursosService() throws SQLException, ClassNotFoundException {
        this.connection = (Connection) ConexionDB.getInstance();
    }


    public String contarAlumnosTotales() throws SQLException, ClassNotFoundException {
        String sql = "select count(c.alu_cur) as TotalAlumnos from cursos c;";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        return rs.next() ? rs.getString("TotalAlumnos") : "0";
    }

}
