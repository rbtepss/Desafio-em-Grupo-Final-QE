#language: pt

@run
@listaCarreiras
Funcionalidade: Acessar a lista de carreiras da accenture

  Cenário: Acessar o item de vagas de tecnologia
    Dado que eu estou no "site da accenture"
    E clico no menu "carreiras"
    E clico no item do menu "Vagas em tecnologia"
    Então devo ver o destaque em "Carreiras em Tecnologia"
    
    
@vagas1
    Cenário: Procurando uma vaga
			Dado que eu estou no "site da Accenture"
			Quando acesso a area de carreiras
			E clico em procurar vagas
			E digito no campo de busca <carreira>
			E clico no botão procurar
			Então devo encontrar vagas para <vagas>
				
		Exemplos:
 			  |carreira				 |vagas							 |
  		  |"desenvolvedor" |"Desenvolvedor"		 |
  