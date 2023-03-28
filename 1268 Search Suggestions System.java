class Solution {
    class TrieNode {
        char c;
        TrieNode[] children;
        boolean isWord;

        public TrieNode(char c) {
            this.c = c;
            this.children = new TrieNode[26];
        }
    }
    private List<String> dfs(TrieNode root, String word, List<String> ans) {
        if(root.isWord) {
            ans.add(word + root.c);
            if(ans.size() >= 3) {
                return ans;
            }
        }
        for(TrieNode child : root.children) {
            if(child != null) {
                dfs(child, word + root.c, ans);
            }
        }
        return ans;
    }
    private List<String> findTopThree(TrieNode root, String word) {
        List<String> ans = new ArrayList<>();
        TrieNode temp = root;
        for(char c : word.toCharArray()) {
            if(temp.children[c-'a'] == null) {
                return ans;
            }else {
                temp = temp.children[c-'a'];
            }
        }
        if(temp.isWord) {
            ans.add(word);
        }
        for(TrieNode child : temp.children) {
            if(child != null) {
                List<String> list = dfs(child, word, new ArrayList());
                ans.addAll(list);
                if(ans.size() >= 3) {
                    return ans.subList(0,3);
                }
            }
        }
        return ans;
    }

    private void insert(String product, TrieNode root) {
        TrieNode temp = root;
        for(int i = 0; i < product.length(); i++) {
            char c = product.charAt(i);
            if(temp.children[c-'a'] == null) {
                temp.children[c-'a'] = new TrieNode(c);
            }
            temp = temp.children[c-'a'];
        }
        temp.isWord = true;
    }

    private TrieNode buildTries(String[] products) {
        TrieNode root = new TrieNode(' ');
        for(String str : products) {
            insert(str, root);
        }
        return root;
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode root = buildTries(products);
        List<List<String>> ans = new ArrayList<>();
        for(int i = 1; i <= searchWord.length(); i++) {
            ans.add(findTopThree(root, searchWord.substring(0,i)));
        }
        return ans;
    }
}
