package boletin27;

import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    float numero1, numero2;
    String operador;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        uno = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        apagar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        restar.setText("-");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        sumar.setText("+");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });

        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 0, 0));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("AC");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        apagar.setBackground(new java.awt.Color(0, 0, 255));
        apagar.setForeground(new java.awt.Color(255, 255, 255));
        apagar.setText("OFF");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cero)
                            .addGap(31, 31, 31)
                            .addComponent(punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(uno)
                            .addGap(32, 32, 32)
                            .addComponent(dos)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuatro)
                            .addComponent(siete))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ocho)
                            .addComponent(cinco)))
                    .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(restar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumar)
                            .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(apagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(apagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dividir)
                    .addComponent(nueve)
                    .addComponent(ocho)
                    .addComponent(siete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicar)
                    .addComponent(seis)
                    .addComponent(cinco)
                    .addComponent(cuatro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno)
                    .addComponent(dos)
                    .addComponent(tres)
                    .addComponent(restar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cero)
                    .addComponent(punto)
                    .addComponent(igual)
                    .addComponent(sumar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pantalla))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        pantalla.setText(pantalla.getText() + "0");
    }//GEN-LAST:event_ceroActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        pantalla.setText(pantalla.getText() + "6");
    }//GEN-LAST:event_seisActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        pantalla.setText(pantalla.getText() + "1");
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        pantalla.setText(pantalla.getText() + "2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        pantalla.setText(pantalla.getText() + "3");
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        pantalla.setText(pantalla.getText() + "4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        pantalla.setText(pantalla.getText() + "5");
    }//GEN-LAST:event_cincoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        pantalla.setText(pantalla.getText() + "7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        pantalla.setText(pantalla.getText() + "8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        pantalla.setText(pantalla.getText() + "9");
    }//GEN-LAST:event_nueveActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("");
        operador = "/";
    }//GEN-LAST:event_dividirActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("");
        operador = "*";
    }//GEN-LAST:event_multiplicarActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("");
        operador = "-";
    }//GEN-LAST:event_restarActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("");
        operador = "+";
    }//GEN-LAST:event_sumarActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        pantalla.setText(pantalla.getText() + ".");
    }//GEN-LAST:event_puntoActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        pantalla.setText("");
        numero1 = 0;
        numero2 = 0;
    }//GEN-LAST:event_resetActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_apagarActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        numero2 = Float.parseFloat(pantalla.getText());
        float resultado;
        if (operador.equals("/")) {
            if (numero1 >= numero2) {
                resultado = numero1 / numero2;
                pantalla.setText(String.valueOf(resultado));
            } else {
                pantalla.setText("E");
            }
        } else if (operador.equals("*")) {
            resultado = numero1 * numero2;
            pantalla.setText(String.valueOf(resultado));
        } else if (operador.equals("+")) {
            resultado = numero1 + numero2;
            pantalla.setText(String.valueOf(resultado));
        } else if (operador.equals("-")) {
            resultado = numero1 - numero2;
            pantalla.setText(String.valueOf(resultado));
        }

    }//GEN-LAST:event_igualActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton punto;
    private javax.swing.JButton reset;
    private javax.swing.JButton restar;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton sumar;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
