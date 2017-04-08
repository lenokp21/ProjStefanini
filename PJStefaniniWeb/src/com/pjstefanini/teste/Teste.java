package com.pjstefanini.teste;

import com.pjstefanini.dao.FuncionarioDAO;
import com.pjstefanini.entity.Funcionario;
import com.pjstefanini.exception.SistemaException;
import com.pjstefanini.util.FabricaConexao;

public class Teste {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		
		f.setNome("Marca da Silva");
		f.setCpf(25698754265L);
		f.setEndereco("Endereco do funcionario");
		f.setTelefone(6134569875L);
		f.setIdCargo(1);
		f.setIdEmpresa(5);
		
		try {
			FuncionarioDAO.salvar(f);
		} catch (SistemaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
