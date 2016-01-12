<%-- 
    Document   : clientes
    Created on : 10/01/2016, 10:20:36
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
    <body>
        <%@include file="headerGeral.jsp" %>
        <br><br><br>
        <h2>Clientes</h2>
        <br>
        <div>
            <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp table-center">
                <thead>
                    <tr>
                        <th>CPF</th>
                        <th>Nome Completo</th>
                        <th>Limite</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${clientes}" var="cliente">
                        <tr>
                            <td>${cliente.cpf}</td>
                            <td>${cliente.nomeCompleto}</td>
                            <td>${cliente.limite}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
