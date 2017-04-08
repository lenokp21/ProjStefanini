package com.pjstefanini.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.SQLError;
import com.pjstefanini.entity.Funcionario;
import com.pjstefanini.exception.SistemaException;
import com.pjstefanini.util.FabricaConexao;

public class FuncionarioDAO {
	
	private final static String insert = " INSERT INTO tbf_funcionario(tbf_nome, tbf_cpf, tbf_endereco, tbf_telefone, tbf_idcargo, tbf_idempresa)  VALUES( ?,?,?,?,?,?) ";
	private final static String update = " UPDATE tbf_funcionario SET tbf_nome = ?, tbf_cpf = ?, tbf_endereco = ?, tbf_telefone = ?, tbf_idcargo = ?, tbf_idempresa = ? WHERE tbf_id = ? ";
	private final String select = " SELECT * FROM tbf_funcionario ";
	private final String delete = " DELETE FROM tbf_funcionario WHERE tbf_id = ? ";
	
	private static Connection conexao;
	private static PreparedStatement ps; 
	
	public FuncionarioDAO() {

	}

	public static void salvar(Funcionario f) throws SistemaException{
		
		try {
			conexao = FabricaConexao.getConexao();
			
			if(f.getId() == null){
				ps = (PreparedStatement) conexao.prepareStatement(insert);
			}else{
				ps = (PreparedStatement) conexao.prepareStatement(update);
			}
			
			ps.setString(1, f.getNome());
			ps.setLong(2, f.getCpf());
			ps.setString(3, f.getEndereco());
			ps.setLong(4, f.getTelefone());
			ps.setInt(5, f.getIdCargo());
			ps.setInt(6, f.getIdEmpresa());
			ps.execute();
			
			FabricaConexao.fechaConexao();
			
		} catch (SQLException e) {
			throw new SistemaException(" Não foi possivel Cadastrar um novo Funcionario. ", e);
		}
	}
	
	public List<Funcionario> listar(){
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		return funcionarios;
	}
	
	public void excluir(Funcionario f){
		
	}
}
