import java.util.Scanner;

  public class DistanceCovered {
      
    public  static  void main(String[] args) {
     
       Scanner scanner = new Scanner (System.in);

         System.out.print("Enter u,t, and a:");

           double initialvelocity = scanner.nextDouble();


               int time = scanner.nextInt();
                
                 double acceleration = scanner.nextDouble();
                  
                 double ut = initialvelocity*time;

                  double at2 = acceleration*(time*time);

                    double distancecovered = ut + 0.5*(at2);
                    
                     System.out.printf("The distancecovered is %.2f", distancecovered);


                   

         
                   


            }
       }