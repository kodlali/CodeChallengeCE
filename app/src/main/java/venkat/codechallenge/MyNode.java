package venkat.codechallenge;

public class MyNode {
	private String previous;
	private String next;
	private String data;

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String toString() {
		return previous + " : " + data + " : " + next;
	}
}
