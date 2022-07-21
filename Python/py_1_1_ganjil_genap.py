"""
Masukkan Bilangan : 7
7 Adalah Bilangan Ganjil
"""

bilangan = input("Masukkan Bilangan : ")
bilangan = int(bilangan)

if bilangan % 2 == 0:
    print(f"{bilangan} adalah Bilangan Genap")
else:
    print(f"{bilangan} adalah Bilangan Ganjil")
