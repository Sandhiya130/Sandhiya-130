
function  somecode() {
    for (var i = 0; i <=2005000; i++) {
        var j=i;
        
        
    } 
    postMessage(i);
        setTimeout("somecode()",500);
    // document.getElementById('p1').innerHTML="Completed "  + j  + " Iterations";
}
somecode();
