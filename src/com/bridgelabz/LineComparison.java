package com.bridgelabz;


public class LineComparison {


 /*   public static void main(String arg[]) {
        System.out.println("Welcome to Line Comparison.");
        int line1 = lengthOfLine(2,1,3,2);
        
    }
*/
    private static int lengthOfLine1(int x1, int x2, int y1, int y2) {
        double ds;
        ds = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + ds);
        int l1 = (int) ds;
        return l1;
    }
    private static int lengthOfLine2(int x1, int x2, int y1, int y2) {
        double ds;
        ds = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + ds);
        int l1 = (int) ds;
        return l1;
    }



    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison.");
        LineComparison line1 = new LineComparison();
        LineComparison line2 = new LineComparison();

        int line3 = lengthOfLine2(2,1,3,2);


        line1.lengthOfLine1(2,1,3,2);
        line2.lengthOfLine1(3,4,5,2);
        
        if (line1.equals(line2)) {
            System.out.println("both lines are equal");
        } else System.out.println("Not equal.");


    }

}