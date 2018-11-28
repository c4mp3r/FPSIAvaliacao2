package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entidades.*;
import conexao.*;

public class DAOCliente {
	
	private int counter;
	
	public void resetCounter()
	{
		counter = 0;
	}
	
	
	
	
	public int addCli(clientes c) {
		counter++;

		String NOVO = 	"INSERT INTO produtos (id, desc, qtd_con) VALUES (?, ?, ?)";
		try (
				
			Connection conn = new CNXHSQLDB().conectar();
			PreparedStatement pst = conn.prepareStatement(NOVO);)
		{
			pst.setInt(1, c.getId());
			pst.setString(2, c.getDesc());
			pst.setInt(3, c.getQtd());
			pst.executeUpdate();

		}
		 catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao executar  " + e.toString());
		}
		return counter;
	}
}
