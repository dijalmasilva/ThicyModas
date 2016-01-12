<%-- 
    Document   : usuarios
    Created on : 10/01/2016, 08:42:36
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
        <h2>Usuários</h2>
        <br>
        <div>
            <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp table-center">
                <thead>
                    <tr>
                        <th>Nome de Usuário</th>
                        <th>Nome Completo</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${usuarios}" var="usuario">
                        <tr>
                            <td>${usuario.nomeDeUsuario}</td>
                            <td>${usuario.nomeCompleto}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
