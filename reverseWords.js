function reverse(sentence){
    const words = sentence.split(' ');
    let ans = '';
    for(let i=0; i<words.length; i++){
        const temp = words[i];
        for(let j=temp.length-1; j>=0; j--){
            ans += temp.charAt(j);
        }
        ans += ' ';
    }
    return ans.trim();
}

const input = "This is a sunny day";
const reversedSentence = reverse(input);
console.log(input);
console.log(reversedSentence);