<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Assignment-2 | Word&Letter</title>
	<style>
		body{
			text-align: center;
			background-color: rgb(64, 70, 64);
		}
		h1{
			color: rgb(68, 212, 248);
			font-size: 35px;
		}
		textarea{
			border-radius: 20px;
			text-align: center;
		}
	</style>
</head>

	<h1>
		Word Count and Letter Count
	</h1>


	<p>
		Type in the textbox and click on
		the button to count the words
	</p>



	<textarea id="inputField" rows="10" cols="60">
	</textarea>
	<br><br>


	<button onclick="countWords()">
		Count Words
	</button>
	<button onclick="countLetters()">
		Count Letters
	</button>
	<br><br>


	<p> Word Count:
		<span id="show">0</span>
	</p>


	<p> Letters Count:
		<span id="shownow">0</span>
	</p>

	<script>

		// CountingLetters
		function countLetters() {

			var text = document.getElementById("inputField").value;
			var numLetters = 0;


			for (var i = 0; i < text.length; i++) {
				numLetters += 1;
			}
			
			document.getElementById("shownow")
				.innerHTML = numLetters;
		}



		// CountingWords 
		function countWords() {

			var text = document
				.getElementById("inputField").value;
			var numWords = 0;


			for (var i = 0; i < text.length; i++) {
				var currentCharacter = text[i];

				if (currentCharacter == " ") {
					numWords += 1;
				}
			}

			numWords += 1;

			document.getElementById("show")
				.innerHTML = numWords;
		}


	</script>
</body>

</html>