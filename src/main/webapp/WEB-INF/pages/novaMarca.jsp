<%-- 
    Document   : novaMarca
    Created on : 26/12/2015, 17:52:43
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <body>
        <%@include file="headerGeral.jsp" %>
        <br><br><br>
        <h2>Nova Marca</h2>
        <p class="texto-rosa">Campos obrigatórios em destaque</p>
        <br>
        <div>
            <form action="addMarca" method="post">
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" required="" name="nome" id="sample1">
                    <label for="sample1" class="mdl-textfield__label">Nome da Marca</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="email" class="mdl-textfield__input" required="" name="email" id="sample2">
                    <label for="sample2" class="mdl-textfield__label">Email</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" required="" name="telefone" id="telefone" maxlength="16">
                    <label for="telefone" class="mdl-textfield__label">Telefone</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="rua" required="" id="sample7">
                    <label for="sample7" class="mdl-textfield__label">Rua</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="numero" required="" id="sample8">
                    <label for="sample8" class="mdl-textfield__label">Número</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="bairro" required="" id="sample9">
                    <label for="sample9" class="mdl-textfield__label">Bairro</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="cidade" required="" id="sample10">
                    <label for="sample10" class="mdl-textfield__label">Cidade</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="estado" required="" id="sample11">
                    <label for="sample11" class="mdl-textfield__label">Estado</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="complemento" id="sample12">
                    <label for="sample12" class="mdl-textfield__label">Complemento</label>
                </div><br><br>
                <input type="submit" value="Cadastrar" class="mdl-button mdl-js-button mdl-button--colored mdl-button--raised">
                <br><br><br>
            </form>
        </div>
    </body>
</html>
