package Api.java;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        // Cria um servidor HTTP na porta 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Define um endpoint GET
        server.createContext("/api/hello", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "API Java Pura funcionando! 🚀";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        // Endpoit POST
        server.createContext("/api/echo", exchange -> {

                if ("POST".equals(exchange.getRequestMethod())) {
                    // Lê o corpo da requisição
                    String requestBody = new String(exchange.getRequestBody().readAllBytes());
                    String response = "Você enviou: " + requestBody;

                    exchange.sendResponseHeaders(200, response.length());
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                } else {
                    exchange.sendResponseHeaders(405, -1); // Não permitido
                }
        });

        // Inicia o servidor
        server.start();
        System.out.println("Servidor rodando em http://localhost:8080/api/hello");
    }
}