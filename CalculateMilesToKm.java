
package calculatemilestokm;


public class CalculateMilesToKm {

 
    public static void main(String[] args) {
        System.out.println("Miles" + "\t" + "\t" + "Kilometers"); 
        int Miles = 1;
                
        for(int x=0; x<10; x++)
        {
            double KM = Miles * 1.609;   
            System.out.printf(Miles + "\t" + "\t" + "%4.3f\n", KM);
            Miles++; 
        }    
    }
    
}
