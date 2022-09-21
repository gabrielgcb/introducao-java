
class Queue {
	char[] q;
	int i_putloc, i_getloc;

	Queue(int size) {
		q = new char[size];
		i_putloc = i_getloc = 0;
	}

	void put(char ch) {
		if(i_putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}

		q[i_putloc++] = ch;
	}

	char get() {
		if(i_getloc == i_putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}

		return q[i_getloc++];
	}

}
