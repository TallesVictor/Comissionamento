/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import view.CC;
import controller.Comissionamento;
/**
 *
 * @author Windows 7
 */
public class Produto {
private String nome ;
private Double valor ;
private Double tx;
private String categoria;
private Double valorc;

    public Produto(String nome, Double valor, Double tx, String categoria, Double valorc) {
        this.nome = nome;
        this.valor = valor;
        this.tx = tx;
        this.categoria = categoria;
        this.valorc = valorc;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTx() {
        return tx;
    }

    public void setTx(Double tx) {
        this.tx = tx;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getValorc() {
        return valorc;
    }

    public void setValorc(Double valorc) {
        this.valorc = valorc;
    }

  
}
   