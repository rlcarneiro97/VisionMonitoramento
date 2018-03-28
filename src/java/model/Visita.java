/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import javax.persistence.Column;
//import javax.persistence.Embedded;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rafael
 */
@Entity
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private int idade;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    //@Column(name = "imagem")
    //private String imagem;

    //@Embedded
    //private EnderecoVisita enderecoVisita;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    /*
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public EnderecoVisita getEnderecoVisita() {
        return enderecoVisita;
    }

    public void setEnderecoVisita(EnderecoVisita enderecoVisita) {
        this.enderecoVisita = enderecoVisita;
    }

     */
}
