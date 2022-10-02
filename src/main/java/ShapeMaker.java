
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        return "";
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        int i = 0;
        while(i < height){
            int b = 0;
            while(b < height){
                System.out.print("*" + " ");
                b++;
            }
            System.out.println();
            i++;
        }
        return "";
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        for (int i = 0; i < height; i++) {
            for (int b = 0; b <= i; b++) {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
        return "";
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        for(int i= height ;i>0 ;i--)
        {
            for(int b= 0 ; b<i ;b++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return "";
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        for (int i = 0; i < height; i++) {
            for (int b = 2 * (height - i); b >= 0; b--) {
                System.out.print(" ");
            }
            for (int b = 0; b <= i; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return "";
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        for (int a=1;a<=4;a++) {// for lop for row
                for (int b =4;b>=a;b--)// for loop for space
                {
                    System.out.print(" ");
                }
                for (int c=1;c<=a;c++)// for loop for column
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
        }
        // write your code here
            return "";
    }
}
