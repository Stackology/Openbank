
# Regras de Segurança

## 1. Objetivo
Este documento tem como objetivo definir as principais regras de segurança a serem seguidas no projeto, garantindo a proteção dos dados e a integridade do sistema.

## 2. Princípios Gerais
- Nunca compartilhe senhas ou informações sensíveis em código ou repositórios.
- Utilize variáveis de ambiente para armazenar dados confidenciais.
- Realize validação de entrada de dados para evitar ataques como SQL Injection.
- Mantenha as dependências do projeto sempre atualizadas.
- Implemente autenticação e autorização adequadas para cada endpoint.

## 3. Boas Práticas
- Faça uso de logs para monitorar atividades suspeitas.
- Limite tentativas de login para evitar ataques de força bruta.
- Utilize criptografia para dados sensíveis em trânsito e em repouso.
- Realize revisões de código focadas em segurança.

## 4. Exemplo de Implementação
```java
// Exemplo de uso de variáveis de ambiente para senha
String dbPassword = System.getenv("DB_PASSWORD");
```

## 5. Glossário
- Palavra nova em inglês: vulnerability (vulnerabilidade)
  - Exemplo: "Always check your code for vulnerabilities before deploying."

Essas regras devem ser revisadas periodicamente para garantir a segurança contínua do projeto.
