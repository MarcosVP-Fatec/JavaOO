package pereira.vinicio.marcos.JavaOO.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class HomeController {
    
    @GetMapping
    ResponseEntity<String> benVindo(){

        String body = "<h1>Java Orientado a Objetos</h1><br><br>"
                    + "<h2>Rotas para teste:</h2><br><ol>"
                    + "<li>Lista Func, ano, mês, Salário, benefício:<br>/JavaOO/listasalariosbeneficios/</li>"
                    + "</ol>";

        return new ResponseEntity<String>(body, HttpStatus.OK);

    }    

   
}
