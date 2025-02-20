package HW1;

public class Introduction {

    public static void main(String[] args) {

        String fullName = "Phạm Sỹ Toàn";
        String studentID = "24022467";
        String className = "K69A-AI1";
        String githubUsername = "toan3107";
        String email = "24022467@vnu.edu.vn";


        System.out.println(fullName + "\t" + studentID + "\t" + className + "\t" + githubUsername + "\t" + email);

        for (int i = 9; i >= 1; i--) {
            String bottles = (i > 1) ? "bottles" : "bottle";
            System.out.println(i + " " + bottles + " of beer on the wall, " + i + " " + bottles + " of beer.");
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}
