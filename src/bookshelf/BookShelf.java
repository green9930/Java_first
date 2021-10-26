package bookshelf;

public class BookShelf extends Shelf implements Queue	{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 배열의 첫 번째 요소 제거하고 그 값을 반환
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
