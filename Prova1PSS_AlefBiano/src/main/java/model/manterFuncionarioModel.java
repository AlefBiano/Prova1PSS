/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author biano
 */
public class manterFuncionarioModel {
    //seguir ordem da tela
    private String cargo;
    private String nome;
    private String bonus;
    private String falta;
    private String idade;
    private String salario;    
    private LocalDate admissao;
    private boolean funcionarioDoMes;   
    //troquei falta, idade e salario pra string por conta da validarFuncionario na business

    public manterFuncionarioModel(String cargo, String nome, String bonus, String falta, String idade, String salario, LocalDate admissao, boolean funcionarioDoMes) {
        this.cargo = cargo;
        this.nome = nome;
        this.bonus = bonus;
        this.falta = falta;
        this.idade = idade;
        this.salario = salario;
        this.admissao = admissao;
        this.funcionarioDoMes = funcionarioDoMes;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public boolean isFuncionarioDoMes() {
        return funcionarioDoMes;
    }

    public void setFuncionarioDoMes(boolean funcionarioDoMes) {
        this.funcionarioDoMes = funcionarioDoMes;
    }
    
    
   
    
    
}
