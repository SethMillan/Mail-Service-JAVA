package proyecto.objetos;

import lombok.Data;

@Data
public final class Usuario extends UsuarioBase{
        
    public Usuario(){
        super();
        locked = false;
    }
    
    public Usuario(String name, String email, String password){
        super(name, email, password,"usuario",false);
    }
}
