
import java.sql.*; 
import java.util.ArrayList;


public class Conexion {
    private static ResultSet Resultado;
    private static Statement Consulta;

    
    Connection conectar = null; //Atributo conectar que es de la clase Connetion (Similar String x, int x, etc).
    
    public Connection conectar () //Método que retorna un tipo de dato (similar a un get), misma clase del atributo (Connection)
    {
        try {
            //Class.forName("org.sqlite.JDBC"); //Le está diciendo a java que va a utilizar el motor SQLite
            Class.forName("com.mysql.jdbc.Driver"); //Le está diciendo a java que va a utilizar el motor SQLite
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/empleado","root", ""); //Después de los : pone el nombre del archivo y la extención es la misma como se va a guardar el proyecto desde SQLite, es lo único que se debe cambiar al copiar y pegar código.
        } //Linea anterior debe poner ruta completa donde está el archivo
        catch (Exception e) 
        {            
            System.out.println(e.getMessage());
        }
        
        return conectar;
    }
        
    public ArrayList CargarImagenes(){
        ArrayList Imagenes = new ArrayList();
        try {
            var c = conectar();
            Consulta = c.createStatement();
            Resultado = Consulta.executeQuery("SELECT * FROM trabajador");
            while (Resultado.next()) {
                ImagenTrabajador mImagen = new ImagenTrabajador();
                mImagen.setImagen_id(Resultado.getInt("documento"));
                mImagen.setNombre(Resultado.getString("nombre"));
                mImagen.setApellido(Resultado.getString("apellido"));
                mImagen.setSexo(Resultado.getString("sexo"));
                mImagen.setImagen(Resultado.getBytes("foto"));
                mImagen.setFecha_De_Ingreso(Resultado.getString("Fecha_De_Ingreso"));
                mImagen.setFecha_De_Nacimiento(Resultado.getString("Fecha_De_Nacimiento"));
                mImagen.setSalario(Resultado.getInt("Salario"));
                Imagenes.add(mImagen);
            }
            
        }catch (Exception e){
            return null;
        }
        return Imagenes;
    }

    

}