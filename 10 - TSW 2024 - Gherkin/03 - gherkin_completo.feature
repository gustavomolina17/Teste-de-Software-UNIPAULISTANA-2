# 05/11/2024
# Profº Ms Gustavo Molina
# Teste de Software

Feature: Emissão de certificado

              Eu, como aluno da Alura,
            Gostaria de ter um certificado emitido,ao completar o curso,
            Pois, assim, consigo comprovar meus conhecimento técnicos 

        Background: Estar matriculado na trilha de Python
            Given que estou logado na Alura
              And possuo matricula ativa

        Scenario Outline:Emissão de certificado
              And estou matriculado na trilha<nomeTrilha>
             When finalizo o meu curso
             Then tenho o meu certificado emitido
        
        Examples:
                  | nomeTrilha | nomeCurso
                  | "Trilha de Python" |
                  | "Java Avançado"    |
                  | "Programação Mobile"|
        
        
        Scenario: Curso em andamento
            Given que tenho acesso a plataforma da Alura
              And estou matriculado na trilha de Python
             When estou fazendo os cursos da trilha
             Then não tenho meu certificado emitido
              But tenho o histórico dos cursos que já conclui