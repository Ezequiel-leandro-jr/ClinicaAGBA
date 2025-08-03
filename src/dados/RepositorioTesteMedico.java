package dados;


import java.util.ArrayList;
import java.util.List;
import negocio.Medico;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class RepositorioTesteMedico {
    private ArrayList<Medico> array_medico;
    
    public RepositorioTesteMedico(){
        this.array_medico = new ArrayList<Medico>();
    }
    
    public void adicionar(Medico medico){
        array_medico.add(medico);
    }
    
    public void remover(Medico medico){
        array_medico.remove(medico);
    }
    
    public void atualizar(Medico medico, Medico medico_atualizado){
        int index = array_medico.indexOf(medico);
        array_medico.set(index, medico_atualizado);
    }
    
    public Medico buscar(Medico medico){
        int index = array_medico.indexOf(medico);
        medico = array_medico.get(index);
        return medico;
    }
    
    public void listar(){
        for (int i = 0; i < array_medico.size(); i++){
            Medico medico = array_medico.get(i);
            System.out.println(medico);
        }
    }
    
}

