import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mash{
  private List <Categories> categories= new ArrayList<Categories>();
  private String[] mashList = {"Mansion", "Apartment", "House", "Shack"};
	public Mash()
	{
		categories = new ArrayList<Categories>();

		Categories mash = new Categories();

		mash.setName("MASH");
		mash.setOptions(mashList);

		categories.add(mash);
	}
	public void setUpCategories(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to MASH!");
.		System.out.println("Please enter the names of the categories you would like to use, (the MASH category is already implemented)");
		System.out.println();
		System.out.println("Enter (Please seperate by commas): ");

		String input = scanner.nextLine();
		String[] theInput = input.split(",");

		for(int i = 0; i < theInput.length; i++){
      Categories category = new Categories();
      category.setName(theInput[i]);
      categories.add(category);
		}
	}

	public void createLifeOptions(){
		Scanner scanner = new Scanner(System.in);
    for(int i = 1; i<categories.size(); i++){
      System.out.println("please enter the options you want for "+ categories.get(i).getName());
      System.out.println("Enter (please seperate by commas):");

      String input = scanner.nextLine();
      String[] theInput = input.split(",");

      categories.get(i).setOptions(theInput);
    }
  }

	//CALL THIS METHOD IN YOUR MAIN METHOD

	public void getLife()
	{
		setUpCategories();
		createLifeOptions();

		Random randint = new Random();
		System.out.println("According to proven science, this is your life");
		System.out.println("----------------------------------------------");
    for(int i =0; i<categories.size(); i++){
      System.out.print(categories.get(i).getName()+": ");
      System.out.println(categories.get(i).getOptions()[randint.nextInt(categories.get(i).getOptions().length)]);
      //System.out.println(categories[i] + ": " +
    }
	}

	public static void main(String...args){
    Mash instance = new Mash();
    instance.getLife();
	}
}
