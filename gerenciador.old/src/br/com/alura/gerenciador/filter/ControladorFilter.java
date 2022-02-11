package br.com.alura.gerenciador.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;

//@WebFilter(urlPatterns="/entrada")
public class ControladorFilter implements javax.servlet.Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void destroy() {}	
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Controlador Filter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
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
