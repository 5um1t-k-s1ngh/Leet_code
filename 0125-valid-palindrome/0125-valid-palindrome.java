class Solution {
    public boolean isPalindrome(String s) {
        // String s2=s.toUpperCase();
        // String result = s2.replace(" ", "");
        String result = s.toUpperCase().replaceAll("[^A-Z0-9]", "");
        int j=0;
        int i = result.length() - 1;;


        while(i>j){
            if (result.charAt(i)==result.charAt(j)){
                j++;
                i--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}