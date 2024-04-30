package proyecto.objetos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Entity
@Table(name = "Mensaje")
@NamedQueries({
    @NamedQuery(name = "Mensaje.findAll", query = "SELECT u FROM Mensaje u"),
    @NamedQuery(name = "Mensaje.findByIdMensaje", query = "SELECT u FROM Mensaje u WHERE u.id = :id"),
    @NamedQuery(name = "Mensaje.findAllByIdConversacion", query = "SELECT u FROM Mensaje u WHERE u.idConversacion = idConversacion")
})

@Data
@AllArgsConstructor
@ToString
public class Mensaje implements Serializable{
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Column(name = "idConversacion")
    private int idConversacion;
    @Column(name = "correoEmisor")
    private String correoEmisor;
    @Column(name = "correoReceptor")
    private String correoReceptor;
    @Column(name = "asutno")
    private String asunto;
    @Column(name = "mensaje")
    private String mensaje;
    @Column(name = "recibido")
    private boolean recibido;
    @Column(name = "leido")
    private boolean leido;

    public Mensaje(){
    }
    
    public Mensaje(String correoEmisor, String correoReceptor, String asunto, String mensaje){
        this.correoEmisor= correoEmisor;
        this.correoReceptor=correoReceptor;
        this.asunto=asunto;
        this.mensaje=mensaje;
        recibido=true;
        leido=false;
        
    }
    
}
