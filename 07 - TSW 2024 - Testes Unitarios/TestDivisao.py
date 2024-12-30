import unittest

def divisao(a,b):
    if b == 0:
        raise ValueError("Divisão por zero NÃO EXISTE") #Exceção
    return a / b #retorna o resultado da divisão de a por b

class TestDivisao(unittest.TestCase):
    def teste_divisao(self):
        self.assertEqual(divisao(10, 2),5)
        
    #Testar a divisão por 0
    def teste_divisao_por_zero(self):
        #Verificar se a chamada da divisao(10,0)levanta a exceção Value Error
        with self.assertRaises(ValueError):
            divisao(23,0)
            
if __name__ == '__main__':
    unittest.main()