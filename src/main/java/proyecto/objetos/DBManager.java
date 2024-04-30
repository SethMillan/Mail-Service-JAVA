package proyecto.objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DBManager {
    private String db = "mail";
    private String user = "root";
    private String password = "Devilman_Neeko(17)";
    private Connection connection;
    private Statement stm;

    public DBManager() {
    }
    
    private void open() throws Exception {
        connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/" + db,
            user, password
        );
        stm = connection.createStatement();
    }
    
    private void close() throws Exception {
        stm.close();
        connection.close();
    }
    
    ////METODOS PARA DINO-USUARIOS
    public Usuario findUser(String usr, String pass) throws Exception{
        String sql ="SELECT * FROM Usuario WHERE email = ? ";
        if(pass != null){
            sql += " AND password = SHA1(?);";
        }
        Usuario usuario = null;
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, usr);
        if(pass!=null){
            ps.setString(2, pass);
        }
        ResultSet rs =ps.executeQuery();
        if(rs.next()){
            usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setName(rs.getString("name"));
            usuario.setEmail(rs.getString("email"));
            usuario.setPassword(rs.getString("password"));
        }
        rs.close();//SI HAY FALLO BORRAR ESTA LINEA, DUDO
        close();
        return usuario;
    }
    public int addUsr(String name, String usr, String pass) throws Exception{
        int resultados = 0;
        String sql ="INSERT INTO Usuario VALUES(NULL,?,?,SHA1(?),?,?);";
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, usr);
        ps.setString(3,pass);
        ps.setString(4, "usuario");
        ps.setString(5, "False");
        resultados = ps.executeUpdate();
        close();
        
        return resultados;
    }
    public List<Usuario> listAllUsrs() throws Exception{
        String sql = "SELECT * FROM Usuario";
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs =ps.executeQuery();
        List<Usuario> respuesta = new ArrayList<>();
        
        while(rs.next()){
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setName(rs.getString("name"));
            usuario.setEmail(rs.getString("email"));
            usuario.setPassword(rs.getString("password"));
            respuesta.add(usuario);
        }
        rs.close();//SI HAY FALLO BORRAR ESTA LINEA, DUDO
        close();
        return respuesta;
    }
    
    
    //METODOS PARA MENSAJES
    public int addMensajeNuevo(String correoEmisor, String correoReceptor, String asunto, String mensaje) throws Exception{
        int resultados = 0;
        String sql = "INSERT INTO Conversacion VALUES(null)";
        String sql2 = "INSERT INTO Mensaje VALUES(null, COUNT(*) FROM Conversacion, ?,?,?,?, 1, 0)";
        open();
            PreparedStatement ps = connection.prepareStatement(sql);
            resultados=ps.executeUpdate();
        close();
        open();
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps2.setString(1, correoEmisor);
            ps2.setString(2, correoReceptor);
            ps2.setString(3, asunto);
            ps2.setString(4, mensaje);
            resultados=ps2.executeUpdate();
        close();
        return resultados;
    }
    
    public int countConversacion() throws Exception{
        int cantidad = 0;
        String sql = "SELECT COUNT(*) FROM Conversacion";
        open();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); // Ejecuta la consulta
            if (rs.next()) {
                cantidad = rs.getInt(1); // Obtiene el valor de COUNT(*)
            }
            rs.close();
        close();
        return cantidad;
    }
    public int countUsrs() throws Exception{
        int cantidad = 0;
        String sql = "SELECT COUNT(*) FROM Usuario";
        open();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); // Ejecuta la consulta
            if (rs.next()) {
                cantidad = rs.getInt(1); // Obtiene el valor de COUNT(*)
            }
            rs.close();
        close();
        return cantidad;
    }
    public int modificarLecturaMensaje(int idConversacion) throws Exception{
        int resultados = 0;
        String query ="UPDATE Mensaje SET leido = 1 WHERE idConversacion = ?";
        open();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idConversacion);
            resultados = ps.executeUpdate();
        close();
        return resultados;
    }
    public int modificarLockedUsr(String estado, int id){
        int resultados = 0;
        String query = "UPDATE Usuario SET activo = ? WHERE id = ?";
        try{
            open();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, estado);
            ps.setInt(2, id);
            resultados = ps.executeUpdate();
            close();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cambiar el estado de un Dino Usuario");
        }
        return resultados;
    }
    public List<Mensaje> findMensajesByConversacion(int idConversacion) throws Exception{
        String query = "SELECT * FROM Mensaje WHERE idConversacion = ?";
        List<Mensaje> msjs = new ArrayList<>();
        try {
            open();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,idConversacion);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                Mensaje msj = new Mensaje(rs.getInt("id"),rs.getInt("idConversacion"),rs.getString("correoEmisor"), rs.getString("correoReceptor"), rs.getString("asunto"), rs.getString("mensaje"), rs.getBoolean("recibido"),rs.getBoolean("leido") );
                msjs.add(msj);
            }
            close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msjs;
    }
    public int addMensajeToConversacion(int idConversacion, String correoEmisor, String correoReceptor, String asunto, String mensaje){
        int resultado = 0;
        try {
            String query = "INSERT INTO Mensaje VALUES(null, ?,?,?,?,?,1,0 )";
            open();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idConversacion);
            ps.setString(2, correoEmisor);
            ps.setString(3, correoReceptor);
            ps.setString(4, asunto);
            ps.setString(5, mensaje);
            
            resultado = ps.executeUpdate();
            close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al agregar mensaje a la conversacion");
        }  
        return resultado;
    }
}
