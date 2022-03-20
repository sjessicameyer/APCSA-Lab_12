import java.util.Scanner;

public class Lab_12{

  final int NUMPERSONS = 4;

	private Person pa [] = new Person[NUMPERSONS];
	private Student st [] = new Student[NUMPERSONS];
	private Instructor in [] = new Instructor[NUMPERSONS];

	private Scanner input;

  public Lab_12(){
    input = new Scanner(System.in);

    // Create persons
		pa[0] = new Person("John", "Doe", 1988);
		pa[1] = new Person("Jane", "Jones", 1992);
		pa[2] = new Person("Sally", "White", 1984);
		pa[3] = new Person("John", "Doe", 1988);

		// Create students
		st[0] = new Student("JohnS", "DoeS", 1988, "Computer Science");
		st[1] = new Student("JaneS", "JonesS", 1992, "English - Poetry");
		st[2] = new Student("SallyS", "WhiteS", 1984, "Mechanical Engineering");
		st[3] = new Student("JohnS", "DoeS", 1988, "Computer Science");

		// Create instructors
		in[0] = new Instructor("JohnI", "DoeI", 1988, 150000);
		in[1] = new Instructor("JaneI", "JonesI", 1992, 90000);
		in[2] = new Instructor("SallyI", "WhiteI", 1984, 149000);
		in[3] = new Instructor("JohnI", "DoeI", 1988, 150000);		
		
    int choice = 1;
		while (choice != -1)
		{	
			// Prompt user
			System.out.println("\nEnter a command");
			System.out.println("  1 - Print all persons");
			System.out.println("  2 - Print all students");
			System.out.println("  3 - Print all instructors");
			System.out.println("  4 - Compare two persons");
			System.out.println("  5 - Compare two students");
			System.out.println("  6 - Compare two instructors");
      System.out.println(" -1 - To quit");

			choice = input.nextInt();
      String result="";
			switch (choice)
			{
        case 1:	
          for (int i=0; i<NUMPERSONS; i++)
          {
            System.out.println(i+ " - "+ pa[i]);
          }
          break;

        case 2:	
          for (int i=0; i<NUMPERSONS; i++)
          {
            System.out.println(i+ " - "+st[i]);
          }
          break;

        case 3:	
          for (int i=0; i<NUMPERSONS; i++)
          {
            System.out.println(i+ " - "+in[i]);
          }
          break;

        case 4: 
          System.out.println("Enter the numbers of the two persons to compare");
          int p1, p2;
          p1 = input.nextInt();
          p2 = input.nextInt();

          if (pa[p1].equals(pa[p2]))
            result = " ARE ";
          else
            result = " AREN'T ";
          System.out.println(pa[p1].firstName() + pa[p1].lastName() + " and " + pa[p2].firstName() + pa[p2].lastName() + result + "the same! ");		
          break;

        case 5:
          System.out.println("Enter the numbers of the two students to compare");
          p1 = input.nextInt();
          p2 = input.nextInt();

          if (st[p1].compareTo(st[p2])== 0 )
            result = " ARE ";
          else if(st[p1].compareTo(st[p2]) != 0 )
            result = " AREN'T ";
          System.out.println(st[p1].firstName() + st[p1].lastName() + " and " + st[p2].firstName() + st[p2].lastName() + result + "the same! ");		
          break;
        case 6:
          System.out.println("Enter the numbers of the two instructors to compare");
          p1 = input.nextInt();
          p2 = input.nextInt();

          if (in[p1].compareTo(in[p2]) == 0)
            result = " is the SAME as ";
          else if (in[p1].compareTo(in[p2]) < 0)
            result = " is LESS Than ";
          else
            result = " is GREATER Than ";
          System.out.println(in[p1].firstName() + in[p1].lastName() + result + in[p2].firstName() + in[p2].lastName());		
          break;
        default:
          System.out.println("Good Bye.");
			}
    }

  }

}