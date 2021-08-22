/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareahanoi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elmer
 */
public class JuegoHanoi extends javax.swing.JFrame  {
Timer timer = new Timer();
TimerTask tarea ;

public void animarlabel(){
    tarea = new TimerTask(){
            @Override
            public void run() {
                
                if(getNumero()<201){
                   pintar(getNumero());
                setNumero(getNumero()+1);
                
                
                }
                else{
                    archivo.delete();

        System.exit(0);   
                }
                
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
                
            }
        };
    timer.scheduleAtFixedRate(tarea, 0, 110);
}
   
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
 public File archivo = new File("Solucion Hanoi.txt");
 
    public int numero = 1;
    public JuegoHanoi() {
        initComponents();
        btnterminar.setVisible(false);
        btnanimar.setVisible(false);
        labimagen.setIcon(new javax.swing.ImageIcon("../TareaHanoi/src/ImagenesAnimacion/Diapositiva"+ getNumero() +".PNG"));
     
    }

     public void leertexto() {
       

        BufferedReader lee;
        try {
            lee = new BufferedReader(new FileReader(archivo));
            String reglon = lee.readLine();

            while (reglon != null) {
                solucion.append(reglon + "\n");

                reglon = lee.readLine();
            }
            lee.close();
            archivo.delete();
        } catch (IOException ex) {
            Logger.getLogger(JuegoHanoi.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        solucion = new javax.swing.JTextArea();
        estado = new javax.swing.JLabel();
        btncontinuar = new javax.swing.JButton();
        btnterminar = new javax.swing.JButton();
        btnanimar = new javax.swing.JButton();
        labimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea 1 Elmer Salazar Estructura de Datos Juego de Hanoi");
        setBackground(java.awt.SystemColor.textHighlight);
        setResizable(false);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        solucion.setEditable(false);
        solucion.setColumns(20);
        solucion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        solucion.setRows(5);
        solucion.setText("Aqui aparecerá la solución paso a paso para el juego");
        jScrollPane1.setViewportView(solucion);

        estado.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        estado.setText("Para ver la solucion de este juego de Hanoi con 6 discos oprima continuar");

        btncontinuar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btncontinuar.setForeground(new java.awt.Color(51, 102, 255));
        btncontinuar.setText("Continuar>>");
        btncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuarActionPerformed(evt);
            }
        });

        btnterminar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnterminar.setForeground(new java.awt.Color(51, 102, 255));
        btnterminar.setText("Terminar!!!");
        btnterminar.setActionCommand("");
        btnterminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnterminarActionPerformed(evt);
            }
        });

        btnanimar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnanimar.setForeground(new java.awt.Color(51, 102, 255));
        btnanimar.setText("Animar");
        btnanimar.setActionCommand("");
        btnanimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanimarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnterminar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnanimar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncontinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncontinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnterminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnanimar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuarActionPerformed
Algoritmo darle = new Algoritmo();
        darle.Solucionpasoapaso();
        leertexto();
        archivo.deleteOnExit();
        archivo.delete();
        estado.setText("Ahora presione Terminar para salir ");      
         btncontinuar.setVisible(false);
        btnanimar.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btncontinuarActionPerformed

    private void btnterminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnterminarActionPerformed
   archivo.delete();

        System.exit(0);          // TODO add your handling code here:
    }//GEN-LAST:event_btnterminarActionPerformed

    private void btnanimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanimarActionPerformed
 btnanimar.setVisible(false);
 
           animarlabel();
        //   timer.schedule(tarea, 300);
      //}   
    btnterminar.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnanimarActionPerformed
public void pintar (int numero)  {
            //this.labimagen.setVisible(false);
            
             labimagen.setIcon(new javax.swing.ImageIcon("../TareaHanoi/src/ImagenesAnimacion/Diapositiva"+ getNumero() +".PNG"));  
             //this.labimagen.setVisible(true);           
    }

    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanimar;
    private javax.swing.JButton btncontinuar;
    private javax.swing.JButton btnterminar;
    private javax.swing.JLabel estado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labimagen;
    private javax.swing.JTextArea solucion;
    // End of variables declaration//GEN-END:variables
}