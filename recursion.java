class recursion{
    public static void main(String[] args) {

        System.out.println(palindrome("qwed"));
    }

    static boolean palindrome(String s){
        if (s.length()==1 || s.length()==0)
            return true;
        else if (s.length()==2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length()-1))
            return palindrome(s.substring(1,s.length()-1));
        return false;

    }
}