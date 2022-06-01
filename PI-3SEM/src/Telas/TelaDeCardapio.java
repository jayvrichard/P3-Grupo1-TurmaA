/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Categoria;
import Classes.CrudCategoria;
import Classes.CrudProduto;
import Classes.ItensPedido;
import Classes.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Sousa
 */
public class TelaDeCardapio extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCardapio
     */
    public TelaDeCardapio() {
        initComponents();
        jpCategoria1.setVisible(false);
        jpCategoria2.setVisible(false);
        jpCategoria3.setVisible(false);
        jpCategoria4.setVisible(false);
        jpCategoria5.setVisible(false);
        jpCategoria6.setVisible(false);
        jpCategoria7.setVisible(false);
        jpCategoria8.setVisible(false);
        jpCategoria9.setVisible(false);
        jpCategoria10.setVisible(false);
        btnAdd1.setVisible(false);
        btnAdd2.setVisible(false);
        btnAdd3.setVisible(false);
        listarCategoria();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }

    private int countcat = 1, countProdMenor = 1, countProdMaior = 100;
    private double valor1, valor2, valor3;
    private boolean adicional1, adicional2, adicional3;
    public static ArrayList<Produto> produto = new ArrayList();
    public static ArrayList<ItensPedido> item = new ArrayList();

    public void listarCategoria() {
        int count = 1;
        CrudCategoria lista = new CrudCategoria();
        for (Categoria l : lista.mostrar()) {
            switch (count) {
                case 1:
                    jpCategoria1.setVisible(true);
                    lblCategoria1.setText(l.getNome());
                    break;
                case 2:
                    lblCategoria2.setText(l.getNome());
                    jpCategoria2.setVisible(true);

                    break;
                case 3:
                    lblCategoria3.setText(l.getNome());
                    jpCategoria3.setVisible(true);
                    break;
                case 4:
                    lblCategoria4.setText(l.getNome());
                    jpCategoria4.setVisible(true);
                    break;
                case 5:
                    lblCategoria5.setText(l.getNome());
                    jpCategoria5.setVisible(true);
                    break;
                case 6:
                    lblCategoria6.setText(l.getNome());
                    jpCategoria6.setVisible(true);
                    break;
                case 7:
                    lblCategoria7.setText(l.getNome());
                    jpCategoria7.setVisible(true);
                    break;
                case 8:
                    lblCategoria8.setText(l.getNome());
                    jpCategoria8.setVisible(true);
                    break;
                case 9:
                    lblCategoria9.setText(l.getNome());
                    jpCategoria9.setVisible(true);
                    break;
                case 10:
                    lblCategoria10.setText(l.getNome());
                    jpCategoria10.setVisible(true);
                    break;
            }
            count++;

        }
    }

    public void listarProduto(int x, int y, int z) {
        int count = 1;
        CrudProduto lista = new CrudProduto();

        for (Produto l : lista.mostrarProd(x, y, z)) {
            switch (count) {
                case 1:
                    lblItem1.setText(" - " + l.getNome());
                    lblPreco1.setText("R$" + String.valueOf(l.getValor()).replace(".", ",") + "0");
                    lblDescricao1.setText(l.getDescricao());
                    lblId1.setText(String.valueOf(l.getId()));
                    btnAdd1.setVisible(true);
                    adicional1 = l.isAdicional();
                    countProdMenor = l.getId();
                    valor1 = l.getValor();
                    break;
                case 2:
                    lblItem2.setText(" - " + l.getNome());
                    lblPreco2.setText("R$" + String.valueOf(l.getValor()).replace(".", ",") + "0");
                    lblDescricao2.setText(l.getDescricao());
                    lblId2.setText(String.valueOf(l.getId()));
                    btnAdd2.setVisible(true);
                    adicional2 = l.isAdicional();
                    countProdMaior = l.getId();
                    valor2 = l.getValor();
                    break;
                case 3:
                    lblItem3.setText(" - " + l.getNome());
                    lblPreco3.setText("R$" + String.valueOf(l.getValor()).replace(".", ",") + "0");
                    lblDescricao3.setText(l.getDescricao());
                    lblId3.setText(String.valueOf(l.getId()));
                    btnAdd3.setVisible(true);
                    adicional3 = l.isAdicional();
                    countProdMaior = l.getId();
                    valor3 = l.getValor();
                    break;
            }
            count++;
        }
    }

    public void limparItens() {
        lblItem1.setText("");
        lblPreco1.setText("");
        lblDescricao1.setText("");
        lblItem2.setText("");
        lblPreco2.setText("");
        lblDescricao2.setText("");
        lblItem3.setText("");
        lblPreco3.setText("");
        lblDescricao3.setText("");
        lblId1.setText("");
        lblId2.setText("");
        lblId3.setText("");
        btnAdd1.setVisible(false);
        btnAdd2.setVisible(false);
        btnAdd3.setVisible(false);
        adicional1 = false;
        adicional2 = false;
        adicional3 = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpCardapio = new javax.swing.JPanel();
        lblCardapio = new javax.swing.JLabel();
        btnRetorno = new javax.swing.JButton();
        jpCategoria1 = new javax.swing.JPanel();
        lblCategoria1 = new javax.swing.JLabel();
        jpCategoria2 = new javax.swing.JPanel();
        lblCategoria2 = new javax.swing.JLabel();
        jpCategoria3 = new javax.swing.JPanel();
        lblCategoria3 = new javax.swing.JLabel();
        jpCategoria4 = new javax.swing.JPanel();
        lblCategoria4 = new javax.swing.JLabel();
        jpCategoria5 = new javax.swing.JPanel();
        lblCategoria5 = new javax.swing.JLabel();
        jpCategoria6 = new javax.swing.JPanel();
        lblCategoria6 = new javax.swing.JLabel();
        jpCategoria7 = new javax.swing.JPanel();
        lblCategoria7 = new javax.swing.JLabel();
        jpCategoria8 = new javax.swing.JPanel();
        lblCategoria8 = new javax.swing.JLabel();
        jpCategoria9 = new javax.swing.JPanel();
        lblCategoria9 = new javax.swing.JLabel();
        jpCategoria10 = new javax.swing.JPanel();
        lblCategoria10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpItem1 = new javax.swing.JPanel();
        lblItem1 = new javax.swing.JLabel();
        lblPreco1 = new javax.swing.JLabel();
        lblDescricao1 = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JButton();
        lblId1 = new javax.swing.JLabel();
        jpItem3 = new javax.swing.JPanel();
        lblId3 = new javax.swing.JLabel();
        lblPreco3 = new javax.swing.JLabel();
        lblDescricao3 = new javax.swing.JLabel();
        btnAdd3 = new javax.swing.JButton();
        lblItem3 = new javax.swing.JLabel();
        jpItem2 = new javax.swing.JPanel();
        lblItem2 = new javax.swing.JLabel();
        lblPreco2 = new javax.swing.JLabel();
        lblDescricao2 = new javax.swing.JLabel();
        btnAdd2 = new javax.swing.JButton();
        lblId2 = new javax.swing.JLabel();
        btnAvancaPagina = new javax.swing.JButton();
        btnRetornaPagina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jpCardapio.setBackground(new java.awt.Color(51, 51, 51));

        lblCardapio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCardapio.setForeground(new java.awt.Color(255, 255, 255));
        lblCardapio.setText("Cardápio");

        btnRetorno.setBackground(new java.awt.Color(255, 102, 0));
        btnRetorno.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        btnRetorno.setText("Cancelar");
        btnRetorno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornoActionPerformed(evt);
            }
        });

        jpCategoria1.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria1.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria1.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria1Layout = new javax.swing.GroupLayout(jpCategoria1);
        jpCategoria1.setLayout(jpCategoria1Layout);
        jpCategoria1Layout.setHorizontalGroup(
            jpCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria1Layout.setVerticalGroup(
            jpCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCategoria1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCategoria2.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria2.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria2.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria2Layout = new javax.swing.GroupLayout(jpCategoria2);
        jpCategoria2.setLayout(jpCategoria2Layout);
        jpCategoria2Layout.setHorizontalGroup(
            jpCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria2Layout.setVerticalGroup(
            jpCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria3.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria3.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria3.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria3Layout = new javax.swing.GroupLayout(jpCategoria3);
        jpCategoria3.setLayout(jpCategoria3Layout);
        jpCategoria3Layout.setHorizontalGroup(
            jpCategoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria3Layout.setVerticalGroup(
            jpCategoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria4.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria4.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria4.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria4Layout = new javax.swing.GroupLayout(jpCategoria4);
        jpCategoria4.setLayout(jpCategoria4Layout);
        jpCategoria4Layout.setHorizontalGroup(
            jpCategoria4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria4Layout.setVerticalGroup(
            jpCategoria4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria5.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria5.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria5.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria5Layout = new javax.swing.GroupLayout(jpCategoria5);
        jpCategoria5.setLayout(jpCategoria5Layout);
        jpCategoria5Layout.setHorizontalGroup(
            jpCategoria5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria5Layout.setVerticalGroup(
            jpCategoria5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria6.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria6.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria6.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria6Layout = new javax.swing.GroupLayout(jpCategoria6);
        jpCategoria6.setLayout(jpCategoria6Layout);
        jpCategoria6Layout.setHorizontalGroup(
            jpCategoria6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria6Layout.setVerticalGroup(
            jpCategoria6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria7.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria7.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria7.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria7Layout = new javax.swing.GroupLayout(jpCategoria7);
        jpCategoria7.setLayout(jpCategoria7Layout);
        jpCategoria7Layout.setHorizontalGroup(
            jpCategoria7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria7Layout.setVerticalGroup(
            jpCategoria7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria8.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria8.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria8.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria8Layout = new javax.swing.GroupLayout(jpCategoria8);
        jpCategoria8.setLayout(jpCategoria8Layout);
        jpCategoria8Layout.setHorizontalGroup(
            jpCategoria8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria8Layout.setVerticalGroup(
            jpCategoria8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria9.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria9.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria9.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria9Layout = new javax.swing.GroupLayout(jpCategoria9);
        jpCategoria9.setLayout(jpCategoria9Layout);
        jpCategoria9Layout.setHorizontalGroup(
            jpCategoria9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria9Layout.setVerticalGroup(
            jpCategoria9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpCategoria10.setBackground(new java.awt.Color(0, 0, 0));

        lblCategoria10.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblCategoria10.setForeground(new java.awt.Color(255, 102, 0));
        lblCategoria10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCategoria10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoria10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCategoria10Layout = new javax.swing.GroupLayout(jpCategoria10);
        jpCategoria10.setLayout(jpCategoria10Layout);
        jpCategoria10Layout.setHorizontalGroup(
            jpCategoria10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCategoria10Layout.setVerticalGroup(
            jpCategoria10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoria10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpCardapioLayout = new javax.swing.GroupLayout(jpCardapio);
        jpCardapio.setLayout(jpCardapioLayout);
        jpCardapioLayout.setHorizontalGroup(
            jpCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCategoria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCategoria10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpCardapioLayout.createSequentialGroup()
                .addGroup(jpCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCardapioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCardapioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCardapioLayout.setVerticalGroup(
            jpCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCardapioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCategoria10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 31, Short.MAX_VALUE)
                .addComponent(btnRetorno)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jpItem1.setBackground(new java.awt.Color(0, 0, 0));
        jpItem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblItem1.setBackground(new java.awt.Color(255, 102, 0));
        lblItem1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblItem1.setForeground(new java.awt.Color(255, 102, 0));

        lblPreco1.setBackground(new java.awt.Color(255, 102, 0));
        lblPreco1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPreco1.setForeground(new java.awt.Color(255, 102, 0));

        lblDescricao1.setBackground(new java.awt.Color(255, 102, 0));
        lblDescricao1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDescricao1.setForeground(new java.awt.Color(255, 102, 0));

        btnAdd1.setBackground(new java.awt.Color(255, 165, 24));
        btnAdd1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdd1.setText("+Add");
        btnAdd1.setToolTipText("");
        btnAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        lblId1.setBackground(new java.awt.Color(255, 102, 0));
        lblId1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblId1.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jpItem1Layout = new javax.swing.GroupLayout(jpItem1);
        jpItem1.setLayout(jpItem1Layout);
        jpItem1Layout.setHorizontalGroup(
            jpItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpItem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpItem1Layout.createSequentialGroup()
                        .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpItem1Layout.createSequentialGroup()
                        .addComponent(lblDescricao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd1)))
                .addContainerGap())
        );
        jpItem1Layout.setVerticalGroup(
            jpItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpItem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpItem1Layout.createSequentialGroup()
                        .addGroup(jpItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpItem1Layout.createSequentialGroup()
                                .addGroup(jpItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jpItem1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        jpItem3.setBackground(new java.awt.Color(0, 0, 0));
        jpItem3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpItem3.setForeground(new java.awt.Color(102, 102, 102));

        lblId3.setBackground(new java.awt.Color(255, 102, 0));
        lblId3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblId3.setForeground(new java.awt.Color(255, 102, 0));

        lblPreco3.setBackground(new java.awt.Color(255, 102, 0));
        lblPreco3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPreco3.setForeground(new java.awt.Color(255, 102, 0));

        lblDescricao3.setBackground(new java.awt.Color(255, 102, 0));
        lblDescricao3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDescricao3.setForeground(new java.awt.Color(255, 102, 0));

        btnAdd3.setBackground(new java.awt.Color(255, 165, 24));
        btnAdd3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdd3.setText("+Add");
        btnAdd3.setToolTipText("");
        btnAdd3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        lblItem3.setBackground(new java.awt.Color(255, 102, 0));
        lblItem3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblItem3.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jpItem3Layout = new javax.swing.GroupLayout(jpItem3);
        jpItem3.setLayout(jpItem3Layout);
        jpItem3Layout.setHorizontalGroup(
            jpItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpItem3Layout.createSequentialGroup()
                .addGroup(jpItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpItem3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblId3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItem3, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(jpItem3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblDescricao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jpItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpItem3Layout.setVerticalGroup(
            jpItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpItem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpItem3Layout.createSequentialGroup()
                        .addComponent(lblPreco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(btnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpItem3Layout.createSequentialGroup()
                        .addGroup(jpItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblDescricao3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );

        jpItem2.setBackground(new java.awt.Color(0, 0, 0));
        jpItem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpItem2.setForeground(new java.awt.Color(102, 102, 102));

        lblItem2.setBackground(new java.awt.Color(255, 102, 0));
        lblItem2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblItem2.setForeground(new java.awt.Color(255, 102, 0));

        lblPreco2.setBackground(new java.awt.Color(255, 102, 0));
        lblPreco2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPreco2.setForeground(new java.awt.Color(255, 102, 0));

        lblDescricao2.setBackground(new java.awt.Color(255, 102, 0));
        lblDescricao2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDescricao2.setForeground(new java.awt.Color(255, 102, 0));

        btnAdd2.setBackground(new java.awt.Color(255, 165, 24));
        btnAdd2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdd2.setText("+Add");
        btnAdd2.setToolTipText("");
        btnAdd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        lblId2.setBackground(new java.awt.Color(255, 102, 0));
        lblId2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblId2.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jpItem2Layout = new javax.swing.GroupLayout(jpItem2);
        jpItem2.setLayout(jpItem2Layout);
        jpItem2Layout.setHorizontalGroup(
            jpItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpItem2Layout.createSequentialGroup()
                .addGroup(jpItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpItem2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblDescricao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd2))
                    .addGroup(jpItem2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpItem2Layout.setVerticalGroup(
            jpItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpItem2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpItem2Layout.createSequentialGroup()
                        .addGroup(jpItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnAvancaPagina.setBackground(new java.awt.Color(255, 165, 24));
        btnAvancaPagina.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnAvancaPagina.setText(">>");
        btnAvancaPagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvancaPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancaPaginaActionPerformed(evt);
            }
        });

        btnRetornaPagina.setBackground(new java.awt.Color(255, 165, 24));
        btnRetornaPagina.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnRetornaPagina.setText("<<");
        btnRetornaPagina.setToolTipText("");
        btnRetornaPagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetornaPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornaPaginaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRetornaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvancaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jpItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
                .addGap(80, 80, 80)
                .addComponent(jpItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addComponent(jpItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAvancaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetornaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jpCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancaPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancaPaginaActionPerformed
        // TODO add your handling code here:
        countProdMenor = countProdMaior + 1;
        countProdMaior += 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_btnAvancaPaginaActionPerformed

    private void btnRetornaPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornaPaginaActionPerformed
        // TODO add your handling code here:
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_btnRetornaPaginaActionPerformed

    private void lblCategoria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria1MouseClicked
        // TODO add your handling code here:
        countcat = 1;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria1MouseClicked

    private void btnRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornoActionPerformed
        Object[] options = {"Sim", "Não"};
        int op = 0;
        op = JOptionPane.showOptionDialog(null, "Deseja Cancelar a compra", "Cancelar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (op == 0) {
            produto.removeAll(produto);
            item.removeAll(item);
            frmPedido x = new frmPedido();
            x.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnRetornoActionPerformed

    private void lblCategoria10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria10MouseClicked
        // TODO add your handling code here:
        countcat = 10;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria10MouseClicked

    private void lblCategoria2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria2MouseClicked
        // TODO add your handling code here:
        countcat = 2;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria2MouseClicked

    private void lblCategoria3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria3MouseClicked
        // TODO add your handling code here:
        countcat = 3;
        countProdMenor = 1;
        countProdMaior = 100;
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria3MouseClicked

    private void lblCategoria4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria4MouseClicked
        // TODO add your handling code here:
        countcat = 4;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria4MouseClicked

    private void lblCategoria5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria5MouseClicked
        // TODO add your handling code here:
        countcat = 5;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria5MouseClicked

    private void lblCategoria6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria6MouseClicked
        // TODO add your handling code here:
        countcat = 6;
        countProdMenor = 1;
        countProdMaior = 100;
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria6MouseClicked

    private void lblCategoria7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria7MouseClicked
        // TODO add your handling code here:
        countcat = 7;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria7MouseClicked

    private void lblCategoria8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria8MouseClicked
        // TODO add your handling code here:
        countcat = 8;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria8MouseClicked

    private void lblCategoria9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoria9MouseClicked
        // TODO add your handling code here:
        countcat = 9;
        countProdMenor = 1;
        countProdMaior = 100;
        limparItens();
        listarProduto(countcat, countProdMenor, countProdMaior);
    }//GEN-LAST:event_lblCategoria9MouseClicked

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        if (adicional1 == true) {
            Produto p = new Produto(Integer.parseInt(lblId1.getText()), lblItem1.getText(), valor1);
            produto.add(p);
            TelaAddRemIngrediente x = new TelaAddRemIngrediente();
            x.setVisible(true);
            this.dispose();
        } else {
            Object[] options = {"Sim", "Não"};
            int op = 0;
            op = JOptionPane.showOptionDialog(null, "Deseja continuar comprando", "Carrinho", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (op == 0) {
                Produto p = new Produto(Integer.parseInt(lblId1.getText()), lblItem1.getText(), valor1);
                ItensPedido i = new ItensPedido(Integer.parseInt(lblId1.getText()), valor1, lblItem1.getText());
                item.add(i);
                produto.add(p);
                JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
                this.dispose();
                TelaDeCardapio x = new TelaDeCardapio();
                x.setVisible(true);

            } else {
                Produto p = new Produto(Integer.parseInt(lblId1.getText()), lblItem1.getText(), valor1);
                ItensPedido i = new ItensPedido(Integer.parseInt(lblId1.getText()), valor1, lblItem1.getText());
                item.add(i);
                produto.add(p);
                JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
                TelaDeSacola x = new TelaDeSacola();
                x.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
        if (adicional2 == true) {
            Produto p = new Produto(Integer.parseInt(lblId2.getText()), lblItem2.getText(), valor2);
            produto.add(p);
            TelaAddRemIngrediente x = new TelaAddRemIngrediente();
            x.setVisible(true);
            this.dispose();
        } else {
            Object[] options = {"Sim", "Não"};
            int op = 0;
            op = JOptionPane.showOptionDialog(null, "Deseja continuar comprando", "Carrinho", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (op == 0) {
                Produto p = new Produto(Integer.parseInt(lblId2.getText()), lblItem2.getText(), valor2);
                ItensPedido i = new ItensPedido(Integer.parseInt(lblId2.getText()), valor2, lblItem2.getText());
                item.add(i);
                produto.add(p);
                JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
                this.dispose();
                TelaDeCardapio x = new TelaDeCardapio();
                x.setVisible(true);

            } else {
                Produto p = new Produto(Integer.parseInt(lblId2.getText()), lblItem2.getText(), valor2);
                ItensPedido i = new ItensPedido(Integer.parseInt(lblId2.getText()), valor2, lblItem2.getText());
                item.add(i);
                produto.add(p);
                JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
                TelaDeSacola x = new TelaDeSacola();
                x.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:

        if (adicional3 == true) {
            Produto p = new Produto(Integer.parseInt(lblId3.getText()), lblItem3.getText(), valor3);
            produto.add(p);
            TelaAddRemIngrediente x = new TelaAddRemIngrediente();
            x.setVisible(true);
            this.dispose();
        } else {
            Object[] options = {"Sim", "Não"};
            int op = 0;
            op = JOptionPane.showOptionDialog(null, "Deseja continuar comprando", "Carrinho", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (op == 0) {
                Produto p = new Produto(Integer.parseInt(lblId3.getText()), lblItem3.getText(), valor3);
                ItensPedido i = new ItensPedido(Integer.parseInt(lblId3.getText()), valor3, lblItem3.getText());
                item.add(i);
                produto.add(p);
                JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
                this.dispose();
                TelaDeCardapio x = new TelaDeCardapio();
                x.setVisible(true);

            } else {
                Produto p = new Produto(Integer.parseInt(lblId3.getText()), lblItem3.getText(), valor3);
                ItensPedido i = new ItensPedido(Integer.parseInt(lblId3.getText()), valor3, lblItem3.getText());
                item.add(i);
                produto.add(p);
                JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
                TelaDeSacola x = new TelaDeSacola();
                x.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAdd3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnAvancaPagina;
    private javax.swing.JButton btnRetornaPagina;
    private javax.swing.JButton btnRetorno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpCardapio;
    private javax.swing.JPanel jpCategoria1;
    private javax.swing.JPanel jpCategoria10;
    private javax.swing.JPanel jpCategoria2;
    private javax.swing.JPanel jpCategoria3;
    private javax.swing.JPanel jpCategoria4;
    private javax.swing.JPanel jpCategoria5;
    private javax.swing.JPanel jpCategoria6;
    private javax.swing.JPanel jpCategoria7;
    private javax.swing.JPanel jpCategoria8;
    private javax.swing.JPanel jpCategoria9;
    private javax.swing.JPanel jpItem1;
    private javax.swing.JPanel jpItem2;
    private javax.swing.JPanel jpItem3;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblCategoria10;
    private javax.swing.JLabel lblCategoria2;
    private javax.swing.JLabel lblCategoria3;
    private javax.swing.JLabel lblCategoria4;
    private javax.swing.JLabel lblCategoria5;
    private javax.swing.JLabel lblCategoria6;
    private javax.swing.JLabel lblCategoria7;
    private javax.swing.JLabel lblCategoria8;
    private javax.swing.JLabel lblCategoria9;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblDescricao2;
    private javax.swing.JLabel lblDescricao3;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblItem1;
    private javax.swing.JLabel lblItem2;
    private javax.swing.JLabel lblItem3;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblPreco2;
    private javax.swing.JLabel lblPreco3;
    // End of variables declaration//GEN-END:variables
}
