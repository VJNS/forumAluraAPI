package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

/**
 * Servlet implementation class EntradaUnicaServlet
 */
@WebServlet("/entrada")
public class EntradaUnicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parmAcao = request.getParameter("acao");
			
		String nomeClasse = "br.com.alura.gerenciador.acao." + parmAcao;
		
		Acao acao = null;
		
		try {
			Class classe = Class.forName(nomeClasse);
			acao = (Acao) classe.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String nome = acao.executa(request, response);
				
		String[] tipoProximaAcao = nome.split(":");
		
		if(tipoProximaAcao[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoProximaAcao[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoProximaAcao[1]);
		}
		
	
	}

}
