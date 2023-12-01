package br.com.bs;

import java.lang.reflect.Field;

import anotações.Coluna;
import anotações.Tabela;
import modelo.Carro;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Carro
        Carro meuCarro = new Carro();
        meuCarro.setId(1);
        meuCarro.setModelo("Civic");
        meuCarro.setMarca("Honda");
        meuCarro.setAno(2022);
        meuCarro.setPreco(80000.0);

        // Obtendo a anotação da tabela
        Tabela tabela = Carro.class.getAnnotation(Tabela.class);
        if (tabela != null) {
            System.out.println("Nome da Tabela: " + tabela.nome());
        }

        // Utilizando reflexão para obter as anotações das colunas
        Field[] campos = Carro.class.getDeclaredFields();
        for (Field campo : campos) {
            Annotation[] anotacoes = campo.getDeclaredAnnotations();
            for (Annotation anotacao : anotacoes) {
                if (anotacao.annotationType().equals(Coluna.class)) {
                    Coluna coluna = (Coluna) anotacao;
                    System.out.println("Nome da Coluna: " + coluna.nome());
                    System.out.println("Tipo da Coluna: " + coluna.tipo());
                }
            }
        }

        // Utilizando reflexão para obter anotação da tabela em tempo de execução
        Annotation[] anotacoesClasse = Carro.class.getAnnotations();
        for (Annotation anotacao : anotacoesClasse) {
            if (anotacao.annotationType().equals(Tabela.class)) {
                Tabela anotacaoTabela = (Tabela) anotacao;
                System.out.println("Nome da Tabela: " + anotacaoTabela.nome());
            }
        }

        // Imprimindo os dados do carro
        System.out.println("ID: " + meuCarro.getId());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Preço: " + meuCarro.getPreco());
    }
}