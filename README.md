
# 🚀 API Java Pura (Sem Frameworks)

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![GitHub Stars](https://img.shields.io/github/stars/seu-usuario/api-java-pura?style=social)](https://github.com/seu-usuario/api-java-pura)

Uma API REST minimalista construída com Java puro usando `HttpServer` nativo, perfeita para entender os fundamentos de HTTP sem frameworks.

## 📋 Índice
- [Visão Geral](#-visão-geral)
- [Endpoints](#-endpoints)
- [Como Executar](#-como-executar)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Testando com Postman](#-testando-com-postman)
- [Roadmap](#-roadmap)
- [Contribuição](#-como-contribuir)
- [Licença](#-licença)

## 🔍 Visão Geral
- **Linguagem**: Java 17+
- **Protocolo**: HTTP/1.1
- **Zero dependências externas**
- **Features**:
  - Tratamento de requisições GET/POST
  - Parsing manual de JSON
  - Configuração programática de rotas

## ⚡ Endpoints

| Método | Rota           | Descrição                     | Exemplo de Resposta               |
|--------|----------------|-------------------------------|-----------------------------------|
| `GET`  | `/api/hello`   | Mensagem de boas-vindas       | `"API Java Pura funcionando! 🚀"` |
| `POST` | `/api/echo`    | Ecoa o payload JSON recebido  | `"Você enviou: {"key":"value"}"`  |

## 🛠️ Como Executar

### Pré-requisitos
- JDK 17 ([Download](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html))
- Git (opcional)

### Passo a Passo
```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/api-java-pura.git
cd api-java-pura

# 2. Compile e execute
javac src/SimpleApi.java
java -cp src SimpleApi

# 3. Acesse no navegador ou Postman:
# GET http://localhost:8080/api/hello
