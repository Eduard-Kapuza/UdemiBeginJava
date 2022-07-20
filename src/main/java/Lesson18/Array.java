package Lesson18;

public class Array {

    static void showArray(String[][] array) {
        //System.out.println("{ {"+array[0][0]+array[0][1]+"}, {"+array[1][0]+"}, {"+array[2][0]+array[2][1]+"} }");


        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length-1==j) {
                    System.out.print(array[i][j] );
                }else {
                    System.out.print(array[i][j]+ ", ");
                }
            }
            if (i!=array.length-1) {
                System.out.print("}, ");
            }else {
                System.out.print("}");
            }
        }
        System.out.println(" }");

    }


    public static void main(String[] args) {
        String[][] array={{"Privet", "kak dela?"},{"Ok", "hello"}, {"Ti","kto?"}};
        showArray(array);
    }
}
