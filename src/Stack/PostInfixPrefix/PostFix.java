package Stack.PostInfixPrefix;

import java.util.Stack;

public class PostFix {
    public static void main(String[] args) {
        String postfix = "9-(5+3)*4/6";
        Stack<String>  val=new Stack<>();
        Stack<Character>  op=new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) { // 0 to 9
                String s = "" + ch;
                val.push(s);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2+o;
                    val.push(t);
                }
                op.pop(); // remove '('
            } else if (ch == '+' || ch == '-') {
                while (!op.isEmpty() && (op.peek() == '+' || op.peek() == '-' || op.peek() == '*' || op.peek() == '/')) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2+o;
                    val.push(t);
                }
                op.push(ch);
            } else if (ch == '*' || ch == '/') {
                while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2+o;
                    val.push(t);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t =v1 + v2+o;
            val.push(t);
        }

        System.out.println(val.peek());}

    }

