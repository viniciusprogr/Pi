package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Aluno;

public class DaoAluno {
	
		private String url = "jdbc:hsqldb:hsql://localhost/";
		private String user = "SA";
		private String password = "";
		private Connection connection;
		public DaoAluno() {
			try {
				connection = DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

	public void insert(Aluno aluno) {
		String sql = "INSERT INTO ALUNOS VALUES(?,?,?,?,?)";
	
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, aluno.getRa());
			pstmt.setString(2,aluno.getNome());
			pstmt.setString(3, aluno.getEmail());	
			pstmt.setDate(4, 
					new java.sql.Date(aluno .getDataNascimento().getTime()));
			pstmt.setString(5, aluno.getSenha());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public void delete(Aluno aluno) {
		String sql = "DELETE FROM ALUNOS WHERE RA=?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, aluno.getRa());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public void update(Aluno aluno) {
		String sql = "UPDATE ALUNOS SET NOME=?,EMAIL=?,"
				   + "DATANASCIMENTO=? WHERE RA=?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1,aluno.getRa());
			pstmt.setString(2, aluno.getNome());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setDate(4, 
					new java.sql.Date(aluno.getDataNascimento().getTime()));
			pstmt.setString(5, aluno.getSenha());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public List<Aluno> getLista() {
		List<Aluno> lista = new ArrayList<>();
		String sql = "SELECT * FROM AlUNOS";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while( rs.next() ) {
				lista.add(new Aluno(rs.getInt(1),
	                       rs.getString(2),
	                       rs.getString(3),
	                        rs.getDate(4),
	                       rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return lista;
	}
	
	public Aluno buscarPeloRa( int ra ) {
		String sql = "SELECT * FROM ALUNO WHERE RA=?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, ra);
			ResultSet rs = pstmt.executeQuery();
			if( rs.next() ) {
				return new Aluno(rs.getInt(1),
			                       rs.getString(2),
			                       rs.getString(3),
			                        rs.getDate(4),
			                       rs.getString(5));
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	}
	
