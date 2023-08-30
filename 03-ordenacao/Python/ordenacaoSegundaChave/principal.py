from pessoa import Pessoa

import operator

# clay	rian	alex	pedro	ana	sofia	alex	alex
# 18	17	    17	    20	    18	15	    48	    18

lista = []
lista.append(Pessoa("clay", 18))
lista.append(Pessoa("rian", 17))
lista.append(Pessoa("alex", 17))
lista.append(Pessoa("pedro", 20))
lista.append(Pessoa("ana", 18))
lista.append(Pessoa("sofia", 15))
lista.append(Pessoa("alex", 48))
lista.append(Pessoa("alex", 18))

#lista.sort(key=lambda p: p.nome)

lista.sort(key=lambda p: (p.idade, p.nome))

for i in lista:
    print(i)
