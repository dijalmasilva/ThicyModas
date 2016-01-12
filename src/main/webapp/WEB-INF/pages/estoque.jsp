<%-- 
    Document   : estoque
    Created on : 26/12/2015, 20:38:07
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
        <h1>Estoque</h1>
        <br>
        <div class="modal-dialog">
            <table class="mdl-data-table mdl-js-data-table table-center">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Marca</th>
                        <th>Tipo</th>
                        <th>Descrição</th>
                        <th>Tamanho</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${produtos}" var="produto">
                        <tr onclick="clicar(${produto.codigo})">
                            <td>${produto.codigo}</td>
                            <td>${produto.marca}</td>
                            <td>${produto.tipo}</td>
                            <td>${produto.descricao}</td>
                            <td>${produto.tamanho}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
