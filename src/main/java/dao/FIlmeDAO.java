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
import negocio.Filme;


/**
 *
 * @author tais
 */
public class FIlmeDAO {
    
    public void cadastrarFilme(Filme filme) throws ExceptionDAO{
        String sql = "insert into FILME (titulo, sinopse, duracao) value (?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getSinopse());
            pStatement.setInt(3, filme.getDuracao());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar o filme " + e);
        }finally{
        
            try{
                if(pStatement != null){
                    pStatement.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão " + e);
            }
        }
    }
    
    public ArrayList<Filme> listarFilme(String titulo) throws ExceptionDAO{
        String sql = "select * from FILME where titulo like '%" + titulo + "%' order by titulo";
       
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Filme> filmes = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs= pStatement.executeQuery(sql);
            
            if(rs != null){
                filmes = new ArrayList();
                while(rs.next()){
                    Filme filme = new Filme();
                    filme.setCodFilme(rs.getInt("codFilme"));
                    filme.setTitulo(rs.getString("titulo"));
                    filme.setSinopse(rs.getString("sinopse"));
                    filme.setDuracao(rs.getInt("duracao"));
                    filmes.add(filme);
                }
            }
            
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao consultar o filme:" + e);
            
        }finally{
            try{
                if(pStatement != null){
                    pStatement.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar pStatement" + e);
            }
            
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conesão: " + e);
            }
        }
        return filmes;
    }
    
    public void alterarFilme(Filme filme) throws ExceptionDAO{
        String sql = "Update FILME set titulo = ?, sinopse = ?, duracao = ? where codFilme = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getSinopse());
            pStatement.setInt(3, filme.getDuracao());
            pStatement.setInt(4, filme.getCodFilme());
            pStatement.execute();
            
        }catch(Exception e){
            throw new ExceptionDAO("Erro ao alterar o filme:" + e);
            
        }finally{
            try{
                if(pStatement != null){
                    pStatement.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar pStatement" + e);
            }
            
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conesão: " + e);
            }
        }
             
    }
    
    public void apagarFilme(Filme filme) throws ExceptionDAO{
        String sql = "Delete From FILME where codFilme = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, filme.getCodFilme());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao apagar o filme " + e);
        }finally{
        
            try{
                if(pStatement != null){
                    pStatement.close();
                }
                
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão " + e);
            }
        }
    }
    
    public void avaliarFilme(Filme filme) throws ExceptionDAO{
         String sql = "Update FILME set avaliacao = ? where codFilme = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{ 
            connection = new Conection().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, filme.getAvaliacao());
            pStatement.setInt(2, filme.getCodFilme());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro avaliar Filme" + e);
        }
    }
}
