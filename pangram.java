public class pangram {
    public static void main(String[] args){
		String sentence = "abcdefghijklmnopqrstuvwxyz";
		if(checkIfPangram(sentence)) {
			System.out.println("The given sentence is a pangram");
		}
		else {
			System.out.println("The given sentence is not a pangram");
		}
	}
	public static boolean checkIfPangram(String sentence) {
	sentence = sentence.toLowerCase();
        for(char c='a'; c<='z'; c++){
            if(sentence.indexOf(c)<0){
                return false;
            }
        }
        return true;
    }
}
