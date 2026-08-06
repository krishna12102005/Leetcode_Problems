class Solution {
    public boolean isSumEqual(String one, String two, String target) {
        StringBuilder first = new StringBuilder();
        // Frist word
        for(int i = 0 ; i < one.length() ; i++){
              first.append(one.charAt(i) - 'a');
        }

        StringBuilder  sec = new StringBuilder();
        // Second word

        for(int i = 0 ; i < two.length() ; i++){
            sec.append(two.charAt(i)-'a');
        }

        // thrid word
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < target.length() ; i++){
            sb.append(target.charAt(i) - 'a');
        }

        int num1 = Integer.parseInt(first.toString());
        int num2 = Integer.parseInt(sec.toString());
        int num3 = Integer.parseInt(sb.toString());

        return num1 + num2 == num3;
    }
}