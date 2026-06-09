package String;

public class LeetCode657_RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {

            char ch = moves.charAt(i);

            if (ch == 'U') {
                y++;
            }

            if (ch == 'D') {
                y--;
            }

            if (ch == 'R') {
                x++;
            }

            if (ch == 'L') {
                x--;
            }
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {

        LeetCode657_RobotReturnToOrigin solution =
                new LeetCode657_RobotReturnToOrigin();

        System.out.println(solution.judgeCircle("UD"));     // true
        System.out.println(solution.judgeCircle("LL"));     // false
        System.out.println(solution.judgeCircle("UDLR"));   // true
        System.out.println(solution.judgeCircle("UUDDLRLR"));// true
    }
}