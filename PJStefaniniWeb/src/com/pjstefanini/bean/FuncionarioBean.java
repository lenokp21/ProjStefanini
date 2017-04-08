package com.pjstefanini.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pjstefanini.dao.FuncionarioDAO;
import com.pjstefanini.entity.Funcionario;
import com.pjstefanini.exception.SistemaException;

@ManagedBean(name="funcionarioBean")
@SessionScoped
public class FuncionarioBean {
	
	private Funcionario funcionario;
	private List<Funcionario> funcionarios;
	
	public FuncionarioBean() {
		funcionario = new Funcionario();
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public void salvar() throws SistemaException{
		FuncionarioDAO.salvar(funcionario);
		funcionario = new Funcionario();
	}
	
	public void excluir(){
		
	}
	
	public List<Funcionario> listar(){
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		return funcionarios;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
	

}
