/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.biblioteca;

/**
 *
 * @author juann
 */
public class UsuarioEspecial extends Usuario{

    public UsuarioEspecial(String nome, String numCelular,String email,String login, String senha) {
        super(nome, numCelular, email, login, senha);
        setMaxEmprestimos(10);
        listaEmprestimos = new Emprestimo[getMaxEmprestimos()];
    }
    
}
