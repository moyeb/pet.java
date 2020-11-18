// Java Classes & Objects
// Assignment: pet.java

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;
  public Pet(String name, int age, String location, String type) {
    this.name = name;
    this.age = age;
    this.location = location;
    this.type = type;
  }
  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

  public String getType(){
    return type;
  }

  public String setType(String type){
    this.type = type;
  }

}

// Custom Class

public class Book {
  private String title;
  private String author;
  private String genre;

  public Book() {}

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public Book (String title, String author, String genre) {
    this.title = title;
    this.author = author;
    this.genre = genre;
  }

  public String getTitle() {
    return title;
  }

  public String setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public String setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public String setGenre(String genre) {
    this.genre = genre;
  }

  public static boolean isHorror(String genre){
    if (genre == "horror") {
      return true;
    } else {
      return false;
    }
  }

  public static String myFavAuthor(String author) {
    System.out.println("Your favorite author is " + author);
  }

}
