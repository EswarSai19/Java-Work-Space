let Amar = {
        
    profession : "Singer",
    city : "Goa"
}
let Akbar = {
    
    profession : "Chef",
    city : "Mumbai"
}
let Anthony = {
    
    profession : "Magician",
    city : "Kashmir"
}
skillChange = function(name,city){
    console.log(`My name is ${name} and I am ${this.profession}`)
}
skillChange.call(Amar,"Akbar")
skillChange.call(Akbar,"Anthony")
skillChange.call(Anthony,"Amar")