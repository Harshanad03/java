import java.util.Scanner;
class main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a%10==3||a%10==8){
            System.out.println("Lucky Winner");
        }
        else{
            System.out.println("Not a Lucky Winner");
        }
    }
}


import java.util.Scanner;
class main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=100&&a>=85){
            System.out.println("A");
        }
        else if(a<=84&&a>=75){
            System.out.println("B");
        }
        else if(a<=74&&a>=65){
            System.out.println("C");
        }
        else if(a<=64&&a>=0){
            System.out.println("D");
        }
        else{
            System.out.println("Invalid");
        }
    }
}



import java.util.Scanner;
class main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1&&a<=15){
            System.out.println("Child Ticket");
        }
        else if(a<=200){
            System.out.println("Adult Ticket");
        }
    }
}

import java.util.Scanner;
class main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1&&a<15){
            System.out.println("Welcome to the show");
            System.out.println("Please note that you should be accompanied by an adult");
        }
        else if(a>=15&&a<=100){
            System.out.println("Welcome to the show");
        }
    }
}


import java.io.*;
import java.util.*;
class Carrom {
	public static void main(String [] args) {
		int number;
		char c;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if(number < 1 || number>9) {
			System.out.println("Invalid Input");
		}
		else {
		c = sc.next().charAt(0);
		
			if(Character.compare(c, 'r') == 0) {
				System.out.println(number+5);
			}
			else {
				System.out.println(number);
			}
		}
	}
}



