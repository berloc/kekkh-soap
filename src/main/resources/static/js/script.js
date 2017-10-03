var responseText = "loading-text";
var activeButton = null;
var successTextElement = document.getElementById("success-text");
var errorTextElement = document.getElementById("error-text");
var loadingTextElement = document.getElementById("loading-text")

var renderText = function(){
    if (responseText == "success-text") {
        successTextElement.style.display = "block";
        errorTextElement.style.display = "none";
        loadingTextElement.style.display = "none";
    }
    if (responseText == "error-text") {
        successTextElement.style.display = "none";
        errorTextElement.style.display = "block";
        loadingTextElement.style.display = "none";
    }
    if (responseText == "loading-text") {
        successTextElement.style.display = "none";
        errorTextElement.style.display = "none";
        loadingTextElement.style.display = "block";
    }
}

var initApp = function(){
    var request = new XMLHttpRequest();
    request.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var responseData = JSON.parse(request.responseText);
            if (responseData.isValid == true) {
                responseText = "success-text";
                activeButton = "success-button";
            }
            if (responseData.isValid == false) {
                responseText = "error-text";
                activeButton = "error-button";
            }
            renderText();
        }
    };
    responseText = "loading-text";
    renderText();
    request.open("GET", "/api/current", true);
    request.send();
};

var setResponse = function(){
    var request = new XMLHttpRequest();
    var valid;
    if (activeButton == "success-button") { valid = true; } else { valid = false; }
    request.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var responseData = JSON.parse(request.responseText);
            if (responseData.successful == true) {
                if (activeButton == "success-button"){
                    responseText = "success-text";
                } else {
                    responseText = "error-text";
                }
            }
            renderText();
        }
    };
    responseText = "loading-text";
    renderText();
    request.open("POST", "/api/toggle", true);
    request.setRequestHeader("Content-Type", "application/json");
    request.send(JSON.stringify({"valid": valid}));
};

initApp();

document.body.addEventListener("click", function(event){
    if (event.target.id == "success-button") {
        activeButton = "success-button";
        setResponse();
    }
    if (event.target.id == "error-button") {
        activeButton = "error-button";
        setResponse();
    }
});