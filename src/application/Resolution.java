package application;

public class Resolution {
	public static String function(double A,double B,double C)
    {

        double a = A;

        double b = B;

        double c = C;

        String answer = "Error";
        
		if (a == 0 && b == 0 && c == 0){
			answer = "tous les nombres reels sont des solutions";
		}
		else if (a==0 && b==0 && c!= 0){
			answer = "y'a pas de solution";
		}
		else if (a==0 && b!= 0){
			double x = -c/b;
			answer = "la solution est : " +  x;
		}
		else if (a!= 0){
			double discriminant = b*b - 4*a*c;
			if (discriminant < 0){
				answer = "l'ensemble des solution est l'ensemble vide";
			}
			else if (discriminant == 0){
				double x = -b/2*a;
				answer = "la solution est " + x + " ";
			}
			else if (discriminant > 0){
				double x = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
				double x2 = (-b - Math.sqrt(b*b - 4*(a*c)))/(2*a);
				answer = "les racines sont : "  + x  +"   et   " + x2 + "  ";
			}
		}
		return answer;
    }   
}
