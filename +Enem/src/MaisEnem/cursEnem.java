/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaisEnem;

/**
 *
 * @author Matheus
 */
public class cursEnem extends javax.swing.JFrame {

    /**
     * Creates new form cursEnem
     */
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    
    public cursEnem() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("1) Quando penso numa profissão, o mais importante para mim é:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 160, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Ser bem sucedido.", "B) Trabalhar em algo que esteja em evidência no mercado.", "C) Fazer algo que gosto, independente do retorno financeiro.", "D) Ser muito bem sucedido financeiramente.", "E) Poder atuar em minha comunidade." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 158, 359, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Estudou bastante e possui uma posição de destaque no mercado de trabalho.", "B) É aventureira e viaja bastante.", "C) Curte a vida e está sempre descobrindo coisas novas.", "D) É bastante criativa e está sempre com novidades.", "E) Se dedica a algum trabalho de ajuda ao próximo" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 184, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setText("2) A pessoa da sua família que você mais admira: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 186, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Futebol.", "B) Lutas.", "C) Natação.", "D) Tênis.", "E) Não gosto de esportes." }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 236, 120, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Uma empresa baseada em algo de meu interesse.", "B) Uma empresa direcionada as tendências atuais do mercado.", "C) Uma empresa familiar onde eu pudesse trabalhar perto de meus amigos/familiares.", "D) Uma empresa tradicional, com serviços conservadores e de fácil comercialização.", "E) Uma empresa criativa onde eu pudesse arriscar e desenvolver novas ideias." }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 210, 347, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setText("4) Qual dos esportes abaixo você mais se identifica?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 238, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setText("3) Se eu tivesse que montar uma empresa hoje, esta empresa seria:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 212, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Não tenho ideia de qual profissão escolher.", "B) Estou na dúvida entre duas profissões.", "C) Estou na dúvida entre 3 profissões ou mais.", "D) Estou indecido emi qual profissão escolher.", "E) Estou certo de qual profissão eu quero, apenas pretendo conferir." }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 288, 339, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Bill Gates.", "B) Steve Jobs.", "C) Ronaldo.", "D) Angelina Jolie.", "E) Madre Tereza." }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 262, 122, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel5.setText(" 6) Estou fazendo este teste vocacional pois:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 290, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Ser um aluno dedicado e tirar notas boas.", "B) Ser atencioso e ajudar meus colegas.", "C) Ser bastante dedicado aos esportes.", "D) Não prestar atenção nas aulas e ser repreendido.", "E) Ser engraçado e contar piadas." }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 277, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Em um hospital.", "B) Em centros esportivos.", "C) Em uma floresta.", "D) Em shoppings.", "E) Em lugares isolados" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 314, 160, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setText("8) Na escola eu geralmente me destacava por:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 342, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setText("7) Em quais destes ambientes você se sente mais a vontade?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 316, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setText("5) Dentre estas personalidades, a que mais admiro é:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 264, -1, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setText("9) Minha maior frustração seria:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 368, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Uma empresa de internet.", "B) Uma fábrica de computadores.", "C) Um restaurante.", "D) Uma academia.", "E) Uma clínica médica." }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 392, 252, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel10.setText("Resultado:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma opção", "A) Não ser bem sucedido profissionalmente.", "B) Não me destacar em minha área de atuação.", "C) Não construir uma família.", "D) Não ter muito tempo para curtir a vida.", "E) Escolher a carreira errada e ter que mudar depois." }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 366, 300, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel11.setText(" 10) Se eu tivesse que abrir um destes negócios seria:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 394, -1, -1));

        jButton1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jButton1.setText("Gerar resultado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 130, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 370, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MaisEnem/cursEnem.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 910, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
       int posicao = jComboBox1.getSelectedIndex();
        if(posicao == 1){
            a = a + 1;
        }
        if(posicao == 2){
            b = b + 1;
        }
        if(posicao == 3){
            c = c + 1;
        }
        if(posicao == 4){
            d = d + 1;
        }
        if(posicao == 5){
            e = e + 1;
        }
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(a > b && a > c && a > d && a > e){
            jTextArea1.setText("Você valoriza o sucesso profissional! "
                    + "Lista das Profissões: Arquitetura, Artes Cênicas, Artes Plásticas, Astronomia, Ciências Biológicas (Biologia), Cinema, Engenharia Mecânica, Esporte, Filosofia, Jornalismo, Matemática, Publicidade, Rádio e TV, Turismo, Veterinária, Educação Física, Meteorologia, Oceanografia, Engenharia Ambiental, Engenharia Florestal e Arqueologia.");
   
        }
        if(b > a && b > c && b > d && b > e){
            jTextArea1.setText("Você valoriza a ascensão social! "
                    + "Lista das Profissões: Medicina, Direito, Artes Cênicas, Arquitetura, Cinema, Editoração, Engenharia Aeronáutica, Jornalismo, Odontologia, Biomedicina, Farmácia, Artes Plásticas, Artes Visuais, Gastronomia, Relações Internacionais e Relações Públicas.\n" +
"");
   
        }
       if(c > b && c > a && c > d && c > e){
            jTextArea1.setText("Você valoriza a segurança! "
                    + "Lista das Profissões: Medicina, Odontologia, Engenharia Civil, Engenharia da Computação, Letras, Nutrição, Pedagogia, Psicologia, Veterinária, Biomedicina, História, Pedagogia, Ciência da Computação, Engenharia de Controle e Automação, Engenharia Nuclear e Engenharia de Materiais.");
   
        }
       if(d > b && d > c && d > a && d > e){
            jTextArea1.setText("Você valoriza a qualidade de vida! "
                    + "Lista das Profissões: Administração, Ciências Contábeis, Análise de Sistemas, Economia, Engenharia da Computação, Farmácia, Física, Comércio Exterior, , Engenharia Mecânica, Engenharia Eletrônica, Engenharia Elétrica, Engenharia de Produção, Engenharia de Agrimensura e Biblioteconomia.");
   
        }
       if(e > b && e > e && e > d && e > a){
            jTextArea1.setText("Você valoriza a solidariedade! "
                    + "Lista das Profissões: Ciências Sociais, Enfermagem, Fonoaudiologia, Engenharia de Alimentos, Jornalismo, Nutrição, Terapia Ocupacional, Psicologia, Serviço Social, Fisioterapia, Odontologia, Decoração, Moda, Fonoaudiologia e Farmácia.");
   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cursEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cursEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cursEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cursEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cursEnem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
