$(document).ready(function () {

    //upload de imagens
    jQuery("#arq").click(function () {
        jQuery("#upload").trigger('click');
    });

    jQuery("#upload").change(function () {
        var arq = jQuery("#upload").val().replace(/^.*\\/, "");
        jQuery("#arq").text(arq);
    });

    //Mask textfield
//    $('#cpf').mask('999.999.999-99');
//    $('#telefone').mask('(99) 99999-9999');
//    $('#aniversario').mask('99/99/9999');

    $("#addPeca").click(function () {
        var tamanho = $('#tam').val();
        var qtde = $('#qtde').val();

        $('#elementos-tabela').after("<tr data-mdl-data-table-selectable-name='pecas[]' data-mdl-data-table-selectable-value='" + tamanho + ", " + qtde + "'>" +
                "<td>" + tamanho + "</td>" +
                "<td>" + qtde + "</td>" +
                "</tr>");

                $('#tam').val("");
                $('#qtde').val("");
                $('#tam').focus();
    });
    
    $('#gen').change(function (){
        var generoSelecionado = $("#gen").val();
        
        if (generoSelecionado === 'Masculino'){
            jQuery('#roupas').attr('list', 'tiposMasculino');
        }else{
            jQuery('#roupas').attr('list', 'tiposFeminino');
        }
    });
});