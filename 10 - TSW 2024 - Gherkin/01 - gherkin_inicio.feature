# 05/11/2024
# Profº Ms Gustavo Molina
# Teste de Software

            Given que estou logado no portal de cursos da Alura # Dado
              And matriculado(a) na trilha de Python # E
             When finalizo a trilha # Quando
             Then tenho meu certificado # Então

# Validação Negativa ou Contraponto Positivo

            Given que estou logado no portal de cursos da Alura
              And matriculado(a) na trilha de Python
             When não finalizo todos os cursos da trilha
             Then não tenho o meu certificado disponível
              But tenho o histórico dos cursos que já conclui


