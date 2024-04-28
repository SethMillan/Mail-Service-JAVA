package proyecto.objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


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
    public Usuario find(String usr, String pass) throws Exception{
        String sql ="SELECT * FROM Usuario WHERE name = ? AND password = SHA1(?);";
        Usuario usuario = null;
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, usr);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        if(rs.next()){
            usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setName(rs.getString("name"));
            usuario.setEmail(rs.getString("email"));
            usuario.setPassword(rs.getString("password"));
        }
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
}
