package com.generation;

public class Course
{

    String name;

    String id;

    int credits;

    public Course( String name, String id, int credits )
    {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }
    
    @Override
    
    public String toString()
    {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }
    
    public String getCredit() {
    	return "Estos son los créditos totales " + credits;
    }

	public int displayCreditsInformation(Course cr) {
		// TODO Auto-generated method stub
		return credits;
	}
}