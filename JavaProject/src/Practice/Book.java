package Practice;

	public class Book {	

	//1.멤버변수 선언
		private String Name, Author;
		private int No, Price;
		
	//2.메서드 작성
		public Book(String Name,String Author,int No,int Price) {
			this.Name = Name;
			this.Author = Author;
			this.No = No;
			this.Price = Price;
		}

	//3.getter & setter 작성
		
		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getAuthor() {
			return Author;
		}

		public void setAuthor(String author) {
			Author = author;
		}

		public int getNo() {
			return No;
		}

		public void setNo(int no) {
			No = no;
		}

		public int getPrice() {
			return Price;
		}

		public void setPrice(int price) {
			Price = price;
		}

		//4.toString()사용
		@Override
		public String toString() {
			return  "제목: " + Name+
					"\n번호: " + No+
					"\n저자: " + Author+
					"\n가격: " + Price;
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	
}
