class Solution {
    public int countPoints(String rings) {
        int r[] = new int[10];
        int b[] = new int[10];
        int g[] = new int[10];

        for(int i = 1; i < rings.length(); i++) {
            if(rings.charAt(i-1) == 'R')
               r[rings.charAt(i) - '0']++;
            if(rings.charAt(i-1) == 'G')
               g[rings.charAt(i) - '0']++;
            if(rings.charAt(i-1) == 'B')
               b[rings.charAt(i) - '0']++;
        }
        int count = 0;
        for(int j = 0; j < 10; j++) {
            if(r[j] >= 1 && b[j] >= 1 && g[j] >= 1)
               count++;
        }
        return count;
    }
}
