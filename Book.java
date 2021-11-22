public class Book
{
  //Fields/Instance Data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;
  
  //Constructor
  public Book(String t, String a, int y, int n, boolean h)
  {
    title = t;
    author = a;
    year = y;
    numPages = n;
    hardCover = h;
  }

//private - cannot access directly from outside the class (Encapsulation)
//public - can access from outside the class
//Accessor Methods
public String getTitle()
{
  return title;
}
public String getAuthor()
{
  return author;
}
public int getYear()
{
  return year;
}
public int getNumPages()
{
  return numPages;
}
public boolean getHardCover()
{
  return hardCover;
}

//Mutator Methods - setter Methods
public void setTitle(String s)
{
  title = s;
}
public void setAuthor(String a)
{
  author = a;
}
public void setYear(int a)
{
  year = a;
}
public void setNumPages(int a)
{
  numPages = a;
}
public void setHardCover(boolean a)
{
  hardCover = a;
}

//other Methods
public boolean equals(Book b)
{
  if(this.getTitle().equals(b.getTitle()))
{
  return true;
} else
{
  return false;
}
}

//what prints for our objects
public String toString()
{
  String str ="";
  str = "\nTitle: " + title + "\nAuthor: " + author + "\nYear: " + year;
  str = str + "\nNumber of Pages: " + numPages + "\nHardcover: " + hardCover;
  return str;
}
}