package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.banco.Banco;
import br.com.alura.modelo.Empresa;

@WebServlet("/listaEmpresa")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2> Listagem das Empresas Cadastradas: </h2>");
		out.println("<ol>");
		for (Empresa empresas : banco.getAll()) {
			out.println("<li>" + empresas.getNome() + "</li>");
		}
		out.println("</ol>");
		out.println("</body>");
		out.println("</html>");
	}

}
