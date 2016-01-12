/* 
 * @autor Dijalma Silva <dijalmacz@gmail.com>
 * 
 * Created in 08/01/2015 - 23:00
 * 
 * Necessita de Jquery
 * 
 * Script para criar mascaras para inputs em HTML
 */

$(document).ready(function () {


    //Mask CPF
    $('#cpf').keyup(function (evt) {

        var cpf = $("#cpf").val();
        var key = evt.which;
        if ((cpf.length === 3 || cpf.length === 7) && (key !== 8 && key !== 46)) {
            cpf += '.';
            $('#cpf').val(cpf);
        }

        if (cpf.length === 11 && (key !== 8 && key !== 46)) {
            cpf += '-';
            $('#cpf').val(cpf);
        }
    });

    //Mask Telefone - Celular
    $("#telefone").focus(function () {

        var telefone = $("#telefone").val();

        if (telefone.length === 0 ) {
            $("#telefone").val('(');
            $("#telefone").focus();
        }
    });

    $("#telefone").keyup(function (evt) {

        var telefone = $("#telefone").val();
        var key = evt.which;
        if ((telefone.length === 3) && (key !== 8 && key !== 46)) {
            telefone += ')';
            $('#telefone').val(telefone);
        }
        if ((telefone.length === 4) && (key !== 8 && key !== 46)) {
            telefone += ' 9 ';
            $('#telefone').val(telefone);
        }
        if ((telefone.length === 11) && (key !== 8 && key !== 46)) {
            telefone += '-';
            $('#telefone').val(telefone);
        }
    });
});