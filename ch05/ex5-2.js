// Pure Functions Have No Side Effects

var haplessObject = {
    emotion: "Carefree!"
};

var evilMutator = function(object){
    object.emotion = "So emo :'(";
}

evilMutator(haplessObject);
haplessObject.emotion;
// => "So emo :'("
