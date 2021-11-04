<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <jsp:include page="cabecalho.html"/>
        <title>Form Olá</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <div class="container text-center">
            <h1 class="display-6">Formulário de HelloWorld (usando o HelloServlet.java)</h1>

            <form action="formlang" method="post" class="border bg-light">
                <h5>Idioma:</h5>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="flexRadioDefault1" type="radio" name="lang" value="pt" checked>
                    <label class="form-check-label" for="flexRadio">Português</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="flexRadioDefault2" type="radio" name="lang" value="en">
                    <label class="form-check-label" for="flexRadio">Inglês</label>
                </div>    
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="flexRadioDefault3" type="radio" name="lang" value="fr">
                    <label class="form-check-label" for="flexRadio">Francês</label>
                </div>    
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="flexRadioDefault4" type="radio" name="lang" value="it">
                    <label class="form-check-label" for="flexRadio">Italiano</label>
                </div>    
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="flexRadioDefault5" type="radio" name="lang" value="ru">
                    <label class="form-check-label" for="flexRadio">Russo</label>
                </div>    
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="flexRadioDefault6" type="radio" name="lang" value="de">
                    <label class="form-check-label" for="flexRadio">Alemão</label>
                </div>
                <div>
                    <br>
                    <h5>Forma de Tratamento:</h5>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="tratamento" value="" checked>
                        <label class="form-check-label" for="inlineRadio1">Nenhuma</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="tratamento" value="sr">
                        <label class="form-check-label" for="inlineRadio2">Sr.</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="tratamento" value="sra">
                        <label class="form-check-label" for="inlineRadio2">Sra.</label>
                    </div>

                </div>
                <div>
                    <label name="nome" class="form-label h5">Nome:</label>
                    <input type="text" class="form-control" name="nome" placeholder="Nome"><br>
                    <button type="submit" class="btn btn-secondary mb-3" value="Cumprimentar">Cumprimentar</button>
                </div>
            </form>


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
