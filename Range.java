import java.util.Iterator;

public class Range implements Iterable<Integer>{
	private int start;
	private int end;

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public Iterator<Integer> iterator() {
		return new rangeIterator();
	}

	private class rangeIterator implements Iterator<Integer>{
		private int cursor;

		public rangeIterator() {
			this.cursor = Range.this.start;
		}

		public boolean hasNext() {
			return (this.cursor <= Range.this.end);
		}

		public Integer next() {
			if (this.hasNext()) {
				int current = cursor;
				cursor++;
				return current;
			}
			return null;
		}
	}

	public static void main(String[] args) {
		Range rg = new Range(5, 10);
		Iterator<Integer> ii = rg.iterator();
		System.out.println(ii.hasNext());
	}
}