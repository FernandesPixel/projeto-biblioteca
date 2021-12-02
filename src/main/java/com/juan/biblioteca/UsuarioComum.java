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
public class UsuarioComum extends Usuario{

    public UsuarioComum(String nome, String numCelular,String email,String login, String senha) {
        super(nome, numCelular, email, login, senha);
        setMaxEmprestimos(5);
        listaEmprestimos = new Emprestimo[getMaxEmprestimos()];
    }
    
}
