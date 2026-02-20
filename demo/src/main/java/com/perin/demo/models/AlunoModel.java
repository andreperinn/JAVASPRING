package com.perin.demo.models;

import jakarta.persistence.*;

@Entity //CRIA NOSSA ENTIDADE NO BANCO
@Table(name = "TBL_ALUNO") // ADICIONA UM NOME PERSONALIZADO NO NOME DA TABELA
public class AlunoModel {

    @Id //GERA A CHAVE PRIMARIA NO BANCO DE DADOS
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GERA O ID AUTOMATICAMENTE
    private Long id;
    //CRIAR ATRIBUTO NOME NO BANVCO
    private String nome;
    private String cpf;
    private String email;

    public AlunoModel(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
