package dados;


import java.util.ArrayList;
import java.util.List;
import negocio.Consulta;
import negocio.Paciente;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class RepositorioTestePaciente {
    private ArrayList<Paciente> array_paciente;
    
    public RepositorioTestePaciente(){
        this.array_paciente = new ArrayList<Paciente>();
    }
    
    public void adicionar(Paciente paciente){
        array_paciente.add(paciente);
    }
    
    public void atualizar(Paciente paciente, Paciente paciente_atualizado){
        int index = array_paciente.indexOf(paciente);
        array_paciente.set(index, paciente_atualizado);
    }
    
    public Paciente buscar(Paciente paciente){
        int index = array_paciente.indexOf(paciente);
        paciente = array_paciente.get(index);
        return paciente;
    }
    
    public void listar(){
        for (int i = 0; i < array_paciente.size(); i++){
            Paciente paciente = array_paciente.get(i);
            System.out.println(paciente);
        }
    }
    
    public void remover(Paciente paciente){
        array_paciente.remove(paciente);
    }
}

