public class lengthofLastWord {
    public static void main(String args[]){
        String word = "Hello World";
        System.out.println("The length of last word is: "+lengthOfLastWord(word));

    }
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String last = arr[arr.length-1];
        return(last.length());
    }
}
