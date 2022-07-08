/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.ClienteDAO;
import dao.ExceptionDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tais
 */
public class Cliente {
    
    private int codCliente;
    private String nome;
    private String cpf;
    private String email;
    
    public Cliente(){}

    public Cliente(int codCliente, String nome, String cpf, String email) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrarCliente(Cliente cliente)throws ExceptionDAO, SQLException {
        new ClienteDAO().cadastraCliente(cliente);
    }
    
    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO, SQLException{
        return new ClienteDAO().listarClientes(nome);
    }
    
    public void alterarCliente(Cliente cliente)throws ExceptionDAO, SQLException {
        new ClienteDAO().alterarCliente(cliente);
    }
    
        public void apagarCliente(Cliente cliente)throws ExceptionDAO, SQLException {
        new ClienteDAO().apagarCliente(cliente);
    }
}
