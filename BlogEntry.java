import java.util.Scanner;

class BlogEntry
{
    private String textEntry, userName, setMonth;
    private int setDay, setYear;
    Date D1 = new Date();

	public BlogEntry()
	{
        userName = "";
        textEntry = "";
        setMonth = "";
        setDay = 0;
        setYear = 0;
	}
	public String toString()
	{
        return ( "Username: " + userName + " - TextEnrty: " + textEntry + "- Date: " + D1);
	}
	public void set_BlogEntry()
	{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter date: (month, day, year)");
        setMonth = input.next(); setDay = input.nextInt(); 
        setYear = input.nextInt(); D1.set_date( setMonth, setDay, setYear);

        System.out.println("Enter Username: ");
        userName = input.next(); input.nextLine();
        System.out.println("Enter Text Entry: ");
        textEntry = input.nextLine();
        input.close();
        }
        public void getSummary()
        {
                String[] words = textEntry.split("\\s+");
                if (words.length <= 10)
                        System.out.print(textEntry);
                else 
                        for (int index = 0; index < 10; index++)
                        {
                                System.out.print(words[index] + " ");
                        }
                System.out.println();
        }
}