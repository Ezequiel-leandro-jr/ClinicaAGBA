/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import dados.*;
import negocio.Consulta;
import negocio.Medico;
import negocio.Paciente;
import negocio.Pessoa;
import negocio.Usuario;
/**
 *
 * @author lucas
 */
public class Teste {
    public static void main(String[] args) {
        
        // testes das entidades
        System.out.println("#### Teste das Entidades ####");
        Usuario usuario = new Usuario("usuario_teste", "123");
        System.out.println(usuario);
        
        
        Pessoa pessoa = new Pessoa("Pessoa", " de Teste", "14/12/2000", "Masculino", "(81)98888-7458", "pessoa.teste@email.com");
        System.out.println(pessoa);
        
        
        Paciente paciente = new Paciente("Paciente", " de Teste", "14/12/2000", "Masculino", "(81)98888-7458", "pessoa.teste@email.com", "111.156.321-87");
        System.out.println(paciente);
        Paciente paciente_2 = new Paciente("Pessoa", " de Teste Dois", "14/12/2000", "Masculino", "(81)98888-7458", "pessoa.teste@email.com", "111.156.321-87");

        
        Medico medico = new Medico(2, "Médico", " de Teste", "14/10/1990", "Feminino", "123PE", "Pediatria", "medico.teste@email.com", "(81)98888-7458");
        Medico medico_2 = new Medico(2, "Médico", " de Teste Dois", "14/10/1990", "Masculino", "321PE", "Geriatra", "medico.teste@email.com", "(81)98888-7458");
        System.out.println(medico);
        
        
        Consulta consulta = new Consulta(8, "pdtr-01", "03/08/2025", "1", "2", "4", "08:15");
        Consulta consulta_2 = new Consulta(9, "pdtr-03", "03/08/2025", "1", "2", "4", "10:15");
        Consulta consulta_3 = new Consulta(10, "pdtr-005", "03/08/2025", "1", "2", "4", "11:15");
        System.out.println(consulta);
        System.out.println("####### #######");

        // testes repositório de médicos
        // adicionar
        System.out.println("#### Teste Repositórios de Médicos ####");
        RepositorioTesteMedico repositorio_medicos = new RepositorioTesteMedico();
        repositorio_medicos.adicionar(medico);
        
        // atualizar
        Medico medico_atualizado = new Medico(2, "Médico", " de Teste Atualizado", "11/10/1988", "Feminino", "124PE", "Pediatria", "medico.teste@email.com", "(81)98888-7458");
        repositorio_medicos.atualizar(medico, medico_atualizado);
        
        // buscar
        System.out.println("#### Resultado busca de médicos: ####" + repositorio_medicos.buscar(medico_atualizado));
        System.out.println("####### #######");
        
        // deletar
        repositorio_medicos.remover(medico_2);
        
        // listar
        System.out.println("#### Listagem de Médicos: ####");
        repositorio_medicos.listar();
        System.out.println("####### #######");

        
        
        // testes repositório de pacientes
        // adicionar
        System.out.println("#### Teste Repositório de Pacientes ####");
        RepositorioTestePaciente repositorio_pacientes = new RepositorioTestePaciente();
        repositorio_pacientes.adicionar(paciente);
        repositorio_pacientes.adicionar(paciente_2);
        
        // atualizar
        Paciente paciente_atualizado = new Paciente("Paciente", "de Teste Atualizada", "14/12/2000", "Masculino", "(81)98888-7458", "pessoa.teste@email.com", "111.156.321-87");
        repositorio_pacientes.atualizar(paciente, paciente_atualizado);
        
        // buscar
        System.out.println("#### Resultado busca de consultas: ####" + repositorio_pacientes.buscar(paciente_atualizado));
        System.out.println("####### #######");
        
        // deletar
        repositorio_pacientes.remover(paciente_2);
        
        // listar
        System.out.println("#### Listagem de Pacientes: ####");
        repositorio_pacientes.listar();
        System.out.println("####### #######");

        
        
        // testes repositório de consultas
        // adicionar
        System.out.println("#### Teste Repositório de Consultas ####");
        RepositorioTesteConsulta repositorio_consultas = new RepositorioTesteConsulta();
        repositorio_consultas.adicionar(consulta);
        repositorio_consultas.adicionar(consulta_2);
        repositorio_consultas.adicionar(consulta_3);
        
        // atualizar
        Consulta consulta_atualizada = new Consulta(8, "pdtr-02", "03/08/2025", "1", "2", "4", "08:30");
        repositorio_consultas.atualizar(consulta, consulta_atualizada);
        
        // buscar
        System.out.println("#### Resultado busca de consultas: ####" + repositorio_consultas.buscar(consulta));
        
        // deletar
        repositorio_consultas.remover(consulta_2);
        
        // listar
        System.out.println("#### Listagem de consultas: ####");
        repositorio_consultas.listar();
        System.out.println("####### #######");
    }
}
