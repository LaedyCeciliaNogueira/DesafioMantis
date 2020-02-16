#language: pt
#autor: laedyceci@gmail.com

Funcionalidade: Realizar e Validar Login

  Esquema do Cenário: O usuário realiza login no Mantis
    Dado que o usuário esteja no "https://mantis-prova.base2.com.br/my_view_page.php"
    Entao ele irá realizar login com <Usuario> e <Senha>
    E o sistema valida o login do <Usuario>

    Exemplos: 
      | Usuario       | Senha    |
      | laedy.cecilia | 123Teste |
