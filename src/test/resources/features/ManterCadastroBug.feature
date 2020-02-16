#language: pt
#autor: laedyceci@gmail.com

Funcionalidade: Cadastrar BUG no Mantis

  Esquema do Cenário: O usuário é capaz de realizar o cadastro de bug no Mantis
    Dado que o usuário esteja no "https://mantis-prova.base2.com.br/my_view_page.php"
    Entao ele irá realizar login com <Usuario> e <Senha>
    E seleciona o <Projeto> para iniciar o cadastro do bug
    E preenche os dados e salva
    Entao o sistema valida o cadastro

    Exemplos: 
      | Usuario       | Senha    | Projeto                 |
      | laedy.cecilia | 123Teste | Laedy Cecilia´s Project |
