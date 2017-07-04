// WARNING: This file is auto-generated and any changes to it will be overwritten

/**
 * 
 */
public class Person
{
    private int alter;
    private String name;
    private String beruf;
  

    /**
     * 
     */
    public Person(String name, String beruf, int alter)
    {
        this.name = name;
        this.beruf = beruf;
        this.alter = alter;
    }

    /**
     * 
     */
    public int gibAlter()
    {
        return alter;
    }

    /**
     * 
     */
    public void habeGeburtstag()
    {
        alter = alter + 1;
    }
}
