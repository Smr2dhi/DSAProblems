package recursion;

public class permutation {
    static void permu(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            // Insert the current character at every position in p
            String s = p.substring(0, i);
            String end = p.substring(i);
            permu(s + ch + end, up.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permu("", str);
    }
}