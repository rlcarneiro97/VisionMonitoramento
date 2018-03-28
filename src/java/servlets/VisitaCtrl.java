package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Visita;
import model.dao.VisitaDao;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "VisitaCtrl", urlPatterns = {"/VisitaCtrl"})
public class VisitaCtrl extends HttpServlet {

    public static Visita visita;
    public static VisitaDao visitaDao;

    public VisitaCtrl() {

        visita = new Visita();
        visitaDao = new VisitaDao();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        int idade = Integer.parseInt(request.getParameter("idade"));
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");

        VisitaCtrl.visita.setNome(nome);
        VisitaCtrl.visita.setIdade(idade);
        VisitaCtrl.visita.setCpf(cpf);
        VisitaCtrl.visita.setRg(rg);

        if (VisitaCtrl.visitaDao.gravarDados(visita) == 1) {

            try (PrintWriter out = response.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Sucesso!</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<script>alert(\"Dados inseridos com sucesso!\");</script>");
                out.println("<input class=\"btn waves-effect waves-light\" type=\"button\" "
                        + "value=\"retornar\" onclick=\"history.back()\">");
                out.println("</body>");
                out.println("</html>");
            }

        } else {

            try (PrintWriter out = response.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Erro!</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<script>alert(\"Dados não foram inseridos!\");</script>");
                out.println("<input class=\"btn waves-effect waves-light\" type=\"button\" "
                        + "value=\"retornar\" onclick=\"history.back()\">");
                out.println("</body>");
                out.println("</html>");
            }

        }

    }

}
