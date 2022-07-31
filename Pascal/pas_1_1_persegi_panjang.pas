(*
    Program Persegi Panjang

    Rumus Persegi Panjang
        Keliling = 2 x ( panjang + lebar )
        Luas = panjang x lebar
*)

program persegipanjang;

var
    panjang, lebar, keliling, luas : integer;

begin
    writeln('Program Persegi Panjang');
    writeln('===========================');

    write('Panjang : ');
    read(panjang);

    write('Lebar   : ');
    read(lebar);

    keliling := 2 * ( panjang + lebar );
    writeln('Keliling = ', keliling);

    luas := panjang * lebar;
    writeln('Luas     = ', luas);
end.
