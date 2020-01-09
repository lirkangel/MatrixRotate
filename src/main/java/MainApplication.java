import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        int option = 0;

        while (4 != option) {
            System.out.println("Insert what you want to do \n" + "1 generate matrix \n" + "2 none \n" + "3 exit \n");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            int count = 1;
            int sizeArray1 = (int) (Math.random() * 10);
            int sizeArray2 = (int) (Math.random() * 10);
            int[][] array = new int [sizeArray1][sizeArray2];
            String exitCount = "a";
            switch (option) {
                case 1: {
                    array = generateMatrix(sizeArray1, sizeArray2);
                    System.out.println("THIS IS YOUR ARRAY \n" + "press any button to rotate or q to exit");
                    while (!"q".equals(exitCount)) {
                        exitCount = scanner.nextLine();
                        process(array);
                    }
                    break;
                }
                case 2:
                case 3:
                    System.out.println("goodbye");
                    break;
                default:
                    break;
            }


        }


    }

    public static void process(int[][] array) {
        System.out.println("THIS IS YOUR ARRAY NOW \n");
        for (int i = 0 ; i < array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] tempTopArray = new int [array.length];
        int[] tempBottomArray = new int [array.length];
        int[] tempRightArray = new int [array[array.length-1].length];
        int[] tempLeftArray = new int [array[array.length-1].length];
        for (int i = 0; i< array.length;i++)
            for (int j = 0; j< array[i].length;j++) {
                tempTopArray[j] = array[0][j];
                tempBottomArray[j] = array[array.length-1][j];
            }
        System.out.println("This is tempBottom");
        for (int i = 0; i < tempBottomArray.length; i++) {
            System.out.println(tempBottomArray[i]);
        }



    }

    public static int[][] generateMatrix(int sizeArray1,int sizeArray2) {

        System.out.println(sizeArray1 + " + " + sizeArray2);
        int[][] array1 = new int[sizeArray1][sizeArray2];


        for (int i = 0; i < array1.length; i++)
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 10);
            }

//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                System.out.print(array1[i][j] + " ");
//            }
//            System.out.println();
//        }
        return array1;
    }


}
