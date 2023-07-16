package IfStatements;

public class ifElse {

    public static void main(String[] args) {

        //--------------Basic-----------

        String[] names = {"John", "Alex", "Dani", "Avi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Class List = " + names[i]);
            //output--tum liste cikti

        }

        // ------other-----

        for (String name : names) {
            System.out.println("List of names = " + name);
        }


    }
}
