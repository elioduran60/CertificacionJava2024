package org.eduran.certificacionjava2024.fase2;

import java.sql.Connection;
import java.sql.SQLException;

public class AlumnosService {

    private final Connection connection;

    public AlumnosService() throws SQLException, ClassNotFoundException {
        this.connection = (Connection) ConexionDB.getInstance();
    }

}
