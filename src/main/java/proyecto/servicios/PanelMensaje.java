/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.servicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.objetos.Conversacion;
import proyecto.objetos.Mensaje;
import proyecto.objetos.Usuario;
import proyecto.objetos.UsuarioBase;

/**
 *
 * @author milla
 */
public class PanelMensaje extends javax.swing.JPanel {
    private static String nombreArchivo;
    private String origen;
    private String destino;
    private Mensaje men;
    /**
     * Creates new form PanelMensaje
     */
    public PanelMensaje() {
        initComponents();
    }
    public PanelMensaje(Mensaje men, String asunto, String contenido, boolean esAdmin){
        initComponents();
        origen = men.getCorreoEmisor();
        destino = men.getCorreoReceptor();
        this.origen = origen;
        nombreArchivo = "D:/Aprendizaje/TAP/TAP-ProyectoCorreos/database.json" ;
        jLabel1.setText("De: "+origen);
        jLabel2.setText("Asunto: "+asunto);
        jLabel3.setText(contenido);
        jLabel6.setText("Para: "+destino);
        if(!men.isLeido())panelRecibido.setVisible(false);
        if(!Mail.correoLog.equals(origen)){
            panelRecibido.setVisible(false);
            panelLeido.setVisible(false);
        }
        if(!esAdmin){
            jLabel4.setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRecibido = new org.edisoncor.gui.panel.PanelImage();
        panelLeido = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();

        jLabel5.setText("jLabel5");

        panelImage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\milla\\Downloads\\check_mark.png")); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 7));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 430, 7));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 430, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("De: millanseth@gmail.com");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 286, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Asunto: Asuntomegaimportante");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 370, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("BLABLABLABLABLABLABLABLABLA");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 430, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Bloquear usuario");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 44, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("Para : blablabla@gmail.com");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 20));

        panelRecibido.setIcon(new javax.swing.ImageIcon("C:\\Users\\milla\\Downloads\\check_mark.png")); // NOI18N

        javax.swing.GroupLayout panelRecibidoLayout = new javax.swing.GroupLayout(panelRecibido);
        panelRecibido.setLayout(panelRecibidoLayout);
        panelRecibidoLayout.setHorizontalGroup(
            panelRecibidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRecibidoLayout.setVerticalGroup(
            panelRecibidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(panelRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 20, 20));

        panelLeido.setIcon(new javax.swing.ImageIcon("C:\\Users\\milla\\Downloads\\check_mark.png")); // NOI18N

        javax.swing.GroupLayout panelLeidoLayout = new javax.swing.GroupLayout(panelLeido);
        panelLeido.setLayout(panelLeidoLayout);
        panelLeidoLayout.setHorizontalGroup(
            panelLeidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelLeidoLayout.setVerticalGroup(
            panelLeidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(panelLeido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 20, 20));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 450, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        List<UsuarioBase> usuarios = CreateAcount.leerJSON();
        int index = 0;
        for(UsuarioBase usuario: usuarios){
            if(usuario.getEmail().equals(origen))usuarios.get(index).setLocked(true);
            index++;
        }
        CreateAcount.escribirJSON(usuarios);
        JOptionPane.showMessageDialog(null, "EL USUARIO "+destino+" HA SIDO BLOQUEADO");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel3.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel4MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelLeido;
    private org.edisoncor.gui.panel.PanelImage panelRecibido;
    // End of variables declaration//GEN-END:variables
public static void actualizarJSON(Mensaje nuevoMensaje, int indiceConversacion) {
        List<Conversacion> conversaciones = leerJSON();
        if (conversaciones != null && indiceConversacion >= 0 && indiceConversacion < conversaciones.size()) {
            conversaciones.get(indiceConversacion).getMensajes().add(nuevoMensaje);
            escribirJSON(conversaciones);
        }
    }

    public static List<Conversacion> leerJSON() {
        Gson gson = new Gson();
        try {
            
            FileReader reader = new FileReader(nombreArchivo);
            List<Conversacion> conversaciones = gson.fromJson(reader, new TypeToken<List<Conversacion>>(){}.getType());
            reader.close();
            return conversaciones;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static void escribirJSON(List<Conversacion> conversaciones) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(conversaciones);
        try {
            FileWriter writer = new FileWriter(nombreArchivo);
            writer.write(json);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void agregarConversacion(Mensaje nuevoMensaje) {
        List<Conversacion> conversaciones = leerJSON();

        if (conversaciones == null) {
            conversaciones = new ArrayList<>();
        }

        Conversacion nuevaConversacion = new Conversacion();
        nuevaConversacion.getMensajes().add(nuevoMensaje);
        conversaciones.add(nuevaConversacion);

        escribirJSON(conversaciones);
    }
}
