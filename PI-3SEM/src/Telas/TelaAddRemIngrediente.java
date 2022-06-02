/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Adicional;
import Classes.CrudAdicional;
import Classes.CrudProduto;
import Classes.ItensPedido;
import Classes.Produto;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TelaAddRemIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form PersProduto
     */
    public TelaAddRemIngrediente() {
        initComponents();
        System.out.println(TelaDeCardapio.produto);
        listarItem(TelaDeCardapio.produto.get(TelaDeCardapio.produto.size() - 1));
        removerA();
        idAd.removeAll(idAd);
        valorAd.removeAll(valorAd);
        listarAdicionais();
    }

    public int quantidade1 = 0, quantidade2 = 0, quantidade3 = 0, quantidade4 = 0,
            quantidade5 = 0, quantidade6 = 0, quantidade7 = 0, quantidade8 = 0, quantidade9 = 0,
            quantidade10 = 0;

    ArrayList<Integer> idAd = new ArrayList();
    ArrayList<Double> valorAd = new ArrayList();

    public static ArrayList<Adicional> adicional = new ArrayList();
    private String nome = TelaDeCardapio.produto.get(TelaDeCardapio.produto.size() - 1).getNome();
    private int id = TelaDeCardapio.produto.get(TelaDeCardapio.produto.size() - 1).getId();
    private double valor = TelaDeCardapio.produto.get(TelaDeCardapio.produto.size() - 1).getValor();

    public void listarItem(Produto p) {
        CrudProduto lista = new CrudProduto();
        for (Produto l : lista.mostrarItem(p.getId())) {
            lblNome.setText(l.getNome());
            lblDescricao.setText(l.getDescricao());
        }
    }

    public void listarAdicionais() {
        int count = 1;
        CrudAdicional lista = new CrudAdicional();
        for (Adicional l : lista.mostrar()) {
            switch (count) {
                case 1:
                    lblIngrediente1.setVisible(true);
                    lblIngrediente1.setText(l.getId() + " - " + l.getNome());
                    lblPreco1.setVisible(true);
                    lblPreco1.setText("R$"+l.getValor()+"0");
                    btnAdd1.setVisible(true);
                    btnRem1.setVisible(true);
                    txtQuant1.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 2:
                    lblIngrediente2.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente2.setVisible(true);
                    lblPreco2.setVisible(true);
                    lblPreco2.setText("R$"+l.getValor()+"0");
                    btnAdd2.setVisible(true);
                    btnRem2.setVisible(true);
                    txtQuant2.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 3:
                    lblIngrediente3.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente3.setVisible(true);
                    lblPreco3.setVisible(true);
                    lblPreco3.setText("R$"+l.getValor()+"0");
                    btnAdd3.setVisible(true);
                    btnRem3.setVisible(true);
                    txtQuant3.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 4:
                    lblIngrediente4.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente4.setVisible(true);
                    lblPreco4.setVisible(true);
                    lblPreco4.setText("R$"+l.getValor()+"0");
                    btnAdd4.setVisible(true);
                    btnRem4.setVisible(true);
                    txtQuant4.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 5:
                    lblIngrediente5.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente5.setVisible(true);
                    lblPreco5.setVisible(true);
                    lblPreco5.setText("R$"+l.getValor()+"0");
                    btnAdd5.setVisible(true);
                    btnRem5.setVisible(true);
                    txtQuant5.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 6:
                    lblIngrediente6.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente6.setVisible(true);
                    lblPreco6.setVisible(true);
                    lblPreco6.setText("R$"+l.getValor()+"0");
                    btnAdd6.setVisible(true);
                    btnRem6.setVisible(true);
                    txtQuant6.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 7:
                    lblIngrediente7.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente7.setVisible(true);
                    lblPreco7.setVisible(true);
                    lblPreco7.setText("R$"+l.getValor()+"0");
                    btnAdd7.setVisible(true);
                    btnRem7.setVisible(true);
                    txtQuant7.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 8:
                    lblIngrediente8.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente8.setVisible(true);
                    lblPreco8.setVisible(true);
                    lblPreco8.setText("R$"+l.getValor()+"0");
                    btnAdd8.setVisible(true);
                    btnRem8.setVisible(true);
                    txtQuant8.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 9:
                    lblIngrediente9.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente9.setVisible(true);
                    lblPreco9.setVisible(true);
                    lblPreco9.setText("R$"+l.getValor()+"0");
                    btnAdd9.setVisible(true);
                    btnRem9.setVisible(true);
                    txtQuant9.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
                case 10:
                    lblIngrediente10.setText(l.getId() + " - " + l.getNome());
                    lblIngrediente10.setVisible(true);
                    lblPreco10.setVisible(true);
                    lblPreco10.setText("R$"+l.getValor()+"0");
                    btnAdd10.setVisible(true);
                    btnRem10.setVisible(true);
                    txtQuant10.setVisible(true);
                    idAd.add(l.getId());
                    valorAd.add(l.getValor());
                    break;
            }
            count++;

        }
    }

    public void removerA() {
        lblPreco1.setVisible(false);
        lblPreco2.setVisible(false);
        lblPreco3.setVisible(false);
        lblPreco4.setVisible(false);
        lblPreco5.setVisible(false);
        lblPreco6.setVisible(false);
        lblPreco7.setVisible(false);
        lblPreco8.setVisible(false);
        lblPreco9.setVisible(false);
        lblPreco10.setVisible(false);
        btnAdd1.setVisible(false);
        btnAdd2.setVisible(false);
        btnAdd3.setVisible(false);
        btnAdd4.setVisible(false);
        btnAdd5.setVisible(false);
        btnAdd6.setVisible(false);
        btnAdd7.setVisible(false);
        btnAdd8.setVisible(false);
        btnAdd9.setVisible(false);
        btnAdd10.setVisible(false);
        lblIngrediente1.setVisible(false);
        lblIngrediente2.setVisible(false);
        lblIngrediente3.setVisible(false);
        lblIngrediente4.setVisible(false);
        lblIngrediente5.setVisible(false);
        lblIngrediente6.setVisible(false);
        lblIngrediente7.setVisible(false);
        lblIngrediente8.setVisible(false);
        lblIngrediente9.setVisible(false);
        lblIngrediente10.setVisible(false);
        btnRem1.setVisible(false);
        btnRem2.setVisible(false);
        btnRem3.setVisible(false);
        btnRem4.setVisible(false);
        btnRem5.setVisible(false);
        btnRem6.setVisible(false);
        btnRem7.setVisible(false);
        btnRem8.setVisible(false);
        btnRem9.setVisible(false);
        btnRem10.setVisible(false);
        txtQuant1.setVisible(false);
        txtQuant2.setVisible(false);
        txtQuant3.setVisible(false);
        txtQuant4.setVisible(false);
        txtQuant5.setVisible(false);
        txtQuant6.setVisible(false);
        txtQuant7.setVisible(false);
        txtQuant8.setVisible(false);
        txtQuant9.setVisible(false);
        txtQuant10.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConcluir = new javax.swing.JButton();
        lblIngrediente4 = new javax.swing.JLabel();
        lblIngrediente1 = new javax.swing.JLabel();
        lblIngrediente2 = new javax.swing.JLabel();
        lblIngrediente3 = new javax.swing.JLabel();
        lblIngrediente5 = new javax.swing.JLabel();
        lblIngrediente6 = new javax.swing.JLabel();
        lblIngrediente7 = new javax.swing.JLabel();
        lblIngrediente8 = new javax.swing.JLabel();
        lblIngrediente9 = new javax.swing.JLabel();
        lblIngrediente10 = new javax.swing.JLabel();
        lblPreco1 = new javax.swing.JLabel();
        lblPreco2 = new javax.swing.JLabel();
        lblPreco3 = new javax.swing.JLabel();
        lblPreco4 = new javax.swing.JLabel();
        lblPreco5 = new javax.swing.JLabel();
        lblPreco10 = new javax.swing.JLabel();
        lblPreco9 = new javax.swing.JLabel();
        lblPreco8 = new javax.swing.JLabel();
        lblPreco7 = new javax.swing.JLabel();
        lblPreco6 = new javax.swing.JLabel();
        btnRem1 = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        btnRem2 = new javax.swing.JButton();
        btnRem3 = new javax.swing.JButton();
        btnAdd3 = new javax.swing.JButton();
        btnAdd4 = new javax.swing.JButton();
        btnRem4 = new javax.swing.JButton();
        btnRem5 = new javax.swing.JButton();
        btnAdd5 = new javax.swing.JButton();
        btnAdd6 = new javax.swing.JButton();
        btnRem6 = new javax.swing.JButton();
        btnRem7 = new javax.swing.JButton();
        btnAdd7 = new javax.swing.JButton();
        btnRem8 = new javax.swing.JButton();
        btnAdd8 = new javax.swing.JButton();
        btnRem9 = new javax.swing.JButton();
        btnAdd9 = new javax.swing.JButton();
        btnRem10 = new javax.swing.JButton();
        btnAdd10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtQuant1 = new javax.swing.JTextField();
        txtQuant2 = new javax.swing.JTextField();
        txtQuant3 = new javax.swing.JTextField();
        txtQuant4 = new javax.swing.JTextField();
        txtQuant5 = new javax.swing.JTextField();
        txtQuant6 = new javax.swing.JTextField();
        txtQuant7 = new javax.swing.JTextField();
        txtQuant8 = new javax.swing.JTextField();
        txtQuant9 = new javax.swing.JTextField();
        txtQuant10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDescricao = new javax.swing.JTextArea();
        lblNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adicionar ou remover itens");
        jLabel1.setToolTipText("");

        btnConcluir.setBackground(new java.awt.Color(255, 165, 24));
        btnConcluir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        lblIngrediente4.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente4.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente4.setText("Ingrediente4");

        lblIngrediente1.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente1.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente1.setText("Ingrediente1");

        lblIngrediente2.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente2.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente2.setText("Ingrediente2");
        lblIngrediente2.setToolTipText("");

        lblIngrediente3.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente3.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente3.setText("Ingrediente3");

        lblIngrediente5.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente5.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente5.setText("Ingrediente5");

        lblIngrediente6.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente6.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente6.setText("Ingrediente6");

        lblIngrediente7.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente7.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente7.setText("Ingrediente7");
        lblIngrediente7.setToolTipText("");

        lblIngrediente8.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente8.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente8.setText("Ingrediente8");

        lblIngrediente9.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente9.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente9.setText("Ingrediente9");

        lblIngrediente10.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblIngrediente10.setForeground(new java.awt.Color(255, 255, 255));
        lblIngrediente10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngrediente10.setText("Ingrediente10");

        lblPreco1.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco1.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco1.setText("Preço1");

        lblPreco2.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco2.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco2.setText("Preço2");

        lblPreco3.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco3.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco3.setText("Preço3");

        lblPreco4.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco4.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco4.setText("Preço4");

        lblPreco5.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco5.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco5.setText("Preço5");

        lblPreco10.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco10.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco10.setText("Preço10");

        lblPreco9.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco9.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco9.setText("Preço9");

        lblPreco8.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco8.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco8.setText("Preço8");

        lblPreco7.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco7.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco7.setText("Preço7");

        lblPreco6.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        lblPreco6.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco6.setText("Preço6");

        btnRem1.setBackground(new java.awt.Color(254, 92, 84));
        btnRem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem1.setText("-");
        btnRem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem1ActionPerformed(evt);
            }
        });

        btnAdd1.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd1.setText("+");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnAdd2.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd2.setText("+");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnRem2.setBackground(new java.awt.Color(254, 92, 84));
        btnRem2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem2.setText("-");
        btnRem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem2ActionPerformed(evt);
            }
        });

        btnRem3.setBackground(new java.awt.Color(254, 92, 84));
        btnRem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem3.setText("-");
        btnRem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem3ActionPerformed(evt);
            }
        });

        btnAdd3.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd3.setText("+");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        btnAdd4.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd4.setText("+");
        btnAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd4ActionPerformed(evt);
            }
        });

        btnRem4.setBackground(new java.awt.Color(254, 92, 84));
        btnRem4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem4.setText("-");
        btnRem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem4ActionPerformed(evt);
            }
        });

        btnRem5.setBackground(new java.awt.Color(254, 92, 84));
        btnRem5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem5.setText("-");
        btnRem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem5ActionPerformed(evt);
            }
        });

        btnAdd5.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd5.setText("+");
        btnAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd5ActionPerformed(evt);
            }
        });

        btnAdd6.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd6.setText("+");
        btnAdd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd6ActionPerformed(evt);
            }
        });

        btnRem6.setBackground(new java.awt.Color(254, 92, 84));
        btnRem6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem6.setText("-");
        btnRem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem6ActionPerformed(evt);
            }
        });

        btnRem7.setBackground(new java.awt.Color(254, 92, 84));
        btnRem7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem7.setText("-");
        btnRem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem7ActionPerformed(evt);
            }
        });

        btnAdd7.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd7.setText("+");
        btnAdd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd7ActionPerformed(evt);
            }
        });

        btnRem8.setBackground(new java.awt.Color(254, 92, 84));
        btnRem8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem8.setText("-");
        btnRem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem8ActionPerformed(evt);
            }
        });

        btnAdd8.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd8.setText("+");
        btnAdd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd8ActionPerformed(evt);
            }
        });

        btnRem9.setBackground(new java.awt.Color(254, 92, 84));
        btnRem9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem9.setText("-");
        btnRem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem9ActionPerformed(evt);
            }
        });

        btnAdd9.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd9.setText("+");
        btnAdd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd9ActionPerformed(evt);
            }
        });

        btnRem10.setBackground(new java.awt.Color(254, 92, 84));
        btnRem10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRem10.setText("-");
        btnRem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRem10ActionPerformed(evt);
            }
        });

        btnAdd10.setBackground(new java.awt.Color(2, 248, 148));
        btnAdd10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd10.setText("+");
        btnAdd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd10ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 0));

        txtQuant1.setEditable(false);
        txtQuant1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant1.setText("0");

        txtQuant2.setEditable(false);
        txtQuant2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant2.setText("0");

        txtQuant3.setEditable(false);
        txtQuant3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant3.setText("0");

        txtQuant4.setEditable(false);
        txtQuant4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant4.setText("0");

        txtQuant5.setEditable(false);
        txtQuant5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant5.setText("0");

        txtQuant6.setEditable(false);
        txtQuant6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant6.setText("0");

        txtQuant7.setEditable(false);
        txtQuant7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant7.setText("0");

        txtQuant8.setEditable(false);
        txtQuant8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant8.setText("0");

        txtQuant9.setEditable(false);
        txtQuant9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant9.setText("0");

        txtQuant10.setEditable(false);
        txtQuant10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuant10.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngrediente5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPreco4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(lblPreco3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRem1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuant1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRem2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuant2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnRem3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuant3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnRem4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuant4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRem5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngrediente10, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngrediente6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPreco10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConcluir)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnRem6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuant6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdd6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnRem10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuant10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdd10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRem9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRem8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRem7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRem1)
                            .addComponent(btnAdd1)
                            .addComponent(txtQuant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRem2)
                            .addComponent(btnAdd2)
                            .addComponent(txtQuant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRem3)
                            .addComponent(btnAdd3)
                            .addComponent(txtQuant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRem4)
                            .addComponent(btnAdd4)
                            .addComponent(txtQuant4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRem5)
                            .addComponent(btnAdd5)
                            .addComponent(txtQuant5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIngrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIngrediente2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIngrediente3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIngrediente4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIngrediente5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblIngrediente6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblIngrediente7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblIngrediente8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblIngrediente9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblIngrediente10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPreco6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRem6)
                                        .addComponent(btnAdd6)
                                        .addComponent(txtQuant6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPreco7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRem7)
                                        .addComponent(btnAdd7)))
                                .addComponent(txtQuant7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPreco8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRem8)
                                .addComponent(btnAdd8)
                                .addComponent(txtQuant8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPreco9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRem9)
                                .addComponent(btnAdd9)
                                .addComponent(txtQuant9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPreco10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRem10)
                                .addComponent(btnAdd10)
                                .addComponent(txtQuant10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConcluir)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        btnCancelar.setBackground(new java.awt.Color(255, 165, 24));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblDescricao.setEditable(false);
        lblDescricao.setBackground(new java.awt.Color(51, 51, 51));
        lblDescricao.setColumns(20);
        lblDescricao.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setLineWrap(true);
        lblDescricao.setRows(5);
        lblDescricao.setWrapStyleWord(true);
        lblDescricao.setAutoscrolls(false);
        lblDescricao.setBorder(null);
        lblDescricao.setCaretColor(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(lblDescricao);

        lblNome.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        // TODO add your handling code here:
        String texto = "";
        double valot = 0;
        if (quantidade1 != 0) {
            texto += " | " + quantidade1 + " - " + lblIngrediente1.getText() + "- R$" + (quantidade1 * valorAd.get(0) + " | ");
            valot += quantidade1 * valorAd.get(0);
        }
        if (quantidade2 != 0) {
            texto += " | " + quantidade2 + " - " + lblIngrediente2.getText() + "- R$" + (quantidade2 * valorAd.get(1) + " | ");
            valot += quantidade1 * valorAd.get(1);
        }
        if (quantidade3 != 0) {
            texto += " | " + quantidade3 + " - " + lblIngrediente3.getText() + "- R$" + (quantidade3 * valorAd.get(2) + " | ");
            valot += quantidade1 * valorAd.get(2);
        }
        if (quantidade4 != 0) {
            texto += " | " + quantidade4 + " - " + lblIngrediente4.getText() + "- R$" + (quantidade4 * valorAd.get(3) + " | ");
            valot += quantidade1 * valorAd.get(0);
        }
        if (quantidade5 != 0) {
            texto += " | " + quantidade5 + " - " + lblIngrediente5.getText() + "- R$" + (quantidade5 * valorAd.get(4) + " | ");
            valot += quantidade1 * valorAd.get(0);
        }
        if (quantidade6 != 0) {
            texto += " | " + quantidade6 + " - " + lblIngrediente6.getText() + "- R$" + (quantidade6 * valorAd.get(5) + " | ");
            valot += quantidade1 * valorAd.get(0);
        }
        if (quantidade7 != 0) {
            texto += " | " + quantidade7 + " - " + lblIngrediente7.getText() + "- R$" + (quantidade7 * valorAd.get(6) + " | ");
            valot += quantidade1 * valorAd.get(0);
        }
        if (quantidade8 != 0) {
            texto += " | " + quantidade8 + " - " + lblIngrediente8.getText() + "- R$" + (quantidade8 * valorAd.get(7) + " | ");
            valot += quantidade1 * valorAd.get(0);
        }
        if (quantidade9 != 0) {
            texto += " | " + quantidade9 + " - " + lblIngrediente9.getText() + "- R$" + (quantidade9 * valorAd.get(8) + " | ");
            valot += quantidade1 * valorAd.get(0);
        }
        if (quantidade10 != 0) {
            texto += " | " + quantidade10 + " - " + lblIngrediente10.getText() + "- R$" + (quantidade10 * valorAd.get(9) + " | ");
            valot += quantidade1 * valorAd.get(0);;
        }
        ItensPedido i = new ItensPedido(id, valor, valot, texto, nome);
        TelaDeCardapio.item.add(i);
        Object[] options = {"Sim", "Não"};
        int op = 0;
        op = JOptionPane.showOptionDialog(null, "Deseja continuar comprando", "Carrinho", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (op == 0) {
            JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
            this.dispose();
            TelaDeCardapio x = new TelaDeCardapio();
            x.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Item adicionado ao carrinho");
            TelaDeSacola x = new TelaDeSacola();
            x.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        TelaDeCardapio x = new TelaDeCardapio();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        quantidade1++;
        txtQuant1.setText("" + quantidade1);
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
        quantidade2++;
        txtQuant2.setText("" + quantidade2);
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:
        quantidade3++;
        txtQuant3.setText("" + quantidade3);
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd4ActionPerformed
        // TODO add your handling code here:
        quantidade4++;
        txtQuant4.setText("" + quantidade4);
    }//GEN-LAST:event_btnAdd4ActionPerformed

    private void btnAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd5ActionPerformed
        // TODO add your handling code here:
        quantidade5++;
        txtQuant5.setText("" + quantidade5);
    }//GEN-LAST:event_btnAdd5ActionPerformed

    private void btnAdd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd6ActionPerformed
        // TODO add your handling code here:
        quantidade6++;
        txtQuant6.setText("" + quantidade6);
    }//GEN-LAST:event_btnAdd6ActionPerformed

    private void btnAdd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd7ActionPerformed
        // TODO add your handling code here:
        quantidade7++;
        txtQuant7.setText("" + quantidade7);
    }//GEN-LAST:event_btnAdd7ActionPerformed

    private void btnAdd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd8ActionPerformed
        // TODO add your handling code here:
        quantidade8++;
        txtQuant8.setText("" + quantidade8);
    }//GEN-LAST:event_btnAdd8ActionPerformed

    private void btnAdd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd9ActionPerformed
        // TODO add your handling code here:
        quantidade9++;
        txtQuant9.setText("" + quantidade9);
    }//GEN-LAST:event_btnAdd9ActionPerformed

    private void btnAdd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd10ActionPerformed
        // TODO add your handling code here:
        quantidade10++;
        txtQuant10.setText("" + quantidade10);
    }//GEN-LAST:event_btnAdd10ActionPerformed

    private void btnRem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem1ActionPerformed
        // TODO add your handling code here:
        if (quantidade1 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade1--;
            txtQuant1.setText("" + quantidade1);
        }
    }//GEN-LAST:event_btnRem1ActionPerformed

    private void btnRem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem2ActionPerformed
        // TODO add your handling code here:
        if (quantidade2 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade2--;
            txtQuant2.setText("" + quantidade2);
        }
    }//GEN-LAST:event_btnRem2ActionPerformed

    private void btnRem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem3ActionPerformed
        // TODO add your handling code here:
        if (quantidade3 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade3--;
            txtQuant3.setText("" + quantidade3);
        }
    }//GEN-LAST:event_btnRem3ActionPerformed

    private void btnRem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem4ActionPerformed
        // TODO add your handling code here:
        if (quantidade4 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade4--;
            txtQuant4.setText("" + quantidade4);
        }
    }//GEN-LAST:event_btnRem4ActionPerformed

    private void btnRem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem5ActionPerformed
        // TODO add your handling code here:
        if (quantidade5 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade5--;
            txtQuant5.setText("" + quantidade5);
        }
    }//GEN-LAST:event_btnRem5ActionPerformed

    private void btnRem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem6ActionPerformed
        // TODO add your handling code here:
        if (quantidade6 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade6--;
            txtQuant6.setText("" + quantidade6);
        }
    }//GEN-LAST:event_btnRem6ActionPerformed

    private void btnRem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem7ActionPerformed
        // TODO add your handling code here:
        if (quantidade7 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade7--;
            txtQuant7.setText("" + quantidade7);
        }
    }//GEN-LAST:event_btnRem7ActionPerformed

    private void btnRem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem8ActionPerformed
        // TODO add your handling code here:
        if (quantidade8 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade8--;
            txtQuant8.setText("" + quantidade8);
        }
    }//GEN-LAST:event_btnRem8ActionPerformed

    private void btnRem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem9ActionPerformed
        // TODO add your handling code here:
        if (quantidade9 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade9--;
            txtQuant9.setText("" + quantidade9);
        }
    }//GEN-LAST:event_btnRem9ActionPerformed

    private void btnRem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRem10ActionPerformed
        // TODO add your handling code here:
        if (quantidade10 == 0) {
            JOptionPane.showOptionDialog(null, "Não é possivel diminuir mais", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        } else {
            quantidade10--;
            txtQuant10.setText("" + quantidade10);
        }
    }//GEN-LAST:event_btnRem10ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddRemIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddRemIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddRemIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddRemIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddRemIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd10;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnAdd4;
    private javax.swing.JButton btnAdd5;
    private javax.swing.JButton btnAdd6;
    private javax.swing.JButton btnAdd7;
    private javax.swing.JButton btnAdd8;
    private javax.swing.JButton btnAdd9;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnRem1;
    private javax.swing.JButton btnRem10;
    private javax.swing.JButton btnRem2;
    private javax.swing.JButton btnRem3;
    private javax.swing.JButton btnRem4;
    private javax.swing.JButton btnRem5;
    private javax.swing.JButton btnRem6;
    private javax.swing.JButton btnRem7;
    private javax.swing.JButton btnRem8;
    private javax.swing.JButton btnRem9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lblDescricao;
    private javax.swing.JLabel lblIngrediente1;
    private javax.swing.JLabel lblIngrediente10;
    private javax.swing.JLabel lblIngrediente2;
    private javax.swing.JLabel lblIngrediente3;
    private javax.swing.JLabel lblIngrediente4;
    private javax.swing.JLabel lblIngrediente5;
    private javax.swing.JLabel lblIngrediente6;
    private javax.swing.JLabel lblIngrediente7;
    private javax.swing.JLabel lblIngrediente8;
    private javax.swing.JLabel lblIngrediente9;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblPreco10;
    private javax.swing.JLabel lblPreco2;
    private javax.swing.JLabel lblPreco3;
    private javax.swing.JLabel lblPreco4;
    private javax.swing.JLabel lblPreco5;
    private javax.swing.JLabel lblPreco6;
    private javax.swing.JLabel lblPreco7;
    private javax.swing.JLabel lblPreco8;
    private javax.swing.JLabel lblPreco9;
    private javax.swing.JTextField txtQuant1;
    private javax.swing.JTextField txtQuant10;
    private javax.swing.JTextField txtQuant2;
    private javax.swing.JTextField txtQuant3;
    private javax.swing.JTextField txtQuant4;
    private javax.swing.JTextField txtQuant5;
    private javax.swing.JTextField txtQuant6;
    private javax.swing.JTextField txtQuant7;
    private javax.swing.JTextField txtQuant8;
    private javax.swing.JTextField txtQuant9;
    // End of variables declaration//GEN-END:variables
}
