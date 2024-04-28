package proyecto.objetos;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario.findByNameUsr", query = "SELECT u FROM Usuario u WHERE u.name = :name"),
    @NamedQuery(name = "Usuario.findByEmailUsr", query = "SELECT u FROM Usuario u WHERE u.email = :email")})

@Data
@AllArgsConstructor
@ToString
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "whoAmI")
    private String whoAmI;
    @Column(name = "activo")
    protected boolean locked;
    public Usuario(String name, String email, String password){
        this.email=email;
        this.password=password;
        this.name=name;
        whoAmI = "usuario";
        locked = false;
    }
    public Usuario(){
        whoAmI = "usuario";
        locked = false;
    }
}
