<%-- 
    Document   : novoProduto
    Created on : 26/12/2015, 14:02:15
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>

    <body>
        <%@include file="headerGeral.jsp" %>
        <br><br><br>
        <h2>Novo Produto</h2>
        <p class="texto-rosa">Campos obrigatórios em destaque</p>
        <br>
        <div class="form-group">
            <form action="addProduto" method="post">
                <button id="arq" class="mdl-button mdl-button--primary"><span class="material-icons">file_upload</span>Upload imagem</button><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" id="sample1">
                    <input type="text" class="mdl-textfield__input" name="codigo" required="" id="codigo">
                    <label for="codigo" class="mdl-textfield__label">Código</label>
                </div><br><br>
                <button type="button" class="mdl-button mdl-button--raised mdl-js-button mdl-js-ripple-effect" onclick="gerarCodigo(${codigos})">Gerar Código</button><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" list="generos" id="gen" required="" name="genero">
                    <label for="generos" class="mdl-textfield__label">Gênero</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" list="" id="roupas" required="" name="tipo">
                    <label for="roupas" class="mdl-textfield__label">Tipo de produto</label>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" list="marcas" name="nomeDaMarca" required="" id="sample3" autocomplete="off">
                    <label for="sample3" class="mdl-textfield__label">Marca</label>
                </div>
                <c:if test="${marcas == null}">
                    <p>Nenhuma marca ainda cadastrada, clique <a href="novaMarca" class="texto-rosa">aqui</a> para cadastrar.</p>
                </c:if>
                <br><br>
                <div class="modal-pecas text-center">
                    <h6>Adicionar peças</h6>
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input type="text" id="tam" class="mdl-textfield__input" list="tamanhos"> 
                        <label for="tam" class="mdl-textfield__label">Tamanho</label>
                    </div>
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input type="number" id="qtde" class="mdl-textfield__input" min="1">
                        <label for="qtde" class="mdl-textfield__label">Quantidade</label>
                    </div><br>
                    <div class="text-right">
                        <a class="mdl-button mdl-js-button mdl-rigth mdl-button--raised mdl-button--icon mdl-button--colored mdl-js-ripple-effect material-icons" id="addPeca">
                            <i class="material-icons">add</i>
                        </a>
                    </div>
                </div><br>
                <div>
                    <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp tabela-produto">
                        <thead>
                            <tr>
                                <th>Tamanho</th>
                                <th>Quantidade</th>
                            </tr>
                        </thead>
                        <tbody id="elementos-tabela">

                        </tbody>
                    </table>
                </div><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" required="" name="valorEntrada" id="sample4" pattern="[0-9 .]*">
                    <label for="sample4" class="mdl-textfield__label">Valor de Entrada</label>
                    <span class="mdl-textfield__error">Apenas números e .(ponto)</span>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input type="text" class="mdl-textfield__input" required="" name="valorSaida" id="sample5" pattern="[0-9 .]*">
                    <label for="sample5" class="mdl-textfield__label">Valor de Saída</label>
                    <span class="mdl-textfield__error">Apenas números e .(ponto)</span>
                </div><br><br>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <textarea name="descricao" rows="3" class="mdl-textfield__input" id="sample6"></textarea>
                    <label for="sample6" class="mdl-textfield__label">Descrição</label>
                </div><br><br>
                <datalist id="marcas">
                    <c:forEach items="${marcas}" var="marca">
                        <option value="${marca.nome}"></option>
                    </c:forEach>
                </datalist>
                <datalist id="generos">
                    <option value="Masculino"></option>
                    <option value="Feminino"></option>
                </datalist>
                <datalist id="tiposMasculino">
                    <option value="Bermuda"></option>
                    <option value="Calça"></option>
                    <option value="Camisa"></option>
                    <option value="Carteira"></option>
                    <option value="Cinto"></option>
                </datalist>
                <datalist id="tiposFeminino">
                    <option value="Blusa"></option>
                    <option value="Calça"></option>
                    <option value="Calçado"></option>
                    <option value="Cinto"></option>
                    <option value="Roupa Íntima"></option>
                    <option value="Saia"></option>
                    <option value="Short"></option>
                </datalist>
                <datalist id="tamanhos">
                    <option value="P"></option>
                    <option value="M"></option>
                    <option value="G"></option>
                    <option value="GG"></option>
                    <option value="34"></option>
                    <option value="36"></option>
                    <option value="38"></option>
                    <option value="40"></option>
                    <option value="42"></option>
                    <option value="44"></option>
                    <option value="Infantil"></option>
                    <option value="Infanto-Juvenil"></option>
                </datalist>
                <input type="file" class="invisible" name="imagem" id="upload"><br>
                <input type="submit" value="Cadastrar" class="mdl-button mdl-js-button mdl-button--colored mdl-button--raised"><br><br>
            </form>
        </div>
        <script>
            function gerarCodigo(codigos) {
                codigos instanceof Array;

                var codigo = Math.floor(Math.random() * 9999);

                for (i = 0; i < codigo.length; i++) {
                    if (codigo === codigos[i])
                        codigo = gerarCodigo(codigo);
                }

                $('#codigo').val(codigo+' ');
                $('#sample1').addClass('is-dirty');
            }
        </script>
    </body>
</html>
