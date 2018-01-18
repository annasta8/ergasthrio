public class Singer{
	static Singer sin[]=new Singer[10];



	private String name;

	private int id;


static int countSingers=0;

public Singer(String name1){
	name=name1;
sin[countSingers]=this;
id=++countSingers;

	}


public String getName(){
	return name;
	}

public void setName(String name1){
	name=name1;
	}

public int getId(){
	return id;
	}

	public void setId(int id1){
		id=id1;

	}



public String toString(){
	return "Singer[singer="  +name+  ", id="  +id+  "  ]";
	}


}