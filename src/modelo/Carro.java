package modelo;

import anotações.Coluna;
import anotações.Tabela;


@Tabela(nome = "Carros")
public class Carro {

 @Coluna(nome = "id", tipo = "INT")
 private int id;

 @Coluna(nome = "modelo", tipo = "VARCHAR(255)")
 private String modelo;

 @Coluna(nome = "marca", tipo = "VARCHAR(255)")
 private String marca;

 @Coluna(nome = "ano", tipo = "INT")
 private int ano;

 @Coluna(nome = "preco", tipo = "DOUBLE")
 private double preco;


 public Carro() {
 }


 public Carro(int id, String modelo, String marca, int ano, double preco) {
     this.id = id;
     this.modelo = modelo;
     this.marca = marca;
     this.ano = ano;
     this.preco = preco;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getModelo() {
     return modelo;
 }

 public void setModelo(String modelo) {
     this.modelo = modelo;
 }

 public String getMarca() {
     return marca;
 }

 public void setMarca(String marca) {
     this.marca = marca;
 }

 public int getAno() {
     return ano;
 }

 public void setAno(int ano) {
     this.ano = ano;
 }

 public double getPreco() {
     return preco;
 }

 public void setPreco(double preco) {
     this.preco = preco;
 }
 
}
