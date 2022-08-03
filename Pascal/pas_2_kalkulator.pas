(*
    Program Kalkulator

    Bilangan A : 
    Bilangan B :

    A + B = C
    A - B = C
    A x B = C
    A / B = C
*)

program kalkulator;

uses sysutils;

var
    bil_a, bil_b : integer;
    hasil_jumlah, hasil_kurang, hasil_kali : longint;
    hasil_bagi : double;

begin
    writeln('======================');
    writeln(' Kalkulator Sederhana ');
    writeln('======================');

    write('Bilangan A : ');
    read(bil_a);

    write('Bilangan B : ');
    read(bil_b);

    hasil_jumlah := bil_a + bil_b;
    writeln(bil_a, ' + ', bil_b, ' = ', hasil_jumlah);

    hasil_kurang := bil_a - bil_b;
    writeln(bil_a, ' - ', bil_b, ' = ', hasil_kurang);

    hasil_kali := bil_a * bil_b;
    writeln(bil_a, ' x ', bil_b, ' = ', hasil_kali);

    hasil_bagi := bil_a / bil_b;
    writeln(bil_a, ' / ', bil_b, ' = ', format('%.4f', [hasil_bagi]));
end.
