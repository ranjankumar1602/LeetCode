class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(set.contains(temp)) {
                return temp;
            }else {
                set.add(temp);
            }
        }
        
        return '\0';
    }
}
