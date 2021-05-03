/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import model.manterFuncionarioModel;
import view.ManterFuncionario;

/**
 *
 * @author biano
 */
public class Collection {
    private ArrayList<manterFuncionarioModel> manterFuncionarios;
    private static Collection Collection;

    public Collection(ArrayList<manterFuncionarioModel> manterFuncionarios) {
        if (manterFuncionarios != null){
            this.manterFuncionarios = manterFuncionarios;
        }
    }
    
    private Collection(){
        this.manterFuncionarios = new ArrayList<>();
    }
    
    public static Collection getcollection(){
        if (Collection == null){
            return Collection = new Collection ();
        } else {
            return Collection;
        }
    }
    
    public void inserirFuncionario(manterFuncionarioModel mFM){
        mFM.setId(manterFuncionarios.size());
        this.manterFuncionarios.add(mFM);
    }
    
}
