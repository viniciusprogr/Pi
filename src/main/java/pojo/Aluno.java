package pojo;

import java.util.Date;

public class Aluno {
	
	private int ra;
	private String nome;
	private String email;
	private Date dataNascimento;
	private String senha;
	
	
	public Aluno(int ra, String nome, String email, Date dataNascimento, String senha) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Aluno [Ra=" + ra + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", senha=" + senha + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	


}
