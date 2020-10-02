window.addEventListener('load', loadPage);
function loadPage(){
    
    document.getElementById("row2").addEventListener("click",holaMund);

    function holaMund(){
        window.alert("hoia mundo desde una ventana de alert xd");
        console.log("Hola Mundo Desde la consola de desarrollo");
    }
}


