<style type="text/css">
    table {
        border: 1px solid black;
    }
    td {
        width: 50px; height: 50px;
    }
    td[bg="white"] {
        background: white;
    }
    td[bg="black"] {
        background: black;
    }
</style>
<body>
<?php
/*
    Tugas Pemrograman Web :
    - Menampilkan Papan Catur Menggunakan Tabel dan Perulangan
*/
    $ukuran = 8;
    $papan_catur = "<table cellspacing=0 cellpadding=0>";

    for($baris = 1; $baris <= $ukuran; $baris++) {
        $papan_catur .= "<tr>";
        for($kolom = 1; $kolom <= $ukuran; $kolom++) {
            if(($baris + $kolom) % 2 == 0) {
                $papan_catur .= "<td bg=white></td>";
            }
            else {
                $papan_catur .= "<td bg=black></td>";
            }
        }
        $papan_catur .= "</tr>";
    }

    $papan_catur .= "</table>";
    echo($papan_catur);
?>
</body>
