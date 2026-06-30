# 🎧 Helpdesk - Frontend

Interface web do sistema de helpdesk, desenvolvida em Angular. Permite que clientes abram chamados, técnicos realizem atendimentos e administradores gerenciem todo o fluxo.

## 🚀 Tecnologias

- **Angular 13** com **TypeScript**
- **Angular Material** para componentes de UI
- **HTML5 / CSS3**
- Integração com a [API REST do backend](https://github.com/Cristianoalves226/helpdesk-backend)

## ⚙️ Como rodar localmente

### Pré-requisitos
- Node.js 14+
- Angular CLI

```bash
# Instale o Angular CLI (caso não tenha)
npm install -g @angular/cli

# Clone o repositório
git clone https://github.com/Cristianoalves226/helpdesk-front.git
cd helpdesk-front

# Instale as dependências
npm install

# Rode a aplicação
ng serve
```

Acesse em `http://localhost:4200`

> ⚠️ Certifique-se de que o [backend](https://github.com/Cristianoalves226/helpdesk-backend) está rodando antes de iniciar o frontend.

## 📌 Funcionalidades

- ✅ Tela de login com autenticação JWT
- ✅ Dashboard com visão geral dos chamados
- ✅ Abertura de novos chamados
- ✅ Acompanhamento de status (Aberto, Em atendimento, Encerrado)
- ✅ Atendimento e encerramento de chamados (perfil Técnico)
- ✅ Gerenciamento de usuários (perfil Admin)

## 🔐 Perfis de usuário

| Perfil | Acesso |
|---|---|
| Admin | Painel completo, gerencia usuários e chamados |
| Técnico | Visualiza e atende chamados atribuídos |
| Cliente | Abre e acompanha seus próprios chamados |

## 🔗 Repositório do Backend

👉 [helpdesk-backend](https://github.com/Cristianoalves226/helpdesk-backend)

## 👨‍💻 Autor

**Cristiano Alves de Campos**  
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cristiano-alves-de-campos-7916b9ba/)
[![Gmail](https://img.shields.io/badge/-Gmail-333?style=flat&logo=gmail&logoColor=red)](mailto:c.alvesdecampos@gmail.com)
