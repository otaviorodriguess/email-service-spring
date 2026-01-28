<h1 align="center">📧 Email Service — Spring Boot</h1>

<p align="center">
  API de envio de e-mails desenvolvida com <strong>Java + Spring Boot</strong>,
  com arquitetura desacoplada e preparada para uso real.
</p>

<hr>

<h2>🚀 Sobre o projeto</h2>

<p>
Este projeto é um serviço de envio de e-mails criado para centralizar
comunicações de sistemas como cadastro, recuperação de senha e notificações.
A aplicação permite trocar o provedor de e-mail sem alterar a regra de negócio.
</p>

<h2>🧠 Conceitos aplicados</h2>

<ul>
  <li>API REST</li>
  <li>Arquitetura em camadas</li>
  <li>Injeção de dependência</li>
  <li>Padrão Strategy</li>
  <li>Baixo acoplamento</li>
</ul>

<h2>🧩 Tecnologias</h2>

<ul>
  <li>Java 17</li>
  <li>Spring Boot 3</li>
  <li>Maven</li>
  <li>Git & GitHub</li>
</ul>

<h2>📬 Endpoint</h2>

<pre>
POST /email
</pre>

<h3>Exemplo de requisição</h3>

<pre>
{
  "to": "email@exemplo.com",
  "subject": "Teste",
  "message": "Mensagem enviada pela aplicação"
}
</pre>

<h2>▶️ Como rodar</h2>

<pre>
git clone https://github.com/otaviorodriguess/email-service-spring.git
cd email-service
mvn spring-boot:run
</pre>

<h2>🔌 Provedores</h2>

<p>
O sistema foi preparado para integração com serviços como
<strong>Brevo, AWS SES, SendGrid</strong> ou SMTP.
</p>

<h2>📈 Evoluções futuras</h2>

<ul>
  <li>Integração real com provedor</li>
  <li>Failover automático</li>
  <li>Fila de mensagens</li>
  <li>Deploy em nuvem</li>
</ul>

<hr>

<p align="center">
  Desenvolvido por <strong>Otávio Rodrigues</strong><br>
  <a href="https://github.com/otaviorodriguess">GitHub</a>
</p>
