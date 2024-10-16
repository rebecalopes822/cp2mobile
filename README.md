# Sistema de Cadastro e Consulta de Usuários para Eventos

## Descrição do Projeto

Este é um sistema simples para cadastro de participantes de eventos, como workshops, palestras ou hackathons. A ideia é permitir que organizadores coletem informações dos participantes e exibam um resumo após o cadastro, ajudando no gerenciamento do evento.

## Tecnologias Utilizadas

- **Kotlin** para desenvolvimento Android.
- **Android Studio** como ambiente de desenvolvimento.
- **XML** para criação dos layouts.
- **NavHostFragment** para gerenciar a navegação entre telas.
- **Internacionalização** com arquivos `strings.xml` (PT-BR e EN).

## Funcionalidades

1. **Tela de Boas-Vindas**  
   Apresenta uma mensagem de boas-vindas ao usuário e um botão para iniciar o cadastro.

2. **Formulário de Cadastro**  
   O formulário contém três campos: **Nome**, **Email** e **Categoria** (via Spinner). Após o preenchimento, o usuário é direcionado para uma tela de resumo.

3. **Tela de Resumo**  
   Exibe o nome, email e categoria fornecidos, além de um botão para retornar ao formulário.

4. **Navegação Intuitiva**  
   Utilizamos o **NavHostFragment** para facilitar a transição entre a tela de boas-vindas, o formulário e o resumo.

5. **Suporte a Português e Inglês**  
   A aplicação oferece suporte a PT-BR e EN através dos arquivos `strings.xml`.

## Estrutura do Projeto

- **MainActivity**: Exibe a tela de boas-vindas.
- **FormFragment**: Contém o formulário para preenchimento dos dados.
- **ResultFragment**: Mostra o resumo das informações preenchidas.
- **NavHostFragment**: Gerencia a navegação entre as telas.

## Requisitos Atendidos

- **Fragmentos**: Foram criados dois fragmentos (FormFragment e ResultFragment).
- **Activities**: A MainActivity funciona como tela principal e de boas-vindas.
- **Formulário Completo**: Inputs de Nome, Email e Categoria.
- **Internacionalização**: Suporte a português e inglês.
- **Imagens e Design Atrativo**: Uso de imagens e espaçamento adequado entre componentes.
- **LinearLayout**: Utilizado no layout da MainActivity e ResultFragment.

## Responsáveis pelo Projeto

- **Rebeca Lopes** (RM553764)  
- **Giovanna Lima** (RM553369) 

## Como Executar

1. **Clone o Repositório:**
   ```bash
   git clone <URL_DO_REPOSITÓRIO>
