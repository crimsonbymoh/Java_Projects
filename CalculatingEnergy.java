import java.util.Scanner;

  public class CalculatingEnergy {
      
    public  static  void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

            System.out.println("Enter amount of water in kilograms");

             double waterInKilogram = scanner.nextDouble();

              System.out.println("Enter the initial temperature of water");
            
                double initialTemperature = scanner.nextDouble();

                  System.out.println("Enter the final temperature of water");

                    double finalTemperature = scanner.nextDouble();

                      double energy = waterInKilogram * (finalTemperature - initialTemperature)*4184;
                        
                        System.out.printf("The energy needed is %d", energy);

            }
       }