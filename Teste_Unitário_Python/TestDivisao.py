def divide(a, b):
    if b == 0:
        raise ValueError("Divisão por zero não é permitida.") # Levanta uma exceção se 'b' for zero
    return a / b # Retorna o resultado da divisão 'a' por 'b'


import unittest

# Método para testar a divisão normal
class TestDivide(unittest.TestCase):
    def test_divide(self):
        self.assertEqual(divide(10, 2), 5)

   # Método para testar a divisão por zero
    def test_divide_por_zero(self):
        # Verifica se a chamada de 'divide(10, 0)' levanta uma exceção ValueError
        with self.assertRaises(ValueError):
            divide(10, 0)

if __name__ == '__main__':
    unittest.main()