/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var registrar = {
    btnGuardar: null,
    formulario: null,
    init: function () {
        this.btnGuardar = $("#btnGuardar");
        this.formulario = $("#formulario");
        this.btnGuardar.on("click", function () {
            registrar.guardarAlumno();
        });
    },
    guardarAlumno: function () {
        $.ajax({
            type: 'POST',
            url: "RegistrarAlumno",
            data: registrar.formulario.serialize(),
            async: false,
            success: function (data) {
                if(data.codigo===1){
                    window.open("principal.html","_self");
                }
                alert(data.mensaje);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(errorThrown);
            }
        });
    }
};
registrar.init();

