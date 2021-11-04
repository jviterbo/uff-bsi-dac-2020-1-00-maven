<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <jsp:include page="cabecalho.html"/>
        <title>Indíce</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <div class="container text-center">
            <h1 class="display-6">Funcionalidades disponíveis:</h1>
            <div class="row">
                <div class="col">
                    <span style="font-size: 5em; color: #006666;">
                        <i class="fab fa-gofore"></i>
                    </span>
                    <p>HelloServlet.java (Método GET)</p>
                    <a href=".\alomundo?lang=pt&nome=Fulano" class="btn btn-secondary" role="button">Acessar</a>

                </div>
                <div class="col">
                    <span style="font-size: 5em; color: #666600;">
                        <i class="fas fa-scroll"></i>
                    </span>      
                    <p>Formulário de HelloWorld (usando o HelloServlet.java - Método POST)</p>
                    <a href=".\helloform.jsp" class="btn btn-secondary" role="button">Acessar</a>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <br>
                    <p class="display-4 alert-warning">${mensagem}</p>
                </div>
            </div>
        </div>
        <script src="https://kit.fontawesome.com/28a8996ecc.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </body>
</html>
