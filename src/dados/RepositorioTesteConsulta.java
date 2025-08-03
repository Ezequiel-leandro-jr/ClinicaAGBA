package dados;


import java.util.ArrayList;
import java.util.List;
import negocio.Consulta;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class RepositorioTesteConsulta {
    private ArrayList<Consulta> array_consulta;
    
    public RepositorioTesteConsulta(){
        this.array_consulta = new ArrayList<Consulta>();
    }
    
    public void adicionar(Consulta consulta){
        array_consulta.add(consulta);
    }
    
    public void remover(Consulta consulta){
        array_consulta.remove(consulta);
    }
    
    public void atualizar(Consulta consulta, Consulta consulta_atualizada){
        int index = array_consulta.indexOf(consulta);
        array_consulta.set(index, consulta);
    }
    
    public Consulta buscar(Consulta consulta){
        int index = array_consulta.indexOf(consulta);
        consulta = array_consulta.get(index);
        return consulta;
    }
    
    public void listar(){
        for (int i = 0; i < array_consulta.size(); i++){
            Consulta consulta = array_consulta.get(i);
            System.out.println(consulta);
        }
    }
    
}

