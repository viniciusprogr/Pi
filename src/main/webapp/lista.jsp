<%@page import="java.text.SimpleDateFormat"%>
<%@page import="pojo.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="Dao.DaoAluno"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista</title>
</head>
<body>
<table border = '1'>
<tr>
	<th>RA<th/>
	<th>Nome<th/>
	<th>Email<th/>
	<th>Data de Nascimento<th/>
</tr>
<%
DaoAluno dao = new DaoAluno();
List<Aluno> list = dao.getLista();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
for( Aluno a: list){
%>
<tr>
<td><%=a.getRa()%></td>
<td><%=a.getNome()%></td>
<td><%=a.getEmail() %></td>
<td><%=dateFormat.format(a.getDataNascimento()) %></td>
</tr>
<%
}%>
</table>
</body>
</html>