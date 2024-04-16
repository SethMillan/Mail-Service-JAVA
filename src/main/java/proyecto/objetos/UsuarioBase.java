package proyecto.objetos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class UsuarioBase {
    protected String name;
    protected String email;
    protected String password;
    protected String whoAmI;
    protected boolean locked;
    public UsuarioBase(){
        
    }
}
