
package CalculadoraGrafica;

import javaapplication11.CalculadoraEspecial;
import java.awt.Color;
public class CalculadoraGrafica extends javax.swing.JFrame {
    CalculadoraEspecial ce = new CalculadoraEspecial("Especial", "Verde", 15, "123qwe", "Osmar");
    public CalculadoraGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        bgresultado = new javax.swing.JPanel();
        bggb = new javax.swing.JPanel();
        resultadotxt = new javax.swing.JTextField();
        bgcomponentes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numero1txt = new javax.swing.JTextField();
        numero2txt = new javax.swing.JTextField();
        sumarbtn = new javax.swing.JButton();
        restarbtn = new javax.swing.JButton();
        multiplicarbtn = new javax.swing.JButton();
        dividirbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Raizbtn = new javax.swing.JButton();
        senobtn = new javax.swing.JButton();
        cosbtn = new javax.swing.JButton();
        tanbtn = new javax.swing.JButton();
        raizcubbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Game_Boy 7777.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 640));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(500, 610));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgresultado.setBackground(new java.awt.Color(51, 51, 255));
        bgresultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bgresultado.setToolTipText("");
        bgresultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bggb.setBackground(new java.awt.Color(255, 0, 0));
        bggb.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resultadotxt.setEditable(false);
        resultadotxt.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        resultadotxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultadotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadotxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bggbLayout = new javax.swing.GroupLayout(bggb);
        bggb.setLayout(bggbLayout);
        bggbLayout.setHorizontalGroup(
            bggbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bggbLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(resultadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        bggbLayout.setVerticalGroup(
            bggbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bggbLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(resultadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bgresultado.add(bggb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 160));

        bg.add(bgresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 200));

        bgcomponentes.setBackground(new java.awt.Color(102, 255, 51));
        bgcomponentes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bgcomponentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgcomponentes.setEnabled(false);
        bgcomponentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Nintendo GAME BOY tm");
        bgcomponentes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, -1));

        numero1txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero1txt.setForeground(java.awt.Color.lightGray);
        numero1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero1txt.setText("Primer Numero");
        numero1txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numero1txtMousePressed(evt);
            }
        });
        bgcomponentes.add(numero1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 60));

        numero2txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero2txt.setForeground(java.awt.Color.lightGray);
        numero2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero2txt.setText("Segundo Numero");
        numero2txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numero2txtMousePressed(evt);
            }
        });
        bgcomponentes.add(numero2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 200, 60));

        sumarbtn.setBackground(new java.awt.Color(102, 102, 102));
        sumarbtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        sumarbtn.setForeground(new java.awt.Color(204, 204, 204));
        sumarbtn.setText("+");
        sumarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sumarbtnMousePressed(evt);
            }
        });
        bgcomponentes.add(sumarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 50, 50));

        restarbtn.setBackground(new java.awt.Color(102, 102, 102));
        restarbtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        restarbtn.setForeground(new java.awt.Color(204, 204, 204));
        restarbtn.setText("-");
        restarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restarbtnMousePressed(evt);
            }
        });
        bgcomponentes.add(restarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 50, 50));

        multiplicarbtn.setBackground(new java.awt.Color(102, 102, 102));
        multiplicarbtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        multiplicarbtn.setForeground(new java.awt.Color(204, 204, 204));
        multiplicarbtn.setText("*");
        multiplicarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                multiplicarbtnMousePressed(evt);
            }
        });
        bgcomponentes.add(multiplicarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 50, 50));

        dividirbtn.setBackground(new java.awt.Color(102, 102, 102));
        dividirbtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        dividirbtn.setForeground(new java.awt.Color(204, 204, 204));
        dividirbtn.setText("/");
        dividirbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dividirbtnMousePressed(evt);
            }
        });
        bgcomponentes.add(dividirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 50, 50));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("CE");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setMargin(new java.awt.Insets(2, 5, 3, 5));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        bgcomponentes.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 50, 50));

        Raizbtn.setBackground(new java.awt.Color(153, 153, 255));
        Raizbtn.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        Raizbtn.setForeground(new java.awt.Color(255, 0, 51));
        Raizbtn.setText("√");
        Raizbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizbtnActionPerformed(evt);
            }
        });
        bgcomponentes.add(Raizbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 70, 30));

        senobtn.setBackground(new java.awt.Color(255, 51, 51));
        senobtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        senobtn.setForeground(new java.awt.Color(51, 51, 51));
        senobtn.setText("Sen");
        senobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senobtnActionPerformed(evt);
            }
        });
        bgcomponentes.add(senobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 30));

        cosbtn.setBackground(new java.awt.Color(51, 255, 255));
        cosbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cosbtn.setForeground(new java.awt.Color(0, 0, 255));
        cosbtn.setText("Cos");
        cosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosbtnActionPerformed(evt);
            }
        });
        bgcomponentes.add(cosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 270, 90, 30));

        tanbtn.setBackground(new java.awt.Color(255, 255, 0));
        tanbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tanbtn.setForeground(new java.awt.Color(255, 51, 0));
        tanbtn.setText("Tan");
        tanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanbtnActionPerformed(evt);
            }
        });
        bgcomponentes.add(tanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 310, 70, 30));

        raizcubbtn.setBackground(new java.awt.Color(255, 153, 51));
        raizcubbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        raizcubbtn.setText("3√");
        raizcubbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                raizcubbtnMousePressed(evt);
            }
        });
        bgcomponentes.add(raizcubbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, 20));
        bgcomponentes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));
        bgcomponentes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ooooooii.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        bgcomponentes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -220, 700, 630));

        bg.add(bgcomponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 490, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadotxtActionPerformed

    private void sumarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumarbtnMousePressed
        double n1 = Double.parseDouble(numero1txt.getText());
        double n2 = Double.parseDouble(numero2txt.getText());
        double resultado = ce.sumar(n1,n2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_sumarbtnMousePressed

    private void restarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restarbtnMousePressed
        double n1 = Double.parseDouble(numero1txt.getText());
        double n2 = Double.parseDouble(numero2txt.getText());
        double resultado = ce.restar(n1,n2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_restarbtnMousePressed

    private void multiplicarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicarbtnMousePressed
       double n1 = Double.parseDouble(numero1txt.getText());
        double n2 = Double.parseDouble(numero2txt.getText());
        double resultado = ce.multiplicar(n1,n2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_multiplicarbtnMousePressed

    private void dividirbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividirbtnMousePressed
         double n1 = Double.parseDouble(numero1txt.getText());
        double n2 = Double.parseDouble(numero2txt.getText());
        double resultado = ce.dividir(n1,n2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_dividirbtnMousePressed

    private void RaizbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizbtnActionPerformed
         double n1 = Double.parseDouble(numero1txt.getText());
        double resultado = ce.raizCuadrada(n1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_RaizbtnActionPerformed

    private void senobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senobtnActionPerformed
         double n1 = Double.parseDouble(numero1txt.getText());
        double resultado = ce.calcularSeno(n1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_senobtnActionPerformed

    private void cosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosbtnActionPerformed
         double n1 = Double.parseDouble(numero1txt.getText());   
        double resultado = ce.calcularCoseno(n1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_cosbtnActionPerformed

    private void tanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanbtnActionPerformed
        double n1 = Double.parseDouble(numero1txt.getText());
        double resultado = ce.calcularTangente(n1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_tanbtnActionPerformed

    private void numero1txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero1txtMousePressed
        if(numero1txt.getText().equals("Primer Numero")){
         numero1txt.setText("");
         numero1txt.setForeground(Color.black);
      }
      if(numero2txt.getText().equals("Segundo Numero")){
         numero2txt.setText("Segundo Numero");
         numero2txt.setForeground(Color.lightGray);
      }
    }//GEN-LAST:event_numero1txtMousePressed

    private void numero2txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero2txtMousePressed
        if(numero2txt.getText().equals("Segundo Numero")){
         numero2txt.setText("");
         numero2txt.setForeground(Color.black);
      }
      if(numero1txt.getText().equals("Primer Numero")){
         numero1txt.setText("Primer Numero");
         numero1txt.setForeground(Color.lightGray);
      }
    }//GEN-LAST:event_numero2txtMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        numero1txt.setText("Primer Numero");
        numero1txt.setForeground(Color.lightGray);
        numero2txt.setText("Segundo Numero");
        numero2txt.setForeground(Color.lightGray);
        resultadotxt.setText("");
    }//GEN-LAST:event_jButton1MousePressed

    private void raizcubbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raizcubbtnMousePressed
        double n1 = Double.parseDouble(numero1txt.getText());
        double resultado = ce.calcularRaizCubica(n1);
        resultadotxt.setText(String.valueOf(resultado));    }//GEN-LAST:event_raizcubbtnMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Raizbtn;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgcomponentes;
    private javax.swing.JPanel bggb;
    private javax.swing.JPanel bgresultado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cosbtn;
    private javax.swing.JButton dividirbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton multiplicarbtn;
    private javax.swing.JTextField numero1txt;
    private javax.swing.JTextField numero2txt;
    private javax.swing.JButton raizcubbtn;
    private javax.swing.JButton restarbtn;
    private javax.swing.JTextField resultadotxt;
    private javax.swing.JButton senobtn;
    private javax.swing.JButton sumarbtn;
    private javax.swing.JButton tanbtn;
    // End of variables declaration//GEN-END:variables
}
