class Constructor
{
    private String name;
    private int id;
    private  int attendence;
    private String school;
    private String village;
    private String schooltype;
    private String principlename;
    private int noofstudents;

    public   Constructor()
    {
        this.school="netaji  high school";
        this.attendence=72;
        this.schooltype="private school";
        this.village="yerraguntla";
        this.noofstudents=500;
        this.principlename="S.M.Bhasha";
    }
    public Constructor(String school, int attendence )
    {
       this.school=school;
       this.attendence=attendence;
    }
    public Constructor(String schooltype,String village)
    {
        this.schooltype=schooltype;
        this.village=village;
    }
    public Constructor(int noofstudents,String principlename)
    {
        this.principlename=principlename;
        this.noofstudents=noofstudents;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
       return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void display()
    {
        System.out.println("schoolname:"+this.name);
        System.out.println("number of attendence:"+this.attendence);
        System.out.println("type of school is:"+this.schooltype);
        System.out.println("village:"+this.village);
        System.out.println("number of students:"+this.noofstudents);
        System.out.println("name of the principle:"+this.principlename);
    }
}
public class ParameterizedConstructor
{
    public static void main(String[] args)
    {
        Constructor con=new Constructor();
        con.setName("thiru");
        con.setId(3);
        System.out.println("name"+con.getName());
        System.out.println("id:"+con.getId());
        con.display();
    }

}
