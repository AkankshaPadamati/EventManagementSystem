import java.util.*;

interface color {
	
    static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red = "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred = "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurple = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";
    static String reset = "\u001B[0m";
    static String black = "\u001B[30m";
    static String magenta = "\u001B[35m";
    static String cyan = "\u001B[36m";
    static String white = "\u001B[37m";

    static String bright_white = "\u001B[90m";
    static String bright_red = "\u001B[91m";
    static String bright_green = "\u001B[92m";
    static String bright_yellow = "\u001B[93m";
    static String bright_magenta = "\u001B[95m";
    static String bright_cyan = "\u001B[96m";

    static String orange = "\u001B[38;5;208m";
    static String pink = "\u001B[38;5;205m";
    static String teal = "\u001B[38;5;37m";
    static String olive = "\u001B[38;5;58m";
    static String maroon = "\u001B[38;5;88m";
    static String navy = "\u001B[38;5;21m";
    static String indigo = "\u001B[38;5;54m";

    static String gold = "\u001B[38;2;255;215;0m";
    static String slate_blue = "\u001B[38;2;106;90;205m";
    static String forest_green = "\u001B[38;2;34;139;34m";
  }

class Birthday implements color {
    static Scanner sc = new Scanner(System.in);

    int Bdaycost = 0;
    int bill = 0;

    String cakeorder = "";
    String theme = "";
    int bill1 = 0;

    String Entry = "";
    int bill2 = 0;

    void cake() {
        System.out.println(blink+bgpurple+ "Here Are Few Cake Flavours" + reset);
        System.out.println(teal + "1.Butterscotch: 500/kg ");
        System.out.println("2.Strawberry :450/kg ");
        System.out.println("3.Chocolate :750/kg");
        System.out.println("4.Pineapple: 600/kg");
        System.out.println("5.vanilla: 500/kg");
        System.out.println("6.BlackForest:1000/kg ");
        System.out.println("7.CaramelWalnut: 1800/kg");
        System.out.println("8.RedVelvet: 1000/kg");
        System.out.println("9.BlueBerry: 800/kg");
        System.out.println("10TruffleCake: 500/kg");
        System.out.println(green + "Enter the flavour of cake you want" + reset);

        int oc = 1;
        while (oc < 11) {
            int a = sc.nextInt();
            if (a == 0)
                break;
            if (a < 0 && a > 10) {
                System.out.println(red + "Invalid Input .Please Enter Correct value " + reset);
            } else {
                switch (a) {

                    case 1:
                        System.out.println(green + "Enter the quantity of cake in kgs" + reset);
                        int b = sc.nextInt();
                        bill = bill + (b * 500);
                        oc++;
                        cakeorder = cakeorder + "ButterscotchCake " + b + " kg\n";
                        System.out
                                .println(green
                                        + "Would you like to order more!! If yes please continue if no please press 0");
                        break;
                    case 2:
                        System.out.println("Enter the quantity of cake in kgs");
                        int c = sc.nextInt();
                        bill = bill + (c * 450);
                        oc++;
                        cakeorder = cakeorder + "StrawbwerryCake " + c + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;
                    case 3:
                        System.out.println("Enter the quantity of cake in kgs");
                        int g = sc.nextInt();
                        bill = bill + (g * 750);
                        oc++;
                        cakeorder = cakeorder + "ChocolateCake " + g + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;

                    case 4:
                        System.out.println("Enter the quantity of cake in kgs");
                        int h = sc.nextInt();
                        bill = bill + (h * 600);
                        oc++;
                        cakeorder = cakeorder + "PineappleCake " + h + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;

                    case 5:
                        System.out.println("Enter the quantity of cake in kgs");
                        int i = sc.nextInt();
                        bill = bill + (i * 500);
                        oc++;
                        cakeorder = cakeorder + "VanillaCake " + i + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;

                    case 6:
                        System.out.println("Enter the quantity of cake in kgs");
                        int j = sc.nextInt();
                        bill = bill + (j * 1000);
                        oc++;
                        cakeorder = cakeorder + "BlackForestCake " + j + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;
                    case 7:
                        System.out.println("Enter the quantity of cake in kgs");
                        int k = sc.nextInt();
                        bill = bill + (k * 1800);
                        oc++;
                        cakeorder = cakeorder + "CaramelWalnutCake " + k + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;

                    case 8:
                        System.out.println("Enter the quantity of cake in kgs");
                        int l = sc.nextInt();
                        bill = bill + (l * 1000);
                        oc++;
                        cakeorder = cakeorder + "RedVelvetCake " + l + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;

                    case 9:
                        System.out.println("Enter the quantity of cake in kgs");
                        int m = sc.nextInt();
                        bill = bill + (m * 800);
                        oc++;
                        cakeorder = cakeorder + "BlueBerryCake " + m + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;
                    case 10:
                        System.out.println("Enter the quantity of cake in kgs");
                        int n = sc.nextInt();
                        bill = bill + (n * 500);
                        oc++;
                        cakeorder = cakeorder + "TruffleCake " + n + " kg\n";
                        System.out
                                .println("Would you like to order more!! If yes please continue if no please press 0");
                        break;

                    default:
                        System.out.println(red + "Invalid Input! Please enter correct value" + red);
                }
            }
        }
        Bdaycost = Bdaycost + bill;
    }

    void Theme() {
        System.out.println(blink+bgpurple + "Here are few Themes for Birthday Party " + reset);
        System.out.println(cyan + "1.circus         :  1500 ");
        System.out.println("2.blackandwhite  :  1000 ");
        System.out.println("3.color          :  1500 ");
        System.out.println("4.superhero      :  2000 ");
        System.out.println("5.fairy          :  2000 ");
        System.out.println("6.butterfly      :  2000 ");
        System.out.println("7.mickey         :  1500 ");
        System.out.println("8.unicorn        :  2500 ");
        System.out.println("9.candy          :  1000 ");
        System.out.println("10.bunny         :  1500 " + reset);
        int oc1 = 1;
        while (oc1 < 2) {
            System.out.println(green + "Enter the theme you want for birthday venue");
            int c = sc.nextInt();
            if (c < 1 || c > 10) {
                System.out.println(red + "Invalid Input .Please Enter Correct Value" + reset);
            } else {
                switch (c) {
                    case 1:
                        theme = "circus";
                        bill1 = bill1 + 1500;
                        oc1++;
                        break;
                    case 2:
                        theme = "blackandwhite";
                        bill1 = bill1 + 1000;
                        oc1++;
                        break;
                    case 3:
                        theme = "color ";
                        bill1 = bill1 + 1500;
                        oc1++;
                        break;
                    case 4:
                        theme = "superhero";
                        bill1 = bill1 + 2000;
                        oc1++;
                        break;
                    case 5:
                        theme = "fairy ";
                        bill1 = bill1 + 2000;
                        oc1++;
                        break;
                    case 6:
                        theme = "butterfly";
                        bill1 = bill1 + 2000;
                        oc1++;
                        break;
                    case 7:
                        theme = "mickey ";
                        bill1 = bill1 + 1500;
                        oc1++;
                        break;
                    case 8:
                        theme = "unicorn ";
                        bill1 = bill1 + 2500;
                        oc1++;
                        break;
                    case 9:
                        theme = "candy";
                        bill1 = bill1 + 1000;
                        oc1++;
                        break;
                    case 10:
                        theme = "bunny";
                        bill1 = bill1 + 1500;
                        oc1++;
                        break;

                }
            }
        }
        Bdaycost = Bdaycost + bill1;

    }

    void Entry() {
        System.out.println(blink+bgyellow + " Here are the options for entry " + reset);
        System.out.println(purple + "1.Entrycart        :  2500 ");
        System.out.println("2.FogEntry         :  3000 ");
        System.out.println("3.baloon blast     :  1500 ");
        System.out.println("4.crackers         :  2000 ");
        int oc2 = 1;
        while (oc2 < 2) {
            System.out.println(green+"Enter the entry you want for arrival");
            int e = sc.nextInt();
            if (e < 1 || e > 4) {
                System.out.println(red + "Invalid Input .Please Enter Correct Value" + reset);
            } else {

                switch (e) {
                    case 1:
                        Entry = "Entrycart";
                        bill2 = bill2 + 2500;
                        oc2++;
                        break;
                    case 2:
                        Entry = "FogEntry ";
                        bill2 = bill2 + 3000;
                        oc2++;
                        break;
                    case 3:
                        Entry = "baloon blast";
                        bill2 = bill2 + 1500;
                        oc2++;
                        break;
                    case 4:
                        Entry = "crackers";
                        bill2 = bill2 + 2000;
                        oc2++;
                        break;

                }
            }

        }
        Bdaycost = Bdaycost + bill2;
    }

    void Showdetails() {
        System.out.println(teal);
        System.out.println("Details of Birthday Event :");
        System.out.println("Cake Order :" + cakeorder);
        System.out.println("Amount for cake :" + bill);
        System.out.println("Birthday Theme :" + theme);
        System.out.println("Amount for theme :" + bill1);
        System.out.println("Birthday Entry :" + Entry);
        System.out.println("Amount for Entry :" + bill2);
        System.out.println("Total Amount :" + Bdaycost);
	        System.out.println(reset);
    }

}

class Movie implements color {
    static Scanner sc = new Scanner(System.in);
    int totalcost = 0;
    int AnchorCost = 0;
    int PosterCost = 0;
    int SeatCost = 0;
    int poster = 0;
    String anchor = "";
    int seat = 0;
    int s = 1;

    void Posters() {
        System.out.println(yellow + "For each poster it costs 1000/-");
        System.out.println(green+"Enter the no of posters do you want:");
        int count = sc.nextInt();
        if (count > 0) {
            PosterCost = count * 1000;
            poster = count;
        }
    }

    double Anchor() {
        System.out.println(purple);
        System.out.println("Select your favorite Anchor");
        System.out.println("1.Suma cost for Anchoring is: Rs.250000/-");
        System.out.println("2.Ravi cost for Anchoring is: Rs.210000/-");
        System.out.println("3.Sreemukhi  cost for Anchoring is: Rs.230000/-");
        System.out.println("4.Pradeep cost for Anchoring is: Rs.210000/-" + reset);
        int s = sc.nextInt();
        switch (s) {
            case 1: {
                AnchorCost = 250000;
                anchor = "Suma";
                break;
            }
            case 2: {
                AnchorCost = 210000;
                anchor = "Ravi";
                break;
            }
            case 3: {
                AnchorCost = 230000;
                anchor = "Sreemukhi";
                break;
            }
            case 4: {
                AnchorCost = 210000;
                anchor = "Pradeep";
                break;
            }
            default: {
                System.out.println(red + "Invalid option! Please choose the valid option (1-4)." + reset);
                return Anchor();
            }
        }
        return AnchorCost;
    }

    static final int SeatsAvailable = 500;

    void Seats() {
        System.out.println(yellow+"For each seat it costs 50/-");
        System.out.println(green+"Enter the number of seats do you want (Maximum " + SeatsAvailable + "):");
        int noofseats = sc.nextInt();
        if (noofseats > 0 && noofseats <= SeatsAvailable) {
            SeatCost = noofseats * 50;
            seat = noofseats;
        } else {
            System.out.println(
                    "Invalid Selection! Please choose a number of seats between 1 and " + SeatsAvailable + ".");
            Seats();
        }
    }

    void display() {
               System.out.println(blink+bgpurple+"Movie Event contains:"+reset);
        System.out.println(gold+"1.Posters");
        System.out.println("2.Anchors");
        System.out.println("3.Seats Booking");
	System.out.println(reset);
        while (s < 4) {
            System.out.print(green+"Enter your choice (1-3), or enter any other number to exit: " + reset);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Posters();
                    s++;
                    break;
                case 2:
                    Anchor();
                    s++;
                    break;
                case 3:
                    Seats();
                    s++;
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    void displayTotalCost() {
        totalcost = PosterCost + AnchorCost + SeatCost;
    }

    void Showdetails() {
        System.out.println(teal);
        System.out.println("\nDetails of Movie Event : ");
        System.out.println("Posters :  " + poster);
        System.out.println("Amount for Posters : " + PosterCost);
        System.out.println("Anchor  :  " + anchor);
        System.out.println("Amount for Anchor  : " + AnchorCost);
        System.out.println("Seats   :  " + seat);
        System.out.println("Amount for Seats   : " + SeatCost);
        System.out.println("Total Amount : " + totalcost + reset);

    }

}
class GetTogether implements color
{
static Scanner sc = new Scanner(System.in);
   	int themeChoice = 0;      
    	int numGifts = 0;         
    	int numMemoryClips = 0;   
    	int numVideos = 0;  
	int themeCost=0; 
	String Theme="";     
       
    	final int giftCost = 500;         
    	final int memoryClipCost = 50;   
    	final int videoCost = 100;        
    	double chooseTheme() 
	{
        	System.out.println(blink+bgpurple+"Choose a Theme for the GetTogether:"+reset);
        	System.out.println(orange+"1. Carnival Theme   - 5000/-");
        	System.out.println("2. Hollywood Glam   - 8000/-");
        	System.out.println("3. Masquerade Party - 7000/-");
        	System.out.println("4. Ethnic Fusion    - 8500/-");
        	System.out.println("5. Seasonal Theme   - 6000/-"+reset);
        	System.out.print(green+"Enter your choice (1-5): ");
		int x=0;
		while(x<1)
		{

        	themeChoice = sc.nextInt();
        	if (themeChoice == 0) 
		{
            		System.out.println(yellow+"Theme: No theme selected.");
       		} 
		else if(themeChoice<0||themeChoice>5)
		{
			System.out.println(red+"Invalid Input!Please Enter  a value between 1-5");
		}
		else 
		{
            		switch (themeChoice) 
			{
                		case 1:
					Theme="Carnival Theme";
					themeCost=5000;
					x++;
					break;
                		case 2:
					Theme="Hollywood Glam";
					themeCost=8000;
					x++;
					break;
                		case 3:
					Theme="Masquerade Ball";
					themeCost=7000;
					x++;
					break;
                		case 4:
					Theme="Ethnic Fusion";
					themeCost=8500;
					x++;
					break;
                		case 5:
					Theme="Seasonal Theme";
					themeCost=6000;
					x++;
					break;
            		}
        	}
	}
		return themeCost;

    	}

        void addGifts() 
	{
		int x=0;
        	System.out.print(green+"How many gifts would you like to add? (each gift costs 500/-)");
		while(x<1)
		{
        	int count = sc.nextInt();
        	if (count <= 0) 
		{
            		System.out.println(red+"Invalid input! Number of gifts must be greater than zero.");
        	} 
		else 
		{
            		numGifts += count;
            		System.out.println(slate_blue+"Successfully added " + count + " gifts.");
			x++;
        	}
		}
    	}

        void addMemoryClips() 
	{
		int x=0;
        	System.out.print(green+"How many memory clips would you like to add? (each memory clip cost 50/-) ");
		while(x<1)
		{
        	int count = sc.nextInt();
        	if (count <= 0) 
		{
            		System.out.println(red+"Invalid input! Number of memory clips must be greater than zero.");
        	} 
		else 
		{
            		numMemoryClips += count;
            		System.out.println(slate_blue+"Successfully added " + count + " memory clips.");
			x++;
		}
        	}
    	}

    	void addVideos() 
	{
		int x=0;
        	System.out.print(green+"How many videos would you like to add? (each video cost 100/-) ");
		while(x<1)
		{
        	int count = sc.nextInt();
        	if (count <= 0) 
		{
            		System.out.println(red+"Invalid input! Number of videos must be greater than zero.");
        	} 
		else 
		{
            		numVideos += count;
            		System.out.println(slate_blue+"Successfully added " + count + " videos.");
			x++;
        	}
		}
    	}

        void showPartyDetails() 
	{
        	System.out.println(teal+"\n--- Party Details ---");
        	System.out.println("Number of Gifts: " + numGifts);
        	System.out.println("Number of Memory Clips: " + numMemoryClips);
        	System.out.println("Number of Videos: " + numVideos);
        	System.out.println("---------------------\n"+reset);
    	}
	void showBill() 
	{
        	int totalCost = 0;

        	if (themeChoice > 0) 
		{
            		totalCost += themeCost;
        	}

        	totalCost += numGifts * giftCost;
        	totalCost += numMemoryClips * memoryClipCost;
        	totalCost += numVideos * videoCost;

        	System.out.println(def+"\n----------"+magenta+" Party Bill"+def+" ----------");
        	System.out.println(yellow+"Theme: " + (themeChoice > 0 ? " Selected"+"    "+ " Rs. " + themeCost  : "Not selected"));
        	System.out.println("Gifts: " + numGifts +"            "+ " Rs. " + (numGifts * giftCost));
        	System.out.println("Memory Clips: " + numMemoryClips + "     "+" Rs. " + (numMemoryClips * memoryClipCost));
        	System.out.println("Videos:" + numVideos +"            " + " Rs. " + (numVideos * videoCost));
        	System.out.println(def+"---------------------------------");
        	System.out.println(yellow+"Total Cost:          Rs. " + totalCost);
        	System.out.println(def+"---------------------------------");
    	}




}


class Wedding implements color
{
	static Scanner sc=new Scanner(System.in);
    		 int Bill=0;
    		String events="";
	void displayevents()
	{
		System.out.println("1. Engagemnet    -50,000");
        	System.out.println("2. Haldi         -20,000");
        	System.out.println("3. Sangeeth      -35000");
        	System.out.println("4. Mehandi       -10,000");
        	System.out.println("----------------------------------");
        		}
    	void Engagement()
    	{
        	System.out.println("    -->ENGAGEMENT<--    ");
		events=events+"Engagement\n";
		Bill=Bill+50000;
       		
        }
    	void haldi()
    	{
        	System.out.println("    -->HALDI<--    ");
		events=events+"Haldi\n";
        	Bill=Bill+20000;
    	}
    	void sangeeth()
    	{
        	System.out.println("    -->SANGEETH<--    ");
        	events=events+"Sangeeth\n";
		Bill=Bill+35000;
    	}
    	void mehandi()
    	{
        	System.out.println("    -->MEHANDI<--    ");
		events=events+"Mehandhi\n";
		Bill=Bill+10000;
        	        	
	
         }
    	void displaybill()
		{
        	System.out.println("---------------------------------");
		System.out.println("Events Selected :");
		System.out.println(events);
                System.out.println("   - : Amount : - ");
        	System.out.println("Total amount    = "+Bill);
		}
}


interface Food extends color{
    static Scanner sc = new Scanner(System.in);

    public static final String[] menuItems = {
            // Vegetarian items
            "Veg Biryani", "Pulao", "Paneer", "Mushroom", "Butter Naan", "Veg Pakora", "Aloo Gobi",
            // Non-Vegetarian items
            "Mixed Biryani", "Chicken", "Mutton", "Fish Curry", "Butter Chicken", "Chicken Pakora",
            "Tandoori Chicken", "Prawn Curry",
            // Desserts
            "Gulab Jamun", "Ice-cream", "Chocolate Cake", "Kaala Jamun", "Rasgulla",
            // Drinks
            "Lemonade", "Soft Drink", "Water", "Iced Tea",
            // Snacks
            "Samosa", "Spring Roll", "Nachos", "Cheese Balls",
            // Roti
            "Plain Roti", "Butter Roti", "Tandoori Roti"
    };

    public static final int[] menuPrices = {
            // Vegetarian prices
            150, 100, 50, 50, 20, 30, 70,
            // Non-Vegetarian prices
            250, 50, 50, 100, 200, 70,
            150, 200,
            // Dessert prices
            50, 20, 80, 40, 50,
            // Drink prices
            30, 20, 10, 40,
            // Snack prices
            15, 25, 50, 35,
            // Roti prices
            15, 20, 25
    };

    default void displayMenu() {
        System.out.println();
        System.out.println(blink+bgpurple+"*************** HERE IS THE MENU ****************"+reset);

        // Displaying Vegetarian Menu
        System.out.println(blink+gold+"******************** Veg ********************"+reset);
        for (int i = 0; i < 7; i++) { // 7 vegetarian items
            System.out.printf("%d) %s----------------rs%d.00%n", i + 1, menuItems[i], menuPrices[i]);
        }

        // Displaying Non-Vegetarian Menu
        System.out.println(blink+gold+"******************* Non-Veg *******************"+reset);
        for (int i = 7; i < 15; i++) { // 7 non-vegetarian items
            System.out.printf("%d) %s----------------rs%d.00%n", i + 1, menuItems[i], menuPrices[i]);
        }

        // Displaying Desserts Menu
        System.out.println(blink+gold+"********************* Desserts ****************"+reset);
        for (int i = 15; i < 20; i++) { // 5 dessert items
            System.out.printf("%d) %s----------------rs%d.00%n", i + 1, menuItems[i], menuPrices[i]);
        }

        // Displaying Drinks Menu
        System.out.println(blink+gold+"********************* Drinks ****************"+reset);
        for (int i = 20; i < 24; i++) { // 4 drink items
            System.out.printf("%d) %s----------------rs%d.00%n", i + 1, menuItems[i], menuPrices[i]);
        }

        // Displaying Snacks Menu
        System.out.println(blink+gold+"********************* Snacks ****************"+reset);
        for (int i = 24; i < 28; i++) { // 4 snack items
            System.out.printf("%d) %s----------------rs%d.00%n", i + 1, menuItems[i], menuPrices[i]);
        }

        // Displaying Rotis Menu
        System.out.println(blink+gold+"******************** Roti Menu ********************"+reset);
        for (int i = 28; i < 30; i++) { // 3 roti items
            System.out.printf("%d) %s----------------rs%d.00%n", i + 1, menuItems[i], menuPrices[i]);
        }
    }
}

interface Decoration extends color{
    // static Scanner sc=new Scanner(System.in);
    default void displayDecorations() {

        System.out.println(blink+bgpurple+"Decoration Services Available:"+reset);
        System.out.println(orange+"1. Flowers  - Rs:50000/-");
        System.out.println("2. Balloons - Rs:30000/-");
        System.out.println("3. Lighting - Rs:70000/-");
        System.out.println("4. Ribbons  - Rs:40000/-");
        System.out.println("5. Lanterns - Rs:25000/-");
        System.out.println("6. Candles  - Rs:20000/-"+reset);

    }
}

interface Invitations extends color {
    default void displayInvitations() {
        System.out.println(blink+bgpurple+"Invitation Services Available:"+reset);
        System.out.println(yellow+"1. Digital Invitations - $20.0\n2. Printed Invitations - $50.0"+reset);
    }
}

interface Games extends color {
    default void displayGames() {
        System.out.println(blink+bgpurple+"Game Services Available:"+reset);
        System.out.println(slate_blue+"1.Damshal Arts   -  Rs:10/-");
        System.out.println("2.Balloon Games  -  Rs:15/-");
        System.out.println("3.Musical Chairs -  Rs:20/-");
        System.out.println("4.Pictionary     -  Rs:25/-"+reset);

    }
}

class Test implements Food, Decoration, Invitations, Games, color {
    
    static Scanner sc = new Scanner(System.in);
    static double ran = 10000 * Math.random();
    static int OTP = (int) ran;

    static void M1(String ck) {

        for (int i = 0;; i++) {

            char ch = (char) ck.charAt(0);
            if (ch <= '9' && ch >= '6') {
                if (ck.length() == 10) {
                    System.out.println("your otp is sent your mobile: " + OTP);
                    break;
                } else {
                    System.out.println(red + "mobile number must be 10 digts ");
                    System.out.print("enter validity mobile number: " + reset);
                    M1(sc.next());
                    break;
                }
            } else {
                System.out.println(red + "mobile number must be start with bt 6 to 9");
                System.out.print("enter validity mobile number: " + reset);
                M1(sc.next());
                break;
            }
        }
    }

    static boolean M2(int a, int b) {

        for (int i = 0;; i++) {
            if (a == b) {
                return true;
            } else {
                System.out.print(red + "please enter validty otp: " + reset);
                M2(OTP, sc.nextInt());
                return true;
            }
        }
    }

    public static void main(String[] args) {
	System.out.println(teal+"************************************************");
	System.out.println("*					       *");
	System.out.println("*"+gold+"          WELCOME TO CV PLANNERS	 "+reset+teal+"      *");
	System.out.println("*		                               *");
	System.out.println(teal+"************************************************"+reset);
		Date t=new Date();																		
        System.out.print(cyan + "enter your name: " + reset);
        String name = sc.next();
        System.out.print(purple + "enter your mobile number: " + reset);
        String mobile = sc.next();

        String M_num = mobile;
        M1(M_num);
        System.out.print(purple + "enter validity otp: " + reset);
        if (M2(OTP, sc.nextInt()) == true) {
            System.out.println(green + "mobile number is succesfully verified_!" + reset);
            System.out.println(t);

		
            System.out.print(purple + "Enter Location: " + reset);
            String location = sc.next();

	               int FinalServiceBill = 0;
            Test obj = new Test();
            System.out.println(teal + "Events Available:");
            System.out.println("1. Birthday\n2. Movie Events\n3. GetTogether\n4. Wedding");
            System.out.print(green + "Enter Event Number you want to book: " + reset);
            int eventChoice = sc.nextInt();

            if (eventChoice == 1) {
                Birthday e1 = new Birthday();
                e1.cake();
                e1.Theme();
                e1.Entry();
                e1.Showdetails();

            }
            if (eventChoice == 2) {
                Movie e2 = new Movie();
                e2.display();
                e2.displayTotalCost();
                e2.Showdetails();

            }
	    if(eventChoice==3)
		{
		GetTogether party = new GetTogether();
        	party.chooseTheme();
		party.addGifts();
		party.addMemoryClips();
		party.addVideos();
		party.showBill();
    	    }	
	   if(eventChoice==4)
	    {
		Marriage e4 =new Marriage();
		e4.displayevents();
        	int x=0;
		while(x<4)
		{
			System.out.println(gold+"Enter Event you want to select .Select 0 to stop"+reset);
			int n=sc.nextInt();
			if(n==0)
			{
			break;
			}
			else
			{
						
				if(n==1)
				{
					x++;
					e4.Engagement();
				}	
		
				if(n==2)
				{
					x++;
					e4.haldi();
				}	
		
				if(n==3)
				{
					x++;
					e4.sangeeth();
				}	
		
				if(n==4)
				{
					x++;
					e4.mehandi();
				}	
		
			}
		}	
	e4.displaybill();


		}	

            System.out.println(teal + "\nHere are few services we provide:");
            System.out.println("1. Food\n2. Decorations\n3. Invitations\n4. Games\n(Enter 0 to end)" + reset);
            int serviceCount = 0;
            while (serviceCount < 4) {
                System.out.print(green + "Enter Which Service you Want (or enter 0 to end): " + reset);
                int serviceChoice = sc.nextInt();
                serviceCount++;
                if (serviceChoice == 0)
                    break;

                if (serviceChoice == 1) {
                    int bill = 0;
                    int selections = 1;
                    obj.displayMenu();

                    String order = "";
                    int maxItems = menuItems.length;

                    System.out.println(green+"Enter what you want to order! Enter 0 to stop ordering");

                    while (selections < 31) {
                        int a = sc.nextInt();
                        if (a == 0) {
                            break;
                        }
                        if (a < 1 || a > maxItems - 1) {
                            System.out.println(
                                    "Invalid Input! Please enter a correct value between 1 and " + (maxItems - 1));
                            continue;
                        }
                        if (order.contains(menuItems[a - 1])) {
                            System.out.println("Item already added");
                            continue;
                        }

                        order += menuItems[a - 1] + "\n"; // Concatenate the item to the order
                        bill += menuPrices[a - 1];
                        selections++;
                        System.out.println(
                               gold+"Would you like to order something else? If yes, please continue. If you want to stop ordering, press 0."+reset);
                    }

                    System.out.println("Enter number of plates you want to order");
                    int b = sc.nextInt();
                    if (b == 0) {
                        System.out.println(
                                "you have entered zero plates .would you like to cancel food ordered 1.yes 2.no");
                        int c = sc.nextInt();
                        if (c == 1) {
                            System.out.println("order has been cancelled");
                        } else if (c == 2) {
                            System.out.println("enter no of plates you wish to order");
                            int d = sc.nextInt();
                            System.out.println("Your order includes: \n" + order);
                            System.out.println("Total Number of plates Served will be " + d);
                            System.out.println("Total amount for food is " + (bill * d));

                        }
                    } else {
                        System.out.println("Your order includes: \n" + order);
                        System.out.println("Total Number of plates Served will be " + b);
                        System.out.println("Total amount for food is " + (bill * b));
                        FinalServiceBill = FinalServiceBill + (bill * b);
                    }
                }

                if (serviceChoice == 2) {
                    obj.displayDecorations();
                    int totalCost = 0;
                    String decorationDetails = "";
                    int selections = 1;
                    boolean arr[] = { false, false, false, false, false, false, false };
                    System.out.println(green+"Enter your decoration preference: ");
                    while (selections < 7) {
                        int n = sc.nextInt();
                        if (n == 0) {
                            break;
                        }
                        if (n < 1 || n > 6) {
                            System.out.println("Invalid Input! Please enter a correct value between 1 and 6");
                            continue;
                        }
                        switch (n) {
                            case 1:
                                if (arr[n] == false) {
                                    totalCost += 50000;
                                    decorationDetails += "Flowers, ";
                                    selections++;
                                } else {
                                    System.out.println("Decoration Already Selected");
                                }
                                arr[n] = true;
                                System.out.println(
                                        "Would you like to add more decorations .If yes please Enter the number. Enter 0 to stop!");
                                break;
                            case 2:
                                if (arr[n] == false) {
                                    totalCost += 30000;
                                    decorationDetails += "Balloons, ";
                                    selections++;

                                } else {
                                    System.out.println("Decoration Already Selected");
                                }
                                arr[n] = true;
                                System.out.println(
                                        "Would you like to add more decorations .If yes please Enter the number. Enter 0 to stop!");
                                break;
                            case 3:
                                if (arr[n] == false) {
                                    totalCost += 70000;
                                    decorationDetails += "Lighting, ";
                                    selections++;

                                } else {
                                    System.out.println("Decoration Already Selected");
                                }
                                arr[n] = true;
                                System.out.println(
                                        "Would you like to add more decorations .If yes please Enter the number. Enter 0 to stop!");
                                break;
                            case 4:
                                if (arr[n] == false) {
                                    totalCost += 40000;
                                    decorationDetails += "Ribbons, ";
                                    selections++;

                                } else {
                                    System.out.println("Decoration Already Selected");
                                }
                                arr[n] = true;
                                System.out.println(
                                        "Would you like to add more decorations .If yes please Enter the number. Enter 0 to stop!");
                                break;
                            case 5:
                                if (arr[n] == false) {
                                    totalCost += 25000;
                                    decorationDetails += "Lanterns, ";
                                    selections++;

                                } else {
                                    System.out.println("Decoration Already Selected");
                                }
                                arr[n] = true;
                                System.out.println(
                                        "Would you like to add more decorations .If yes please Enter the number. Enter 0 to stop!");
                                break;
                            case 6:
                                if (arr[n] == false) {
                                    totalCost += 20000;
                                    decorationDetails += "Candles, ";
                                    selections++;

                                } else {
                                    System.out.println("Decoration Already Selected");
                                }
                                arr[n] = true;
                                System.out.println(
                                        "Would you like to add more decorations .If yes please Enter the number. Enter 0 to stop!");
                                break;
                            default:
                                System.out.println("Invalid decoration choice");
                                break;
                        }
                    }
                    String[] strArray = decorationDetails.split(",");
                    System.out.println("Decorations Selected : ");
                    for (String choice : strArray) {
                        System.out.println(choice);
                    }
                    System.out.println("Total Decorations Bill: " + totalCost);
                    FinalServiceBill = FinalServiceBill + totalCost;

                }

                if (serviceChoice == 3) {
                    obj.displayInvitations();
                    int totalCost = 0;
                    String invitationDetails = "";

                    int selections = 1;
                    System.out.println(green+"Please choose an invitation type "+reset);
                    while (selections < 3) {

                        int a = sc.nextInt();
                        if (a == 0) {
                            break;
                        }
                        if (a < 1 || a > 2) {
                            System.out.println(red+"Invalid Input! Please enter a correct value among 1 and 2"+reset);
                            continue;
                        }

                        switch (a) {
                            case 1: {

                                System.out.println("How many Invitations would you like to send?");
                                int b = sc.nextInt();
                                totalCost += (b * 20.0);
                                invitationDetails += "Digital Invitations  - " + b + " Invitations\n";
                                if (selections == 1) {
                                    System.out.println(
                                            teal+"Would you like to add printed Invitations also .If yes please Enter the 2. Enter 0 to stop!"+reset);
                                }
                                selections++;
                                break;

                            }
                            case 2: {

                                System.out.println("How many Invitations would you like to send?");
                                int b = sc.nextInt();
                                totalCost += (b * 50.0);
                                invitationDetails += "Printed Invitations  - " + b + " Invitations\n";
                                if (selections == 1) {
                                    System.out.println(
                                            teal+"Would you like to add Digital Invitations also .If yes please Enter the 1. Enter 0 to stop!"+reset);
                                }
                                selections++;
                                break;
                            }
                        }
                    }
                    System.out.println(slate_blue+"Total bill for invitations: " + totalCost+reset);
                    FinalServiceBill = FinalServiceBill + totalCost;
                    System.out.println(teal+"Invitations will be sent are \n " + invitationDetails+reset);

                }
                if (serviceChoice == 4) {
                    obj.displayGames();
                    double totalCost = 0;
                    String gameDetails = "";
                    String selectedGames = ""; // To store selected game numbers as a string

                    System.out.println(gold+"Choose the game you want to conduct"+reset);
                    int selections = 1;

                    while (selections < 5) {
                        int a = sc.nextInt();

                        if (a == 0) {
                            break;
                        }

                        if (a < 1 || a > 4) {
                            System.out.println("Invalid Input! Please enter a correct value between 1 and 4");
                            continue;
                        }

                        // Check if the game is already selected by searching in the string
                        if (selectedGames.contains(String.valueOf(a))) {
                            System.out.println(red+"This game is already selected. Please choose a different game."+reset);
                            continue;
                        } else {
                            selectedGames += a; // Append the selected game number to the string
                        }

                        System.out.println(magenta+"How many rounds would you like to conduct?"+reset);
                        int b = sc.nextInt();

                        switch (a) {
                            case 1:
                                totalCost += (b * 10.0);
                                gameDetails += "Damshal Arts   - " + b + " rounds\n";
                                break;
                            case 2:
                                totalCost += (b * 15.0);
                                gameDetails += "Balloon Games  - " + b + " rounds\n";
                                break;
                            case 3:
                                totalCost += (b * 20.0);
                                gameDetails += "Musical Chairs - " + b + " rounds\n";
                                break;
                            case 4:
                                totalCost += (b * 25.0);
                                gameDetails += "Pictionary     - " + b + " rounds\n";
                                break;
                        }

                        System.out.println(
                               gold+ "Would you like to add more games? If yes, please enter the number. Enter 0 to stop!"+reset);
                        selections++;
                    }

                    System.out.println(teal+"Games order confirmed. Total Games Bill: $" + totalCost);
                    System.out.println(teal+"Games conducted will be:\n" + gameDetails);

                }

            }
        }
	System.out.println(def+" ");
		    }
}