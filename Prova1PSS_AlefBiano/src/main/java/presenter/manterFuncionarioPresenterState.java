/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;
import business.manterFuncionarioBusiness;

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
   //   mFP.removeListeners;
        mFP.getView().setEnabled(false);
        mFP.getView().getButtonEditar().setEnabled(false);
        mFP.getView().getButtonExcluir().setEnabled(false);
        mFP.getView().getButtonFechar().setEnabled(true);
        mFP.getView().getButtonSalvar().setEnabled(true);
        mFP.getView().getCheckFuncionarioDoMes().setEnabled(true);
        mFP.getView().getComboBonus().setEnabled(true);
        mFP.getView().getComboCargo().setEnabled(true);
        mFP.getView().getTexAdimissao().setText("");
        mFP.getView().getTexAdimissao().setEnabled(true);
        mFP.getView().getTexSalario().setText("");
        mFP.getView().getTexSalario().setEnabled(true);
        mFP.getView().getTextIdade().setText("");
        mFP.getView().getTextIdade().setEnabled(true);
        mFP.getView().getTextNome().setText("");
        mFP.getView().getTextNome().setEnabled(true);
        mFP.getView().getTextFaltas().setText("");
        mFP.getView().getTextFaltas().setEnabled(true);
        mFP.getView().setEnabled(true);
        
    }
    @Override
    public void salvar(){
        new SalvarCommand().executar(mFP);
        //mFP dentro de salvar não reconhece o método setEstado
        mFP.setEstado (VisualizacaoState (mFP));
    }
    @Override
    public void fechar(){
    }
    
}

class VisualizacaoState extends manterFuncionarioPresenterState{
    
    public VisualizacaoState(manterFuncionarioPresenter mFP) {
        super(mFP);
        mFP.removeListeners();
        mFP.getView().setEnabled(false);
        mFP.getView().getButtonEditar().setEnabled(true);
        mFP.getView().getButtonExcluir().setEnabled(true);
        mFP.getView().getButtonFechar().setEnabled(true);
        mFP.getView().getButtonSalvar().setEnabled(false);
        mFP.getView().getCheckFuncionarioDoMes().setEnabled(false);
        mFP.getView().getComboBonus().setEnabled(false);
        mFP.getView().getComboCargo().setEnabled(false);
        mFP.getView().getTexAdimissao().setEnabled(false);
        mFP.getView().getTexSalario().setEnabled(false);
        mFP.getView().getTextIdade().setEnabled(false);
        mFP.getView().getTextNome().setEnabled(false);
        mFP.getView().getTextFaltas().setEnabled(false);
        mFP.getView().setEnabled(true);
    }
    @Override
    public void fechar(){
    
    }
    @Override
    public void editar() {
        //mFP não reconhece o setEstado
        //já reconhece, troquei pra public
        mFP.setEstado(new EdicaoState(mFP));
    }
    
    @Override
    public void excluir(){
    //fazer pergunta se quer excluir mesmo ou não
    // var excluir tem a resposta true ou false
    if (excluir) {
            new ExcluirCommand().executar(mFP);
            mFP.getView().dispose();
        } else {
            mFP.setEstado(new VisualizacaoState(mFP));
        }
    }
}

class EdicaoState extends manterFuncionarioPresenterState{

    public EdicaoState (manterFuncionarioPresenter mFP) {
        super(mFP);
        mFP.removeListeners();
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







































//////////////////////////////////////////////////////
///public class abstract manterFuncionarioPresenterState {
//    private manterFuncionarioPresenter presenter;
//
//    public manterFuncionarioPresenterState(manterFuncionarioPresenter presenter) {
//        this.presenter = presenter;
//    }
//    
//    public void salvar(){
//        throw new RuntimeException("Não é possivel salvar neste estado.");
//    }
//    public void editar(){
//        throw new RuntimeException("Não é possivel editar neste estado.");
//    }
//    public void excluir(){
//        throw new RuntimeException("Não é possivel excluir neste estado.");
//    }
//    public void fechar(){
//    throw new RuntimeException("Não é possivel fechar neste estado.");
//    }
//    
//}
//
//class InclusaoState extends manterFuncionarioPresenterState{
//
//    public InclusaoState(manterFuncionarioPresenter presenter) {
//        super(presenter);
//    } 
//    @Override
//    public void salvar(){
//    }
//    @Override
//    public void fechar(){
//    }
//    
//}
//
//class VisualizacaoState extends manterFuncionarioPresenterState{
//    
//    public VisualizacaoState(manterFuncionarioPresenter presenter) {
//        super(presenter);
//    }
//    @Override
//    public void fechar(){
//    }
//}
//
//class EdicaoState extends manterFuncionarioPresenterState{
//
//    public EdicaoState (manterFuncionarioPresenter presenter) {
//        super(presenter);
//    }
//    @Override
//    public void salvar(){
//    }
//    @Override
//    public void fechar(){
//    }
//    @Override
//    public void editar(){
//    }
//    @Override
//    public void excluir(){
//    }
//}
