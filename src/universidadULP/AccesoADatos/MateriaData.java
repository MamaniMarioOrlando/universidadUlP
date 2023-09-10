
package universidadULP.AccesoADatos;

import java.sql.Connection;
import java.util.List;
import universidadULP.Entidades.Materia;

/*
 * @author MaRio y Lore
 */
public class MateriaData {
    private Connection connection =  null;

    public MateriaData() {
        connection = Conexion.getConnection();        
    }
    
    public void guardarMateria(Materia materia){
    
    }
    
    public void modificarMateria(Materia materia){
    
    }
    
    public void eliminarMateria(int id){
    
    }
    
    public Materia buscarMateria(int id){
    
       
    }
    
    public List<Materia> listarMateria(){
    
        
    }
    
    
}
