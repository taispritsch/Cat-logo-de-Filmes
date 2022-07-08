/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import dao.ExceptionDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Cliente;

/**
 *
 * @author tais
 */
public class ClienteControle 
{
    public ClienteControle()
    {}
    
    public boolean cadastrarCliente(String nome, String cpf, String email) throws ExceptionDAO, SQLException{
        if(nome != null && nome.length() > 0 && validarCPF(cpf) && email != null && email.length() > 0){
            Cliente cliente = new Cliente(nome, cpf, email);
            cliente.cadastrarCliente(cliente);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Cliente> listarClientes(String nome) throws Exception{
       return new Cliente().listarClientes(nome);
    }
    
    public boolean alterarCliente(int codCliente, String nome, String cpf, String email) throws ExceptionDAO, SQLException{
        if(nome != null && nome.length() > 0 && validarCPF(cpf) && email != null && email.length() > 0){
            Cliente cliente = new Cliente(nome, cpf, email);
            cliente.setCodCliente(codCliente);
            cliente.alterarCliente(cliente);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean apagarCliente(int codCliente) throws ExceptionDAO, SQLException{
        if(codCliente == 0){
            return false;
        }else{
            Cliente cliente = new Cliente();
            cliente.setCodCliente(codCliente);
            cliente.apagarCliente(cliente);
            return true;
        }
    }
        
   
    public boolean validarCPF(String cpf){
        for(int i = 0; i <cpf.length(); i++){
            if(!Character.isDigit(cpf.charAt(i))){
                if(!(i ==3 || i ==7 || i == 11)){
                    return false;
                }
            }
        }
       return true;
       
        
    }
    /*
    private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            soma += digito * peso[peso.length - str.length() + indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    public static boolean validarCPF(String cpf) {
        if ((cpf == null) || (cpf.length() != 11)) {
            return false;
        }
        Integer digito1 = calcularDigito(cpf.substring(0, 9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0, 9) + digito1, pesoCPF);
        
        return cpf.equals(cpf.substring(0, 9) + digito1.toString() + digito2.toString());
        
        
    }*/
    
}
