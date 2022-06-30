import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort
{
    private static boolean randomNumbs;
    private static Scanner input = new Scanner(System.in);
    private static int amountOfRandomNumbs;
    private static int[] numbsArray = new int[0];

    /* function that consider last element as pivot,  
    place the pivot at its exact position, and place
    smaller elements to left of pivot and greater
    elements to right of pivot.  */
    public static void main(String[] args) {
        getNumberGenerator();
        runQuickSort();
    }

    private static void runQuickSort() {
        if (randomNumbs){
            Random rd = new Random(); // creating Random object
            numbsArray = new int[amountOfRandomNumbs];
            for (int i = 0; i < numbsArray.length; i++) {
                numbsArray[i] = rd.nextInt(); // storing random integers in an array
            }
        } else { getNumbers(); }

        int arrayLength = numbsArray.length;

        System.out.println("\nOriginal order of the entered numbers: ");
        printNumbers(numbsArray, arrayLength);

        long startTime = System.nanoTime();
        makeQuickSort(numbsArray, 0, arrayLength - 1);
        long endTime = System.nanoTime();

        System.out.println("\n\nAfter sorting order of numbers: ");
        printNumbers(numbsArray, arrayLength);

        long timeElapsed = endTime - startTime;
        System.out.println("\n\nExecution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        System.out.println();
    }

    private static void getNumbers() {
        String numbers;
        boolean areNumbsCorrect = false;
        System.out.println("Podaj dowolne cyfry przedzielone spacjami.");
        do {
            numbers = input.nextLine();
            if (numbers.matches("^\\d+(\\s*-?\\d*\\s*)*$")) {
                areNumbsCorrect = true;
            } else {
                System.out.println("Nieprawidłowe dane. Podaj dowolne cyfry przedzielone spacjami.");
            }
        } while (!areNumbsCorrect);

        String[] arr = numbers.split("\\s+");
        numbsArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbsArray[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(Arrays.toString(numbsArray));
    }

    private static int partition (int[] numbsArray, int start, int end)
    {
        int pivot = numbsArray[end]; // pivot element
        int index = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (numbsArray[j] < pivot)
            {
                index++; // increment index of smaller element
                int t = numbsArray[index];
                numbsArray[index] = numbsArray[j];
                numbsArray[j] = t;
            }
        }
        int boundaryIndicator = numbsArray[index+1];
        numbsArray[index+1] = numbsArray[end];
        numbsArray[end] = boundaryIndicator;
        return (index + 1);
    }

    /* function to implement quick sort */
    /* numbsArray[] = array to be sorted, start = Starting index, end = Ending index */
    private static void makeQuickSort(int[] numbsArray, int start, int end)
    {
        if (start < end)
        {
            int p = partition(numbsArray, start, end);  //p is partitioning index
            makeQuickSort(numbsArray, start, p - 1);
            makeQuickSort(numbsArray, p + 1, end);
        }
    }

    private static void getNumberGenerator(){
        System.out.println("Wybierz sposób generowania liczb: \n1 - losowy\n2 - ręczny");
        boolean isGeneratorSelected = false;
        do {
            String numGenerator = input.nextLine();
            switch (numGenerator){
                case "1":
                    randomNumbs = true;
                    getAmountOfNumber();
                    isGeneratorSelected = true;
                    break;
                case "2":
                    randomNumbs = false;
                    isGeneratorSelected = true;
                    break;
                default:
                    System.out.println("Nieprawidłowa wartość." +
                            "\nWybierz sposób generowania liczb: \n1 - losowy\n2 - ręczny");
                    break;
            }
        } while (!isGeneratorSelected);
    }

    private static void getAmountOfNumber(){
        boolean isAmountGiven = false;
        do {
            System.out.print("Podaj ilość liczb do wygenerowania: ");
            String amount = input.nextLine();
            try {
                amountOfRandomNumbs = Integer.parseInt(amount);
                isAmountGiven = true;
            } catch (Exception e){
                System.out.println("Nieprawidłowa wartość.\n");
            }
        } while (!isAmountGiven);
    }

    /* function to print an array */
    private static void printNumbers(int[] numbsArray, int n)
    {
        int i;
        for (i = 0; i < n; i++)
            if (i % 10 == 0) System.out.print("\n" + numbsArray[i] + " ");
            else System.out.print(numbsArray[i] + " ");
    }
}  