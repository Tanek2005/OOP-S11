public class MarksProcessing {
    public static void main(String[] args) {
        int[][] marks = {
            {45, 67, 88},
            {34, 56, 70},
            {90, 85, 60}
        };

        for (int i = 0; i < marks.length; i++) {
            boolean allPassed = true;
            for (int mark : marks[i]) {
                if (mark < 35) {
                    allPassed = false;
                    break;
                }
            }
            if (allPassed)
                System.out.println("Student " + (i + 1) + " passed all subjects.");
        }
    }
}