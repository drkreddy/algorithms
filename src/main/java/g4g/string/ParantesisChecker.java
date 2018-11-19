package g4g.string;

import java.util.*;

public class ParantesisChecker {
    static Map<Character,Character> leftRight = new HashMap<>();

    public static void main(String[] args) {
        leftRight.put('}','{');
        leftRight.put(')','(');
        leftRight.put(']','[');

        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        for(int i=0;i<n;i++){
            String in = sc.nextLine();
            System.out.println(isBalanced(in));
        }
    }
    public static String isBalanced(String str){
        List<Character> stack = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(leftRight.values().contains(c)){
                stack.add(c);
            }else if(leftRight.keySet().contains(c)){
                if(stack.size()==0){
                    return "not balanced";
                }
                Character match = stack.remove(stack.size() - 1);
                if(leftRight.get(c).charValue()!=match.charValue()){
                   return "not balanced";
                }
            }else{
                return "not balanced";
            }
        }

        if(stack.size()>0){
            return "not balanced";
        }

        return "balanced";
    }
}
