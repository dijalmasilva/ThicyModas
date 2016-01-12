<%-- 
    Document   : erroLogin
    Created on : 29/12/2015, 16:42:34
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <body>
        <%@include file="header.jsp" %>
        <br><br><br><br>
        <div class="mdl-layout__content">
            <h3>Entrar</h3><br>
            <p class="texto-rosa">Nome de usuário ou senha inválidos!</p>
            <form action="verificaLogin" method="post">
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" type="text" id="sample1" name="nomeDeUsuario" pattern="[A-Z,a-z]*">
                    <label class="mdl-textfield__label" for="sample1">Nome de usuário</label>
                    <span class="mdl-textfield__error">Somente alfabeto e sem espaço, por favor!</span>
                </div>
                <br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" type="password" name="senha" id="sample2">
                    <label class="mdl-textfield__label" for="sample2">Senha</label>
                </div>
                <br><br>
                <button class="mdl-button mdl-js-button mdl-button--colored mdl-button--primary mdl-js-ripple-effect">Logar</button>
            </form>
        </div>
        
    </body>
</html>