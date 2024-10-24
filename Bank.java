import java.util.*;

class Bank {
    static String username;
    static long mobile;
    static String pan;
    static Long adhar;
    static String address;
    static int pin;
    static double bal;
    final static Long accountnumber = 12341234122346L;
    final static String ifscCode = "LCF1234";

    static ArrayList<String> statement = new ArrayList<>();

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println(" *** Welcome ***");
            System.out.println("LAXMI CHIT FUND ");
            System.out.println();
            System.out.println("1. Existing User ");
            System.out.println("2. Create Bank Account ");
            System.out.println();
            System.out.print("Enter an option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    login(sc);
                    break;

                case 2:
                    createAccount(sc);
                    break;

                default:
                    System.out.println("Wrong Option Entered");
            }
        }
    }

    public static void login(Scanner sc) {
        if (username != null) {
            System.out.println();
            System.out.println(" *** LOGIN Module ***");
            System.out.println();
            System.out.print("Mobile: ");
            Long mobile1 = sc.nextLong();
            System.out.print("Pin: ");
            int pin1 = sc.nextInt();
            if ((mobile == mobile1) && (pin == pin1)) {
                homePage(sc);
            } else {
                System.out.println();
                System.out.println("Wrong cerd entered");
            }
            System.exit(0);
        } else {
            System.out.println();
            System.out.println("Create Your Account First ");
            System.out.println();
        }
    }

    public static void createAccount(Scanner sc) {
        System.out.println();
        System.out.println("*** Account Creation Module ***");
        System.out.println();
        System.out.print("Username: ");
        sc.nextLine();
        username = sc.nextLine();
        System.out.print("Mobile: ");
        mobile = sc.nextLong();
        System.out.print("Adhar: ");
        adhar = sc.nextLong();
        System.out.print("Pancard: ");
        pan = sc.next();
        System.out.print("Address: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("Pin: ");
        pin = sc.nextInt();
        System.out.print("Enter the amount to deposit : ");
        bal = sc.nextDouble();
        statement.add("Deposit: " + bal);
        System.out.println();
        System.out.println("Account Created Successfully ");
        System.out.println();

    }

    public static void homePage(Scanner sc) {
        for (;;) {
            System.out.println();
            System.out.println(" *** HOME PAGE MODULE***");
            System.out.println();
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Statement");
            System.out.println("5. Edit Profile");
            System.out.println("6. Logout");
            System.out.println();
            System.out.print("Enter an option : ");
            int option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    deposit(sc);
                    break;

                case 2:
                    widthdraw(sc);
                    break;

                case 3:
                    checkBalance(sc);
                    break;

                case 4:
                    statement();
                    break;

                case 5:
                    editProfile(sc);
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("Wrong op Entered ");

            }
        }
    }

    public static void deposit(Scanner sc) {
        System.out.println("**** Deposit Amount ****");
        System.out.println();
        System.out.print("Enter the amount: ");
        double depositAmount = sc.nextDouble();
        bal += depositAmount;
        statement.add("Deposit: " + depositAmount);
        System.out.println();
        System.out.println("Amount Deposited Successfully ");
    }

    public static void widthdraw(Scanner sc) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("***** Withdraw Amount .....***");

            System.out.println();

            System.out.print("Enter the amount: ");

            double withdrawAmount = sc.nextDouble();

            System.out.print("Enter your pin: ");

            int pin1 = sc.nextInt();

            if (pin == pin1) {
                if (withdrawAmount <= bal) {
                    bal -= withdrawAmount;
                    statement.add("Withdraw: " + withdrawAmount);
                    System.out.println("Amount debited Successfully");
                } else {
                    System.out.println("Insufficients Funds");
                }
                return;
            } else {
                System.out.println();
                System.out.println("Wrong Pin Entered");
            }
        }
        System.out.println();

        System.out.println("Your account has been deactivated for 24 hr.");

        System.exit(0);

    }

    public static void checkBalance(Scanner sc) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("..... CHECK BALANCE ");
            System.out.print("Enter your pin: ");
            int pin1 = sc.nextInt();
            if (pin == pin1) {
                System.out.println();
                System.out.println("Account Balance is: " + bal + "rs");
                return;
            } else {
                System.out.println();
                System.out.println("Wrong Pin Entered");
            }

        }
        System.out.println();

        System.out.println("Your account has been deactivated for 24 hr.");

        System.exit(0);

    }

    public static void statement() {
        System.out.println("***** Statement *****");
        System.out.println();
        for (String tran : statement) {
            System.out.println(tran);
        }
    }

    public static void editProfile(Scanner sc) {

        System.out.println("Edit Profile");
        System.out.println();
        System.out.println("What Do you Want to Edit");
        System.out.println("1: Username");
        System.out.println("2: Mobile Number");
        System.out.println("3: address ");
        System.out.println("4: Pin");
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.print("Enter New Username : ");
                sc.nextLine();
                username = sc.nextLine();
                break;
            case 2:
                System.out.print("Enter new Mobile Number : ");
                mobile = sc.nextLong();
                break;
            case 3:
                System.out.print("Enter New Address : ");
                sc.nextLine();
                address = sc.nextLine();
                break;
            case 4:
                System.out.print("Enter New Pin : ");
                pin = sc.nextInt();
                break;
            default:
                System.out.println("Wrong Number Entered");
                break;
        }

    }
}
