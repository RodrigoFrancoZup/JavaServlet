<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem das Empresas</title>
</head>
<body>
	<h2>Listagem de Todas Empresas Cadastradas:</h2>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>Id= ${empresa.id} - ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/mm/yyyy"/></li>		
		</c:forEach>
	</ul>
	
	
	<%-- USANDO SCRIPTLET
	<ul>
	<%
        List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
        for (Empresa empresa : lista) {
    %>
        <li><%= empresa.getNome() %></li>
    <%
        }
    %>
	</ul>
	 --%>
</body>
</html>