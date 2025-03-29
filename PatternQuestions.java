public class PatternQuestions {
    public static void main(String[] args) {
        pattern7( 5);

    }
    static void pattern1(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <=i  ; j++) {
                System.out.print("* ");
            }
          System.out.println();
        }

    }

    static void pattern2(int n ){
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n  ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// find the formula to find the column(j) here we have used that n-i+19
    static void pattern3(int n){
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n-i+1  ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /* * * * * *
         * * * * *
         * * * *
         * * *
         * *
         */
    }
    static void pattern4(int n){
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 0; i < 2 * n ; i++) {
            int totalcolsInRow = i > n ? 2* n - i : i;
            for (int j = 0; j < totalcolsInRow ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        //*
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
    }
    static void pattern6(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalcolsInRow = i > n ? 2 * n - i : i;
            int numofspace = n- totalcolsInRow;
            for (int s = 0; s < numofspace; s++) {
                System.out.print(" ");

            }
            for (int j = 0; j < totalcolsInRow; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     *
    static void pattern7(int n){
        for (int row = 1; row <=n ; row++) {

            for (int space = 0; space < n-row ; space++) {
                System.out.print("  ");
                
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= row  ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();

        }
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5
    }
}
