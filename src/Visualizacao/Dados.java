/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

import Modelagem.Dados1;
import Modelagem.Sort;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dados extends javax.swing.JFrame {

    private static String email;

    public Dados(String email) {
        initComponents();
        obterDado();
        this.email = email;
    }
    
    
    Dados1 dad = new Dados1();
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_perfil = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        btn_dados = new javax.swing.JButton();
        btn_mapa = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dados = new javax.swing.JTable();
        btn_criar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_proprietario = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_dt_analise = new javax.swing.JTextField();
        txt_doenca = new javax.swing.JTextField();
        txt_obs = new javax.swing.JTextField();
        btn_limpar = new javax.swing.JButton();
        btn_pesquisar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        btn_ordenar = new javax.swing.JButton();

        jLabel5.setText("jLabel3");

        jPanel9.setBackground(new java.awt.Color(201, 219, 178));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualização/src/pencil.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 241, 228));

        jPanel2.setBackground(new java.awt.Color(201, 219, 178));

        jPanel3.setBackground(new java.awt.Color(71, 83, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_perfil.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_perfil.setForeground(new java.awt.Color(71, 83, 60));
        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/src/user2.png"))); // NOI18N
        btn_perfil.setText("  PERFIL");
        btn_perfil.setContentAreaFilled(false);
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });

        btn_inicio.setBackground(new java.awt.Color(250, 241, 228));
        btn_inicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(71, 83, 60));
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/src/dash2.png"))); // NOI18N
        btn_inicio.setText("  INÍCIO");
        btn_inicio.setContentAreaFilled(false);
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_dados.setBackground(new java.awt.Color(250, 241, 228));
        btn_dados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_dados.setForeground(new java.awt.Color(148, 166, 132));
        btn_dados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/src/graph.png"))); // NOI18N
        btn_dados.setText("  DADOS");
        btn_dados.setContentAreaFilled(false);
        btn_dados.setOpaque(true);
        btn_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dadosActionPerformed(evt);
            }
        });

        btn_mapa.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_mapa.setForeground(new java.awt.Color(71, 83, 60));
        btn_mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/src/map2.png"))); // NOI18N
        btn_mapa.setText("  MAPA");
        btn_mapa.setContentAreaFilled(false);
        btn_mapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mapaActionPerformed(evt);
            }
        });

        btn_sair.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(71, 83, 60));
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/src/logout.png"))); // NOI18N
        btn_sair.setText("  SAIR");
        btn_sair.setContentAreaFilled(false);
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/src/antravision_verde 3.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/src/antra_nome_verde.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btn_dados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(btn_sair))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel11))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_mapa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_perfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btn_dados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel5.setBackground(new java.awt.Color(71, 83, 60));
        jPanel5.setPreferredSize(new java.awt.Dimension(290, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setText("DADOS REGISTRADOS");

        tbl_dados.setBackground(new java.awt.Color(201, 219, 178));
        tbl_dados.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tbl_dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Proprietário", "Telefone", "Data da Análise", "Doença Existente", "Observações"
            }
        ));
        tbl_dados.setColumnSelectionAllowed(true);
        tbl_dados.setGridColor(new java.awt.Color(71, 83, 60));
        tbl_dados.setPreferredSize(new java.awt.Dimension(375, 357));
        tbl_dados.setRowHeight(35);
        tbl_dados.setRowMargin(10);
        tbl_dados.setSelectionBackground(new java.awt.Color(148, 166, 132));
        tbl_dados.getTableHeader().setReorderingAllowed(false);
        tbl_dados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_dados);

        btn_criar.setBackground(new java.awt.Color(201, 219, 178));
        btn_criar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_criar.setForeground(new java.awt.Color(71, 83, 60));
        btn_criar.setText("CRIAR DADO");
        btn_criar.setContentAreaFilled(false);
        btn_criar.setOpaque(true);
        btn_criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(201, 219, 178));
        btn_excluir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(71, 83, 60));
        btn_excluir.setText("EXCLUIR DADO");
        btn_excluir.setContentAreaFilled(false);
        btn_excluir.setOpaque(true);
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(201, 219, 178));
        btn_alterar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(71, 83, 60));
        btn_alterar.setText("ALTERAR DADO");
        btn_alterar.setContentAreaFilled(false);
        btn_alterar.setOpaque(true);
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("NOME");

        txt_nome.setBackground(new java.awt.Color(227, 218, 207));
        txt_nome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nome.setBorder(null);
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("PROPRIETÁRIO");

        txt_proprietario.setBackground(new java.awt.Color(227, 218, 207));
        txt_proprietario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_proprietario.setBorder(null);

        txt_telefone.setBackground(new java.awt.Color(227, 218, 207));
        txt_telefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_telefone.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("TELEFONE");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("DATA DA ANÁLISE");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("OBSERVAÇÕES");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("DOENÇA EXISTENTE");

        txt_dt_analise.setBackground(new java.awt.Color(227, 218, 207));
        txt_dt_analise.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_dt_analise.setBorder(null);
        txt_dt_analise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dt_analiseActionPerformed(evt);
            }
        });

        txt_doenca.setBackground(new java.awt.Color(227, 218, 207));
        txt_doenca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_doenca.setBorder(null);

        txt_obs.setBackground(new java.awt.Color(227, 218, 207));
        txt_obs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_obs.setBorder(null);
        txt_obs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_obsActionPerformed(evt);
            }
        });

        btn_limpar.setBackground(new java.awt.Color(201, 219, 178));
        btn_limpar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_limpar.setForeground(new java.awt.Color(71, 83, 60));
        btn_limpar.setText("LIMPAR DADOS");
        btn_limpar.setContentAreaFilled(false);
        btn_limpar.setOpaque(true);
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_pesquisar.setBackground(new java.awt.Color(201, 219, 178));
        btn_pesquisar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_pesquisar.setForeground(new java.awt.Color(71, 83, 60));
        btn_pesquisar.setText("PESQUISAR");
        btn_pesquisar.setContentAreaFilled(false);
        btn_pesquisar.setOpaque(true);
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(227, 218, 207));
        txt_id.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_id.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        txt_pesquisar.setBackground(new java.awt.Color(227, 218, 207));
        txt_pesquisar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_pesquisar.setBorder(null);
        txt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisarActionPerformed(evt);
            }
        });

        btn_ordenar.setBackground(new java.awt.Color(201, 219, 178));
        btn_ordenar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_ordenar.setForeground(new java.awt.Color(71, 83, 60));
        btn_ordenar.setText("ORDENAR DADOS");
        btn_ordenar.setContentAreaFilled(false);
        btn_ordenar.setOpaque(true);
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt_obs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                                    .addComponent(txt_dt_analise, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                                            .addComponent(txt_pesquisar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_doenca, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                        .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_criar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ordenar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addContainerGap(327, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_doenca, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_obs, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dt_analise, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_criar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void consultardados(){
               
        ResultSet tabela;
        tabela = null;
        
        
        tabela = dad.consultarDado();
        DefaultTableModel modelo = (DefaultTableModel) tbl_dados.getModel();
        modelo.setNumRows(0);
        
       try{
        do{
           modelo.addRow(new String[]{tabela.getString(1),tabela.getString(2), tabela.getString(3), tabela.getString(4), tabela.getString(5), tabela.getString(6), tabela.getString(7)});
        }while(tabela.next());
      
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+ erro) ;    
        }

}
    
       public void obterDado(){
      
       ResultSet tabela;
       tabela = null;
    
       tabela = dad.consultarProprietario(txt_pesquisar.getText());
       DefaultTableModel modelo = (DefaultTableModel) tbl_dados.getModel();
       modelo.setNumRows(0);
        try
        {
        do{
           modelo.addRow(new String[]{tabela.getString(1),tabela.getString(2), tabela.getString(3), tabela.getString(4), tabela.getString(5), tabela.getString(6), tabela.getString(7)});
         }while(tabela.next());
      
    }catch(SQLException erro){
      JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+ erro) ;    
    }
}
        
    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        Inicio i = new Inicio(email);
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dadosActionPerformed
        Dados d = new Dados(email);
        d.setVisible(true);
    }//GEN-LAST:event_btn_dadosActionPerformed

    private void btn_mapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mapaActionPerformed
        this.setVisible(false);
        Mapa m = new Mapa(email);
        m.setVisible(true);
    }//GEN-LAST:event_btn_mapaActionPerformed

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
        this.setVisible(false);
        Perfil p;
        try {
            p = new Perfil(email);
            p.setVisible(true);
        } catch(SQLException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_perfilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        dad.setId(Integer.parseInt(txt_id.getText()));
        dad.excluirDado();
        consultardados();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
       dad.setId(Integer.parseInt(txt_id.getText()));
       dad.setNome(txt_nome.getText());
       dad.setProprietario(txt_proprietario.getText());
       dad.setTelefone(txt_telefone.getText());
       dad.setDt_analise(txt_dt_analise.getText());
       dad.setDoenca(txt_doenca.getText());
       dad.setObs(txt_obs.getText());
       dad.alterarDado();
       consultardados();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criarActionPerformed
        dad.setNome(txt_nome.getText());
        dad.setProprietario(txt_proprietario.getText());
        dad.setTelefone(txt_telefone.getText());
        dad.setDt_analise(txt_dt_analise.getText());
        dad.setDoenca(txt_doenca.getText());
        dad.setObs(txt_obs.getText());
        dad.cadastrarDado();
        
    ResultSet tabela;
    tabela = null;
    
    tabela = dad.consultarDado();
    DefaultTableModel modelo = (DefaultTableModel) tbl_dados.getModel();
    modelo.setNumRows(0);
    
    try
    {
      do{
         modelo.addRow(new String[]{tabela.getString(1),tabela.getString(2), tabela.getString(3), tabela.getString(4), tabela.getString(5), tabela.getString(6), tabela.getString(7)});
    }while(tabela.next());
      
    }catch(SQLException erro){
      JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+ erro) ;    
    }
    
    }//GEN-LAST:event_btn_criarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        txt_id.setText("");
        txt_nome.setText("");
        txt_proprietario.setText("");
        txt_telefone.setText("");
        txt_dt_analise.setText("");
        txt_doenca.setText("");
        txt_obs.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        dad.setProprietario(txt_pesquisar.getText());
        dad.consultarId();
        obterDado();
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void tbl_dadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dadosMouseClicked
        int linhaselecionada = tbl_dados.getSelectedRow();
        txt_id.setText(tbl_dados.getValueAt(linhaselecionada, 0).toString());
        txt_nome.setText(tbl_dados.getValueAt(linhaselecionada, 1).toString());
        txt_proprietario.setText(tbl_dados.getValueAt(linhaselecionada, 2).toString());
        txt_telefone.setText(tbl_dados.getValueAt(linhaselecionada, 3).toString());
        txt_dt_analise.setText(tbl_dados.getValueAt(linhaselecionada, 4).toString());
        txt_doenca.setText(tbl_dados.getValueAt(linhaselecionada, 5).toString());
        txt_obs.setText(tbl_dados.getValueAt(linhaselecionada, 6).toString());
    }//GEN-LAST:event_tbl_dadosMouseClicked

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesquisarActionPerformed

    private void txt_obsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_obsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_obsActionPerformed

    private void txt_dt_analiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dt_analiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dt_analiseActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
      ResultSet tabela;
       tabela = null;
    
       tabela = dad.consultarProprietario(txt_pesquisar.getText());
       DefaultTableModel modelo = (DefaultTableModel) tbl_dados.getModel();
       modelo.setNumRows(0);
        try{
            List<Dados1> locs = new ArrayList<>();  
            do{
                Dados1 dado = new Dados1(tabela.getInt(1), tabela.getString(2), tabela.getString(3), tabela.getString(4), tabela.getString(5), tabela.getString(6), tabela.getString(7));
                locs.add(dado);
            }
            while(tabela.next());
            
            Sort sort = new Sort();
            sort.mergeSortByData(locs);
            for (Dados1 dado : locs) {
                            

                    modelo.addRow(new String[] {
                    String.valueOf(dado.getId()),
                    dado.getNome(),
                    dado.getProprietario(),
                    dado.getTelefone(),
                    dado.getDt_analise(),
                    dado.getDoenca(),
                    dado.getObs()
                });
            }
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro preencher tabela" + erro);
        }
    }//GEN-LAST:event_btn_ordenarActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dados(email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_criar;
    private javax.swing.JButton btn_dados;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_mapa;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_dados;
    private javax.swing.JTextField txt_doenca;
    private javax.swing.JTextField txt_dt_analise;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_obs;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_proprietario;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

}
