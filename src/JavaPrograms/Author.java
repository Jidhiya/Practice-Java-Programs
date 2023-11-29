package JavaPrograms;

public class Author {
	
	String first_name ;
	String last_name ;
	
	Author(String firstname, String lastname)
	{
		this.first_name = firstname;
		this.last_name = lastname;
	}
	

	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	//public static void main(String[] args) {
		public String toString() {
			return first_name + " " + last_name;

	}
	}

