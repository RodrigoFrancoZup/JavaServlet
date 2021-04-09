package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.banco.Banco;
import br.com.alura.modelo.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Empresa empresa = new Empresa();
		Banco banco = new Banco();	
		
		empresa.setNome(request.getParameter("nome"));
		banco.add(empresa);
		

		RequestDispatcher rd = request.getRequestDispatcher("novaEmpresaCriada.jsp");
		request.setAttribute("nomeEmpresa", empresa.getNome());
		rd.forward(request, response);

		// PrintWriter out = response.getWriter();
		// out.println("<html><body><h2>A empresa "+ nome +" foi cadastrada! </h2></body></html>");
	}

}
