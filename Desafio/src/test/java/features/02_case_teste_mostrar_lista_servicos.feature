# language: pt

@run
Funcionalidade: Acessar o site da accenture a mostrar a lista de servicos

	Contexto:
		Dado que eu estou no "site da accenture"
    E clico no menu "servicos"
    
  Esquema do Cenario: listar serviços da Accenture
    Entao devo ver os servicos abaixo
      | Application Services         |
      | Artificial Intelligence      |
      | Automation                   |
      | Business Process Services    |
      | Change Management            |
      | Cloud                        |
      | Customer Experience          |
      | Data & Analytics             |
      | Ecosystem Partners           |
      | Finance Consulting           |
      | Industry X                   |
      | Infrastructure               |
      | Marketing                    |
      | Mergers & Acquisitions (M&A) |
      | Operating Models             |
      | Security                     |
      | Supply Chain Management      |
      | Sustainability               |
      | Technology Consulting        |
      | Technology Innovation        |
      | Zero Based Budgeting (ZBB)   |

  Cenário: Clicar no serviço cloud
    E clico no item do menu "cloud"
    Então devo encontrar o título "Serviços de Cloud"
