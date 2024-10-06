class parenthesis 
{
    public boolean isValid(String s) 
    {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) 
        {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else 
            {
                if (i >= 0
                    && ((stack[i] == '(' && ch == ')')
                        || (stack[i] == '{' && ch == '}')
                        || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }
}

//USES A STACK-ESQUE VIBE TO GET THE CORRESPONDING VALUES OUT AND FIND THE VALID PARENTHESIS

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.