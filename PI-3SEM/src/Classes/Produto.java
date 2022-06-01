/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ruy_s
 */
public class Produto {

    private int id;
    private String nome;
    private int categoria;
    private double valor;
    private String descricao;
    private boolean adicional;

    public Produto() {
    }

    public Produto(int id) {
        this.id = id;
    }

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Produto(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Produto(String nome, int categoria, double valor, String descricao, boolean adicional) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.adicional = adicional;
    }

    public Produto(int id, String nome, int categoria, double valor, String descricao, boolean adicional) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.adicional = adicional;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAdicional() {
        return adicional;
    }

    public void setAdicional(boolean adicional) {
        this.adicional = adicional;
    }
}
