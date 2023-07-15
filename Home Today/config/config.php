<?php 

$db = new mysqli('localhost','root','','hometoday');

if($db->connect_error){
	echo "Error connecting database";
}

 ?>