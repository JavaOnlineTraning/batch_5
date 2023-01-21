package java8_Programs;

public class Book {

	private int id;
	private String name;      //Declare variables
	private int page;
	
	public Book(int id, String name, int page) {    //Parameteries constructor
		super();
		this.id = id;
		this.name = name;
		this.page = page;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", page=" + page + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + page;
		return result;
	}

	/*
	 * hashcode and equal are there because if there is something similarity in the
	 * id and page just to differentiate
	 * 
	 * it wrt name thats why we are using this
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (page != other.page)
			return false;
		return true;
	}
}
