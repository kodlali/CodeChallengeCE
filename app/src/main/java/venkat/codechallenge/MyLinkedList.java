package venkat.codechallenge;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class MyLinkedList {

	private ArrayList<MyNode> myNodeDatas;

	public MyLinkedList() {
		myNodeDatas = new ArrayList<MyNode>();
	}

	public void add(String value) {
		MyNode node = createNode(myNodeDatas.size(), value);
		if (node != null)
			myNodeDatas.add(node);
	}

	public void modify(int position, String value) {
		MyNode updated = createAndModify(position, value);
		if (updated != null) {
			MyNode node = getNextNode(position);
			if (node != null)
				node.setPrevious(updated.getNext());
		}
	}

	private void updateValues(MyNode node, int position) {
		if (node != null) {
			MyNode nodes = myNodeDatas.get(position);

		}
	}

	public String get(int position) {
		return myNodeDatas.get(position).getData();
	}

	public int size() {
		return myNodeDatas.size();
	}

	public void remove(int position) {
		myNodeDatas.remove(position);
		if (position != 0 && position != myNodeDatas.size()) {
			MyNode node = myNodeDatas.get(position);
			MyNode previsou = getPreviousNode(position);
			node.setPrevious(previsou.getNext());
		} else if (position == 0 && position != myNodeDatas.size()) {
			myNodeDatas.get(position).setPrevious("0");
		}
	}

	private MyNode getNextNode(int position) {
		return (position >= myNodeDatas.size() - 1) ? null : myNodeDatas
				.get(position + 1);
	}

	private MyNode getPreviousNode(int position) {
		return (position == 0) ? null : myNodeDatas.get(position - 1);
	}

	private MyNode createNode(int position, String data) {
		try {
			MyNode node = new MyNode();
			node.setData(data);
			MyNode previous = getPreviousNode(position);
			if (previous == null)
				node.setPrevious("0");
			else
				node.setPrevious(previous.getNext());

			node.setNext(new CreateHashCode().SHA1(data));
			return node;

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String toString() {
		String rtn = "";
		for (MyNode mn : myNodeDatas) {
			rtn += mn.toString() + "\n";
		}
		return rtn;
	}

	private MyNode createAndModify(int position, String data) {
		MyNode node = myNodeDatas.get(position);
		if (node != null) {
			try {
				node.setData(data);
				MyNode previous = getPreviousNode(position);
				if (previous == null)
					node.setPrevious("0");
				else
					node.setPrevious(previous.getNext());

				node.setNext(new CreateHashCode().SHA1(data));

			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return node;
	}


}
