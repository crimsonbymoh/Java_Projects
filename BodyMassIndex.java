import java.util.scanner;

  public Class BodyMassIndex{

    public static void main(String[] args) {

     Scanner scanner = new Scanner(system.in);
     
       System.out.println("Enter weight in pounds:");

         double weight = Scanner.nextDouble();

           System.out.println("Enter height in inches:");

            int height = scanner.nextInt();

              double constantValueForConvertingToKilogram = 0.45359237; 

                 double constantValueForConvertingToMeter = 0.0254;

                   double weightInKilogram = weight * constantValueForConvertingToKilogram;

                     double heightToMeters = height * constantValueForConvertingToMeter;

                         double BodyMassIndex = weightInKilogram / (heightInMeters * heightInMeters);

                           System.out.printf("BodyMassIndex is %2f", bmi);


    }
  }