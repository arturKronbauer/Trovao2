Teste Trovão 2
Programação Orientada a Objetos
Prof. Artur Henrique Kronbauer

Cenário:

Você está criando um sistema para uma biblioteca. A biblioteca possui diferentes tipos de mídia, como livros e revistas. Você também deseja rastrear informações sobre os títulos disponíveis no acervo. Para isso, você deve usar classes e interfaces para representar os objetos relacionados à biblioteca.

Questão:

Projete um sistema de classes e interfaces em uma linguagem de programação orientada a objetos que atenda aos requisitos acima. Aqui estão as principais entidades a serem representadas:

ItemDeMidia: Uma classe abstrata que serve como base para todos os tipos de mídia na biblioteca. Ela deve conter atributos como título e ano de publicação.

Livro: Uma classe que herda de ItemDeMidia e contêm como atributos o ISBN e uma lista de autores. Deve conter os métodos para adicionar e retornar os autores de um livro.

Revista: Classe que herda de ItemDeMidia. Esta classe deve conter o número de edição para revistas.

Autor: Uma classe que representa um autor. Deve conter atributos como nome e data de nascimento.

Biblioteca: Uma classe que mantém uma lista de ItemDeMidia disponíveis na biblioteca. Ela deve ser capaz de adicionar itens e percorrer o ArrayList de ItemDeMidia para encontrar uma mídia por título.

Pesquisavel: Uma interface que deve ser implementada por todas as classes que podem ser pesquisadas na biblioteca. Deve conter um método pesquisar.

Projete as classes de forma que seja possível adicionar autores, itens de mídia, e pesquisar itens pelo título.

Você pode usar uma estrutura de dados como ArrayList para manter a lista de itens na biblioteca e a lista de autores de livros.

Utilize os conceitos de composição, herança, polimorfismo, classes abstratas e interfaces.

Crie todos os construtores necessários para as classes, gets e sets e toString conforme o Exemplo de Interação apresentado no final deste documento.

Exemplo de Interação

Informe o número de mídias: 3

*** Dados da Mídia 1 ***

Qual o tipo (1)Livro (2)Revista: 2

Informe o título: ACM

Informe o ano de publicação: 2023

Qual o número de edição da revista: 4

*** Dados da Mídia 2 ***

Qual o tipo (1)Livro (2)Revista: 1

Informe o título: Java como programar

Informe o ano de publicação: 2017

Informe o ISBN: 1234

Informe o número de autores: 2

Informe o nome do Autor 1: Suzana Daitel

Informe a data de nascimento: 24/05/1980

Informe o nome do Autor 2: Mario Daitel

Informe a data de nascimento: 27/08/1978

*** Dados da Mídia 3 ***

Qual o tipo (1)Livro (2)Revista: 2

Informe o título: Tecnologia

Informe o ano de publicação: 2022

Qual o número de edição da revista: 1

*** Acervo da Biblioteca ***

Título = ACM 

Ano Publicação = 2023

Número da Edição = 4

----------

Título = Java como programar 

Ano Publicação = 2017

Autores: 

Suzana Daitel 

Mario Daitel 

----------

Título = Tecnologia 

Ano Publicação = 2022

Número da Edição = 1

----------

Qual o título a ser pesquisado: programar

Título: Java como programar

