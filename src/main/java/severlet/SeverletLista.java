package severlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoAluno;
import pojo.Aluno;

/**
 * Servlet implementation class SeverletLista
 */
@WebServlet("/SeverletLista")
public class SeverletLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeverletLista() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\"/>\r\n"
				+ "<title>Lista</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<table border='1'>"
	            + "<tr>\r\n"
	   		    + "	<th>c�digo</th>\r\n"
	   		    + "	<th>descri��o</th>\r\n"
	   		    + "	<th>quantidade</th>\r\n"
	   		    + "	<th>pre�o</th>\r\n"
	   		    + "	<th>data da compra</th>\r\n"
	   		    + "</tr>");
		DaoAluno dao = new DaoAluno();
		List<Aluno> lista = dao.getLista();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for (Aluno a: lista) {
			out.println("<tr>" +
					"<td>" + a.getRa() + "</td>" +
					"<td>" + a.getNome() + "</td>" +
					"<td>" + a.getEmail() + "</td>" +
					"<td>" + dateFormat.format(a.getDataNascimento()) +"</td></tr>" );
		}
		
		out.println("</table>"
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
