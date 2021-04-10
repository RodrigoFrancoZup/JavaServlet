<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkNovaEmpresaServlet"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Nova Empresa</title>
</head>
<body>
	<form action="${linkNovaEmpresaServlet}" method="post">
		<label>Nome:</label>
		<input type="text" name="nome" placeholder="Digite o nome da empresa!"/></br>
		<br/><label>Data Abertura:</label>
		<input type="text" name="dataAbertura" placeholder="Digite a data"/></br>
		</br><input type="submit" value="Cadastrar">
	</form>
</body>
</html>