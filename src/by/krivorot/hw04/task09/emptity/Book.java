package by.krivorot.hw04.task09.emptity;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int yearOfPublishing;
	private int pages;
	private int price;
	private String binding;

	public Book(int id, String title, String author, String publishingHouse, int yearOfPublishing, int pages, int price,
			String binding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((binding == null) ? 0 : binding.hashCode());
		result = prime * result + id;
		result = prime * result + pages;
		result = prime * result + price;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfPublishing;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (binding == null) {
			if (other.binding != null)
				return false;
		} else if (!binding.equals(other.binding))
			return false;
		if (id != other.id)
			return false;
		if (pages != other.pages)
			return false;
		if (price != other.price)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishingHouse=" + publishingHouse
				+ ", yearOfPublishing=" + yearOfPublishing + ", pages=" + pages + ", price=" + price + ", binding="
				+ binding + "]";
	}

}
