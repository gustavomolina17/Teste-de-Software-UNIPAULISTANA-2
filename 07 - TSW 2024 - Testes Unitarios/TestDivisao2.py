import unittest
 
def divisao(a,b):
    if b == 0:
       raise ValueError("Divisão por zero NÃO EXISTE") 
    return a / b 
 
class TestDivisao2(unittest.TestCase):
    def teste_divisao(self):
        self.assertEqual(divisao(10, 2),5)
       
 
    def teste_divisao_por_zero(self):
        try:
            divisao(10,0) 
        except ValueError as e:
            print(f"Erro: {e}") 
            self.assertEqual(str(e),"Divisão por zero NÃO EXISTE")
       
           
if __name__ == '__main__':
    unittest.main()