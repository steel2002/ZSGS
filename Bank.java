import java.util.Scanner;

class RBI {
    public double getInterast() {
        return 4.1;
    }
}

class SBI extends RBI {
    public double getInterast() {
        return 5.1;
    }
}

class ICICI extends RBI {
    public double getInterast() {
        return 6.1;
    }
}

class KVB extends RBI {
    public double getInterast() {
        return 7.1;
    }
}

class BSV extends RBI {
      public double getInterast() {
        return 8.1;
    }

}


class HDFC extends RBI {
      public double getInterast() {
        return 9.1;
    }

}

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select Your Bank :");
        System.out.println();
        System.out.println("Click 1 SBI  :");
        System.out.println("Click 2 ICICI :");
        System.out.println("Click 3 KVB :");
        System.out.println("Click 4 BSV :");
        System.out.println("Click 5 HDFC :");
        System.out.println();
        System.out.println("<========*****************==========>");

        int click = scan.nextInt();
        RBI bank = null;

        switch (click) {
            case 1:
                System.out.println("Welcome select in SBI Bank :");
                bank = new SBI();
                break;
            case 2:
                System.out.println("Welcome select in ICICI Bank :");
                bank = new ICICI();
                break;
            case 3:
                System.out.println("Welcome select in KVB Bank :");
                bank = new KVB();
                break;

                case 4:
                  System.out.println("Welcome select in BSV Bank :");
                  bank = new BSV();
                  break;
                  case 5:
                  System.out.println("Welcome select in HDFC Bank :");
                  bank = new HDFC();
                  break;
            default:
                System.out.println("Invalid selection.");
                return;
        }

         System.out.println("Menu  :");
         System.out.println();
         System.out.println("select 1: Show Interest Rate");
         System.out.println("select 2: Calculate Compound Interest");
         System.out.println("select 3: Exit");

        while (true) {
       
            int select = scan.nextInt();

            switch (select) {
                case 1:
                    System.out.println("The Interest Rate of Bank: " + bank.getInterast()+" %");
                    break;
                     case 2:
                   System.out.format("Enter the Principal amount: $ ");
                     double p = scan.nextDouble();

                   //  System.out.println("Enter the Rate of Interest: " +"%");
                    double r = bank.getInterast();

                    System.out.println("Enter the Number of Years: ");
                    double t = scan.nextDouble();

                    double result = p * Math.pow((1 + r / 100), t) - p;
                   System.out.printf("You are Interest : %.2f\n", result); 
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid menu selection.");
            }
        }
    }
}