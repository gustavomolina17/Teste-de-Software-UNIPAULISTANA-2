#Import do módulo unittest, que fornece ferramentas para criar testes
import unittest

def soma(a,b):
    return a + b

# Criando uma classe de teste que herda de 'unittest.TestCase'
class TestSoma(unittest.TestCase):
    def teste_soma_positivos(self):
        self.assertEqual(soma(4, 2),6)
    
    def teste_soma_negativos(self):
        self.assertEqual(soma(-3, -2),-5)

    def teste_soma_mixta(self):
        self.assertEqual(soma(-1, 1),0)
       
    #Bloco principal 
if __name__ == '__main__':
    unittest.main() #Executa todos os testes definidos na classe TestSoma
    