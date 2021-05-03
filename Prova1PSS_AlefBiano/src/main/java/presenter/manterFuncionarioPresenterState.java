/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import view.ManterFuncionario;

/**
 *
 * @author biano
 */

public class manterFuncionarioPresenterState {
    public  manterFuncionarioPresenter mFP;

    public manterFuncionarioPresenterState(manterFuncionarioPresenter mFP){
        this.mFP = mFP;
    }
    
    public void salvar(){
        try{
        } catch(Exception e){
        throw new RuntimeException("Não é possivel salvar neste estado.");}
    }
    public void editar(){
        throw new RuntimeException("Não é possivel editar neste estado.");
    }
    public void excluir(){
        throw new RuntimeException("Não é possivel excluir neste estado.");
    }
    public void fechar(){
    throw new RuntimeException("Não é possivel fechar neste estado.");
    }
    
    public void cancelar (){
      //new CancelarCommand().executar(mFP);
    }
    
}

class InclusaoState extends manterFuncionarioPresenterState{

    public InclusaoState(manterFuncionarioPresenter mFP) {
        super(mFP);
        mFP.getView().setEnabled(false);
        mFP.getView().getButtonEditar().setEnabled(true);
        mFP.getView().getButtonExcluir().setEnabled(false);
        mFP.getView().getButtonFechar().setEnabled(true);
        mFP.getView().getButtonSalvar().setEnabled(true);
        ManterFuncionario.getCheckFuncionarioDoMes().setEnabled(true);
        ManterFuncionario.getComboBonus().setEnabled(true);
        ManterFuncionario.getComboCargo().setEnabled(true);
        ManterFuncionario.getTexAdimissao().setText("");
        ManterFuncionario.getTexAdimissao().setEnabled(true);
        ManterFuncionario.getTexSalario().setText("");
        ManterFuncionario.getTexSalario().setEnabled(true);
        ManterFuncionario.getTextIdade().setText("");
        ManterFuncionario.getTextIdade().setEnabled(true);
        ManterFuncionario.getTextNome().setText("");
        ManterFuncionario.getTextNome().setEnabled(true);
        ManterFuncionario.getTextFaltas().setText("");
        ManterFuncionario.getTextFaltas().setEnabled(true);
        mFP.getView().setEnabled(true);
        
    }
    @Override
    public void salvar(){
//        mFP.setEstado(VisualizacaoState(mFP));
    }
    @Override
    public void fechar(){
    }

    
    
}

class VisualizacaoState extends manterFuncionarioPresenterState{
    
    public VisualizacaoState(manterFuncionarioPresenter mFP) {
        super(mFP);
        mFP.getView().setEnabled(false);
        mFP.getView().getButtonEditar().setEnabled(true);
        mFP.getView().getButtonExcluir().setEnabled(true);
        mFP.getView().getButtonFechar().setEnabled(true);
        mFP.getView().getButtonSalvar().setEnabled(false);
        ManterFuncionario.getCheckFuncionarioDoMes().setEnabled(false);
        ManterFuncionario.getComboBonus().setEnabled(false);
        ManterFuncionario.getComboCargo().setEnabled(false);
        ManterFuncionario.getTexAdimissao().setEnabled(false);
        ManterFuncionario.getTexSalario().setEnabled(false);
        ManterFuncionario.getTextIdade().setEnabled(false);
        ManterFuncionario.getTextNome().setEnabled(false);
        ManterFuncionario.getTextFaltas().setEnabled(false);
        mFP.getView().setEnabled(true);
    }
    @Override
    public void fechar(){
    
    }
    @Override
    public void editar() {
        mFP.setEstado(new EdicaoState(mFP));
    }
    
    @Override
    public void excluir(){
    
    }
}

class EdicaoState extends manterFuncionarioPresenterState{

    public EdicaoState (manterFuncionarioPresenter mFP) {
        super(mFP);
        mFP.getView().setEnabled(false);
        mFP.getView().getButtonEditar().setEnabled(false);
        mFP.getView().getButtonExcluir().setEnabled(false);
        mFP.getView().getButtonFechar().setEnabled(true);
        mFP.getView().getButtonSalvar().setEnabled(true);
        mFP.getView().getCheckFuncionarioDoMes().setEnabled(true);
        mFP.getView().getComboBonus().setEnabled(true);
        mFP.getView().getComboCargo().setEnabled(true);
        //puxar dados do banco
        mFP.getView().getTexAdimissao().setEnabled(true);
        mFP.getView().getTexSalario().setEnabled(true);
        mFP.getView().getTextIdade().setEnabled(true);
        mFP.getView().getTextNome().setEnabled(true);
        mFP.getView().getTextFaltas().setEnabled(true);
        mFP.getView().setEnabled(true);
    }
    @Override
    public void salvar(){
    }
    @Override
    public void fechar(){
    }
    @Override
    public void editar(){
    }
    @Override
    public void excluir(){
    }
}

