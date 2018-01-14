// Living with Immutable Data Structures

// Recursion Instead of for/while

var wrestlers = getAlligatorWrestlers();
var totalBites = 0;

var l = wrestlers.length;

for (var i=0; i < l; i++){
    totalBites += wrestlers[i].timesBitten;
}



var allPatients = getArkhamPatients();
var analyzedPatients = [];
var l = allPatients.length;

for (var i=0; i < l; i++){
    if(allPatients[i].analyzed){
	analyzedPatients.push(allPatients[i]);
    }
}
