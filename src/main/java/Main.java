import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //first librarian
        Librarian defaultLibrarian = new Librarian("Main librarian" , "mypassword@@1234");
        Librarian.addLibrarian(defaultLibrarian);

        System.out.println("Welcome to our library!" +'\n' +"Declare your identity to continue"+'\n'
                +"Press u : a user" +'\t' +"Press l : a librarian");
        Scanner input = new Scanner(System.in);
        String identity = input.next();
        switch (identity){
            case "u":
                System.out.println("If you already have an account press 'yes' and if you don't , press anything to creat an account");
                String isOldUser = input.next();
                if(isOldUser.toLowerCase().equals("yes")){
                    //SIGN IN
                }else{
                    creatAccount();
                    runMenuUser();
                }
                break;
            case "l":
                System.out.println("If you already have an account press 'yes' and if you don't , press anything to creat an account");
                String isOldLibrarian = input.next();
                if(isOldLibrarian.toLowerCase().equals("yes")){
                    //SIGN IN
                }else{
                    creatAccount();
                    runMenuLibrarian();
                }
            default:
                System.err.println("INVALID INPUT!");
                System.out.println("You need to try again.");
                break;
        }
    }
    public static void logIn(){//////////???????????
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you username: ");
        String username = input.next();
        System.out.print("Enter you password: ");
        String password = input.next();
    }

    public static void creatAccount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.next();
        System.out.print("Password: ");
        String pass = input.next();

        System.out.println("To continue the process choose your identity");
        System.out.println("Press 0 : a user"+('\t')+"Press 1 : a librarian");
        int identity = input.nextInt();
        if(identity==0){
           User account = new User(username,pass);
           Library.addUser(account);
        }
        if(identity==1) {
            Librarian account = new Librarian(username,pass);
            Library.addLibrarian(account);
        }

    }
    public static void runMenuUser(){
        User newuser = new User(username,password);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your book name: ");
        String book = input.next();

        System.out.println("Why did you come here choose it from the menu below and type the number");
        System.out.println("1.Rent a book");
        System.out.println("2.Return a book");
        int menu = input.nextInt();
        switch (menu){
            case 1 : newuser.rentBook(book);
            break;
            case 2 : newuser.returnBook(book);
            break;
        }
    }
    public static void runMenuLibrarian(){
        Librarian newlibrarian = new Librarian(username,password);
        Scanner input = new Scanner(System.in);
        System.out.println("Why did you come here choose it from the menu below and type the number ");
        System.out.println("1.User category"+'\n'+"2.Book category"+'\n'+"3.Librarian category"+'\n');
        int category = input.nextInt();
        switch (category){
            case 1 : System.out.println("User category :" +'\n'+
                    "1.Search for a user"+'\t'+"2.Add a user"+'\t'+"3.Remove a user"+'\t'+"4.Update a user");
                int menu1 = input.nextInt();
                System.out.println("Enter the user name: ");
                ///////////??????????????
                switch (menu1){//user
                    case 1 : newlibrarian.searchuser(user);
                        break;
                    case 2 : newlibrarian.adduser(user);
                        break;
                    case 3 : newlibrarian.removeuser(user);
                        break;
                    case 4 : newlibrarian.updateuser(user);
                        break;
                }
                break;


            case 2 :  System.out.println("Book category :" +'\n'+
                    "1.Search for a book"+'\t'+"2.Add a book"+'\t'+"3.Remove a book"+'\t'+"4.Update a book");
                int menu2 = input.nextInt();
                System.out.println("Enter the book name: ");
                ///////////??????????????
                switch (menu2){//book
                    case 1 : newlibrarian.searchbook(book);
                        break;
                    case 2 : newlibrarian.addbook(book);
                        break;
                    case 3 : newlibrarian.removebook(book);
                        break;
                    case 4 : newlibrarian.updatebook(book);
                        break;
                }
                break;


            case 3 :  System.out.println("Librarian category :" +'\n'+
                    "1.Search for a librarian"+'\t'+"2.Add a librarian"+'\t'+"3.Remove a librarian"+'\t'+"4.Update a librarian");
                int menu3 = input.nextInt();
                System.out.println("Enter the librarian name: ");
                ///////////??????????????
                switch (menu3){//librarian
                    case 1 : newlibrarian.searchlibrarian(librarian);
                        break;
                    case 2 : newlibrarian.addLibrarian(librarian);
                        break;
                    case 3 : newlibrarian.removelibrarian(librarian);
                        break;
                    case 4 : newlibrarian.updatelibrarian(librarian);
                        break;
                }
                break;
        }

    }
}
