# 05/11/2024
# Profº Ms Gustavo Molina
# Teste de Software

Feature: Emissão de certificado

              Eu, como aluno da trilha de Python,
    Gostaria de ter um certificado emitido,ao completar a trilha,
    Pois, assim, consigo comprovar meus conhecimento técnicos em Python

        Background: Estar matriculado na trilha de Python na Alura
            Given que tenho acesso a plataforma da Alura
              And estou matriculado na trilha de Python

        Scenario: Emissão de certificado
             When finalizo a trilha
             Then tenho o meu certificado emitido

        Scenario: Curso em andamento
            Given que tenho acesso a plataforma da Alura
              And estou matriculado na trilha de Python
             When estou fazendo os cursos da trilha
             Then não tenho meu certificado emitido
              But tenho o histórico dos cursos que já conclui