"use strict";

function loadAPI(){
    fetch(`https://api.chucknorris.io/jokes/random`)
        .then(response => response.json())
        .then(element => {
            console.log(element.value);
            $(' .joke ').html(`<h1>${element.value}</h1>`);

        })
}

// function getIcon(){
//     fetch(`https://assets.chucknorris.host/img/avatar/chuck-norris.png`)
//         .then(response => response.json())
//         .then(element => {
//             $(' .joke ').append(`<img src="${element.icon_url}">`);
//         })
// }

loadAPI();
