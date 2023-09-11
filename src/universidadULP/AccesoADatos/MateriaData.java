/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadULP.AccesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import universidadULP.Entidades.Materia;

/**
 *
 * @author MaRio
 */
public class MateriaData {
    
    Connection connection = Conexion.getConnection();

    public MateriaData() {
    }
    
    public void guardarMateria(Materia materia){
        

        try {
            String sqlInsert = "INSERT INTO materia(nombre, año, estado)"
                            + "VALUES(?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareCall(sqlInsert);
            
            preparedStatement.setString(1, materia.getNombre());
            preparedStatement.setInt(1, materia.getAnio());
            preparedStatement.setBoolean(3, materia.isEstado());
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
