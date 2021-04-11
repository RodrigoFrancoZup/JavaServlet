package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		Date dataAbertura = null;
		Banco banco = new Banco();	
		
		empresa.setNome(request.getParameter("nome"));
		String dataEmString = request.getParameter("dataAbertura");
		
		//Determinando o padrão de formato da data que vamos converter!
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		//Convertendo a data de String para Date
		try {
			dataAbertura = sdf.parse(dataEmString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		empresa.setDataAbertura(dataAbertura);
		banco.add(empresa);
		
		// request.setAttribute("nomeEmpresa", empresa.getNome());
		
		// rd comentando pois ele gera o erro do F5!
		// RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa");
		//rd.forward(request, response);
		
		response.sendRedirect("listaEmpresa");

		// PrintWriter out = response.getWriter();
		// out.println("<html><body><h2>A empresa "+ nome +" foi cadastrada! </h2></body></html>");
	}

}
