package proyecto.objetos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Mensaje{
    private String correoEmisor;
    private String correoReceptor;
    private String asunto;
    private String mensaje;
    private boolean recibido;
    private boolean leido;
    
    public Mensaje(String correoEmisor, String correoReceptor, String asunto, String mensaje){
        this.correoEmisor= correoEmisor;
        this.correoReceptor=correoReceptor;
        this.asunto=asunto;
        this.mensaje=mensaje;
        recibido=true;
        leido=false;
        
    }
    
}
