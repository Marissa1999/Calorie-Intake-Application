//Programmer: Marissa Gonçalves
//Date: September 15, 2017
//Purpose: This program calculates the recommended daily calorie intake, to maintain a healthy weight.

//import java in order to create an input
import java.util.Scanner;

//compile the program with class
public class CalorieIntake

{
	//method to make the program run
	public static void main (String[]args)

  {
	//define a scanner
	Scanner keyboard = new Scanner (System.in);



    //enter the age
	System.out.print ("What is your age?: ");

    //non-numeric are not permitted in this program
    if (!keyboard.hasNextInt())
    {
		String bad_input1 = keyboard.next();
		System.out.println ();
		System.out.println ("Invalid age input: " + bad_input1 + ".");
		System.out.println ("Try again later.");
		System.out.println ();
		System.exit(1);
    }
       //allow the user to enter numerical values
       int age = keyboard.nextInt();




        //enter the height
		System.out.print ("Enter your height (inches): ");

        //non-numeric are not permitted in this program
	    if (!keyboard.hasNextInt())
			 {
				 String bad_input2 = keyboard.next();
				 System.out.println ();
			     System.out.println ("Invalid height input: " + bad_input2 + ".");
			     System.out.println ("Try again later.");
			     System.out.println ();
			     System.exit(1);
		     }

        //allow the user to enter numerical values
        int height = keyboard.nextInt();



            //enter the weight
			System.out.print ("Enter your weight (pounds): ");

             //non-numeric are not permitted in this program
			 if ( !keyboard.hasNextInt() )
		     {
				 String bad_input3 = keyboard.next();
				 System.out.println ();
				 System.out.println ("Invalid weight input: " + bad_input3 + ".");
				 System.out.println ("Try again later.");
				 System.out.println ();
			     System.exit(1);
		     }

             //allow the user to enter numerical values
             int weight = keyboard.nextInt();



                //enter the gender
			    System.out.print ("Enter M for male or F for female gender selection: ");
			    char gender = keyboard.next().toUpperCase().charAt(0);


                //if the input doesn't include the following letters below, the program stops
			    if (gender != 'M' && gender != 'F')
			    {
					String bad_input4 = keyboard.next();
					System.out.println ();
					System.out.println ("Invalid gender input. Expected M for male and F for female. Encountered " + bad_input4 + ".");
					System.out.println ();
					System.exit(1);
			    }


                    //print out the physical activity level for the user to choose
				    System.out.println ("How would you rate your physical activity level?");
			        System.out.println ("1. Little or no exercise.");
			        System.out.println ("2. Light exercise (1-3 days per week).");
			        System.out.println ("3. Moderate exercise (3-5 days per week).");
			        System.out.println ("4. Heavy exercise (6-7 days per week).");
			        System.out.println ("5. Very heavy exercise (twice per day, extra heavy workout).");


                    //proceed with a space
                    System.out.println ();


                    //enter a number that is in the selection below
                    System.out.print("Please select: 1, 2, 3, 4 or 5: ");
                    int activity_level = keyboard.nextInt();


                    //proceed with a space
                    System.out.println ();


                    //print out the following information based on each of the specified numbers
                    switch (activity_level)
                    {
				    case 1: System.out.println ("Based on the following information:");
				            System.out.println ("Weight: " + (double) weight);
                            System.out.println ("Height: " + (double) height);
                            System.out.println ("Age: " + age + " years");

                            //specify the letters symbolize the full names of each gender
						    if (gender == 'M')
						    {
						      System.out.println ("Gender: Male");
						    }
						    else
						    {
						      System.out.println ("Gender: Female");
			                }

                            //print out the activity consumption
                            System.out.println ("Activity: Little or no exercise.");

                            //calculate the amount of calories to maintain the inputted weight
                            double calories;
							if (gender == 'F')
					        {
							  calories = (655.1 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
							}
							else
							{
							  calories = (66 + (6.2 * weight) + (12.7 * height) - (6.76 * age));
							}

							//print out the result for the calorie intake
                            System.out.println ("Your recommended daily calorie intake is: " + (calories * 1.2)); break;



                    //print out the following information based on each of the specified numbers
                    case 2: System.out.println ("Based on the following information:");
				            System.out.println ("Weight: " + (double) weight);
                            System.out.println ("Height: " + (double) height);
                            System.out.println ("Age: " + age + " years");

                            //specify the letters symbolize the full names of each gender
							if (gender == 'M')
							{
							  System.out.println ("Gender: Male");
							}
						    else
						    {
							  System.out.println ("Gender: Female");
			                }

			                //print out the activity consumption
                            System.out.println ("Activity: Light exercise (1-3 days per week).");

                            //calculate the amount of calories to maintain the inputted weight
						    if (gender == 'F')
							{
							  calories = (655.1 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
						    }
						    else
							{
							  calories = (66 + (6.2 * weight) + (12.7 * height) - (6.76 * age));
						    }

                            //print out the result for the calorie intake
                            System.out.println ("Your recommended daily calorie intake is: " + (calories * 1.375)); break;



                    //print out the following information based on each of the specified numbers
                    case 3: System.out.println ("Based on the following information:");
				            System.out.println ("Weight: " + (double) weight);
                            System.out.println ("Height: " + (double) height);
                            System.out.println ("Age: " + age + " years");

                           //specify the letters symbolize the full names of each gender
						   if (gender == 'M')
						   {
							 System.out.println ("Gender: Male");
						   }
						   else
						   {
							 System.out.println ("Gender: Female");
			               }

			                //print out the activity consumption
                            System.out.println ("Activity: Moderate exercise (3-5 days per week).");

                            //calculate the amount of calories to maintain the inputted weight
						    if (gender == 'F')
							{
							  calories = (655.1 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
							}
							else
							{
							  calories = (66 + (6.2 * weight) + (12.7 * height) - (6.76 * age));
							}

							//print out the result for the calorie intake
                            System.out.println ("Your recommended daily calorie intake is: " + (calories * 1.55)); break;




                    //print out the following information based on each of the specified numbers
                    case 4: System.out.println ("Based on the following information:");
				            System.out.println ("Weight: " + (double) weight);
                            System.out.println ("Height: " + (double) height);
                            System.out.println ("Age: " + age + " years");

                            //specify the letters that symbolize the full names of each gender
						    if (gender == 'M')
						    {
						   	  System.out.println ("Gender: Male");
						    }
						   	else
						   	{
						   	  System.out.println ("Gender: Female");
			                }

			                //print out the activity consumption
                            System.out.println ("Activity: Heavy exercise (6-7 days per week).");

                            //calculate the amount of calories to maintain the inputted weight
							if (gender == 'F')
						    {
							  calories = (655.1 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
							}
							else
							{
							  calories = (66 + (6.2 * weight) + (12.7 * height) - (6.76 * age));
						    }

						    //print out the result for the calorie intake
                            System.out.println ("Your recommended daily calorie intake is: " + (calories * 1.725)); break;




                    //print out the following information based on each of the specified numbers
                    case 5: System.out.println ("Based on the following information:");
				            System.out.println ("Weight: " + (double) weight);
                            System.out.println ("Height: " + (double) height);
                            System.out.println ("Age: " + age + " years" );

                            //specify the letters that symbolize the full names of each gender
					        if (gender == 'M')
					        {
					   		  System.out.println ("Gender: Male");
					   	    }
					   	    else
					   	    {
					   		  System.out.println ("Gender: Female");
			                }

			                //print out the activity consumption
                            System.out.println ("Activity: Very heavy exercise (twice per day, extra heavy workout).");

                            //calculate the amount of calories to maintain the inputted weight
						    if (gender == 'F')
							{
							  calories = (655.1 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
							}
						    else
						    {
							  calories = (66 + (6.2 * weight) + (12.7 * height) - (6.76 * age));
						    }

						    //print out the result for the calorie intake
                            System.out.println ("Your recommended daily calorie intake is: " + (calories * 1.9)); break;

                    default: System.out.println ("Invalid activity level input. Expected 1, 2, 3, 4, or 5. Encountered: " + activity_level);
				    }


                    //proceed with a space
                    System.out.println ();

     }

}