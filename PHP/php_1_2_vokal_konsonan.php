<?php
	/*
		"Halo Semuanya"

		Vokal : aoeuaa
		Konsonan : hlsmny
	*/	
	$vokal = "aiueo";
	$konsonan = "bcdfghjklmnpqrstvwxyz";

	$teks = "PHP adalah singkatan dari \"PHP: Hypertext Preprocessor\"";
	$len = strlen($teks);

	$huruf_vokal = "";
	$huruf_konsonan = "";

	for($i = 0; $i < $len; $i++) {
		$huruf = $teks[$i];
		$huruf = strtolower($huruf);

		if(strpos($vokal, $huruf) > -1) {
			$huruf_vokal .= $huruf;
		}
		else if(strpos($konsonan, $huruf) > -1) {
			$huruf_konsonan .= $huruf;
		}
	}
	echo("Teks : ".$teks."<br>");
	echo("Vokal : ".$huruf_vokal."<br>");
	echo("Konsonan : ".$huruf_konsonan."<br>");
?>
