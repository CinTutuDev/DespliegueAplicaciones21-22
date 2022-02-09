import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class Sesiones extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      HttpSession session = request.getSession();
        Integer contadorDeAccesos;
 
        synchronized (session) {
          contadorDeAccesos = (Integer) session.getAttribute("contadorDeAccesos");
          if (contadorDeAccesos == null) {
            contadorDeAccesos = 0;
          } else {
            contadorDeAccesos = new Integer(contadorDeAccesos + 1);
          }
          session.setAttribute("contadorDeAccesos", contadorDeAccesos);
        }
 
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet de prueba de sesi�n</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Accesos: " + contadorDeAccesos + " en esta sesi�n</h2>");
        out.println("<p>(Identificador de sesi�n: " + session.getId() + ")</p>");
        out.println("<p>(Fecha de creaci�n de la sesi�n: "
                + new Date(session.getCreationTime()) + ")</p>");
        out.println("<p>(Fecha de �ltimo acceso a la sesi�n: " 
                + new Date(session.getLastAccessedTime()) + ")</p>");
        out.println("<p>(M�ximo tiempo inactivo de la sesi�n: "
                + session.getMaxInactiveInterval() + " segundos)</p>");
        out.println("<p><a href='" + request.getRequestURI() + "'>Refrescar</a></p>");
        out.println("<p><a href='" 
                + response.encodeRedirectURL(request.getRequestURI())
                + "'>Refrescar con reescitura de URLs</a></p>");
        out.println("<h1>Servlet SesionServlet at " + request.getContextPath() + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
  }
}
