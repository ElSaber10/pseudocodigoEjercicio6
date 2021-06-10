import java.util.*;
import java.util.Random;
public class Ejercicio6 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);
	//String sexo;
	int May=0, Men=0,m1=0,m2=0, i = 0;
	double PromMay=0, PromMen=0;
	int datos[] = new int [100] ;
	while(i < 10){
	System.out.println("Ingrese su edad");
	datos[i] = sc.nextInt();
		if (datos[i] < 25){
		Men += datos[i];
		m1++;
		i++;
		}
		if (datos[i] >= 25){
		May += datos[i];
		m2++;
		i++;
		}
	}
	PromMay = May/m2;
	PromMen = Men/m1;
	System.out.println("Promedio de Mayores iguales a 25))  " + PromMay);
	System.out.println("Promedio de Hombres Menores a 25))  " + PromMen);
}
}
