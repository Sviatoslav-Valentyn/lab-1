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
        char с = 'с';
        System.out.println("Before: ");
        for (String str : arr) {
            System.out.println(str + " " + numberOfSymbol(str, с));
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (isGreat(arr[j], arr[j+1], с)) {
                    var tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("After: ");
        for (String str : arr) {
            System.out.println(str + " " + numberOfSymbol(str, с));
        }
    }
}