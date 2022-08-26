public class Task1 {
    public static int numberOfSymbol(String str, char symbol) {
        return (int) str.chars().filter(ch -> ch == symbol).count();
    }

    public static boolean isGreatBySymbol(String str1, String str2, char symbol) {
        return numberOfSymbol(str1, symbol) > numberOfSymbol(str2, symbol);
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "check", "ccc", "cccc", "collect", "call"};
        char symbol = 'c';
        System.out.println("Before: ");
        outputResult(arr,symbol);
        sortBySymbol(arr, symbol);
        System.out.println();
        System.out.println("After: ");
        outputResult(arr, symbol);
    }

    public static void outputResult(String[] strings, char symbol) {
        for (String str : strings) {
            System.out.println(str + " " + numberOfSymbol(str, symbol));
        }
    }

    public static void sortBySymbol(String[] strings, char symbol) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (isGreatBySymbol(strings[j], strings[j + 1], symbol)) {
                    String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
            }
        }
    }
}