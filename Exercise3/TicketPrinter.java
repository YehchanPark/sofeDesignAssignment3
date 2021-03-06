package Exercise3;

public class TicketPrinter extends Observer {
    public void displayText(String[] text){//Prints out text at a desired format
        String s = String.format("%-15s  %3s", "Product", "Price");
        String s1 = String.format("%-15s  %3s", "------", "-----");
        String line = String.format("%-15s %5s", text[0], text[1]);

        System.out.println("Ticketprinter view: \n"+s);
        System.out.println(s1);
        System.out.println(line);
    }

    @Override
    void update(String[] text) {//Updates the printer to print out the desired texts
        System.out.println("Ticket Printer Notified\n");
        displayText(text);
    }
}
