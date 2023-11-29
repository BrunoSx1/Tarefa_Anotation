package br.com.bs;

import java.lang.reflect.Field;

import anotações.Coluna;
import anotações.Tabela;
import modelo.Carro;

public class Main {
 public static void main(String[] args) {
     Carro meuCarro = new Carro();
     meuCarro.setId(1);
     meuCarro.setModelo("Civic");
     meuCarro.setMarca("Honda");
     meuCarro.setAno(2022);
     meuCarro.setPreco(80000.0);

     Tabela tabela = Carro.class.getAnnotation(Tabela.class);
     if (tabela != null) {
         System.out.println("Nome da Tabela: " + tabela.nome());
     }

     Field[] campos = Carro.class.getDeclaredFields();
     for (Field campo : campos) {
         Coluna coluna = campo.getAnnotation(Coluna.class);
         if (coluna != null) {
             System.out.println("Nome da Coluna: " + coluna.nome());
             System.out.println("Tipo da Coluna: " + coluna.tipo());
         }
     }

     System.out.println("ID: " + meuCarro.getId());
     System.out.println("Modelo: " + meuCarro.getModelo());
     System.out.println("Marca: " + meuCarro.getMarca());
     System.out.println("Ano: " + meuCarro.getAno());
     System.out.println("Preço: " + meuCarro.getPreco());
 }
}
