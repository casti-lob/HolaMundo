

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RespuestaNombre
 */
@WebServlet("/RespuestaNombre")
public class RespuestaNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RespuestaNombre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("nombre");
		
		PrintWriter writer= response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Buenas "+name);
		writer.println("<a href=\"index.html\"><button>Atras</button></a>");
		writer.println("</body>");
		writer.println("</html>"); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("nombre");
		
		PrintWriter writer= response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Buenas "+name);
		writer.println("<a href=\"index.html\"><button>Atras</button></a>");
		writer.println("</body>");
		writer.println("</html>"); 
	}

}
