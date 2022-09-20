/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
*/

class ValidParentheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));
      }
      
      public static boolean isValid(String s) {
                char[] storage = new char[s.length()]; // vector para almacenar (control de apertura y cierre)
                int position = 0;
    
                for (char character : s.toCharArray()){//character alamacena cada uno de los elementos que se estan reccoriendo del array s 
                    switch (character) {
                        case '{':
                            storage[position++] = '}';
                            break;
                        case '[':
                            storage[position++] = ']';
                            break;
                        case '(':
                            storage[position++] = ')';
                            break;
                        default:
                            if (position == 0 || storage[--position] != character){
                                return false;
                            }
                            break;
                    }
                }
                return position == 0;
            }
}

