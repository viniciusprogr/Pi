package severlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoAluno;
import pojo.Aluno;

/**
 * Servlet implementation class SeverletCadastro
 */
@WebServlet("/Cadastrar")
public class SeverletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeverletCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ra = Integer.parseInt(request.getParameter("Ra"));
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento;
		try {
			dataNascimento = dateFormat.parse(request.getParameter("dataNascimento"));
		}catch (Exception e) {
			dataNascimento = new Date();
		}
		Aluno aluno = new Aluno(ra, nome, email, dataNascimento, senha);
		DaoAluno dao = new DaoAluno();
		dao.insert(aluno);
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\"/>\r\n"
				+ "<title>Resultado</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<p>Produto inserido</p>\r\n"
				+ "<a href=\"/Projeto\">voltar</a>"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
