=begin

    1
    22
    333
    4444
    55555
    666666

=end

print "Masukkan Tinggi Segitiga : "
tinggi = gets.chomp.to_i

for baris in (1..tinggi)
    for kolom in (1..baris)
        print baris
    end
    puts ""
end
