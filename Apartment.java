package com.gmail.kr.malyar;

import java.util.Scanner;

public class Apartment 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �������� ");
		int aprt = sc.nextInt();
		int flr;
		
		if (aprt < 144 && aprt > 0 ){
			if (aprt > 108){
				flr = ((aprt-108+3)/4);
				System.out.println("ϳ�'��� � 4");
				System.out.println("���� � " + flr);
			}
			if (aprt > 72 && aprt < 108){
				flr = ((aprt-72+3)/4);
				System.out.println("ϳ�'��� � 3");
				System.out.println("���� � " + flr);
			}
			if (aprt > 36 && aprt < 72){
				flr = ((aprt-36+3)/4);
				System.out.println("ϳ�'��� � 2");
				System.out.println("���� � " + flr);
			}
			if (aprt < 36){
				flr = (aprt+3)/4;
					System.out.println("ϳ�'��� � 1");
					System.out.println("���� � " + flr);
			}
					System.out.println("�������� � "+aprt);
			
		}

		else{ 
			System.out.println("������,���� �������� � ��� �� ����");
		}

	}
	

}
