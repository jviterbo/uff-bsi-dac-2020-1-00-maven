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

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        String horario = "";
        if (hora >= 0 && hora < 12) {
            horario = "manha";
        } else if (hora >= 12 && hora < 18) {
            horario = "tarde";
        } else if (hora >= 18 && hora < 24) {
            horario = "noite";
        }
        
        String msg = "";

        String lang = request.getParameter("lang");
        if (lang == null) {
            lang = "pt";
        }
        switch (lang) {
            case "pt":
                if(horario.equals("manha")){msg = "Bom Dia, ";}
                if(horario.equals("tarde")){msg = "Boa Tarde, ";}
                if(horario.equals("noite")){msg = "Boa Noite, ";}
                break;
            case "en":
                if(horario.equals("manha")){msg = "Good Morning, ";}
                if(horario.equals("tarde")){msg = "Good Afternoon, ";}
                if(horario.equals("noite")){msg = "Good Evening, ";}
                break;
            case "fr":
                if(horario.equals("manha")){msg = "Bonjour, ";}
                if(horario.equals("tarde")){msg = "Bon Après-midi, ";}
                if(horario.equals("noite")){msg = "Bonne Soirée, ";}
                break;
            case "de":
                if(horario.equals("manha")){msg = "Guten Morgen, ";}
                if(horario.equals("tarde")){msg = "Guten Tag, ";}
                if(horario.equals("noite")){msg = "Gute Nacht, ";}
                break;
            case "it":
                if(horario.equals("manha")){msg = "Buon Biorno, ";}
                if(horario.equals("tarde")){msg = "Buon Pomeriggio, ";}
                if(horario.equals("noite")){msg = "Buona Notte, ";};
                break;
            case "ru":
                if(horario.equals("manha")){msg = "Dobroye utro, ";}
                if(horario.equals("tarde")){msg = "Dobryy den', ";}
                if(horario.equals("noite")){msg = "Spokoynoy Nochi, ";}
                break;
        }

        String nome = request.getParameter("nome");

        if (nome == null || nome.equals("")) {
            nome = "Fulano";
        }

        msg = msg + nome + "!";

        request.setAttribute("mensagem", msg);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/helloform.jsp");
        rd.forward(request, response);
    }
}
