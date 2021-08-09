package hashmap;
import linkedList.AddNew;

public class MyHashMap<k, v> {
	AddNew<k> addNew;

	public MyHashMap() {
		this.addNew = new AddNew<>();
	}

	public v get(k key) {
		MyMapNode<k,v> myMapNode = (MyMapNode<k,v>) this.addNew.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(k key, v value) {
		 MyMapNode<k,v> myMapNode = (MyMapNode<k,v>) this.addNew.search(key);
		 if(myMapNode == null) {
			 myMapNode = new MyMapNode<>(key, value);
			this.addNew.append(myMapNode);
		 }
		 else
			 myMapNode.setValue(value);
	}
	@Override
	public String toString() {
		return "MyHashNodes{" + addNew + "}";
	}
	
}
