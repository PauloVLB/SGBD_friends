//Título: SGBD_friends

Github Repository: https://github.com/isaacmarlon/SGBD_friends

//Descrição:

    O presente software é capaz de manipular ,de forma simplificada, dados em tabelas (entidades) de um
    mini banco de dados. A estruturação é baseada em arquivos binários que são preenchidos por objetos 
    serializáveis Java.

//Funcionalidades:

    1. Criar tabela
        1. Nomear nova tabela
        2. Criar colunas
            (New) 1. Gerar chave primária automaticamente

        3. Salvar nova tabela (ArrayList<Tabela>)
        
        [Throws Exceptions]
            1. Salvar dados nulos  
            2. Duplicação de tabelas com mesmo nome

    2. Tabelas
        (New) Seleção múltipla.
        1. Visualizar tabelas existentes
        2. Nova linha (AddLinha)
        3. Ver
            1. Buscar dados de uma ou mais linha
            2. Filtrar resultados de pesquisas
                1. Valores menores ou iguais
                2. Valores menores
                3. Valores maiores 
                4. Valores maiores ou iguais
            3. Remover linha (por Chave Primária);

            (EXCEPTION) Quando removemos uma linha, ao clicar em voltar,
            o JForm TelaListar ainda está com as tabelas antigas. Logo, se o 
            usuário apertar em ver novamente, irá ver a tabela antiga.
        
        4. Remover (Remoção de tabela[s] selecionada[s])

        [Throws Exceptions]
            1. Não selecionar tabela(s)
            2. Tipo do valor relacionado a coluna incorreto
            3. Chave primária já existente
            4. Busca de dados inexistentes

// O que é extra?

    1. Software gera um valor para chave primária (Facilita a criação de uma nova chave primária)
    2. Seleção múltipla de tabelas (Permite a visualização e modificação de várias tabelas simultâneamente)
        1. Remoções
        2. Adicionar linhas
    3. JSlider para filtrar valores (Facilita a modificação na forma de visualizar os resultados numéricos)
    4. Listar colunas criadas (Facilita a visualização das colunas criadas pelo usuário)

// O que faltou?

    1. Problemas
        1. Não conseguimos implementar código que espera o término de uma JForm;
        2. Falha ao excluir uma linha e reabrir novamente a JForm correspondente;
        3. Ao tentar criar uma tabela nula, o programa detecta porém em algum ponto acaba
        salvando uma tabela nula.

// O que faríamos diferente?

    1. Retiraríamos a quantidade fixa de colunas que o usuários deve escolher
    2. Removeríamos alguns pop-ups desnecessários
    3. Melhoraríamos as relações entre as JForms
    

//Sobre:
    
    Autores:
        Douglas Gabriel da Silva Araújo, Isaac Marlon da Silva Lourenço e Paulo Vitor Lima Borges.

    Contribuições:
        Douglas G.S.A.:
            - Desenvolvimento back-end
                Maior contribuição:
                    . Classes Fundamentais
                    . Função de gerar chave primária randômica



        Isaac M.S.L.:
            - Desenvolvimento back-end
                Maior contribuição:
                    . Classes fundamentais
                    . Filtragem de valores
            (Front-end)
                - Design das JForm's



        Paulo V.L.B.:
            - Desenvolvimento back-end
                Maior contribuição:
                    . Classes fundamentais
                    . Exceptions


    Versão entregue: 09/04/2019
//
                
                

        
        