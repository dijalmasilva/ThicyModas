<%-- 
    Document   : novaCliente
    Created on : 23/12/2015, 20:46:30
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>

    <body>
        <%@include file="headerGeral.jsp" %>
        <br><br><br>
        <h2>Novo cliente</h2>
        <p class="texto-rosa">Campos obrigatórios em destaque</p>
        <br>
        <div class="form-group">
            <form action="cadastraCliente" method="post">

                <button id="arq" class="mdl-button mdl-button--primary"><span class="material-icons">file_upload</span>Upload imagem</button><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="nomeCompleto" required="" id="sample1">
                    <label for="sample1" class="mdl-textfield__label">Nome Completo</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="cpf" required="" id="cpf" maxlength="14"/>
                    <label for="cpf" class="mdl-textfield__label">CPF</label>
                    <span class="mdl-textfield__error"></span>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="tel" class="mdl-textfield__input" name="telefone" required="" id="telefone" maxlength="16">
                    <label for="telefone" class="mdl-textfield__label">Telefone</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="email" class="mdl-textfield__input" name="email" required="" id="sample4">
                    <label for="sample4" class="mdl-textfield__label">Email</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" name="profissao" id="sample5">
                    <label for="sample5" class="mdl-textfield__label">Profissao</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="date" class="mdl-textfield__input" name="aniversario" id="sample6" required="">
                </div><br>
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
                <div class="modal-disponibilidade">
                    <h5>Disponibilidade</h5>
                    <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                        <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" name="disponibilidade" value="Manhã">
                        <span class="mdl-checkbox__label">Manhã</span>
                    </label>
                    <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-2">
                        <input type="checkbox" id="checkbox-2" class="mdl-checkbox__input" name="disponibilidade" value="Tarde">
                        <span class="mdl-checkbox__label">Tarde</span>
                    </label>
                    <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-3">
                        <input type="checkbox" id="checkbox-3" class="mdl-checkbox__input" name="disponibilidade" value="Noite">
                        <span class="mdl-checkbox__label">Noite</span>
                    </label>
                </div>
                <br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="number" class="mdl-textfield__input" name="limite" id="sample14">
                    <label class="mdl-textfield__label">Limite</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <textarea class="mdl-textfield__input" rows="3" name="observacao"></textarea>
                    <label class="mdl-textfield__label">Observação</label>
                </div><br><br>
                <input type="submit" value="Cadastrar" class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect">
            </form>
            <br><br>
        </div>
    </body>
</html>
