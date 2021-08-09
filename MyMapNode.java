package hashmap;
import linkedList.INode;

public class MyMapNode<k,v> implements INode<k>{
	
	k key;
	v value;
	MyMapNode<k,v> next;
	
	public MyMapNode(k key, v value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	public v getValue() {
		return value;
	}

	public void setValue(v value) {
		this.value = value;
	}

	@Override
	public k getKey() {
		return key;
	}

	@Override
	public void setKey(k Key) {
		this.key = key;
	}

	@Override
	public INode<k> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<k> next) {
		this.next = (MyMapNode<k,v>) next;
		
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append('}');
		if(next != null)
			myMapNodeString.append("->").append(next.toString());
		return myMapNodeString.toString();
	}
	
}
