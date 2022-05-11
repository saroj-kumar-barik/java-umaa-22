package in.google.ipl;

public class Teams {
    public // access modifier
    static // keyword (without object this main method is accessible)
    void   // return type
    main //method name
            (String[] args)
    // body
    {
        String teamA = "CSK"; // data type of teamA is String
        // disply
        System.out.println(teamA.length()); // out datatype = PrintStream
        System.out.println(teamA);
        int r = m1(10,20);
        System.out.println(r);
    }


    public static int m1(int x, int y)
    {
        int result = x + y;
        return result;
    }
}
