function validarForma(forma){
    var usuario=forma.usuario;
    if(usuario.value==""|| usuario.value=="Escribir usuario"){
        alert("debe completar el campo!!");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password=forma.password;
    if(password=="" || password.value.length<3){
        alert("proporcionar password de al menos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias=forma.tecnologia;
    var checkSeleccionado=false;
    for(var i=0; i<=tecnologias.length;i++){
        if(tecnologias[i].checked){
            checkSeleccionado=true;
        }
        
    }
    if(!checkSeleccionado){
      alert("SELECCIONA UNA TECNOLOGIA");
        return false;
    }
    return true;
    
    var generos=forma.genero;
    var radioSeleccionado=false;
    for(var i=0; i<generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado=true;
        }
    }
    if(!radioSeleccionado){
        
        alert("SELECCIONE GENERO");
        return false;
    }
    var ocupacion=forma.ocupacion;
    if(ocupacion.value==""){
        alert("SELECCIONE UNA OCUPACION");
        return false;
    }
    
    alert("formulario valido!");
    return true;
}

