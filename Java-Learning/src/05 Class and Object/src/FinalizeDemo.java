class Associate
{
    String name;

    Associate(String name)
    {
        this.name = name;
    }

    void showDetails()
    {
        System.out.println("Associate : " + name);
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println(name + " object is being garbage collected.");
    }
}

public class FinalizeDemo
{
    public static void main(String[] args)
    {
        Associate s1 = new Associate("Prashant");

        s1.showDetails();

        s1 = null;

        System.gc();

        System.out.println("End of main()");
    }
}