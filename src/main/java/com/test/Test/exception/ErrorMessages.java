package com.test.Test.exception;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class ErrorMessages {

    public Map<String, String> errorRegexEmail(){
        Map<String,String> mensaje = new HashMap<>();
        mensaje.put("mensaje:", "El formato del correo no es válido");
        return mensaje;
    }

    public Map<String, String> errorEmailRegistrado(){
        Map<String,String> mensaje = new HashMap<>();
        mensaje.put("mensaje:", "El correo ya esta registrado");
        return mensaje;
    }

    public Map<String, String> errorRegexContrasena(){
        Map<String,String> mensaje = new HashMap<>();
        mensaje.put("mensaje:", "La contraseña no cumple el formato");
        return mensaje;
    }

    public Map<String, String> userNulo(){
        Map<String,String> mensaje = new HashMap<>();
        mensaje.put("mensaje:", "El usuario no puede estar vacío");
        return mensaje;
    }
}
