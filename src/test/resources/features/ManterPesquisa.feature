#language: pt
#autor: laedyceci@gmail.com

Funcionalidade: Validacao de retorno de BUG no Mantis

  Esquema do Cenário: O usuário esquisa um bug com Id válido Mantis
    Dado que o usuário esteja no "https://mantis-prova.base2.com.br/my_view_page.php"
    Entao ele irá realizar login com <Usuario> e <Senha>
    E realiza a pesquisa do Bug por um ID válido
    Entao sistema retorna o resultado

    Exemplos: 
      | Usuario       | Senha    |
      | laedy.cecilia | 123Teste |

  Cenário: O usuário pesquisa um bug com Id inválido Mantis
    E para verificar um retorno nulo o usuário insere um Id nulo
    Entao o sistema retorna uma msg de erro.
