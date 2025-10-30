from sum import sumar
def test_sumar_positivos():
    assert sumar(2, 3) == 5
def test_sumar_negativos_y_positivos():
    assert sumar(-1, 4) == 3
def test_sumar_cero():
    assert sumar(0, 0) == 0