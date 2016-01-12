<%-- 
    Document   : principal
    Created on : 07/12/2015, 16:34:03
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <body>
        <%@include file="headerPersonalizado.jsp" %>
        <br><br><br><br>
        <h3>Venda</h3>
        <div class="mdl-grid">
            <c:forEach items="${roupas}" var="roupa">
                <div class="mdl-cell mdl-cell--4-col background-rosa">
                    <div>
                        <h4>${roupa.nome}</h4>
                        <p>${roupa.descricao}</p>
                    </div>
                    <div class="mdl-cell--no-spacing">
                        <img src="images/dress.png" width="300">
                    </div>
                    <div>
                        <label>Preço: 22,21 R$</label><br>
                        <label>Qtde no estoque: 22 u</label>
                    </div>
                </div>
            </c:forEach>
            <div class="mdl-cell mdl-cell--4-col background-rosa">
                <div>
                    <h4>Nome do produto</h4>
                    <p>Descrição</p>
                </div>
                <div class="mdl-cell--no-spacing">
                    <img src="images/dress.png" width="300">
                </div>
                <div>
                    <label>Preço: 22,21 R$</label><br>
                    <label>Qtde no estoque: 22 u</label>
                </div>
            </div>
            <div class="mdl-cell mdl-cell--4-col background-rosa">
                <div>
                    <h4>Nome do produto</h4>
                    <p>Descrição</p>
                </div>
                <div class="mdl-cell--no-spacing">
                    <img src="images/dress.png" width="300">
                </div>
                <div>
                    <label>Preço: 22,21 R$</label><br>
                    <label>Qtde no estoque: 22 u</label>
                </div>
            </div>
            <div class="mdl-cell mdl-cell--4-col background-rosa">
                <div>
                    <h4>Nome do produto</h4>
                    <p>Descrição</p>
                </div>
                <div class="mdl-cell--no-spacing">
                    <img src="images/dress.png" width="300">
                </div>
                <div>
                    <label>Preço: 22,21 R$</label><br>
                    <label>Qtde no estoque: 22 u</label>
                </div>
            </div>
        </div>
    </body>
</html>