package conditionalStatement;

/**
 *  주사위 세개
 *  random한 값 나오도록 설정함.
 */

public class Q2480 {
    public static void main(String[] args) {
        int num_random = 0;
        int array[] = new int[3];
        int reward = 0;

        for(int i=0; i<3; i++) {
            while(num_random == 0) {
                num_random = (int)(Math.random() * 6);
            }

            array[i] = num_random;
            System.out.print(num_random + " ");
            num_random = 0;
        }

        if((array[0]==array[1])&&(array[1]==array[2])){
            reward = 10000 + array[0] * 1000;
            System.out.println(reward);
        }

        if((array[0]==array[1])&&(array[0]!=array[2])){
            reward = 1000 + array[0] * 100;
            System.out.println(reward);
        }
        else if((array[1]==array[2])&&(array[1]!=array[0])){
            reward = 1000 + array[1] * 100;
            System.out.println(reward);
        }
        else if((array[2]==array[0])&&(array[2]!=array[1])){
            reward = 1000 + array[2] * 100;
            System.out.println(reward);
        }

        if((array[0]!=array[1])&&(array[1]!=array[2])&&(array[2]!=array[0])){
            if((array[0]>array[1])&&(array[0]>array[2])){
                reward = 100 * array[0];
                System.out.println(reward);
            }
            if((array[1]>array[0])&&(array[1]>array[2])){
                reward = 100 * array[1];
                System.out.println(reward);
            }
            if((array[2]>array[0])&&(array[2]>array[1])){
                reward = 100 * array[2];
                System.out.println(reward);
            }
        }

    }
}

