"""
Masukkan Bilangan : 5
5! = 5 * 4 * 3 * 2 * 1 = 120 
"""

bilangan = input("Masukkan Bilangan : ")
bilangan = int(bilangan)
hasil = 1

f_output = f"{bilangan}! = "

while bilangan > 0:
	f_output += f"{bilangan}"
	hasil *= bilangan
	bilangan -= 1

	if bilangan < 1:
		f_output += f" = {hasil}"
	else:
		f_output += " * "

print(f_output)
