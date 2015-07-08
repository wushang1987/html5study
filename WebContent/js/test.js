/**
 * 
 */

console.log("aa");


var dc="title=112122";

$.ajax({
	   type: "POST",
	   url: "addpage",
	   data: dc
	   
	}).done(function(date){
		console.log(date);
	});
