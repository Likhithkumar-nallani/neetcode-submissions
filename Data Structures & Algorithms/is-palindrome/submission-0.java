class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare ignoring case
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {

                return false;
            }
            left++;
            right--;
        }
        return true;


       /* String rev ="";
        for(int i=0;i<s.length();i++){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
     */   
    }
}
