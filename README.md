
# ✅ Banco Digital — Checklist de Funcionalidades e Estrutura

Este projeto é um sistema bancário digital desenvolvido em Java com Spring Boot, focado em boas práticas de arquitetura, segurança e escalabilidade. O objetivo é simular operações bancárias reais, como cadastro de clientes, movimentação de contas, autenticação segura e integração com serviços externos. O sistema foi iniciado em arquitetura monolítica, com planejamento para migração futura para microsserviços, visando maior flexibilidade e manutenção. O projeto também serve como base de estudos para conceitos modernos de desenvolvimento backend, integração contínua e documentação automatizada.

---

## 📌 Arquitetura Geral

- [x] Início em arquitetura **monolítica**
- [ ] Transição planejada para arquitetura **baseada em microsserviços**
- [ ] Documentação das decisões de arquitetura (monolito → microserviços)
- [ ] Uso de **containers Docker** para isolar serviços
- [ ] Separação por **módulos/domínios**: Cliente, Conta, Transações, Crédito, etc.

---

## 🔐 Autenticação & Segurança

- [ ] Criação de endpoints protegidos
- [ ] Spring Security configurado (com boas práticas)
- [ ] OAuth2/JWT para autenticação segura
- [ ] Rate-limiting / proteção contra brute force

---

## 🧩 Microsserviços Planejados

- [ ] Serviço: **clientes** (CRUD, verificação de dados)
- [ ]Serviço: **contas** (vinculação, saldo, histórico)
- [ ] Serviço: **transações** (PIX, TED, depósito, saque)
- [ ] Serviço: **empréstimos/crédito** (análise, aprovação)
- [ ] Serviço: **SWIFT/transferência internacional** (simulado)
- [ ] Serviço: **notificações** (e-mail, push, logs)

---

## 🌐 Integrações REST

- [ ] Exposição de APIs REST com Spring Boot
- [ ] Consumo de APIs entre serviços por HTTP
- [ ] Uso de JSON como formato padrão
- [ ] Criação de contratos de API (Swagger/OpenAPI)

---

## 🌍 Simulação SWIFT (Transferência Internacional)

- [ ] Criação de DTO para mensagem MT103
- [ ] Serviço que gera mensagem MT103 simulada
- [ ] Endpoint REST para envio de transferência internacional
- [ ] Logs detalhados com ID de rastreio
- [ ] Histórico de mensagens enviadas
- [ ] Painel visual para análise de mensagens

---

## 📱 Comunicação com apps externos

- [ ] REST API compatível com:
  - [ ] App Android
  - [ ] App iOS
  - [ ] Aplicação web (navegador)
- [ ] Suporte a CORS para aplicações frontend
- [ ] Autenticação token-based (JWT) para apps móveis

---

## 📈 Integração com dados externos

- [ ] Integração com API da B3 (dados da bolsa de valores)
- [ ] Armazenamento e exibição de cotações
- [ ] Atualização periódica automática via scheduler

---

## 📂 Repositórios e Controle de Equipes

- [ ] Separação de repositórios por serviço
- [ ] Controle de acesso por equipe (ex: equipe de cliente ≠ equipe de crédito)
- [ ] Documentação pública por serviço:
  - [ ] Requisições suportadas
  - [ ] Respostas esperadas
  - [ ] Códigos de erro

---

## 📦 Ferramentas e Gerenciamento

- [ ] Uso de Maven como gerenciador de dependências
- [ ] Uso do Spring Boot para aceleração de projeto
- [ ] Configuração de ambientes: `dev`, `test`, `prod`
- [ ] CI/CD automatizado para serviços (GitHub Actions, Jenkins, etc.)
- [ ] Dockerfile para cada microsserviço

---

## 📺 Divulgação do Projeto

- [ ] Apresentação da ideia no YouTube
- [ ] Demonstração da evolução (monolito → microsserviços)
- [ ] Documentar arquitetura no README principal
- [ ] Criar vídeos explicando decisões técnicas

---

## 📋 Extras e Futuras Funcionalidades

- [ ] Implementar rate-limiting com Spring Cloud Gateway
- [ ] Simular Score de Crédito interno
- [ ] API para geração de boletos
- [ ] Sistema de cartões virtuais
- [ ] Cadastro e autenticação com biometria (mock)

---

> **Status:** em andamento  
> **Desenvolvedor:** GABRIEL MARTINS

=======
>>>>>>> b938a5519b1a4b9aeb07858a12a163db35d85c32

