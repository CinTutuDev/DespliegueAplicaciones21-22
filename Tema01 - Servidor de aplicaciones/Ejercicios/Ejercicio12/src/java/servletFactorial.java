import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletFactorial extends HttpServlet {
	private int numero;
	
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		numero = Integer.parseInt(request.getParameter("numero"));
		
		out.println(calculaFactorial());
	}

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private int calculaFactorial() {
		int resultado = 1;
		for (int i = numero; i>0; i--) {
			resultado *= i;
		}
		return resultado;
	}
	
}