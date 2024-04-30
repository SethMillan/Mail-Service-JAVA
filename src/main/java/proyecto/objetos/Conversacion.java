package proyecto.objetos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "Conversacion")
@NamedQueries({
    @NamedQuery(name = "Conversacion.findAll", query = "SELECT u FROM Conversacion u")
})

@Data
public class Conversacion implements Serializable{
    @Id
    @Column(name = "id")
    private int id;
    public Conversacion(){
       
    }
    
}
