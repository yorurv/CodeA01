=begin
	Tugas Coding :
	-> Contoh Output Program

	Input batasan angka : 20
	=====================================
	Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari 20 adalah : 3 5 6 9 10 12 15 18
	Jumlah Angka Genap : 4 angka
	Jumlah Angka Ganjil : 4 angka

=end

print "Input batasan angka : "
angka = gets.chomp.to_i

puts "====================================="
print "Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari #{angka} adalah : "

jumlah_genap = 0
jumlah_ganjil = 0

for n in (1..(angka-1))
    # mencari angka kelipatan 3 / 5
	if (n % 3 == 0) or (n % 5 == 0)
		print "#{n} "

        # mencari angka ganjil / genap
		if n % 2 == 0
			jumlah_genap += 1
		else
			jumlah_ganjil += 1
		end
	end
end

puts ""
puts "Jumlah Angka Genap : #{jumlah_genap} angka"
puts "Jumlah Angka Ganjil : #{jumlah_ganjil} angka"
