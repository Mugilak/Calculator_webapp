/**
 * 
 */
 function insert(num) 
{
	// document.getElementById("myText").value
document.getElementById("text").value = document.getElementById("text").value + num;
}

// Use equal() function to return the result based on passed values.
function equal()
{
var exp = document.getElementById("text").value;
if(exp)
{
document.getElementById("text").value = eval(exp)
}
}

/* Here, we create a backspace() function to remove the number at the end of the numeric series in textview. */
function backspace()
{
var exp = document.getElementById("text").value;
document.getElementById("text").value = exp.substring(0, exp.length - 1); /* remove the element from total length ? 1 */
}

function remove(){
	document.getElementById("text").value = " ";
}