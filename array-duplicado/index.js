let acharDuplicados = array => array.filter((item, index) => array.indexOf(item) != index)

console.log(acharDuplicados([4,5,44,98,4,5,6,7]))