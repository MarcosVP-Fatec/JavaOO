package pereira.vinicio.marcos.JavaOO.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterCors implements Filter {

    private ServletContext context;

    public void doFilter( ServletRequest req
                        , ServletResponse res
                        , FilterChain chain)
            throws IOException, ServletException {

        // Primeiramente estamos gerando log do mÃ©todo da requisiÃ§Ã£o
        HttpServletRequest request = (HttpServletRequest) req;
        this.context.log(">>>>>>> CORSFilter HTTP Request: " + request.getMethod());

        // Autoriza
        // Respostas para o navegador
        HttpServletResponse response = (HttpServletResponse) res;
        response.addHeader("Access-Control-Allow-Origin" , "*"); // Aqui eu colocaria meus domÃ­nios que terÃ£o autorizaÃ§Ã£o
        response.addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD, PUT, POST, DELETE, PATCH");
        response.addHeader("Access-Control-Allow-Headers", "*");

        // Para requisicoes com metodo OPTIONS
        // Alguns navegadores perguntam antes se pode mandar a requisiÃ§Ã£o. Esta Ã© uma
        // requisÃ§Ã£o tipo
        // fake sÃ³ perguntando se pode. Depois manda a requisiÃ§Ã£o de verdade GET, POST,
        // etc.
        // Quando o navegador manda um OPTIONS espera receber um status de aceito.
        // No caso de OPTIONS jÃ¡ retorna e nÃ£o passa adiante pelo chain.
        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_ACCEPTED);
            return;
        }
        // Passa adiante demais requisicoes
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
        // Aqui pode-se desalocar qualquer recurso
    }

    /**
     * @apiNote init Contrutor do Filtro
     */
    @Override
    public void init(FilterConfig config) throws ServletException {
        this.context = config.getServletContext();
        this.context.log(">>>>>>> CORSFilter inicializado!");
    }

}