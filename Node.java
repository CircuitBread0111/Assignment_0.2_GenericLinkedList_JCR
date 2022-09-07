
class Node<T> {
	T data;
	Node<T> nextNode;
	public Node()
	{
		nextNode=null;
		data=null;
	}
	/**
	 * sets the data in the node
	 * @param data given to the node
	 */
	public void setData(T data) {
		this.data=data;
	}
	/**
	 * gets the data from the node
	 * @return the data from the node
	 */
	public Node<T> getNode() {
		return this;
	}
	
	/**
	 * sets the next item in the node
	 * @param nextNode the item to be added in the next node
	 */
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}

