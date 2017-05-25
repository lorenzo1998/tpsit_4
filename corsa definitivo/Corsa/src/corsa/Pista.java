
package corsa;

/**
 * Pista è la finestra che contiene il percorso di gara
 * @author Andrea Vallorani
 */
public class Pista extends javax.swing.JFrame {
    
    /**
     * Creates new form pista
     */
    public Pista() {
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

        corsia1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        icoAtleta1 = new javax.swing.JLabel();
        corsia2 = new javax.swing.JPanel();
        icoAtleta2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bottoneAvvio = new javax.swing.JButton();
        statoGara = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        icoAtleta3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        icoAtleta4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        icoAtleta5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        icoAtleta7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        icoAtleta8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        icoAtleta6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        corsia1.setBackground(new java.awt.Color(255, 102, 102));
        corsia1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        corsia1.add(jPanel2);
        jPanel2.setBounds(100, 0, 10, 130);

        icoAtleta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        icoAtleta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta1.setText("mario");
        icoAtleta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        corsia1.add(icoAtleta1);
        icoAtleta1.setBounds(0, 0, 120, 110);

        corsia2.setBackground(new java.awt.Color(255, 102, 102));
        corsia2.setLayout(null);

        icoAtleta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoAtleta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta2.setText("broswer");
        icoAtleta2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icoAtleta2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta2.setPreferredSize(new java.awt.Dimension(88, 110));
        icoAtleta2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        corsia2.add(icoAtleta2);
        icoAtleta2.setBounds(0, 0, 90, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        corsia2.add(jPanel3);
        jPanel3.setBounds(100, 0, 10, 130);

        bottoneAvvio.setText("VIA!");
        bottoneAvvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneAvvioActionPerformed(evt);
            }
        });

        statoGara.setText("Gara non ancora iniziata");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        icoAtleta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoAtleta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta3.setText("karim");
        icoAtleta3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icoAtleta3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(icoAtleta3);
        icoAtleta3.setBounds(0, 0, 90, 110);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(100, 0, 11, 130);

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setLayout(null);

        icoAtleta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoAtleta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta4.setText("usain");
        icoAtleta4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icoAtleta4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel5.add(icoAtleta4);
        icoAtleta4.setBounds(0, 0, 90, 110);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(100, 0, 11, 130);

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setLayout(null);

        icoAtleta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoAtleta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta5.setText("michael");
        icoAtleta5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icoAtleta5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel7.add(icoAtleta5);
        icoAtleta5.setBounds(0, 0, 90, 110);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8);
        jPanel8.setBounds(100, 0, 11, 130);

        jPanel11.setBackground(new java.awt.Color(255, 102, 102));
        jPanel11.setLayout(null);

        icoAtleta7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoAtleta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta7.setText("raily");
        icoAtleta7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icoAtleta7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel11.add(icoAtleta7);
        icoAtleta7.setBounds(0, 0, 90, 110);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12);
        jPanel12.setBounds(100, 0, 11, 130);

        jPanel13.setBackground(new java.awt.Color(255, 102, 102));
        jPanel13.setLayout(null);

        icoAtleta8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoAtleta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta8.setText("giasuun");
        icoAtleta8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icoAtleta8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel13.add(icoAtleta8);
        icoAtleta8.setBounds(0, 0, 90, 110);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14);
        jPanel14.setBounds(100, 0, 11, 130);

        jPanel9.setBackground(new java.awt.Color(255, 102, 102));
        jPanel9.setLayout(null);

        icoAtleta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoAtleta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/corridore.png"))); // NOI18N
        icoAtleta6.setText("dimitrof");
        icoAtleta6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icoAtleta6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icoAtleta6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel9.add(icoAtleta6);
        icoAtleta6.setBounds(0, 0, 90, 110);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10);
        jPanel10.setBounds(100, 0, 11, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(corsia2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(corsia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statoGara)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bottoneAvvio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(corsia1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statoGara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottoneAvvio)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneAvvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneAvvioActionPerformed
        Giudice giudice = new Giudice(this);
        giudice.start();
        this.bottoneAvvio.setEnabled(false);
    }//GEN-LAST:event_bottoneAvvioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneAvvio;
    private javax.swing.JPanel corsia1;
    private javax.swing.JPanel corsia2;
    public javax.swing.JLabel icoAtleta1;
    public javax.swing.JLabel icoAtleta2;
    public javax.swing.JLabel icoAtleta3;
    public javax.swing.JLabel icoAtleta4;
    public javax.swing.JLabel icoAtleta5;
    public javax.swing.JLabel icoAtleta6;
    public javax.swing.JLabel icoAtleta7;
    public javax.swing.JLabel icoAtleta8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JLabel statoGara;
    // End of variables declaration//GEN-END:variables
}