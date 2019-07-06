import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int cur_row = 1;cur_row <= n;cur_row++)
      {
        for(int space = 1;space <= (n- cur_row);space++)
        {
          System.out.print(" ");
	}
        for(int col_no = 1;col_no <= (2*cur_row-1);col_no++)
        {
          System.out.print("*");
        }
System.out.print("\n");
      }
    }
}

