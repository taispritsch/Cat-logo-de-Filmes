/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Cliente;

/**
 *
 * @author tais
 */
public class ClienteDAO {
    
    public void cadastraCliente(Cliente cliente) throws ExceptionDAO, SQLException{
        String sql = "insert into CLIENTE (nome, cpf, email) values (?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getCpf());
            pStatement.setString(3, cliente.getEmail());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar cliente " + e);
        }finally{
            try{
                if(pStatement != null){
                    pStatement.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement:" + e);
            }
            
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
    
    public ArrayList<Cliente> listarClientes(String nome) throws SQLException, ExceptionDAO{
        String sql = "select * from CLIENTE where nome like '%" + nome + "%' order by nome";
        
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList clientes = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if(rs != null){
                clientes = new ArrayList<Cliente>();
                while(rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setCodCliente(rs.getInt("CodCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEmail(rs.getString("email"));
                    clientes.add(cliente);
                }
            }
            
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao consultar cliente " + e);
        }finally{
            try{
                if(pStatement != null){
                    pStatement.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o statement: " + e);
            }
            
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
        
        return clientes;
    }
    
    public void alterarCliente(Cliente cliente) throws ExceptionDAO, SQLException{
        String sql = "update CLIENTE set nome = ?, cpf = ?, email = ? where codCliente = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getCpf());
            pStatement.setString(3, cliente.getEmail());
            pStatement.setInt(4, cliente.getCodCliente());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao alterar cliente " + e);
        }finally{
            try{
                if(pStatement != null){
                    pStatement.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement:" + e);
            }
            
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
    
    public void apagarCliente(Cliente cliente) throws ExceptionDAO, SQLException{
        String sql = "Delete from CLIENTE where codCliente = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, cliente.getCodCliente());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao apagar cliente " + e);
        }finally{
            try{
                if(pStatement != null){
                    pStatement.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement:" + e);
            }
            
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
}
