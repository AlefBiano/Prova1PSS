/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import business.ManterFuncionarioBusiness;
import java.time.LocalDate;

/**
 *
 * @author biano
 */
public class manterFuncionarioModel {
    //seguir ordem da tela
    private int id;
    private String cargo;
    private String nome;
    private String bonus;
    private String falta;
    private String idade;
    private String salario;    
    private LocalDate admissao;
    private boolean funcionarioDoMes;   
    //troquei falta, idade e salario pra string por conta da validarFuncionario na business

    public manterFuncionarioModel(int id, String cargo, String nome, String bonus, String falta, String idade, String salario, LocalDate admissao, boolean funcionarioDoMes) {
        this.id = id;
        this.cargo = cargo;
        this.nome = nome;
        this.bonus = bonus;
        this.falta = falta;
        this.idade = idade;
        this.salario = salario;
        this.admissao = admissao;
        this.funcionarioDoMes = funcionarioDoMes;
    }

    public manterFuncionarioModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void admissaoInserir(String admissaoInserir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAdmissao(String admissaoInserir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
   
    
    
}
