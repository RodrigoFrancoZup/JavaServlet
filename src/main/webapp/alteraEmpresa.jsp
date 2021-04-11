<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraEmpresa" var="linkAlteraEmpresaServlet"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterando Empresa</title>
</head>
<body>
	<form action="${linkAlteraEmpresaServlet}" method="post">
		<input hidden name="id" value="${empresa.id}" />
		<label>Nome:</label> <input type="text" name="nome" value="${empresa.nome}"/></br> <br />
		<label>Data Abertura:</label> <input type="text" name="dataAbertura" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/mm/yyyy"/>"></br> </br>
		<input type="submit" value="Alterar">
	</form>
</body>
</html>