package com.test.Test.controller;

import com.test.Test.entity.User;
import com.test.Test.entity.UserResponse;
import com.test.Test.exception.ErrorMessages;
import com.test.Test.service.UserService;
import com.test.Test.util.Validations;
import jakarta.validation.ValidationException;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Validations validations;

    @Autowired
    private ErrorMessages errors;

    @PostMapping()
    public ResponseEntity<Object> saveUser(@NotNull @RequestBody User user){

        try{
        UserResponse newUserResponse = new UserResponse();

        //se valida si esxiste el usuario por medio del correo
        User userExists = userService.findByEmail(user.getEmail());
        if(userExists != null ){
            return ResponseEntity.status(HttpStatus.CONFLICT).body((errors.errorEmailRegistrado()));
        }

        //se valida si el correo cumple con el formato
        if(!validations.validarRegexEmail(user.getEmail())){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors.errorRegexEmail());
        }

        //se valida si la contraseña cumple con el formato
        if(!validations.validarRegexContrasena(user.getPassword())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors.errorRegexContrasena());
        }

        //se crea el nuevo usuario
        User newUser = this.userService.saveUser(user);
        userService.guardarUserConResponse(newUser, newUserResponse);

        return ResponseEntity.status(HttpStatus.CREATED).body(newUserResponse);

        } catch (ValidationException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors.userNulo());
        }
    }

    @GetMapping("")
    public String test(){
        return "HOLA MUNDO";
    }



}
