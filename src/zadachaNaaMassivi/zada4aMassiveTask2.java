package zadachaNaaMassivi;
import java.util.Arrays;
public class zada4aMassiveTask2 {
    public static void main(String[] args) {
        int nums[] = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("исходный массив: " + Arrays.toString(nums));
        System.out.print("Первая половина элемента:");
        for (int i = 0; i< nums.length/2;i++){
            System.out.print(" "+ nums[i]);
        }
    }
}
   /* git init
    git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/OrdaYerkebulan/massiv-practiceTask2-9.git
        git push -u origin main*/

// git config --global user.name "John Doe"
//   git config --global user.email johndoe@example.com