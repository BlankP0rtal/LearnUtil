function solve() {
    var data = document.getElementsByClassName("level-form")[0].children[0].children[0].children;
    var values = data[1].value.split(", ").sort();
    var res="";
    for(var i=0 ;i < values.length - 1; i++)
    	res += values[i] + ", ";
    res += values[values.length - 1];
    data[3].value = res;
    document.getElementsByClassName("level-form")[0].children[0].children[0].children[5].click();
}

solve();