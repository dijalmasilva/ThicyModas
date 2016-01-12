<%-- 
    Document   : novoUsuario
    Created on : 25/12/2015, 12:04:36
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <body>
        <%@include file="headerGeral.jsp" %>
        <br><br><br>
        <h2>Novo Usuário</h2>
        <p class="texto-rosa">Campos obrigatórios em destaque</p>
        <br>
        <div class="form-group">
            <form action="addUsuario" method="post">

                <button id="arq" class="mdl-button mdl-button--primary"><span class="material-icons">file_upload</span>Upload imagem</button><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="nomeCompleto" required="" id="sample1">
                    <label for="sample1" class="mdl-textfield__label">Nome Completo</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="cpf" required="" id="cpf" maxlength="14"/>
                    <label for="cpf" class="mdl-textfield__label">CPF</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="tel" class="mdl-textfield__input" name="telefone" required="" id="telefone" maxlength="16">
                    <label for="telefone" class="mdl-textfield__label">Telefone</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="email" class="mdl-textfield__input" name="email" required="" id="sample4">
                    <label for="sample4" class="mdl-textfield__label">Email</label>
                </div><br><br>
                <input type="file" class="invisible" name="imagem" id="upload"><br>
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
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="tel" class="mdl-textfield__input" name="telefoneOpcional" id="sample13">
                    <label for="sample13" class="mdl-textfield__label">Telefone Opcional</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="nomeDeUsuario" id="sample14" required="">
                    <label for="sample14" class="mdl-textfield__label">Nome de usuário</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="password" class="mdl-textfield__input" name="senha" id="sample15" required="">
                    <label for="sample15" class="mdl-textfield__label">Senha</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="number" class="mdl-textfield__input" name="salario" id="sample16">
                    <label for="sample16" class="mdl-textfield__label">Salário</label>
                </div><br><br>
                <input type="submit" value="Cadastrar" class="mdl-button mdl-button--raised mdl-js-button mdl-button--colored"><br><br>
            </form>
        </div>
    </body>
</html>
