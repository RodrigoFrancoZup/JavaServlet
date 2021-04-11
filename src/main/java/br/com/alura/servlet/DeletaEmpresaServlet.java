package br.com.alura.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.banco.Banco;

@WebServlet("/deletaEmpresa")
public class DeletaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Banco banco = new Banco();

		Integer id = Integer.parseInt(request.getParameter("id"));
		
		banco.remove(id);
		
		response.sendRedirect("listaEmpresa");
	}

}
