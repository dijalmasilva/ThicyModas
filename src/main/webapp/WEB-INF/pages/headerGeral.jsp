<%-- 
    Document   : headerGeral
    Created on : 23/12/2015, 20:55:33
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="mdl-layout mdl-js-layout ">
    <header class="mdl-layout__header">
        <div class="mdl-layout-icon material-icons"></div>
        <div class="mdl-layout__header-row">
            <span class="mdl-layout__title">Thicy Modas</span>
            <div class="mdl-layout-spacer"></div>
        </div>
    </header>
    <div class="mdl-layout__drawer">
        <span class="mdl-layout__title">Menu</span>
        <nav class="mdl-navigation">
            <a class="mdl-navigation__link" href="novaVenda" title="Nova venda">Nova Venda
                <button class="mdl-button mdl-button--icon mdl-js-button">
                    <span class="material-icons">add_shopping_cart</span>
                </button>
            </a>
            <div>
                <a class="mdl-navigation__link" href="#" > Cadastrar
                    <button class="mdl-button mdl-button--icon mdl-js-button" id="menu1" title="Cadastrar">
                        <span class="material-icons">add_circle_outline</span>
                    </button>
                </a>
            </div>
            <a class="mdl-navigation__link" href="estoque">Estoque
                <button class="mdl-button mdl-button--icon mdl-js-button" title="Estoque">
                    <img src="images/dropbox15.png" class="material-icons">
                </button>
            </a>
            <a class="mdl-navigation__link" href="#">Visualizar
                <button class="mdl-button mdl-button--icon mdl-js-button" id="menu2" title="Visualizar">
                    <span class="material-icons">rate_review_white</span>
                </button>
            </a>
            <a class="mdl-navigation__link" href="#">Finanças
                <button class="mdl-button mdl-button--icon mdl-js-button" title="Finanças">
                    <span class="material-icons">event_note</span>
                </button>
            </a>
        </nav>
    </div>
    <ul for="menu1" class="mdl-menu mdl-js-menu mdl-js-ripple-effect">
        <a href="novoCliente"><li class="mdl-menu__item" >Cliente</li></a>
        <a href="novoProduto"><li class="mdl-menu__item" >Produto</li></a>
        <a href="novoUsuario"><li class="mdl-menu__item" >Usuário</li></a>
        <a href="novoFornecedor"><li class="mdl-menu__item" >Fornecedor</li></a>
        <a href="novaMarca"><li class="mdl-menu__item" >Marca</li></a>
    </ul>
    <ul for="menu2" class="mdl-menu mdl-js-menu mdl-js-ripple-effect">
        <a href="vendas"><li class="mdl-menu__item" >Vendas</li></a>
        <a href="clientes"><li class="mdl-menu__item" >Clientes</li></a>
        <a href="usuarios"><li class="mdl-menu__item" >Usuários</li></a>
        <a href="fornecedores"><li class="mdl-menu__item" >Fornecedores</li></a>
        <a href="marcas"><li class="mdl-menu__item" >Marcas</li></a>
    </ul>
</div>