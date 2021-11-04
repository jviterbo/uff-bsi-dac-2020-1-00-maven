package hello;

import java.io.IOException;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hello", urlPatterns = {
    "/alomundo", "/formlang"})

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getServletPath();
        switch (action) {
            case "/alomundo":
                alomundo(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/formlang":
                formlang(request, response);
                break;
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    //ALO FULANO APARECE NO INDEX.JSP
    private void alomundo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";

        String lang = request.getParameter("lang");
        if (lang == null) {
            lang = "pt";
        }
        switch (lang) {
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "kr":
                msg = "Annyeonghasibnikka, ";
                break;
            case "ru":
                msg = "Privet, ";
                break;
        }

        String nome = request.getParameter("nome");

        if (nome == null) {
            nome = "Fulano";
        }

        msg = msg + nome + "!";

        request.setAttribute("mensagem", msg);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }

    private void formlang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        String horario = "";

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);

        if (hora >= 0 && hora < 12) {
            horario = "manha";
        } else if (hora >= 12 && hora < 18) {
            horario = "tarde";
        } else {
            horario = "noite";
        }

        String lang = request.getParameter("lang");
        String tratamento = request.getParameter("tratamento");
        String nome = request.getParameter("nome");

        if (lang == null) {
            lang = "pt";
        }
        switch (lang) {
            case "pt":
                if (tratamento.equals("sr")) {
                    tratamento = "Senhor ";
                } else if (tratamento.equals("sra")) {
                    tratamento = "Senhora ";
                } else {
                    tratamento = "";
                }
                if (horario.equals("manha")) {
                    msg = "Bom Dia, " + tratamento;
                } else if (horario.equals("tarde")) {
                    msg = "Boa Tarde, " + tratamento;
                } else {
                    msg = "Boa Noite, " + tratamento;
                }
                break;
            case "en":
                if (tratamento.equals("sr")) {
                    tratamento = "Sir ";
                } else if (tratamento.equals("sra")) {
                    tratamento = "Madam ";
                } else {
                    tratamento = "";
                }
                if (horario.equals("manha")) {
                    msg = "Good Morning, " + tratamento;
                } else if (horario.equals("tarde")) {
                    msg = "Good Afternoon, " + tratamento;
                } else {
                    msg = "Good Evening, " + tratamento;
                }
                break;
            case "fr":
                if (tratamento.equals("sr")) {
                    tratamento = "Monsieur ";
                } else if (tratamento.equals("sra")) {
                    tratamento = "Madame ";
                } else {
                    tratamento = "";
                }
                if (horario.equals("manha")) {
                    msg = "Bonjour, " + tratamento;
                } else if (horario.equals("tarde")) {
                    msg = "Bon Après-midi, " + tratamento;
                } else {
                    msg = "Bonne Soirée, " + tratamento;
                }
                break;
            case "de":
                if (tratamento.equals("sr")) {
                    tratamento = "Herr ";
                } else if (tratamento.equals("sra")) {
                    tratamento = "Gnädige Frau ";
                } else {
                    tratamento = "";
                }
                if (horario.equals("manha")) {
                    msg = "Guten Morgen, " + tratamento;
                } else if (horario.equals("tarde")) {
                    msg = "Guten Tag, " + tratamento;
                } else {
                    msg = "Gute Nacht, " + tratamento;
                }
                break;
            case "it":
                if (tratamento.equals("sr")) {
                    tratamento = "Signore ";
                } else if (tratamento.equals("sra")) {
                    tratamento = "Signora ";
                } else {
                    tratamento = "";
                }
                if (horario.equals("manha")) {
                    msg = "Buon Biorno, " + tratamento;
                } else if (horario.equals("tarde")) {
                    msg = "Buon Pomeriggio, " + tratamento;
                } else {
                    msg = "Buona Notte, " + tratamento;
                }
                ;
                break;
            case "ru":
                if (tratamento.equals("sr")) {
                    tratamento = "Ser ";
                } else if (tratamento.equals("sra")) {
                    tratamento = "Gospozha ";
                } else {
                    tratamento = "";
                }
                if (horario.equals("manha")) {
                    msg = "Dobroye utro, " + tratamento;
                } else if (horario.equals("tarde")) {
                    msg = "Dobryy den', " + tratamento;
                } else {
                    msg = "Spokoynoy Nochi, " + tratamento;
                }
                break;
        }

        if (nome == null || nome.equals("")) {
            nome = "Fulano";
        }

        msg = msg + nome + "!";

        request.setAttribute("mensagem", msg);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/helloform.jsp");
        rd.forward(request, response);
    }
}
