# language: pt

@run
@sobre
Funcionalidade: Sobre a accenture

Cenário: Ver as características da accenture
	#Dado que eu estou no <site> da accenture
	#Quando clico no <menu> sobre a accenture
	#Quando clico no item do menu <sobre> a accenture
	#Então devo ver o título destacado <destaque>
	Dado que eu estou no "site da accenture"
	Quando clico no menu "sobre a accenture"
	E clico no item do menu "sobre a accenture"
	Então devo ver o destaque em "Nosso propósito:"

#Exemplos:
#	|site																|menu								|sobre 							|titulo					 |
	#|"https://www.accenture.com/br-pt"	|"sobre a accenture"|"sobre a accenture"|"Nosso propósito:"|
	