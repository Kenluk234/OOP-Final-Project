import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // Function to hire a handyman
    public static void Hire(Scanner scn, Handymen handymen) {
        boolean userrequest = false;
        System.out.println(handymen.showDesc());
        System.out.println("Would you like to hire him/her (Yes/No)? (By hiring them, you agree to pay the fees, and it cannot be undone)");
        String confirm = scn.next();
        if (confirm.equals("Yes")) {
            userrequest = true;
            System.out.println("Awaiting Handyman's confirmation.");
            System.out.println("Request detected, would you like to work with your customer?");
            System.out.print("Answer (Yes/No): ");
            String handyconfirm = scn.next();
            if (handyconfirm.equals("Yes")) {
                handymen.accept = true;
                // Consider the code below
                if (userrequest && handymen.accept) {
                    System.out.println(handymen.phoneNum);
                    System.out.println(handymen.email);
                    System.out.println("Here are the terms & conditions:");
                    System.out.println("Lorem ipsum dolor sit amet.\n" +
                            "Qui quos magni sit harum neque cum illo molestias eum omnis maiores.\n" +
                            "Non tempore quidem non esse quis ex quas ipsum et commodi quibusdam.\n" +
                            "A pariatur pariatur et reiciendis delectus vel soluta molestiae et sapiente facere sed Quis perferendis.\n" +
                            "Sed molestiae voluptas ut incidunt fugiat qui omnis delectus et voluptatibus ipsam id enim Quis.\n" +
                            "At recusandae incidunt qui optio fuga ea aliquam earum aut expedita autem cum illum voluptas.\n" +
                            "Et quisquam reiciendis aut fugiat eius id nobis unde ad illum neque.\n" +
                            "Ut suscipit accusantium est labore totam qui labore recusandae.\n" +
                            "Sit nihil inventore est possimus magnam non quam illo ex porro galisum et culpa voluptas!\n" +
                            "Aut sint quas non assumenda beatae eos quam galisum ex velit iure et rerum commodi eum recusandae consectetur. </p>\n" +
                            "<p>Ut illum labore est esse consequatur et quis quae et officia nesciunt quo numquam eveniet ut harum beatae.\n" +
                            "Qui cumque quia est molestias veritatis eos modi porro quo illo blanditiis et atque itaque.\n" +
                            "Quo fugit facilis ut consequuntur enim sit minus laboriosam et unde accusantium sed aliquid architecto qui ipsum fuga et dolores maxime. \n" +
                            "Ut laboriosam maxime non ipsum dolores id molestias explicabo rem magni voluptatem quo illo voluptatem et delectus omnis. \n" +
                            "Qui consectetur eius non culpa eveniet qui unde officia eum rerum dignissimos sit molestias repellat. \n" +
                            "In dolor dicta ab perspiciatis consequatur ex sequi tempora et quis voluptas est vitae quia. \n" +
                            "Non fuga impedit et iste quia aut suscipit consequuntur.\n" +
                            "Sit dignissimos molestias rem temporibus soluta et ipsa placeat qui vitae ipsam quo natus quasi. \n" +
                            "Aut rerum asperiores ea nihil praesentium est voluptatem neque et voluptatibus iusto ut repellat consequatur aut praesentium voluptatem. \n" +
                            "Ex rerum voluptate ea eaque sapiente aut dolore sint eum suscipit iusto ea omnis pariatur ab porro consequatur? \n" +
                            "Quo dolorum fuga aut reprehenderit nobis ad labore voluptatem qui voluptatum iure qui eligendi neque quo magni corrupti.\n\n");
                    System.out.println("This is your last chance to cancel your appointment. Do you still wish to continue the appointment? (Yes/No)");
                    String finalConfirmation = scn.next();
                    // If confirmed, it prints confirmation and employs the handymen instance.
                    if (finalConfirmation.equals("Yes")) {
                        System.out.println("Appointment confirmed.");
                        System.out.println("Payment will be done after the appointment is finished.");
                        handymen.employed = true;
                    } else if (finalConfirmation.equals("No")) {
                        System.out.println("Appointment cancelled.");
                    } else {
                        System.out.println("Invalid input.");
                        System.out.println("Press enter to go back.");
                        scn.nextLine();
                        scn.nextLine();
                    }
                }
            } else if (handyconfirm.equals("No")) {
                handymen.accept = false;
                System.out.println("Sorry, your request is rejected.");
            } else {
                System.out.println("Invalid input.");
                System.out.println("Press enter to go back.");
                scn.nextLine();
                scn.nextLine();
            }
        } else if (confirm.equals("No")) {
            userrequest = false;
        } else {
            System.out.println("Invalid input.");
            System.out.println("Press enter to go back.");
            scn.nextLine();
            scn.nextLine();
        }
    }
    // Returns an ArrayList of handymen with duplicates removed
    public static ArrayList<Handymen> removeDuplicates(ArrayList<Handymen> listA) {
        ArrayList<Handymen> newList = new ArrayList<Handymen>();
        for (Handymen elements : listA) {
            if (!(newList.contains(elements))) {
                newList.add(elements);
            } else {
                continue;
            }
        }
        return newList;
    }
    // Returns an ArrayList of profession tags, where tag duplicates are removed
    public static ArrayList<String> removeTagDuplicates(ArrayList<String> listB) {
        ArrayList<String> newList = new ArrayList<String>();
        for (String elements : listB) {
            if (!(newList.contains(elements))) {
                newList.add(elements);
            } else {
                continue;
            }
        }
        return newList;
    }

    // Returns an ArrayList of handymen hired by you
    public static ArrayList<Handymen> employedHandymen(ArrayList<Handymen> listB) {
        ArrayList<Handymen> employedHandymenList = new ArrayList<Handymen>();
        for (Handymen elementE : listB) {
            if (elementE.employed == true) {
                employedHandymenList.add(elementE);
            }
        }
        return employedHandymenList;
    }

    // Returns an ArrayList of IDs of your hired handymen
    public static ArrayList<String> employedHandymenID(ArrayList<Handymen> listC) {
        ArrayList<String> employedHandymenIDList = new ArrayList<String>();
        for (Handymen elementE : listC) {
            if (elementE.employed == true) {
                String elementEID = elementE.id;
                employedHandymenIDList.add(elementEID);
            }
        }
        return employedHandymenIDList;
    }
    // Returns invalid input message
    public static void invalidInput(Scanner scn) {
        System.out.println("Invalid input");
        System.out.println("Press enter to go back.");
        // (2W) 2 input prompts to prevent automatic return to main menu before pressing the main key first
        scn.nextLine();
        scn.nextLine();
    }
    // Returns tag not existing message
    public static void tagNotExisting(Scanner scn) {
        System.out.println("Sorry, Tag does not exist.");
        System.out.println("Press enter to go back.");
        // Refer to (2W)
        scn.nextLine();
        scn.nextLine();
    }
    // Returns handymen already hired message
    public static void handymanAlreadyHired(Scanner scn) {
        System.out.println("You already hired this person!");
        System.out.println("Press enter to go back.");
        // Refer to (2W)
        scn.nextLine();
        scn.nextLine();
    }
    public static void invalidID(Scanner scn) {
        System.out.println("Invalid ID, please enter the correct ID.");
        System.out.println("Press enter to go back.");
        // Refer to (2W)
        scn.nextLine();
        scn.nextLine();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String UserKey = "Username";
        String PassKey = "Password";
        // An ArrayList that contains all handymen recorded
        ArrayList<Handymen> handymenList = new ArrayList<>();
        // An ArrayList that contains employed handymen instances
        ArrayList<Handymen> handymenEmployed = employedHandymen(handymenList);
        // An ArrayList that contains tags of all professions of handymen provided
        ArrayList<String> handymenSpec = new ArrayList<>();
        // An ArrayList that contains list of featured handymen objects
        ArrayList<Handymen> featuredHandymen = new ArrayList<Handymen>();
        // An ArrayList that contains IDs of featured handymen
        ArrayList<String> featuredHandymenID = new ArrayList<String>();
        IndoorHandymen h1 = new IndoorHandymen(
                false,
                false,
                true,
                "1",
                "1",
                "Mike",
                "Sanders",
                "Plumber",
                "081238576027",
                "mike@gmail.com",
                4,
                "A plumber",
                "Bachelor Of Mechanics",
                7.99
        );
        IndoorHandymen h2 = new IndoorHandymen(
                false,
                false,
                false,
                "2",
                "2",
                "John",
                "Damon",
                "Furnisher",
                "083429384841",
                "johndamon@gmail.com",
                2,
                "A furnisher",
                "Bachelor Of Design",
                4.99
        );
        HybridHandymen h3 = new HybridHandymen(
                false,
                false,
                false,
                "3",
                "3",
                "Lydia",
                "Warner",
                "Florist",
                "081102264846",
                "lydia@gmail.com",
                "City A",
                "A florist",
                "Doctor Of Biology",
                true,
                5,
                6.99
        );
        IndoorHandymen h4 = new IndoorHandymen(
                false,
                false,
                false,
                "4",
                "4",
                "Marco",
                "Sanchez",
                "Glassmith",
                "081254762676",
                "sanchez@gmail.com",
                5,
                "Just a glassmith",
                "Bachelor of Arts",
                8.99
        );
        IndoorHandymen h5 = new IndoorHandymen(
                false,
                false,
                false,
                "5",
                "5",
                "Juan",
                "Martinez",
                "Plumber",
                "086356734421",
                "Jumar@gmail.com",
                3,
                "I am the plumber you need!",
                "Bachelor of Engineering",
                4.99
        );
        IndoorHandymen h6 = new IndoorHandymen(
                false,
                false,
                false,
                "6",
                "6",
                "Marquis",
                "Paulo",
                "Technician",
                "086356734421",
                "ItsPaulo@gmail.com",
                7,
                "I am here to fix your problems!",
                "Bachelor of Computer Science",
                6.99
        );
        IndoorHandymen h7 = new IndoorHandymen(
                false,
                true,
                true,
                "7",
                "7",
                "Jonathan",
                "Kyojuro",
                "Glassmith",
                "081504222225",
                "JoJo@gmail.com",
                10,
                "Your art is one button away!",
                "Bachelor of Arts",
                8.99
        );
        OutdoorHandymen h8 = new OutdoorHandymen(
                false,
                false,
                false,
                "8",
                "8",
                "Keith",
                "Jenkins",
                "Gardener",
                "081266773911",
                "jenkins@gmail.com",
                "City B",
                "I am the gardener you need!",
                true,
                3.99
        );
        OutdoorHandymen h9 = new OutdoorHandymen(
                false,
                false,
                false,
                "9",
                "9",
                "Willem von",
                "Ichtem",
                "Gardener",
                "081266773911",
                "willem@gmail.com",
                "City A",
                "I love gardening!",
                false,
                3.99
        );

        // Add handymen objects to the handymenList.
        handymenList.add(h1);
        handymenList.add(h2);
        handymenList.add(h3);
        handymenList.add(h4);
        handymenList.add(h5);
        handymenList.add(h6);
        handymenList.add(h7);
        handymenList.add(h8);
        handymenList.add(h9);

        // Add handymen professions to the handymenProf in order to make the search feature functional.
        handymenSpec.add(h1.specialization);
        handymenSpec.add(h2.specialization);
        handymenSpec.add(h3.specialization);
        handymenSpec.add(h4.specialization);
        handymenSpec.add(h5.specialization);
        handymenSpec.add(h6.specialization);
        handymenSpec.add(h7.specialization);
        handymenSpec.add(h8.specialization);
        handymenSpec.add(h9.specialization);

        // Add handymen to the featured list
        featuredHandymen.add(h1);
        featuredHandymen.add(h2);
        featuredHandymen.add(h3);

        System.out.println("Welcome to the Handymen Service!");

        // Login prompt
        while (true) {
            /*
            System.out.println("Username:");
            String User = scn.next();
            System.out.println("Password:");
            String Pass = scn.next();
            // If username and password is correct, the login loop breaks and user goes into the main menu.
            if (User.equals(UserKey) && Pass.equals(PassKey)) {
                break;
            }
            // If loop has not been broken, it displays login mistakes and restarts prompt until log in is successful.
            System.out.println("Wrong username or password. Try again");
            continue;
        }
        */
            while (true) {
                // The main menu.
                System.out.println("Handyman Service");
                System.out.println("Recommended services today:");
                // Displays featured handymen
                for (Handymen handyman : featuredHandymen) {
                    System.out.println(handyman.menuForm());
                }
                System.out.println("1. Proceed to selecting ID");
                System.out.println("2. Search for other handymen");
                System.out.println("3. View appointment status");
                System.out.println("Select Option: ");
                String opt = scn.next();
                if (opt.equals("1")) {
                    while (true) {
                        for (Handymen handyman : featuredHandymen) {
                            System.out.println(handyman.menuForm());
                        }
                        System.out.println("Select ID (Press 'Q' to exit): ");
                        String IDchoice = scn.next();
                        // Option to select recommended handymen.
                        boolean IDfound = false;
                        boolean isAlreadyHired = false;

                        Handymen selection = null;
                        if (IDchoice.equals("Q")) {
                            break;
                        } else {
                            for (Handymen element : employedHandymen(handymenList)) {
                                if (element.id.equals(IDchoice)) {
                                    isAlreadyHired = true;
                                } else {
                                    continue;
                                }
                            }
                            for (Handymen element : featuredHandymen) {
                                if (IDchoice.equals(element.id)) {
                                    IDfound = true;
                                    selection = element;
                                    break;
                                }
                            }
                            if (selection == null && isAlreadyHired == false) {
                                invalidID(scn);
                            }
                            // If a hired handyman is selected (the ID is the same as any hired IDs), then the system tells that the user already hired the person.
                            if (isAlreadyHired == true) {
                                handymanAlreadyHired(scn);
                            }
                            // Hires handymen if ID is found and not already hired
                            if (IDfound && !(isAlreadyHired)) {
                                if (selection != null) {
                                    Hire(scn, selection);
                                } else {
                                    invalidID(scn);
                                }
                            }
                        }
                    }
                } else if (opt.equals("2")) {
                    // Option to search handymen.
                    while (true) {
                        boolean tagFound = false;
                        System.out.println("Who are you looking for?");
                        handymenSpec = removeTagDuplicates(handymenSpec);
                        System.out.println(handymenSpec);
                        System.out.println("If you want to exit search, press 'Q'.");
                        System.out.println("Search: ");
                        String src = scn.next();
                        // If Q entered, returns to main menu, else proceeds to search
                        if (src.equals("Q")) {
                            break;
                        } else {
                            for (String elementX : handymenSpec) {
                                if (src.equals(elementX)) {
                                    tagFound = true;
                                    break;
                                }
                            }
                            // If search matches any specialization tags, proceeds to search confirmation and shows all handymen of the specifications
                            if (tagFound == true) {
                                System.out.println("Are you looking for " + src + "? (Yes/No)");
                                String confirm = scn.next();
                                if (confirm.equals("Yes")) {
                                    // New searchedHandymen array
                                    ArrayList<Handymen> searchedHandymen = new ArrayList<>();
                                    // Adds handymen of matching tags to searchedHandymen and prints the handymen info as well
                                    for (Handymen elementA : handymenList) {
                                        if (elementA.specialization.equals(src)) {
                                            searchedHandymen.add(elementA);
                                            System.out.println(elementA.menuForm());
                                        }
                                    }
                                    boolean IDfound = false;
                                    boolean isAlreadyHired = false;
                                    System.out.println("Select ID (Press 'Q' to exit): ");
                                    String IDchoice = scn.next();
                                    Handymen selection = null;
                                    if (IDchoice.equals("Q")) {
                                        break;
                                    }
                                    for (Handymen element : searchedHandymen) {
                                        if (IDchoice.equals(element.id) && element.employed == true) {
                                            isAlreadyHired = true;
                                        }
                                    }
                                    if (isAlreadyHired == true) {
                                        handymanAlreadyHired(scn);
                                    } else {
                                        for (Handymen element : searchedHandymen) {
                                            if (IDchoice.equals(element.id)) {
                                                IDfound = true;
                                                selection = element;
                                                if (selection instanceof OutdoorHandymen) {
                                                    OutdoorHandymen outdoorSelection = (OutdoorHandymen) element;
                                                    if (IDfound == true && outdoorSelection.optimalEnvironment) {
                                                        Hire(scn, outdoorSelection);
                                                    } else if(outdoorSelection.optimalEnvironment == false) {
                                                        System.out.println("Sorry, due to weather or other factors, the handyman can't work here.");
                                                        System.out.println("Press enter to go back.");
                                                        scn.nextLine();
                                                        scn.nextLine();
                                                    }
                                                } else if (element instanceof IndoorHandymen || element instanceof HybridHandymen) {
                                                    if (IDfound == true) {
                                                        Hire(scn, selection);
                                                    }
                                                }
                                            }
                                        }
                                        if (IDfound == false) {
                                            invalidID(scn);
                                        }
                                    }
                                } else if (confirm.equals("No")) {
                                    continue;
                                } else {
                                    invalidInput(scn);
                                }
                            } else if (tagFound == false) {
                               tagNotExisting(scn);
                            }
                        }
                    }
                } else if (opt.equals("3")) {
                    // Option to check handymen that are currently hired.
                    while (true) {
                        boolean handymenHired = false;
                        for (Handymen elementE : handymenList) {
                            if (elementE.employed == true) {
                                if (elementE.servicing == true) {
                                    System.out.println("Status: Employed + Servicing     " + elementE.menuForm());
                                    handymenEmployed.add(elementE);
                                    handymenHired = true;
                                } else if (elementE.servicing == false) {
                                    System.out.println("Status: Employed + Not Servicing " + elementE.menuForm());
                                    handymenEmployed.add(elementE);
                                    handymenHired = true;
                                }
                            }
                        }
                        if (handymenHired == false) {
                            System.out.println("No handymen is being hired now.");
                        }
                        boolean paid = false;
                        boolean IDfound = false;
                        boolean paymentQuit = false;
                        System.out.println("1. Select ID and pay");
                        System.out.println("2. Confirm service progress");
                        System.out.println("3. Main Menu");
                        System.out.println("Option: ");
                        String opt3 = scn.next();
                        if (opt3.equals("1")) {
                            for (Handymen elementF : handymenList) {
                                if (elementF.employed == true && elementF.servicing == true) {
                                    System.out.println(elementF.menuForm());
                                }
                            }
                            System.out.println("Select ID (Enter 'Q' to exit): ");
                            String IDchoice = scn.next();
                            Handymen selection = null;
                            if (IDchoice == "Q") {
                                break;
                            }
                            for (Handymen element : handymenEmployed) {
                                if (IDchoice.equals(element.id) && element.servicing == true) {
                                    IDfound = true;
                                    selection = element;
                                    break;
                                }
                            }
                            if (IDfound) {
                                while (true) {
                                    System.out.println("1. Pay");
                                    System.out.println("2. Back");
                                    String opt31 = scn.next();
                                    if (opt31.equals("1")) {
                                        System.out.println("Enter appointment duration in hours:");
                                        int hours = scn.nextInt();
                                        double fees = selection.price * hours;
                                        while (true) {
                                            System.out.println("The fee is: " + Double.toString(fees));
                                            System.out.println("Select payment method:");
                                            System.out.println("1. PayPal");
                                            System.out.println("2. Debit / Credit card");
                                            System.out.println("3. Go Back");
                                            String opt311 = scn.next();
                                            if (opt311.equals("1")) {
                                                System.out.println("PayPal verification receiver");
                                                System.out.println("Let's say the system detects payment, and the signal is sent to the prompt below.");
                                                System.out.println("Is the fee paid? (Yes/No)");
                                                String check = scn.next();
                                                if (check.equals("Yes")) {
                                                    paid = true;
                                                    break;
                                                } else if (check.equals("No")) {
                                                    paid = false;
                                                    break;
                                                } else {
                                                    invalidInput(scn);
                                                }
                                            } else if (opt311.equals("2")) {
                                                System.out.println("DC / CC verification receiver");
                                                System.out.println("Let's say the system detects payment.");
                                                System.out.println("Is the fee paid? (Yes/No)");
                                                String check = scn.next();
                                                if (check.equals("Yes")) {
                                                    paid = true;
                                                    break;
                                                } else if (check.equals("No")) {
                                                    paid = false;
                                                    break;
                                                } else {
                                                    invalidInput(scn);
                                                }
                                            } else if (opt311.equals("3")) {
                                                break;
                                            } else {

                                            }
                                        }
                                    } else if (opt31.equals("2")) {
                                        break;
                                    }
                                    if (paid == true) {
                                        break;
                                    }
                                }
                            } else {
                                invalidInput(scn);
                                break;
                            }
                            if (paid == true) {
                                System.out.println("Payment successful.");
                                System.out.println("Thank you for choosing us!");
                                selection.serviceDone();
                            }
                        } else if (opt3.equals("2")) {
                            // ArrayList of handymen employed but not servicing
                            ArrayList<Handymen> handymenEmployedNotServicing = new ArrayList<>();
                            // Adds handymen employed that is not servicing to the ArrayList
                            for (Handymen handyman : handymenList) {
                                if (handyman.servicing == false && handyman.employed == true) {
                                    handymenEmployedNotServicing.add(handyman);
                                }
                            }
                            // Prints every handyman employed, but not servicing
                            for (Handymen handyman : handymenEmployedNotServicing) {
                                System.out.println(handyman.menuForm());
                            }
                            // Boolean tracks and breaks a while (true) loop if passcode matches
                            boolean invalidIDBreak = false;
                            boolean passcodeMatchBreak = false;
                            boolean quitBreak = false;
                            // Selects ID among list
                            System.out.println("Select ID (Press 'Q' to exit): ");
                            String IDchoice = scn.next();
                            if (IDchoice.equals("Q")) {
                                quitBreak = true;
                            } else {
                                while (true) {
                                    for (Handymen handyman : handymenEmployedNotServicing) {
                                        // Selects ID if it exists in the list
                                        if (IDchoice.equals(handyman.id)) {
                                            // Prompt passcode
                                            System.out.println("Enter passcode (Press 'Q' to exit): ");
                                            String passcodeEntered = scn.next();
                                            // If passcode matches, handymen servicing is set to true and breaks the list
                                            if (passcodeEntered.equals(handyman.passcode)) {
                                                handyman.servicing();
                                                System.out.println("Handyman confirmed service.");
                                                passcodeMatchBreak = true;
                                                break;
                                            } else if(passcodeEntered.equals("Q")) {
                                                quitBreak = true;
                                                break;
                                            } else {
                                                System.out.println("Wrong passcode, please try again.");
                                            }
                                        } else {
                                            invalidID(scn);
                                            invalidIDBreak = true;
                                            break;
                                        }
                                    }
                                    // Referring to comments above, the boolean breaks the loop once passcode matches
                                    if (passcodeMatchBreak || quitBreak || invalidIDBreak) {
                                        break;
                                    }
                                }
                            }
                        } else if (opt3.equals("3")) {
                            break;
                        } else {
                            invalidInput(scn);
                        }
                    }
                } else {
                    invalidInput(scn);
                }
            }
        }
    }
}
