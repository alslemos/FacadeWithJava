import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
	private static int choice;
	
	public static void main(String[] args) {
		do {
            System.out.print("========= Academic Report ============ \n");
            System.out.print("1. Lecture A.              \n");
            System.out.print("2. Lecture B.              \n");
            System.out.print("3. Lecture C.                 \n");
            System.out.print("4. Exit.                   \n");
            System.out.print("Enter the lecture of your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
				choice = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice) {
                case 1:
                    {
                        shopKeeper.lectureAData();;
                    }
                    break;
                case 2:
                    {
                    	shopKeeper.lectureBData();;
                    }
                    break;
                case 3:
                    {
                    	shopKeeper.lectureCData();
                    }
                    break;
                default:
                    {
                        System.out.println("Nothing valid selected");
                    }
                    return;
            }
        } while (choice != 4);
	}
}
