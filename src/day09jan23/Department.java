package day09jan23;

public abstract class Department {
	private StringQueue queue = new StringQueue();

	public StringQueue getQueue() {
		return queue;
	}

	abstract String getName();

	public void addMessage(String msg) {
		queue.enqueue(msg);
	}

	public String nextMessage() {
		String msg = null;
		try {
			msg = queue.dequeue();
		} catch (EmptyQueueException e) {
		}
		return msg;
	}
}
