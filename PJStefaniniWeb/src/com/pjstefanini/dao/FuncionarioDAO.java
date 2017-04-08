package com.pjstefanini.dao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.pjstefanini.entity.Funcionario;

public class FuncionarioDAO {
	
	
	
	private Connection conexao;
	private PreparedStatement ps; 
	
	public FuncionarioDAO() {

	}

	public static void salvar(Funcionario f){
		
	}
	
	public List<Funcionario> listar(){
		
	}
	
	public void excluir(Funcionario f){
		
	}
}
