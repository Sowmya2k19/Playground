import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int val = n;
      for(int cur_row = 1;cur_row <= n;cur_row++)
      {
        for(int col_no = val;col_no >=1;col_no--)
        {
          System.out.print(col_no);
	}
        val--;
        System.out.print("\n");
      }
}
}
