package chap05;
import java.util.*;

class Deal {
	public static void main(String args[]) {
		int numHands = Integer.parseInt(args[0]);
		int cardsPerHand = Integer.parseInt(args[1]);

		// ����һ���ƣ���52���ƣ���
		String[] suit = new String[] { "spades", "hearts", "diamonds", "clubs" };
		String[] rank = new String[] { "A", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "J", "Q", "K" };
		List<String> deck = new ArrayList<String>();
		for (String ss : suit)
			for (String sr : rank)
				deck.add(ss + "_" + sr);

		Collections.shuffle(deck); // ����ı�deck��Ԫ�ص����д��򣬼�ϴ�ơ�

		for (int i = 0; i < numHands; i++)
			System.out.println(dealHand(deck, cardsPerHand)); // ����һ���Ʋ����������
	}

	public static List<String> dealHand(List<String> deck, int n) {
		int deckSize = deck.size();
		List<String> handView = deck.subList(deckSize - n, deckSize); // ��deck�н�ȡһ��������
		List<String> hand = new ArrayList<String>(handView); // ���ø���������һ������
		handView.clear(); // ����������ա�
		return hand;
	}
}
