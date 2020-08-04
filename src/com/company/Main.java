package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //region 1.Array values to print *
//        String numbers = "1,3,5,2,4";
//        String[] arrayNumbers = numbers.split(",");
//
//        int[] arryNum = new int[arrayNumbers.length];
//        for (int i = 0; i < arrayNumbers.length; i++) {
//            arryNum[i] = Integer.parseInt(arrayNumbers[i]);
//        }
//        System.out.print("Pattern for: ");
//        System.out.println(Arrays.toString(arryNum));
//
//        for (int i = 0; i < arryNum.length; i++) {
//            for (int j = 1; j <= arryNum[i]; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
        //       }
        //endregion

        //region 2.Remove duplicates from String
//        String inputStringWithDups="javajava";
//        String outputStringNoDups= removeDuplicateFromString(inputStringWithDups);
//        System.out.println("Input: "+inputStringWithDups+", Output: "+outputStringNoDups);
        //endregion

        //region 3.Duplicate characters with number of occurrence
//        String inputString="pogbahahaha";
//        System.out.println("Input:"+inputString);
//        System.out.print("Output:");
//        printCharAndOccurrence(inputString);
        //endregion

        //region 4.BubbleSort
//        int[] numbersArray=new int[]{5,6,7,4,4,4,4,3,2,1};
        //System.out.println("Bubble Sort:");
//        System.out.println("Input:"+Arrays.toString(numbersArray));
//        System.out.print("Output:");
//        bubbleSort(numbersArray);
        //endregion

        //region 5.Insertion Sort
//        int[] numbersArray = new int[]{5, 6, 7, 4, 3, 2, 1};
//        System.out.println("InsertionSort:");
//        System.out.println("Input:"+Arrays.toString(numbersArray));
//        insertionSort(numbersArray);
        //endregion

        //region 6.Selection Sort
//        int[] numbersArray = new int[]{5, 6, 7, 4, 3, 2, 1};
//        System.out.println("Selection Sort:");
//        System.out.println("Input:"+Arrays.toString(numbersArray));
//        selectionSort(numbersArray);
        //endregion

        //region 7.Palindrome
//        String palindromeOrNot="atata";
//        System.out.println("Input:"+palindromeOrNot);
//        checkForPalindrome(palindromeOrNot.toLowerCase());

        //endregion

        //region 8.Floyds Triangle
//        System.out.println("Floyds Triangle");
//        int totRows=7,row,col,num=1;
//
//        for ( row = 0; row <totRows ; row++) {
//            for (col = 0; col <=row; col++) {
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
        //endregion

        //region 9.Count Vowels
//        String input="aeiounthatfallsonyou";
//        countVowels(input);
        //endregion

        //region 10.Largest and Smallest
//        int[] array = new int[]{1, 100000, 0, 7, -10};
//        int largestNumber=Integer.MIN_VALUE;
//        int smallestNumber=Integer.MAX_VALUE;
//
//        System.out.println(largestNumber+"|"+smallestNumber);
//
//        for (int x:
//             array) {
//            if (x>largestNumber){
//                largestNumber=x;
//            }
//            if (x<smallestNumber){
//                smallestNumber=x;
//            }
//        }
//        System.out.println("Largest: "+largestNumber+","+"Smallest: "+smallestNumber);

//endregion

        //region 11.Print Duplicate Elements in Array
//        String[] dupliacte = new String[]{"java", "java", "lava", "lava", "spurs", "arsenal"};
//
//        Set nonDuplicateSet = new LinkedHashSet();
//        Set duplicateSet = new LinkedHashSet();
//
//        for (String x:dupliacte){
//            if (!nonDuplicateSet.contains(x)){
//                nonDuplicateSet.add(x);
//            }else {
//                duplicateSet.add(x);
//            }
//        }
//
//        System.out.println("Non-Duplicate:"+nonDuplicateSet.toString());
//        System.out.println("Duplicate:"+duplicateSet.toString());

        //endregion

        //region 12.Prime Number
        //number that can be divided by 1 and itself
//        boolean isPrime=true;
//        int inputNumber=14;
//
//        for (int i = 2; i <inputNumber ; i++) {
//            if (inputNumber%i==0){
//                isPrime=false;
//            }
//        }
//
//        if (isPrime){
//            System.out.println("Its a prime Number");
//        }else {
//            System.out.println("Not a prime Number");
//        }
        //endregion

        //region 13.Pyramid
//        int row=5;
//        for (int i = 0; i <=row ; i++) {
//            for (int j = 1; j <=row-i ; j++) {
//                System.out.print(j+"  ");
//            }
//            System.out.println();
//        }
        //endregion

        //region 14.Find Missing Number in an Array
//        int[] array={1,2,4,5,6,3,8};
//        int missingNumber=getMissingNumber(array,array.length+1);
//        System.out.println("input:"+Arrays.toString(array));
//        System.out.println("Missing Number is "+missingNumber);
//        //endregion

        //region 15. print 1 to 10 without loop
        //print1to10(1);
        //endregion

        //region 16.Factorial
//        int x=5;
//        System.out.println("Fact: "+calFact(x));
        //endregion

        //region 17. 2 Strings are Anagram or Not
//        Scanner keyboard=new Scanner(System.in);
//        System.out.println("Enter 2 String");
//        String str1=keyboard.nextLine();
//        String str2=keyboard.nextLine();
//
//        System.out.println("String 1= "+str1+",String 2= "+str2);
//        char[] a=str1.toCharArray();
//        char[] b=str2.toCharArray();
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        if (Arrays.equals(a,b)){
//            System.out.println("Yes, they are anagram");
//        }else {
//            System.out.println("No, they are not anagram");
//        }


        //endregion

        //region 18. Count Characters in each word of a String
//        String str="Hello World is shit i don't care";
//        countStringWordLength(str);
        //endregion

        //region 19. Adds Element to Array
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Enter Size of Array: ");
//        int size = keyboard.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i]=keyboard.nextInt();
//        }
//
//        System.out.println("Array: "+Arrays.toString(array)+" Size:"+array.length);

        //endregion

        //region 20. Largest Number among three numbers
//        int x=10,y=20,z=30;
//        System.out.println(x+" vs "+y+" vs "+z);
//        if (x>y&& x>z){
//            System.out.println(x+" is largest");
//        }else if (y>x&&y>z){
//            System.out.println(y+" is largest");
//        }else {
//            System.out.println(z+" is largest");
//        }
        //endregion

        //region 21. Calculate Factors
//        for (int i = 1; i <=100 ; i++) {
//            System.out.print(i+"'s factors are: ");
//            for (int j = 1; j <=i ; j++) {
//                if (i%j==0){
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
//        }
        //endregion

        //region 22.Fibonacci
//        int a=0,b=1,c=0;
//        System.out.println("Fibonacci: ");
//        for (int i = 1; i <=10 ; i++) {
//            System.out.print(a+ " ");
//            c=a+b;
//            a=b;
//            b=c;
//        }
        //endregion

        //region 23.Swap without 3rd variable
//        int a=10,b=20;
//        System.out.println("a="+a+",b="+b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("After swap a="+a+",b="+b);
        //endregion

        //region 24.Fahrenheit to Celsius and Vice Versa
//        //c to f->F=(C*9/5)+32
//        //f to c->C=(F-32)*5/9
//        int c=50,f=0;
//        System.out.println("___________________");
//        System.out.println("Celsius to Fahrenheit");
//        System.out.println("C:"+c+", F:"+f);
//            f=(c*9/5)+32;
//            c=0;
//        System.out.println("F="+f);
//        System.out.println("___________________");
//        System.out.println("Fahrenheit to Celsius");
//        System.out.println("F:"+f+", C:"+c);
//        c=(f-32)*5/9;
//        f=0;
//        System.out.println("C="+c);
//        System.out.println("___________________");
//endregion

        

    }

    private static void countStringWordLength(String str) {
        char[] c = str.toLowerCase().toCharArray();
        for (int i = 0; i < c.length; i++) {
            String s = "";
            while (i < c.length && c[i] != ' ') {
                s += c[i];
                i++;
            }
            if (s.length() > 0) {
                System.out.println(s + "->" + s.length());
            }
        }

    }

    private static int calFact(int x) {
        if (x == 0) {
            return x;
        }

        if (x == 1) {
            return x;
        } else {
            return x * calFact(x - 1);
        }
    }

    private static void print1to10(int i) {
        if (i <= 10) {
            print1to10(i + 1);
            System.out.println(i);
        }

    }

    private static int getMissingNumber(int[] array, int n) {
        int actualSum = 0;
        int expectedSum = ((n * (n + 1)) / 2);

        for (int x :
                array) {
            actualSum += x;
        }
        return expectedSum - actualSum;

    }

    private static void countVowels(String input) {
        int counter = 0;
        char[] array = input.toCharArray();
        for (char c :
                array) {
            switch (c) {
                case 'a':
                    counter++;
                    break;
                case 'e':
                    counter++;
                    break;
                case 'i':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
            }
        }
        System.out.println("Vowels:" + counter);

    }

    private static void checkForPalindrome(String palindromeOrNot) {
        String reverse = "";
        for (int i = palindromeOrNot.length() - 1; i >= 0; i--) {
            reverse += palindromeOrNot.charAt(i);
        }

        System.out.println(palindromeOrNot + " vs " + reverse);
        if (palindromeOrNot.equals(reverse)) {
            System.out.println("Yes,they are Palindrome");
        } else {
            System.out.println("No,they are not Palindrome");
        }
    }

    private static void selectionSort(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            int Minj = i;
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[j] < numbersArray[Minj]) {
                    Minj = j;
                }
            }
            int temp = 0;
            if (Minj != i) {
                //swap i,Minj
                temp = numbersArray[i];
                numbersArray[i] = numbersArray[Minj];
                numbersArray[Minj] = temp;
            }
        }
        System.out.println("Output: " + Arrays.toString(numbersArray));
    }

    private static void insertionSort(int[] numbersArray) {

        for (int i = 1; i < numbersArray.length; i++) {
            int j = i;
            int temp = 0;
            while (j > 0 && numbersArray[j - 1] > numbersArray[j]) {
                //swap
                temp = numbersArray[j];
                numbersArray[j] = numbersArray[j - 1];
                numbersArray[j - 1] = temp;
                j--;
            }

        }
        System.out.println("Output:" + Arrays.toString(numbersArray));

    }

    private static void bubbleSort(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 1; j < numbersArray.length - i; j++) {
                int temp = 0;
                if (numbersArray[j] < numbersArray[j - 1]) {
                    //swap
                    temp = numbersArray[j];
                    numbersArray[j] = numbersArray[j - 1];
                    numbersArray[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbersArray));
    }

    private static void printCharAndOccurrence(String inputString) {
        Map<Character, Integer> map = new HashMap<>();

        char[] array = inputString.toCharArray();
        for (char c :
                array) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        System.out.println(map.toString());
    }

    private static String removeDuplicateFromString(String inputStringWithDups) {

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < inputStringWithDups.length(); i++) {
            char c = inputStringWithDups.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
            }
        }
        String output = "";
        for (char out :
                set) {
            output += out;
        }
        return output;
    }

}
