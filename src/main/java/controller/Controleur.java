package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import domaine.*;
import metier.*;

@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Traite traite = new Traite();
	private RequestDispatcher disp=null;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lien = request.getParameter("lien");

		/*
		 * chargement d'une vue par le controleur sans faire appel aux traitement
		 */
		if (lien.equals("lien1")) {
			response.sendRedirect("entree.jsp");
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String texte = "";
		String forme = request.getParameter("forme");
		if (forme.equals("forme1")) {
			texte = request.getParameter("pret");
			int mpret = Integer.parseInt(texte);
			texte = request.getParameter("taux");
			double tia = Double.parseDouble(texte);
			texte = request.getParameter("na");
			int na = Integer.parseInt(texte);
			
			Pret pret = new Pret();
			pret.setMpret(mpret);
			pret.setTia(tia);
			pret.setNa(na);
			pret = traite.calcule(pret);
			request.setAttribute("pret", pret);
			disp = request.getRequestDispatcher("sortie.jsp");
		
			disp.forward(request, response);
		}
	}

}
