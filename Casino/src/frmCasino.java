
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP15DA0023LA
 */
public class frmCasino extends javax.swing.JFrame {
Hilo miHilo1 = new Hilo();
Hilo miHilo2 = new Hilo();
Hilo miHilo3 = new Hilo();
FondoPanel fondo = new FondoPanel();
int contador =0;
int presionadas[]= new int[3];
String rutas[] = new String[3];
String claveV ="122",vidasC="1333",genial="2111",pruebeEste="322";
String comparación="";
Integer vidas=10;
    /**
     * Creates new form frmCasino
     */
    public frmCasino() {
        this.setContentPane(fondo);
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        this.setTitle("Fate Grand Casino");
        Jvidas.setText(Integer.toString(vidas));
        //
        rutas[0]="1";
        rutas[1]="2";
        rutas[2]="3";
        Border border = BorderFactory.createLineBorder(Color.yellow, 5);
        Label1.setText("");
        Label2.setText("");
        Label3.setText("");
        Image img = new ImageIcon(this.getClass().getResource("/imagenes/cuarzo.png")).getImage();
        img = img.getScaledInstance(Label1.getWidth(), Label1.getHeight(), java.awt.Image.SCALE_DEFAULT);
        Label1.setIcon(new ImageIcon(img));
        Label2.setIcon(new ImageIcon(img));
        Label3.setIcon(new ImageIcon(img));
        // a ver 
        miHilo1.window=1;
        miHilo1.start();
        miHilo2.window=2;
        miHilo2.start();
        miHilo3.window=3;
        miHilo3.start();
    }

    private static class FondoPanel extends JPanel{
        private Image imagen; 
        public FondoPanel() {
            
        }
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.png")).getImage(); //To change body of generated methods, choose Tools | Templates.
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    public class Hilo extends Thread{
        public int window=0;
        private boolean run= false;
        private int numero = 1;

        public boolean isRun() {
            return run;
        }

        public int getNumero() {
            return numero;
        }
        
        public void startRunning(){
            run=true;
        }
        public void stopRunning(){
            run=false;
        }
        public int getRandom(){
            numero = (int)(Math.random()*9+1);
            
            return numero;
        }
        @Override
        public void run() {
            Image img;
            while(window==1){
                while(run){
                    if(this.getRandom()==1){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/ereshkigal.jpg")).getImage();
                        rutas[0]="/imagenes/ereshkigal.jpg";
                    }else if(this.getRandom()==2){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/destruction.png")).getImage();
                         rutas[0]="/imagenes/destruction.png";
                    }else if(this.getRandom()==3){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/arash.png")).getImage();
                         rutas[0]="/imagenes/arash.png";
                    }else if(this.getRandom()==4){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/mapo.png")).getImage();
                        rutas[0]="/imagenes/mapo.png";
                    }else if(this.getRandom()==5){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/spartacus.png")).getImage();
                        rutas[0]="/imagenes/spartacus.png";
                    }else if(this.getRandom()==6){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/Ce.png")).getImage();
                        rutas[0]="/imagenes/Ce.png";
                    }else if(this.getRandom()==7){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/serenity.jpg")).getImage();
                         rutas[0]="/imagenes/serenity.jpg";
                    }else if(this.getRandom()==8){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/fionn.png")).getImage();
                        rutas[0]="/imagenes/fionn.png";
                    }else if(this.getRandom()==9){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/tenacity.png")).getImage();
                        rutas[0]="/imagenes/tenacity.png";
                    }else {
                        img = new ImageIcon(this.getClass().getResource("/imagenes/mapo.png")).getImage();
                        rutas[0]="/imagenes/mapo.png";
                    }
                    img = img.getScaledInstance(Label1.getWidth(), Label1.getHeight(), java.awt.Image.SCALE_DEFAULT);
                    Label1.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            while(window==2){
                while(run){
                    if(this.getRandom()==1){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/ereshkigal.jpg")).getImage();
                        rutas[1]="/imagenes/ereshkigal.jpg";
                    }else if(this.getRandom()==2){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/destruction.png")).getImage();
                         rutas[1]="/imagenes/destruction.png";
                    }else if(this.getRandom()==3){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/arash.png")).getImage();
                         rutas[1]="/imagenes/arash.png";
                    }else if(this.getRandom()==4){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/mapo.png")).getImage();
                        rutas[1]="/imagenes/mapo.png";
                    }else if(this.getRandom()==5){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/spartacus.png")).getImage();
                        rutas[1]="/imagenes/spartacus.png";
                    }else if(this.getRandom()==6){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/Ce.png")).getImage();
                        rutas[1]="/imagenes/Ce.png";
                    }else if(this.getRandom()==7){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/serenity.jpg")).getImage();
                         rutas[1]="/imagenes/serenity.jpg";
                    }else if(this.getRandom()==8){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/fionn.png")).getImage();
                        rutas[1]="/imagenes/fionn.png";
                    }else if(this.getRandom()==9){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/tenacity.png")).getImage();
                        rutas[1]="/imagenes/tenacity.png";
                    }else {
                        img = new ImageIcon(this.getClass().getResource("/imagenes/mapo.png")).getImage();
                        rutas[1]="/imagenes/mapo.png";
                    }
                    img = img.getScaledInstance(Label2.getWidth(), Label2.getHeight(), java.awt.Image.SCALE_DEFAULT);
                    Label2.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            while(window==3){
                while(run){
                    if(this.getRandom()==1){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/ereshkigal.jpg")).getImage();
                        rutas[2]="/imagenes/ereshkigal.jpg";
                    }else if(this.getRandom()==2){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/destruction.png")).getImage();
                         rutas[2]="/imagenes/destruction.png";
                    }else if(this.getRandom()==3){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/arash.png")).getImage();
                         rutas[2]="/imagenes/arash.png";
                    }else if(this.getRandom()==4){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/mapo.png")).getImage();
                        rutas[2]="/imagenes/mapo.png";
                    }else if(this.getRandom()==5){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/spartacus.png")).getImage();
                        rutas[2]="/imagenes/spartacus.png";
                    }else if(this.getRandom()==6){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/Ce.png")).getImage();
                        rutas[2]="/imagenes/Ce.png";
                    }else if(this.getRandom()==7){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/serenity.jpg")).getImage();
                         rutas[2]="/imagenes/serenity.jpg";
                    }else if(this.getRandom()==8){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/fionn.png")).getImage();
                        rutas[2]="/imagenes/fionn.png";
                    }else if(this.getRandom()==9){
                        img = new ImageIcon(this.getClass().getResource("/imagenes/tenacity.png")).getImage();
                        rutas[2]="/imagenes/tenacity.png";
                    }else {
                        img = new ImageIcon(this.getClass().getResource("/imagenes/mapo.png")).getImage();
                        rutas[2]="/imagenes/mapo.png";
                    }
                    img = img.getScaledInstance(Label3.getWidth(), Label3.getHeight(), java.awt.Image.SCALE_DEFAULT);
                    Label3.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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

        jButton1 = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Jvidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Label1.setText("jLabel1");

        jButton2.setText("Parar Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Label2.setText("jLabel1");

        Label3.setText("jLabel1");

        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Stop");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Stop");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vidas");

        Jvidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jvidas.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(102, 102, 102)
                                .addComponent(jButton5)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton4)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jvidas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(226, 226, 226))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jvidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        miHilo1.startRunning();
        miHilo2.startRunning();
        miHilo3.startRunning();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        miHilo1.stopRunning();
        miHilo2.stopRunning();
        miHilo3.stopRunning();
        this.cadenasC();
        contador=3;
        this.Ya();
        System.out.println(comparación);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        miHilo1.stopRunning();
        comparación=comparación+"1";
        presionadas[0]=presionadas[0]+1;
        if(presionadas[0]==1){
            contador++;
        }
        if(contador==3){
            this.Ya();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        miHilo3.stopRunning();
        comparación=comparación+"3";
        presionadas[1]=presionadas[1]+1;
        if(presionadas[1]==1){
            contador++;
        }
        if(contador==3){
            this.Ya();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        miHilo2.stopRunning();
        comparación=comparación+"2";
        presionadas[2]=presionadas[2]+1;
        if(presionadas[2]==1){
            contador++;
        }
        if(contador==3){
            this.Ya();
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    public void Ya(){
        if(rutas[0].equals(rutas[1])&&rutas[1].equals(rutas[2])){
            this.vibrar();
        }
        contador=0;
        rutas[0]="1";
        rutas[1]="2";
        rutas[2]="3";
        for(int i=0; i<3;i++){
            presionadas[i]=0;
        }
        vidas--;
        Jvidas.setText(Integer.toString(vidas));
        if(vidas==0){
            JOptionPane.showMessageDialog(null, "Perdió... ¡Vuelva pronto!");
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
    public void cadenasC(){
        if(comparación.equals(claveV)){
            Image img = new ImageIcon(this.getClass().getResource("/imagenes/ereshkigal.jpg")).getImage();
            img = img.getScaledInstance(Label1.getWidth(), Label1.getHeight(), java.awt.Image.SCALE_DEFAULT);
            Label1.setIcon(new ImageIcon(img));
            Label2.setIcon(new ImageIcon(img));
            Label3.setIcon(new ImageIcon(img));
            for(int i=0; i<3;i++){
                rutas[i]="/imagenes/ereshkigal.jpg";
            }
        }else if(comparación.equals(vidasC)){
            vidas=vidas+11;
        }else if(comparación.equals(this.genial))
        {
            vidas=1;
        }
        else if(comparación.equals(pruebeEste)){
            pruebeEste="a";claveV="b";vidasC="C";genial="d";
            JOptionPane.showMessageDialog(null, "Adios Hacks");
        }
        comparación="";
    }
    public void vibrar()
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x,y = (int) ((dimension.getHeight() - this.getHeight()) / 2);;
        for (int i=0; i<150;i++){
            x = (int) ((dimension.getWidth() - this.getWidth()) / 2)+50;
            this.setLocation(x, y);
            x = (int) ((dimension.getWidth() - this.getWidth()) / 2)-50;
            this.setLocation(x, y);
        }
        x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        this.setLocation(x, y);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCasino().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jvidas;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
