function calcularAP(){
    let base = 0;
    let altura = 0;
    let area = 0;
    let perimetro = 0;

    base = document.getElementById("base").value;
    altura = document.getElementById("altura").value;

    if(((base <0)||(base==""))||((altura <0)||(altura==""))){
        alert("Ingresa valores válidos");
        document.getElementById("base").value="";
        document.getElementById("altura").value="";
    }else{
        area = parseFloat(base)*parseFloat(altura);
        perimetro = (parseFloat(base)+parseFloat(altura))*2;
        document.getElementById("area").value=area;
        document.getElementById("perimetro").value=perimetro;
    }
}

function limpiar(){
    document.getElementById("base").value="";
    document.getElementById("altura").value="";
    document.getElementById("area").value="";
    document.getElementById("perimetro").value="";
}