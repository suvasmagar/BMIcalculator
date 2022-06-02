import java.util.Scanner;

public class Assessment1A {
    public static void main(String[] args)
    {
         double weight, height;

         int high = 0;
         int low= 0; 
         int norm = 0;
         System.out.println("BMI Calculation: You are welcome\n");

         int a;
         Scanner sc = new Scanner(System.in);
         System.out.print("How many BMI calculations do you wish to perform ?  --> ");
         a = sc.nextInt();
         BMICalculator obj[] = new BMICalculator[a];

         // to store bmi values of an array 
         double[] arr = new double[a];


         for(int i = 0; i < a; i++)
         {
           
            obj[i] = new BMICalculator();
            System.out.print("\nHeight for person " + (i+1) + "(m): ");
            height = sc.nextFloat();
            System.out.print("Weight for person " + (i+1) + "(kgs): ");
            weight = sc.nextFloat();
            double bmi = obj[i].value(weight, height);
            arr[i] = bmi;
            System.out.print("BMI for person " + (i+1) + ": " + bmi);

            System.out.print(" which is " + obj[i].classification8(bmi) + "\n");


            if(obj[i].Classification3(bmi)=="Low")
                low++;
            else if(obj[i].Classification3(bmi) == "Normal")
                norm++;
            else
                high++;
         }

         double[] arr2 = new double[a];
         arr2 = obj[a-1].sort(arr, a);
         double avg = (arr[0] + arr[a-1]) / 2;

         System.out.println("\nLowest BMI " + arr[a-1] );
         System.out.println("Highest BMI " + arr[0]);
         System.out.println("Average BMI " + avg);


        System.out.println("Number with low BMI: " +  low);
        System.out.println("Number with normal BMI: " + norm);
        System.out.println("Number with high BMI: " + high);
        System.out.println("Thank you!");

    }
}
