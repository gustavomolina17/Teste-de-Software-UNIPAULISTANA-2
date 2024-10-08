# Importando o módulo 'unittest', que fornece ferramentas para criar testes
import unittest

def soma(a, b):
    return a + b

# Criando uma classe de teste que herda de 'unittest.TestCase'

class TestSoma(unittest.TestCase):
    def test_soma_positivos(self):
        self.assertEqual(soma(2, 3),8)

    def test_soma_negativos(self):
        self.assertEqual(soma(-1, -1), -2)

    def test_soma_misturada(self):
        self.assertEqual(soma(-1, 1), 0)

# Bloco principal para executar os testes
if __name__ == '__main__':
    unittest.main() # Executa todos os testes definidos na classe TestSoma