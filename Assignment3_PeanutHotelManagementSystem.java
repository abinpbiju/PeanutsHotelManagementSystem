//Assignment 3 Title: Prototype Stub on Peanut's Hotel Management System

//Submitted by TEAM of

//ROJY JOHNY 0953292
//TISSA THOMAS 0953400
//ABIN PUNNILETHU BIJU 0963741
//LITTY RAJAN 0959135

//Date Submitted: 23rd April 2021

//4th Semester Business and Information System Architecture Program - B Section

//Class Day and Time: Every Thursdays 5:00 PM to 8:00 PM Class

public class PeanutHotelReservationManagementSystem
{
    // This method is the ENTRY POINT of PeanutHotelReservationManagementSystem java program
    // Any Business Logics will be implemented in the Further class away from this main method
    public static void main(String[] args){

        //This is the point where all the classes are being called to Make the Peanut Hotel Management System Work

        }

        //Initializing and Instance for the Method MakeBookingReservation and Callable varibale from the Instance
        MakeBookingReservation bk = new MakeBookingReservation();
        bk.MakeBookingReservation();

        //Initializing and Instance for the Method OrderMeals and Callable varibale from the Instance
        OrderMeals meals = new OrderMeals();
        meals.OrderMeals();

        //Initializing and Instance for the Method ProcessOrder and Callable varibale from the Instance
        ProcessOrder po = new ProcessOrder();
        po.ProcessOrder();

        //Initializing and Instance for the Method MakePayment and Callable varibale from the Instance
        MakePayment payment = new MakePayment();
        payment.MakePayment();




        }
}

public class BookReservation
{
    //Initliazing Variables Required for the Information of Peanut's Hotels Reservation System
    private int booking_id;
    private long checkInDateTime;
    private long checkOutDateTime;
    private String bookingType;
    private int person;

    // Creating a Method to Fetch all the Data from the User with a Template on IT
    public ReservationDetails()
    {
        customer = new UserInfo();
        rooms = new ArrayList<>();
        booking_id = -1;
        bookingType = "Reserved";
        
    }

    //Referenced code from Lecture to Intialize a GUI Windows for Booking Reservation using User Interactions
    //This is written to Initialize a GUI for the Reservation Process to be made 
    public Reservation BookReservation()
    {
		BookingAgentGUI gui = new BookingAgentGUI();
        gui.StartReservationApplication();
    }
    //Method to get the Booking ID of Referenced User
    public int getBooking_id() 
    {
        return booking_id;
    }
    //Method to Set that Booking ID to the Referenced User
    public void setBooking_id(int booking_id) 
    {
        this.booking_id = booking_id;
    }
    // Method to get the Booking Type of the Referenced User
    public String getBookingType() 
    {
        return bookingType;
    }


}

//Defining a Class for Ordering Meals through Peanut's Hotel
public class OrderMeals {
    
    int orderId;
    int bookingId;
    String foodItem;
    int price;
    int quantity;
    int total;

    // Defining a Method to Process the Ordering of Meals
    public OrderMeals(int b,String f,int p,int q, int t)
    {
        bookingId = b;
        foodItem = f;
        price = p;
        quantity = q;
        total = t;
    }
    
    // Getting the Meals Order's Order ID for Further Processing
    public int getOrderId() {
        return orderId;
    }

    //Setting the OrderID to the Purchase Transaction
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    //Getting the Reservation Booking ID to Link the Purchase of Meals towards the Booking ID of the Client
    public int getBookingId() {
        return bookingId;
    }

    //Setting the Booking ID to Bind the Purchase of Meals into the Booking ID of the Client
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    //Writing an Object to Define the Details/Schema of the Payment Transaction to be Made from the Client
    public class Payment {
    
        private Booking booking;
        int totalRentPrice;
        int daysStayed;
        private String payment_date;
        private String payment_method;
        private boolean hasDiscount;
        private float discount;
        int totalBill;
        
        //Defining a Method to Make the Payment linked to the Booking ID of the Client
        public Payment(Booking b)
        {
            booking = b;
            //totalRentPrice = b.getRoomsFare() * 1;
            
        }

        //Defining a Re-Usable Method to GET the Booking ID of the Client
        public Booking getBooking() {
            return booking;
        }

        //Defining a Re-Usable Method to SET the Booking ID of the Client towards the Payment Transaction to be made
        public void setBooking(Booking booking) {
            this.booking = booking;
        }
        
        //Defining a Method to Get the Due Date of the Payment to be made
        public String getPayment_date() {
            return payment_date;
        }
    

          //Defining a NEW Method to Calculate the TOTAL Bill towards the Client, By Totaling the Meals Order + The Total Rent for the STAY that Client has made
          //Inside Peanut's Hotel
    public int calculateTotalBill()
    {
        int orderTotal = 0;
        
        for(ExtraOrders order: orders)
        {
            orderTotal += order.getQuantity() * order.getItem().getPrice();
        }
        totalBill = orderTotal+ totalRentPrice;
        
        return totalBill;
    }

    //Defining a Class for Storing the Reservation Data into the SQL Database of Peanut's Hotel
private class PeanutHotelsReservationDataStore
{
    //Initializing a Database Instance Object with Connection String to the SQL
    public class BookingDb {

        Connection conn;
        PreparedStatement statement = null;
        ResultSet result = null;
    
        //Making the Database Connection through ProtoType
        public BookingDb() {
            conn = DataBaseConnection.connectTODB();
        }
    
        //Implemetation of Small Code Method to Insert the Booking Data into the Peanut Hotel's SQL Database 
        public void insertBooking(Booking booking) {
            for (int i = 0; i < booking.getRooms().size(); i++) {
                try {
                    String insertQuery = "insert into booking"
                            + "('customer_id','booking_room','guests','check_in','check_out','booking_type','has_checked_out')"
                            + " values("
                            + booking.getCustomer().getCustomer_id()
                }
                //Written some Varibale/Table Tuples to conceptualize What all details have to be stored inside the DB
}



