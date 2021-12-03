/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author juann
 */
public class Biblioteca {

    private Usuario[] listaUsuarios;
    private Obra[] listaObras;

    public static boolean emprestar(Usuario usuario, Obra obra) {
        Emprestimo[] emprestimos = usuario.getListaEmprestimos();
        Emprestimo emprestimo = new Emprestimo(usuario,obra);
        for(int i =0;i<emprestimos.length;i++){
            if(emprestimos[i] == null){
                emprestimos[i] = emprestimo;
                usuario.setListaEmprestimos(emprestimos);
                return true;
            }
        }
        return false;
    }

    public static void devolver(Usuario usuario, Obra obra) {

    }

    public static void reservar(Usuario usuario, Obra obra) {

    }

    public static void renovar(Usuario usuario, Obra obra) {

    }

    public static void punirAtraso() {

    }

    public static void limparReservas() {

    }

}
