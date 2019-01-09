'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
    //console.log(inputStdin);
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

// cannot access 'end' so moved above
process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
//

});

function readLine() {
    return inputString[currentLine++];
}


function vowelsAndConsonants(s) {
    var vow = new RegExp("[aeiou]+");
    var con = new RegExp("[^aeiou]+");

    var array1 = s.split("");
    for (let value of array1) {
        if (vow.test(value)) console.log(value);
    }
    var array2 = s.split("");
    for (let value of array2) {
        if (con.test(value)) console.log(value);
    }
}


function main() {
    const s = readLine();

    vowelsAndConsonants(s);
}
