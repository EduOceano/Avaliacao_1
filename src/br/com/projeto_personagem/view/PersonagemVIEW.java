
package br.com.projeto_personagem.view; 

import br.com.projeto_personagem.dto.PersonagemDTO; 
import br.com.projeto_personagem.ctr.PersonagemCTR;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class PersonagemVIEW extends javax.swing.JInternalFrame {

    PersonagemDTO personagemDTO = new PersonagemDTO();
    PersonagemCTR personagemCTR = new PersonagemCTR();
    GerenciadorAudio audio = new GerenciadorAudio();
    int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_personagem;
    
    public PersonagemVIEW() {
        initComponents();
        try {
   
    java.io.File arquivoFonte = new java.io.File("src/res/Gothicbyte-WpeRG.ttf");
    java.awt.Font fonteBase = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, arquivoFonte);
    
    java.awt.Font fonteTitulo = fonteBase.deriveFont(24f);
    java.awt.Font fonteTexto = fonteBase.deriveFont(18f);
    
    jLabel1.setFont(fonteTitulo);
    jLabel11.setFont(fonteTitulo);
    
    jLabel2.setFont(fonteTexto); 
    jLabel3.setFont(fonteTexto); 
    jLabel4.setFont(fonteTexto); 
    jLabel5.setFont(fonteTexto); 
    jLabel6.setFont(fonteTexto);
    jLabel7.setFont(fonteTexto);
    jLabel8.setFont(fonteTexto);
    jLabel9.setFont(fonteTexto);
    jLabel10.setFont(fonteTexto);
    jLabel12.setFont(fonteTexto);
    jLabel13.setFont(fonteTexto);
    
    txt_nome.setFont(fonteTexto);
    txt_classe.setFont(fonteTexto);
    txt_nivel.setFont(fonteTexto);
    txt_sabedoria.setFont(fonteTexto);
    txt_forca.setFont(fonteTexto);
    txt_carisma.setFont(fonteTexto);
    txt_destreza.setFont(fonteTexto);
    txt_inteligencia.setFont(fonteTexto);
    txt_constituicao.setFont(fonteTexto);
    
    pesquisa_nome.setFont(fonteTexto);
    cb_raca.setFont(fonteTexto);
    
    jtl_consultar_personagem.setFont(fonteTexto);
    jtl_consultar_personagem.getTableHeader().setFont(fonteTexto);
    
    btnNovo.setFont(fonteTexto);
    btnSalvar.setFont(fonteTexto);
    btnCancelar.setFont(fonteTexto);
    btnExcluir.setFont(fonteTexto);
    btnSair.setFont(fonteTexto);
    
} catch (Exception e) {
    System.out.println("Erro ao carregar a fonte decorada.");
}
        audio.tocarMusica("src/res/MenuMusic.wav");
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jtl_consultar_personagem.setOpaque(false);
        javax.swing.table.DefaultTableCellRenderer estiloCelula = new javax.swing.table.DefaultTableCellRenderer();
        estiloCelula.setBackground(new java.awt.Color(0, 0, 0, 160)); 
        estiloCelula.setForeground(java.awt.Color.WHITE); 
        estiloCelula.setOpaque(true);
        jtl_consultar_personagem.setDefaultRenderer(Object.class, estiloCelula);
        liberarCampos(false);
        liberaBotoes(true, false,false,false,true);
        modelo_jtl_consultar_personagem = (DefaultTableModel) jtl_consultar_personagem.getModel();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_classe = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nivel = new javax.swing.JTextField();
        txt_sabedoria = new javax.swing.JTextField();
        txt_carisma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_raca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_destreza = new javax.swing.JTextField();
        txt_forca = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_personagem = new javax.swing.JTable();
        txt_inteligencia = new javax.swing.JTextField();
        txt_constituicao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pesquisa_nome = new javax.swing.JTextField();
        btnMudo = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Ficha De Personagem");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 11, 240, -1));

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 30));

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Classe:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 30));

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Nível:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, 30));

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Destreza:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 30));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Constituição: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 160, 30));

        txt_nome.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_nome.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_nome.setNextFocusableComponent(txt_classe);
        txt_nome.setOpaque(false);
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 200, 40));

        txt_classe.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_classe.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_classe.setNextFocusableComponent(txt_nivel);
        txt_classe.setOpaque(false);
        getContentPane().add(txt_classe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 40));

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Força:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 80, 30));

        txt_nivel.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_nivel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_nivel.setNextFocusableComponent(cb_raca);
        txt_nivel.setOpaque(false);
        txt_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nivelActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 40, 40));

        txt_sabedoria.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_sabedoria.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_sabedoria.setNextFocusableComponent(txt_carisma);
        txt_sabedoria.setOpaque(false);
        txt_sabedoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sabedoriaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_sabedoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 40, 40));

        txt_carisma.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_carisma.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_carisma.setNextFocusableComponent(pesquisa_nome);
        txt_carisma.setOpaque(false);
        txt_carisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_carismaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_carisma, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 40, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Raça:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, 30));

        cb_raca.setBackground(new java.awt.Color(204, 204, 204));
        cb_raca.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cb_raca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Elfo", "Anão", "Orc" }));
        cb_raca.setNextFocusableComponent(txt_destreza);
        getContentPane().add(cb_raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 40));

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("Inteligência:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 150, 40));

        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 204));
        jLabel10.setText("Sabedoria:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 120, 30));

        txt_destreza.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_destreza.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_destreza.setNextFocusableComponent(txt_forca);
        txt_destreza.setOpaque(false);
        txt_destreza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_destrezaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_destreza, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 40, 40));

        txt_forca.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_forca.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_forca.setNextFocusableComponent(txt_constituicao);
        txt_forca.setOpaque(false);
        txt_forca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_forcaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_forca, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 40, 40));

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/portal.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setOpaque(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 160, 50));

        btnNovo.setBackground(new java.awt.Color(204, 204, 204));
        btnNovo.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/parchment.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setOpaque(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 160, 50));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/cross-swords.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setOpaque(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 160, 50));

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluir.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/grave.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setOpaque(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 50));

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/scroll.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setOpaque(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 160, 50));

        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Personagens Salvos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 210, -1));

        jLabel12.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("Nome :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, 30));

        btnPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/crystal-ball.png"))); // NOI18N
        btnPesquisar.setOpaque(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, 90, -1));

        jtl_consultar_personagem.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jtl_consultar_personagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_personagem.setOpaque(false);
        jtl_consultar_personagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_personagemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_personagem);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 410, 161));

        txt_inteligencia.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_inteligencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_inteligencia.setNextFocusableComponent(txt_sabedoria);
        txt_inteligencia.setOpaque(false);
        txt_inteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inteligenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_inteligencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 40, 40));

        txt_constituicao.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txt_constituicao.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        txt_constituicao.setNextFocusableComponent(txt_inteligencia);
        txt_constituicao.setOpaque(false);
        txt_constituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_constituicaoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_constituicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 40, 40));

        jLabel13.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("Carisma:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 100, -1));

        pesquisa_nome.setBackground(new java.awt.Color(0, 0, 0));
        pesquisa_nome.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        pesquisa_nome.setForeground(new java.awt.Color(255, 255, 255));
        pesquisa_nome.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        pesquisa_nome.setNextFocusableComponent(txt_nome);
        pesquisa_nome.setOpaque(false);
        pesquisa_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisa_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 70, 230, 30));

        btnMudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/music.png"))); // NOI18N
        btnMudo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/music(muted).png"))); // NOI18N
        btnMudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 50, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_personagem/view/imagens/MenuGif.gif"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberarCampos(true);
        liberaBotoes(false, true,false,false,true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
if (gravar_alterar==1){
    gravar();
    gravar_alterar=0;
} else{
    if(gravar_alterar == 2){
        alterar();
    } else{
    JOptionPane.showMessageDialog(null, "Erro no Sistema!");
  }
}     
limpaCampos();
liberarCampos(false);
liberaBotoes(true, false,false,false,true);

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       preencherTabela(pesquisa_nome.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jtl_consultar_personagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_personagemMouseClicked
        
        preencherCampos(Integer.parseInt(String.valueOf(
        jtl_consultar_personagem.getValueAt(
        jtl_consultar_personagem.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_personagemMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        excluir();
        limpaCampos();
        liberarCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_personagem.setNumRows(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

      limpaCampos();
      liberarCampos(false);
      modelo_jtl_consultar_personagem.setNumRows(0);
      liberaBotoes(true, false, false, false, true);
      gravar_alterar=0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

      this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txt_sabedoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sabedoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sabedoriaActionPerformed

    private void txt_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nivelActionPerformed

    private void txt_carismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_carismaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_carismaActionPerformed

    private void txt_inteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inteligenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inteligenciaActionPerformed

    private void txt_forcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_forcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_forcaActionPerformed

    private void txt_constituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_constituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_constituicaoActionPerformed

    private void txt_destrezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_destrezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_destrezaActionPerformed

    private void pesquisa_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa_nomeActionPerformed

    private void btnMudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudoActionPerformed
         audio.alternarMudo();
    }//GEN-LAST:event_btnMudoActionPerformed


  private void liberarCampos(boolean a){
        txt_nome.setEnabled(a);
        txt_classe.setEnabled(a);
        txt_nivel.setEnabled(a);
        txt_sabedoria.setEnabled(a);
        txt_forca.setEnabled(a);
        cb_raca.setEnabled(a);
        txt_carisma.setEnabled(a);
        txt_destreza.setEnabled(a);
        txt_inteligencia.setEnabled(a);
        txt_constituicao.setEnabled(a);
    }  

    private void limpaCampos(){
        txt_nome.setText("");
        txt_classe.setText("");
        txt_nivel.setText("");
        txt_sabedoria.setText("");
        txt_forca.setText("");
        txt_carisma.setText("");
        txt_destreza.setText("");
        txt_inteligencia.setText("");
        txt_constituicao.setText("");
    }
    
    private void liberaBotoes(boolean a, boolean b,boolean c,boolean d, boolean e){
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnExcluir.setEnabled(d);
        btnSair.setEnabled(e);
    }
    
    private void gravar(){
        try{
            personagemDTO.setNome(txt_nome.getText());
            personagemDTO.setClasse(txt_classe.getText());
            personagemDTO.setRaca(cb_raca.getSelectedItem().toString());
            personagemDTO.setNivel(Integer.parseInt(txt_nivel.getText()));
            personagemDTO.setForca(Integer.parseInt(txt_sabedoria.getText()));
            personagemDTO.setDestreza(Integer.parseInt(txt_forca.getText()));
            personagemDTO.setConstituicao(Integer.parseInt(txt_carisma.getText()));
            personagemDTO.setInteligencia(Integer.parseInt(txt_destreza.getText()));
            personagemDTO.setSabedoria(Integer.parseInt(txt_inteligencia.getText()));
            personagemDTO.setCarisma(Integer.parseInt(txt_constituicao.getText()));
            
            JOptionPane.showMessageDialog(null, personagemCTR.inserirPersonagem(personagemDTO));
        }catch(Exception e){
            System.out.println("Erro ao Gravar: " + e.getMessage());
        }
    }
    
    private void alterar(){
        try{
            personagemDTO.setNome(txt_nome.getText());
            personagemDTO.setClasse(txt_classe.getText());
            personagemDTO.setRaca(cb_raca.getSelectedItem().toString());
            personagemDTO.setNivel(Integer.parseInt(txt_nivel.getText()));
            personagemDTO.setForca(Integer.parseInt(txt_sabedoria.getText()));
            personagemDTO.setDestreza(Integer.parseInt(txt_forca.getText()));
            personagemDTO.setConstituicao(Integer.parseInt(txt_carisma.getText()));
            personagemDTO.setInteligencia(Integer.parseInt(txt_destreza.getText()));
            personagemDTO.setSabedoria(Integer.parseInt(txt_inteligencia.getText()));
            personagemDTO.setCarisma(Integer.parseInt(txt_constituicao.getText()));
            
            JOptionPane.showMessageDialog(null, personagemCTR.alterarPersonagem(personagemDTO));
        }catch(Exception e){
            System.out.println("Erro ao Alterar: " + e.getMessage());
        }
    }
    
    private void preencherTabela (String nome){
        try{
        modelo_jtl_consultar_personagem.setNumRows(0);
        
        // Recria os cabeçalhos com o ID e esconde a primeira coluna
        modelo_jtl_consultar_personagem.setColumnIdentifiers(new Object[]{"ID", "Nome", "Nível"});
        jtl_consultar_personagem.getColumnModel().getColumn(0).setMinWidth(0);
        jtl_consultar_personagem.getColumnModel().getColumn(0).setMaxWidth(0);
        jtl_consultar_personagem.getColumnModel().getColumn(0).setWidth(0);
        
        personagemDTO.setNome(nome);
        rs = personagemCTR.consultarPersonagem(personagemDTO, 1);
        
        while(rs.next()){
            modelo_jtl_consultar_personagem.addRow(new Object[]{
                rs.getString("id_personagem"),
                rs.getString("nome"),
                rs.getString("nivel")
            });
        }
    }catch(Exception e){
        System.out.println("Erro SQL: " + e);
    }finally{
        personagemCTR.CloseDB();
    }
    }
    
    private void preencherCampos(int id_personagem){
        try{
            personagemDTO.setId_personagem(id_personagem);
            rs = personagemCTR.consultarPersonagem(personagemDTO, 2);
            if(rs.next()){
                txt_nome.setText(rs.getString("nome"));
                txt_classe.setText(rs.getString("classe"));
                cb_raca.setSelectedItem(rs.getString("raca"));
                txt_nivel.setText(rs.getString("nivel"));
                txt_sabedoria.setText(rs.getString("forca"));
                txt_forca.setText(rs.getString("destreza"));
                txt_carisma.setText(rs.getString("constituicao"));
                txt_destreza.setText(rs.getString("inteligencia"));
                txt_inteligencia.setText(rs.getString("sabedoria"));
                txt_constituicao.setText(rs.getString("carisma"));
                
                gravar_alterar = 2;
                liberarCampos(true);
            }
        } catch (Exception e){
            System.out.println("Erro ao preencher campos: " + e.getMessage());
        }
    }
    
    private void excluir(){
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esta ficha de personagem?","Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, personagemCTR.excluirPersonagem(personagemDTO));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JToggleButton btnMudo;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cb_raca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtl_consultar_personagem;
    private javax.swing.JTextField pesquisa_nome;
    private javax.swing.JTextField txt_carisma;
    private javax.swing.JTextField txt_classe;
    private javax.swing.JTextField txt_constituicao;
    private javax.swing.JTextField txt_destreza;
    private javax.swing.JTextField txt_forca;
    private javax.swing.JTextField txt_inteligencia;
    private javax.swing.JTextField txt_nivel;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_sabedoria;
    // End of variables declaration//GEN-END:variables

}
