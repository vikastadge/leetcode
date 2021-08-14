package com.vikastadge.algo;
/*

171. Excel Sheet Column Number

Given a string columnTitle that represents the column title as appear in an Excel sheet,
return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        final ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber("FXSHRXW"));
    }

    public int titleToNumber(String columnTitle) {
        int value = 0;
        int j=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            double pow = Math.pow(26, j);
            value = value + ((int)pow * (columnTitle.charAt(i) - 64));
            j++;
        }
        return value;
    }
}
