/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import model.manterFuncionarioModel;

/**
 *
 * @author biano
 */
public class manterFuncionarioBusiness {

    public manterFuncionarioBusiness() {
    }
    public void salvarFuncionario(manterFuncionarioModel manterFuncionario)throws Exception{
    this.validarFuncionario(manterFuncionario);
    //lembrar de puxar inserção
    }
    
    
    private void validarFuncionario(manterFuncionarioModel manterFuncionario) throws Exception{
        
        if (manterFuncionario.getNome()== null){
            throw new Exception ("Por favor, informe o nome do funcionário.");
        }
        
        if (manterFuncionario.getFalta()== null){
            throw new Exception ("Por favor, informe o número de faltas do funcionário.");
        }
        
        if (manterFuncionario.getIdade()== null){
            throw new Exception ("Por favor, informe a idade do funcionário.");
        }
        
        if (manterFuncionario.getSalario()== null){
            throw new Exception ("Por favor, informe o salário do funcionário.");
        }
        
        if (manterFuncionario.getAdmissao()== null){
            throw new Exception ("Por favor, informe a data de admissão do funcionário.");
        }
    }
            
            
}
