package be.atc.controler.servlet;

import be.atc.controler.dao.EntityTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( name = "Servlet2Test", value = "/Servlet2Test" )
public class Servlet2Test extends HttpServlet {
    final static        org.apache.log4j.Logger logger = org.apache.log4j.Logger
            .getLogger( Servlet2Test.class );
    private             EntityTest              pers   = new EntityTest();
    public static final String                  VUE    = "/views/test.jsp";

    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        try {

            request.setAttribute( "adresse", pers.listDesPersonnes() );
        } catch ( Exception e ) {
            System.out.println( "Erreur servlet" );
        }
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        try {
            request.setAttribute( "adresse", pers.listDesPersonnes() );
        } catch ( Exception e ) {
            System.out.println( "Erreur servlet get" );
        }
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

    }
}
