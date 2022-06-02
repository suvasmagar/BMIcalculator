public class BMICalculator{

   
    public BMICalculator() {}

    public double value(double weight, double height)
    {
        double calc;
        calc = weight / ( height * height);
        System.out.println("check for clac value: " + calc);
        return calc;
    }

    public String classification8(double dmi)
    {
        String str;
        if(dmi > 0 && dmi < 15 )
            str = "Very severly underweight";
        else if(dmi >= 15 && dmi < 16)
            str = "Severly underweight";
        else if(dmi >= 16 && dmi <18.5)
            str = "Underweight";
        else if(dmi >= 18.5 && dmi < 25)
            str = "Normal (healthy weight)";
        else if(dmi >= 25 && dmi < 30)
            str = "Overweight";
        else if(dmi >= 30 && dmi < 35)
            str = "Moderately obese";
        else if(dmi == 40)
            str = "Severly obese";
        else
            str = "Very severely obese ";
        
        return str;
    }

    public String Classification3(double bmi)
    {
        String str;

       
        if(bmi < 18.5)
        {
            str = "Low";
            
        }
            
        else if(bmi >= 18.5 && bmi < 25)
        {
            str = "Normal";
           
        } 
        else
        {
            str = "high";
            
        } 
        
        return str;

    }

    // public int getLow()
    // {
    //     return low;
    // }
    // public int getHigh()
    // {
    //     return high;
    // }
    // public int getNorm()
    // {
    //     return norm;
    // }

    public double[] sort(double[] obj, int a)
    {
        double[] arr = new double[a];
       
        double temp;
        for(int i = 0; i < a; i++)
        {
            arr = obj;
            for(int j = i+1; j < a; j++)
            {
                if(arr[i] <  arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }

       
        return arr;
    }
}