/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import business.ManterFuncionarioBusiness;
import model.manterFuncionarioModel;
import view.ManterFuncionario;
/**
 *
 * @author biano
 */
public class manterFuncionarioPresenter{
    private ManterFuncionario view;
    private manterFuncionarioPresenterState estado;
    private ManterFuncionario mF;

    public manterFuncionarioPresenter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ManterFuncionario getView() {
        return view;
    }

    public manterFuncionarioPresenterState getEstado() {
        return estado;
    }

    public ManterFuncionario getmFuncionario() {
        return mF;
    }
    
    public manterFuncionarioPresenter (ManterFuncionario mF){
        if (mF != null) {
            this.estado = new VisualizacaoState(this); 
        } else {
            this.estado = new InclusaoState(this);
        }
    }
    
    public void salvar(){
	estado.salvar();
        
    }
    public void editar(){
	estado.editar();
    }
    public void excluir(){
	estado.excluir();
    }
    public void fechar(){
        estado.fechar();
    }
    
    
   public void setEstado(manterFuncionarioPresenterState estado) {this.estado = estado;}
   
  
   
   public static class Inserir{
       ManterFuncionarioBusiness mFB = new ManterFuncionarioBusiness();
       
       public Inserir(ManterFuncionario mF) throws Exception{
           manterFuncionarioModel func = new manterFuncionarioModel();
           var cargoInserir = ManterFuncionario.getComboCargo().getSelectedItem().toString();
           var nomeInserir = ManterFuncionario.getTextNome().getText();
           var bonusInserir = ManterFuncionario.getComboBonus().getSelectedItem().toString();
           var faltaInserir = ManterFuncionario.getTextFaltas().getText(); 
           var idadeInserir = ManterFuncionario.getTextIdade().getText();
           var salarioInserir = ManterFuncionario.getTexSalario().getText();
           var admissaoInserir = ManterFuncionario.getTexAdimissao().getText();
           var funcionarioDoMesInserir =  ManterFuncionario.getCheckFuncionarioDoMes().isSelected();
          
          //PUXAR A VALIDAÇÃO DA BUSINESS!!!!
          func.setCargo(cargoInserir);
          func.setNome(nomeInserir);
          func.setBonus(bonusInserir);
          func.setFalta(faltaInserir);
          func.setIdade(idadeInserir);
          func.setSalario(salarioInserir);
          func.setAdmissao(admissaoInserir);
          func.setFuncionarioDoMes(funcionarioDoMesInserir);
          mFB.validarFuncionario(func);
           collection.Collection.getcollection().inserirFuncionario(func);
           
       }

   }
    
}





	
