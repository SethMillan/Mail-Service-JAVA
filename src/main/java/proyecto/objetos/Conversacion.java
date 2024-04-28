package proyecto.objetos;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Conversacion {
    private List<Mensaje> mensajes;
    
    public Conversacion(){
        mensajes = new ArrayList<>();
    }
    
}
