/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import model.buscarFuncionarioModel;

/**
 *
 * @author biano
 */
public class BuscarFuncionarioBusiness {
    
    public BuscarFuncionarioBusiness(){
    }
    public void buscarFuncionario(buscarFuncionarioModel buscarFuncionario)throws Exception{
    this.validarBusca(buscarFuncionario);
    }
    
    private void validarBusca(buscarFuncionarioModel buscarFuncionario)throws Exception{
        if (buscarFuncionario.getNome()== null){
            throw new Exception ("Por favor, informe o nome do funcionário.");
        }
    }
}
