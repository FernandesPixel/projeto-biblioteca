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
public class Teste {

    public static void main(String[] args) {
        UsuarioComum usuario = new UsuarioComum("Juan", "41 99999-9999", "juan@email.com", "Juan", "senha");
        UsuarioComum usuario2 = new UsuarioComum("Juan2", "41 99999-9999", "juan@email.com", "Juan", "senha");
        UsuarioEspecial usuario3 = new UsuarioEspecial("Juan3", "41 99999-9999", "juan@email.com", "Juan", "senha");

        /*
        for(Usuario usuario1:biblioteca.getListaUsuarios()){
            System.out.println("Usuario: "+usuario1.getNome());
        }
         */
 /*
        UsuarioComum user1 = new UsuarioComum("User1", "41 99999-9999", "user1@email.com", "user1", "senha1");
        for(Usuario usuario1:biblioteca.getListaUsuarios()){
            System.out.println("Usuario: "+usuario1.getNome());
        }
        UsuarioComum user2 = new UsuarioComum("User2", "41 99999-9999", "user2@email.com", "user2", "senha2");
        for(Usuario usuario1:biblioteca.getListaUsuarios()){
            System.out.println("Usuario: "+usuario1.getNome());
        }
        UsuarioEspecial user3 = new UsuarioEspecial("User3", "41 99999-9999", "user3@email.com", "user3", "senha3");
        for(Usuario usuario1:biblioteca.getListaUsuarios()){
            System.out.println("Usuario: "+usuario1.getNome());
        }
         */
        Autor autor = new Autor("Jorgin");
        Autor[] autores = {autor};
        Editora editora = new Editora("Editora 1", "editora_um@email.com", "Paraná");
        Obra obra1 = new Obra("Livro teste1", autores, editora, 2018, 1, 2.7, 7);
        Biblioteca biblioteca = new Biblioteca();
        /*
        for(Obra obra5:biblioteca.getListaObras()){
            System.out.println("obra: "+obra5);
        }
        Obra obra = new Obra("Livro legal", autores, editora, 2020, 2.7, 7);
        for(Obra obra5:biblioteca.getListaObras()){
            System.out.println("obra: "+obra5);
        }
         */

        if (Usuario.podeEmprestar(usuario)) {
            if (Biblioteca.emprestar(usuario, obra1)) {
                System.out.println(usuario.toString());
                System.out.println("Empréstimo realizado com sucesso!");
                System.out.println("Unidades disponíveis: "+obra1.getQtdExemplares());
                System.out.println("ListaEmprestimo: "+usuario.getListaEmprestimos());
            }else{
                System.out.println("Não há mais unidades do livro "+obra1.getTitulo());
                System.out.println("Unidades disponíveis: "+obra1.getQtdExemplares());
            }
        } else {
            System.out.println("O usuário " + usuario.getNome() + " não pode mais realizar empréstimos");
        }

        if (Usuario.podeEmprestar(usuario2)) {
            if (Biblioteca.emprestar(usuario2, obra1)) {
                System.out.println(usuario2.toString());
                System.out.println("Empréstimo realizado com sucesso!");
                System.out.println("Unidades disponíveis: "+obra1.getQtdExemplares());
            }else{
                System.out.println("Não há mais unidades do livro "+obra1.getTitulo());
                System.out.println("Unidades disponíveis: "+obra1.getQtdExemplares());
            }
        } else {
            System.out.println("O usuário " + usuario.getNome() + " não pode mais realizar empréstimos");
        }

        /*
        System.out.println("Devolvendo Livro");
        Biblioteca.devolver(usuario, obra1);
        System.out.println(usuario.toString());
        System.out.println(biblioteca.toString());
        */

        System.out.println(biblioteca.toString());
        Biblioteca.removerUsuario(usuario);
        Biblioteca.removerObra(obra1);
        System.out.println(biblioteca.toString());

    }
}
