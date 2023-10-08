function sort(arr){
    for(let i=0; i<arr.length-1; i++){
        let minIndex = i;
        for(let j=i+1; j<arr.length; j++){
            if(arr[j] > arr[minIndex]){
                minIndex = j;
            }
        }
        const temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    return arr;
}

const arr = [64,12,22,11,25];
const sortedArray = sort(arr);
console.log(sortedArray);