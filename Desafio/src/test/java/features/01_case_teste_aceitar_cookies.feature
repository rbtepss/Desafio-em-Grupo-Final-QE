#language: pt

@run
@aceitarCookies

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD

Contexto:
	 Dado que eu estou no "site da accenture"
   E abro as configurações de cookies
	 E clico em Confirmar minhas escolhas
	 
  Cenário: Aceitar o cookie LGPD
    Então deve fechar o modal

  Cenario: Configuracoes do cookie
    Quando clico em configuracoes de cookie
    Entao devo ver o item de "sua privacidade"
    E devo ver "Cookies estritamente necessarias"
    E devo ver "Cookies Analiticos de Primeira Parte"
    E devo ver "Cookies de Desempenho e Cookies Funcionais"
    E devo ver "Cookies de Publicidade e Redes Sociais"
    
