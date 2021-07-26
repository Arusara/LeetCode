class Solution {
    public int calculate(String str) {
        Stack<Integer> stack = new Stack<>();

        int currentNumber = 0;
        char operation = '+';
        int N = str.length();
        for(int i=0;i<N;i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                currentNumber = currentNumber*10 + ch-'0';
            }

            if (!Character.isDigit(ch)&&!Character.isWhitespace(ch) || i==N-1) {


                if (operation=='+') {
                    stack.push(currentNumber);
                } else if (operation=='-') {
                    stack.push(-1*currentNumber);
                } else if (operation=='*') {
                    stack.push(stack.pop()* currentNumber);

                } else if (operation=='/') {
                    stack.push(stack.pop()/currentNumber);
                }

                operation = ch;
                currentNumber = 0;
            }


        }

        int sum=0;
        while (!stack.isEmpty()) {
            sum+=stack.pop();
        }



        return sum; 
    }
}
