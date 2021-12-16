/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author juann
 */
public class Biblioteca {

    private static Usuario[] listaUsuarios = {};
    private static Obra[] listaObras = {};

    public Usuario[] getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(Usuario[] listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Obra[] getListaObras() {
        return listaObras;
    }

    public void setListaObras(Obra[] listaObras) {
        this.listaObras = listaObras;
    }

    public static void adicionarObra(Obra obra) {
        ArrayList<Obra> obras = new ArrayList<>(Arrays.asList(listaObras));
        obras.add(obra);
        listaObras = new Obra[obras.size()];
        listaObras = obras.toArray(listaObras);
    }

    public static void removerObra(Obra obra) {
        ArrayList<Obra> obras = new ArrayList<>(Arrays.asList(listaObras));
        obras.remove(obra);
        listaObras = new Obra[obras.size()];
        listaObras = obras.toArray(listaObras);
    }

    public static void adicionarUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = new ArrayList<>(Arrays.asList(listaUsuarios));
        usuarios.add(usuario);
        listaUsuarios = new Usuario[usuarios.size()];
        listaUsuarios = usuarios.toArray(listaUsuarios);
    }

    public static void removerUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = new ArrayList<>(Arrays.asList(listaUsuarios));
        usuarios.remove(usuario);
        listaUsuarios = new Usuario[usuarios.size()];
        listaUsuarios = usuarios.toArray(listaUsuarios);
    }

    public static boolean emprestar(Usuario usuario, Obra obra) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(usuario, obra);
        if (emprestimos.size() < usuario.getMaxEmprestimos()) {
            emprestimos.add(emprestimo);
            Emprestimo[] listaEmprestimos = new Emprestimo[emprestimos.size()];
            usuario.setListaEmprestimos(emprestimos.toArray(listaEmprestimos));
            return true;
        }
        return false;
    }

    public static void devolver(Usuario usuario, Obra obra) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        Emprestimo emprestimo = Emprestimo.procurarEmprestimo(usuario, obra);
        emprestimos.addAll(Arrays.asList(usuario.getListaEmprestimos()));
        emprestimos.remove(emprestimo);
        Emprestimo[] listaEmprestimos = new Emprestimo[emprestimos.size()];
        usuario.setListaEmprestimos(emprestimos.toArray(listaEmprestimos));
    }

    public static void reservar(Usuario usuario, Obra obra) {

    }

    public static void renovar(Usuario usuario, Obra obra) {

    }

    public static void punirAtraso() {

    }

    public static void limparReservas() {

    }

    @Override
    public String toString() {
        String usuarios = "";
        for (Usuario usuario : listaUsuarios) {
            if(usuario != null){
                usuarios += " " + usuario.getNome() + ", ";
            }
        }

        String obras = "";
        for (Obra obra : listaObras) {
            if (obra != null) {
                obras += " " + obra.getTitulo() + ", ";
            }
        }

        return "Biblioteca{listaUsuario[" + usuarios + "] listaObras[" + obras + "]}";
    }
}
