public class findIndexOfFirstOccurrenceInString {
    // Find the Index of the First Occurrence in a String
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
