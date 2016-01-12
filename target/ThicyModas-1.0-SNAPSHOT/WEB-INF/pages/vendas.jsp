<%-- 
    Document   : vendas
    Created on : 27/12/2015, 10:23:21
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <body>
        <%@include file="headerGeral.jsp" %>
        <br><h1>Vendas</h1><br>
        <div class="modal-dialog">
            <table class="table table-bordered table-striped table-hover">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Data da venda</th>
                        <th>Forma de pagamento</th>
                        <th>Cliente</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${vendas}" var="venda">
                        <tr onclick="clicar(${venda.codigo})">
                            <td>${venda.codigo}</td>
                            <td>${venda.data}</td>
                            <td>${venda.formaDePagamento}</td>
                            <td>${venda.cliente}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
