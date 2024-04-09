package com.test.Test.util;

import com.test.Test.config.ConfigYml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Validations {
    //se llama a clase ConfigYml ya que en esta se utiliza
    //los regex que se definieron en application.yml
    @Autowired
    ConfigYml configYml;

    //funcion para validar el formato del email con regex definido
    public boolean validarRegexEmail(String email){
        boolean valid = email.matches(configYml.getEmail());
        return valid;
    }

    //funcion para validar el formato de la contraseña con regex definido
    public boolean validarRegexContrasena(String contrasena){
        boolean valid = contrasena.matches(configYml.getPass());
        return valid;
    }

}
