# Definindo uma classe chamada 'Contador'
class Contador:
    def __init__(self):
        self.contagem = 0  # Inicializa o contador com 0

    def incrementar(self):
        self.contagem += 1 # Aumenta o valor da contagem em 1

    def zerar(self):
        self.contagem = 0 # Reseta o contador para 0

    def valor(self):
        return self.contagem # Retorna o valor atual da contagem
    

import unittest

class TestContador(unittest.TestCase):
    def setUp(self):
        self.contador = Contador() # Cria uma nova instância de Contador para cada teste

    def test_incrementar(self):
        self.contador.incrementar()
        self.assertEqual(self.contador.valor(), 1) # Verifica se o valor é 1

    def test_zerar(self):
        self.contador.incrementar() # Incrementa o contador antes de zerar
        self.contador.zerar() # Reseta o contador
        self.assertEqual(self.contador.valor(), 0) # Verifica se o valor é 0


if __name__ == '__main__':
    unittest.main()