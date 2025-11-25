import SEE.Externals;
import java.util.Scanner;

public class Main1 {
   public Main1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter number of students:");
      int var2 = var1.nextInt();
      Externals[] var3 = new Externals[var2];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         System.out.println("Student " + (var4 + 1));
         var3[var4] = new Externals();
         var3[var4].inputStudentDetails();
         var3[var4].inputCIEmarks();
         var3[var4].inputSEEmarks();
         var3[var4].calculateFinalMarks();
      }

      System.out.println("----Student Details--------");

      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4].displayStudentDetails();
         var3[var4].displayFinalMarks();
      }

   }
}
