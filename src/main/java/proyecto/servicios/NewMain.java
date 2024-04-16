package proyecto.servicios;

import java.util.ArrayList;
import java.util.List;
import proyecto.objetos.Admin;
import proyecto.objetos.Usuario;
import proyecto.objetos.UsuarioBase;

public class NewMain {
        static List<UsuarioBase> usuarios = new ArrayList<UsuarioBase>();

    public static void main(String[] args) {
        UsuarioBase admin = new Admin("admin", "admin@gmail.com", "asd");
        UsuarioBase correo = new Usuario("correo","correo@gmail.com","asd");
        usuarios.add(admin);
        usuarios.add(correo);
        System.out.println(usuarios);
        //CreateAcount.escribirJSON(usuarios);
        new Login().setVisible(true);
    }
    
}
