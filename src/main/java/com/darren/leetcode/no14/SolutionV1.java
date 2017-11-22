package com.darren.leetcode.no14;

public class SolutionV1 {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs == null || strs.length == 0) {
            return result;
        }

        if (strs.length == 1) {
            return strs[0];
        }

        result = strs[0];
        int length = strs.length;
        for (int i = 1; i < length; i++) {
            if (!strs[i].startsWith(result)) {
                if(result.length() - 1 == 0){
                    result = "";
                    break;
                }else{
                    strs[0] = result.substring(0, result.length() - 1);
                    result = longestCommonPrefix(strs);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SolutionV1 solution = new SolutionV1();

        String[] array = new String[] { "c","acc","ccc"};
        String result = solution.longestCommonPrefix(array);
        System.out.println(result);
    }
}
