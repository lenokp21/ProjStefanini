package com.pjstefanini.bean;

import java.util.ArrayList;
import java.util.List;

import com.pjstefanini.entity.Funcionario;

public class FuncionarioBean {
	
	Funcionario funcionario;
	List<Funcionario> funcionarios;
	
	public FuncionarioBean() {
		funcionario = new Funcionario();
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public void salvar(){
		
	}
	
	public void excluir(){
		
	}
	
	public List<Funcionario> listar(){
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		return funcionarios;
	}
	
	

}
