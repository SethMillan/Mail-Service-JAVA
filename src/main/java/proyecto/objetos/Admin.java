package proyecto.objetos;

import lombok.Data;
import proyecto.interfaces.IAdmin;

@Data
public final class Admin extends UsuarioBase implements IAdmin{    

    public Admin(String name, String email, String password){
        super(name, email, password,"admin",false);
    }
    
    @Override
    public void bloquarUsuario(Usuario usuario) {
        
    }

    
}
