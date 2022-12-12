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
                    + "<li>Método que recebe uma lista de funcionários, mês e ano e retorna o valor total pago (salário e benefício) a esses funcionários no mês:<br><b>/JavaOO/lista/salarios-beneficios/</b></li>"
                    + "<li>Método que recebe uma lista de funcionários, mês e ano e retorna o total pago somente em salários no mês:<br><b>/JavaOO/lista/salarios-no-mes/</b></li>"
                    + "<li>Método que recebe uma lista somente com os funcionários que recebem benefícios, mês e ano e retorne o total pago em benefícios no mês:<br><b>/JavaOO/lista/beneficios-no-mes/</b></li>"
                    + "<li>Método que recebe uma lista de funcionários, mês e ano e retorne o que recebeu o valor mais alto no mês:<br><b>/JavaOO/lista/maior-recebimento-no-mes/</b></li>"
                    + "<li>Método que recebe uma lista somente com os funcionários que recebem benefícios, mês e ano e retorne o nome do funcionário que recebeu o valor mais alto em benefícios no mês:<br><b>/JavaOO/lista/maior-beneficio-no-mes/</b></li>"
                    + "<li>Método que recebe uma lista de vendedores, mês e ano e retorne o que mais vendeu no mês.:<br><b>/JavaOO/lista/maior-venda-no-mes/</b></li>"
                    + "</ol>";

        return new ResponseEntity<String>(body, HttpStatus.OK);

    }    

   
}
