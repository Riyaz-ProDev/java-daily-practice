import java.util.Scanner;

public class switching {
  public static void main(String[] args) {
    String day;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the day");
    day=sc.nextLine();
    switch(day){
      case "monday":{
        System.out.println("today is "+ day);
        break;
      }
      case "tuesday":{
        System.out.println("today is "+ day);
        break;
      }
      case "wed":{
        System.out.println("today is "+ day);
        break;
      }
      case "thru":{
        System.out.println("today is "+ day);
        break;
      }
      case "fri":{
        System.out.println("today is "+ day);
        break;
      }
      case "sat":{
        System.out.println("today is "+ day);
        break;
      }
      case "sun":{
        System.out.println("today is "+ day);
        break;
      }

    }

  }
}
