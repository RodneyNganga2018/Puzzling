import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzles {
    // prints the sum of the array items and returns an array with all items greater than 10
    public ArrayList<Integer> puzzleA (int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum+= arr[i];
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }

        System.out.println(String.format("The sum total is %d", sum));
        return newArr;
    }

    // shuffles the names and prints them and then returns an array with all the names longer than 5 characters
    public ArrayList<String> puzzleB (String[] arr) {
        ArrayList<String> arrCopy = new ArrayList<String>(Arrays.asList(arr));

        Collections.shuffle(arrCopy);
        for (String item : arrCopy) {
            System.out.println(item);
        }

        ArrayList<String> newArr = new ArrayList<String>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length() > 5) {
                newArr.add(arr[i]);
            }
        }

        return newArr;
    }

    // shuffles the array and prints the last and first letter of the array and displays a unique message if the first letter is a vowel
    public void puzzleC (char[] arr) {
        ArrayList<Character> arrCopy = new ArrayList<Character>();

        for (char item : arr) {
            arrCopy.add(item);
        }

        Collections.shuffle(arrCopy);
        System.out.println(String.format("The last letter is %s", arrCopy.get(arrCopy.size()-1)));

        String vowels = "aeiou";
        if (vowels.indexOf(arrCopy.get(0)) != -1) {
            System.out.println(String.format("The first letter is the vowel %s", arrCopy.get(0)));
        } else {
            System.out.println(String.format("The first letter is %s", arrCopy.get(0)));
        }
    }

    // generates an array with 10 random numbers between 55-100
    public ArrayList<Integer> puzzleD() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();

        for (int i=1; i<=10; i++) {
            numbers.add(r.nextInt(46) + 55);
        }

        return numbers;
    }

    // generates an array with 10 random numbers and sorts them then displays the minimum and maximum values
    public ArrayList<Integer> puzzleE() {
        ArrayList<Integer> numbers = new ArrayList<Integer>(puzzleD());

        Collections.sort(numbers);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(numbers.size()-1));

        return numbers;
    }

    // create a random string that is 5 characters long
    public String puzzleF() {
        String randomStr = "";
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random r = new Random();

        for (int i=1; i<=5; i++) {
            randomStr+= alphabet[r.nextInt(26)];
        }

        return randomStr;
    }

    // generates an array with 10 random strings each 5 characters long
    public ArrayList<String> puzzleG() {
        ArrayList<String> someList = new ArrayList<String>();

        for (int i=1; i<=10; i++) {
            someList.add(puzzleF());
        }

        return someList;
    }
}
