package no.bugs.homework4.structure;

import java.util.Stack;

// Задача 4: Стеки (Stacks)
public class Stacks {
    public static void main(String[] args) {
        System.out.println(isValid("([]{})"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("(.Y.)"));
    }


    static boolean isValid(String value){
        Stack<Character> stack = new Stack<>();
        for (char c : value.toCharArray()) {
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top !='{') ||
                        (c == ']' && top !='[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


}
