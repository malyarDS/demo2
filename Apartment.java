package com.gmail.kr.malyar;

import java.util.Scanner;

public class Apartment 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть номер квартири ");
		int aprt = sc.nextInt();
		int flr;
		
		if (aprt < 144 && aprt > 0 ){
			if (aprt > 108){
				flr = ((aprt-108+3)/4);
				System.out.println("Під'їзд № 4");
				System.out.println("Етаж № " + flr);
			}
			if (aprt > 72 && aprt < 108){
				flr = ((aprt-72+3)/4);
				System.out.println("Під'їзд № 3");
				System.out.println("Етаж № " + flr);
			}
			if (aprt > 36 && aprt < 72){
				flr = ((aprt-36+3)/4);
				System.out.println("Під'їзд № 2");
				System.out.println("Етаж № " + flr);
			}
			if (aprt < 36){
				flr = (aprt+3)/4;
					System.out.println("Під'їзд № 1");
					System.out.println("Етаж № " + flr);
			}
					System.out.println("Квартира № "+aprt);
			
		}

		else{ 
			System.out.println("Нажаль,такої квартири в домі не існує");
		}

	}
	

}
