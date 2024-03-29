/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gabriel Gustavo
 */
public class Main extends javax.swing.JFrame {

    private String caminhoImgOriginal = "";
    private String caminhoParaSalvar = "";
    private String nomeImgOriginal = "";

    /**
     * Creates new form Frame1
     */
    public Main() {
        initComponents();
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
        btnProcurarImg = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        lblImgGrayScale = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblImgMonoChromatic = new javax.swing.JLabel();
        btnProcessar = new javax.swing.JButton();
        lblMsgValidaCampos = new javax.swing.JLabel();
        lblCaminhoImg = new javax.swing.JLabel();
        lblSavarEm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        btnProcurarImg.setText("Procurar Imagem ...");
        btnProcurarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarImgActionPerformed(evt);
            }
        });

        lblImg.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Processamento de imagens");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Preview da Imagem:");

        jButton2.setBackground(new java.awt.Color(217, 83, 79));
        jButton2.setForeground(new java.awt.Color(247, 247, 247));
        jButton2.setText("Salvar em ...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnProcessar.setBackground(new java.awt.Color(92, 184, 92));
        btnProcessar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProcessar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessar.setText("Processar");
        btnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessarActionPerformed(evt);
            }
        });

        lblMsgValidaCampos.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblMsgValidaCampos.setForeground(new java.awt.Color(184, 26, 26));

        lblCaminhoImg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCaminhoImg.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblSavarEm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSavarEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(lblImgGrayScale, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(128, 128, 128)
                            .addComponent(lblImgMonoChromatic, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel2)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMsgValidaCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblSavarEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCaminhoImg, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnProcurarImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblMsgValidaCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProcurarImg, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(lblCaminhoImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(lblSavarEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblImgGrayScale, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblImgMonoChromatic, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarImgActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser buscaFoto = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Images Filter", "jpg", "tiff", "bmp", "pcx", "gif", "png", "ppm", "tif", "pgm", "wbmp", "jpeg", "pbm");
            buscaFoto.setFileFilter(filtro);
            buscaFoto.setAcceptAllFileFilterUsed(false);

            buscaFoto.setCurrentDirectory(new File(""));
            buscaFoto.setDialogTitle("Carregar imagem");
            buscaFoto.showOpenDialog(this);

            String fotoCaminho = "" + buscaFoto.getSelectedFile().getName();
            lblCaminhoImg.setText(fotoCaminho);
            this.caminhoImgOriginal = buscaFoto.getSelectedFile().toString();//img.getCanonicalPath()+"/"+jtxtCaminhoImg.getText();  
            this.nomeImgOriginal = lblCaminhoImg.getText();
            ImageIcon lblIconPreview = new ImageIcon(caminhoImgOriginal);
            lblIconPreview.setImage(lblIconPreview.getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), 1));
            lblImg.setIcon(lblIconPreview);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnProcurarImgActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            File g = new java.io.File("");
            chooser.setCurrentDirectory(g);
            chooser.setDialogTitle("choosertitle");
            chooser.showOpenDialog(this);
            caminhoParaSalvar = (chooser.getSelectedFile().toString());//chooser.getCurrentDirectory().toString()
            lblSavarEm.setText(caminhoParaSalvar);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void btnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessarActionPerformed
        // TODO add your handling code here:
        if (validaCampos()) {
            
            
            String end1 = proc.ConversorDeCanais.toGrayScale(caminhoImgOriginal, nomeImgOriginal, caminhoParaSalvar);
            
            String end2 = proc.ConversorDeCanais.toBlackAndWhite(caminhoImgOriginal, nomeImgOriginal, caminhoParaSalvar);
            
            ImageIcon icon1 = new ImageIcon(end1);
            icon1.setImage(icon1.getImage().getScaledInstance(lblImgGrayScale.getWidth(), lblImgGrayScale.getHeight(), 1));
            lblImgGrayScale.setIcon(icon1);

            ImageIcon icon2 = new ImageIcon(end2);
            icon2.setImage(icon2.getImage().getScaledInstance(lblImgMonoChromatic.getWidth(), lblImgMonoChromatic.getHeight(), 1));
            lblImgMonoChromatic.setIcon(icon2);
            
        }


    }//GEN-LAST:event_btnProcessarActionPerformed
    private boolean validaCampos() {
        lblMsgValidaCampos.setText("");
        if (caminhoImgOriginal.equals("")) {
            lblMsgValidaCampos.setText("Por favor, Selecione uma imagem para processar");
            return false;
        }
        if (caminhoParaSalvar.equals("")) {
            lblMsgValidaCampos.setText("Por favor, Selecione um caminho para salvar as imagens");
            return false;
        }
        if ((nomeImgOriginal.equals(""))) {
            lblMsgValidaCampos.setText("Arquivo inválido");
            return false;
        }
        return true;

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessar;
    private javax.swing.JButton btnProcurarImg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCaminhoImg;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblImgGrayScale;
    private javax.swing.JLabel lblImgMonoChromatic;
    private javax.swing.JLabel lblMsgValidaCampos;
    private javax.swing.JLabel lblSavarEm;
    // End of variables declaration//GEN-END:variables
}
