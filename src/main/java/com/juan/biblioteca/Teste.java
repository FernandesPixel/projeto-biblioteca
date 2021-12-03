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
public class Teste {
    public static void main(String[] args) {
        UsuarioComum usuario = new UsuarioComum("Juan", "41 99999-9999", "juan@email.com", "Juan", "senha");
        
        Autor autor = new Autor("Jorgin");
        Autor[] autores = {autor};
        Editora editora = new Editora("Editora 1", "editora_um@email.com", "Paraná");
        Obra obra = new Obra("Livro legal", autores, editora, 2020, 2.7, 7);
        
        if(Biblioteca.emprestar(usuario, obra)){
            System.out.println(usuario.toString());
            System.out.println("Empréstimo realizado com sucesso!");
        }else{
            System.out.println("O usuário "+usuario.getNome()+" não pode mais realizar empréstimos");
        }
        
    }
}
