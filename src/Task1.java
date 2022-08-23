public class Task1 {
    public static int numberOfSymbol(String str, char symbol) {
        int lenSymbol = str.length();
        int lenWithoutSymbol = str.replace(symbol+"", "").length();
        return lenSymbol-lenWithoutSymbol;
    }
    public static boolean isGreat(String str1, String str2, char symbol) {
        return numberOfSymbol(str1, symbol) > numberOfSymbol(str2, symbol);
    }

    public static void main(String[] args) {
        String[] arr = {"сafe", "сheck", "ссс", "сссс" , "сollect", "сall"};
        char letter = 'с';
        System.out.println("Before: ");
        for (String str : arr) {
            System.out.println(str + " " + numberOfSymbol(str, letter));
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (isGreat(arr[j], arr[j+1], letter)) {
                    var tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("After: ");
        for (String str : arr) {
            System.out.println(str + " " + numberOfSymbol(str, letter));
        }
    }
}




















































//import java.util.*;
//public class Task1 {
//    public static void main(String[] args) {
//        String[] string = {"camera", "cconsequence", "calm"};
//        char c = 'c';
//
//        for (int i = 0; i < string.length; ++i){
//            for (int j = i; j < ; ++j)
//            System.out.println(string[i]);
//            }
//
//
//
//        // System.out.println(a);
//    }
//}
//









// сортування
//        String[] result = b;
//        for (int i=0; i<result.length-1; i++)
//            for (int j=i; j>=0; j--)
//                if (result[j].compareTo(result[j+1])>0) {
//                    // обміняти M[j] та M[j+1] місцями
//                    strings = result[j];
//                    result[j] = result[j+1];
//                    result[j+1] = strings;
//                }
//// виведення результату
//        for (int i=0; i<result.length; i++)
//            System.out.println(result[i]);
//    }
//}