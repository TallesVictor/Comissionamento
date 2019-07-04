/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Produto;
import view.CC;

/**
 *
 * @author Windows 7
 */
public class Comissionamento {

    public static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarCc();
    }

    public static void mostrarCc() {
        CC c = new CC();
        c.setTitle("Comissao");
        c.setLocationRelativeTo(null);
        c.setVisible(true);

    }

    public static void adicionarProduto(Produto p) {
        listaProduto.add(p);
    }

    public static ArrayList<Produto> buscarTodos() {
        return listaProduto;
    }

    public static void excluirUsuario(Produto p) {
        listaProduto.remove(p);
    }

}

