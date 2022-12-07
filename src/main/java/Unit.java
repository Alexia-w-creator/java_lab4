public class Unit {
    private int ID;
    private String title;
    private static int counter = 1;
    public Unit(int _ID, String _title)
    {
        ID = _ID;
        title = _title;
    }
    public Unit(String _title)
    {
        ID = 1+(counter++)%26;
        title = _title;
    }

    public void println()
    {
        System.out.println("Unit ID: " + ID + "\nUnit title: " + title);
    }
}
