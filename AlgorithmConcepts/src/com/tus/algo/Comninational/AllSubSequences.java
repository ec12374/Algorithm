package com.tus.algo.Comninational;

public class AllSubSequences {

	// don not prefer iterative methods we can not generate for loops as per the
	// given length

	//
	public void allSubSequencesRec(char[] in) {

		auxSubSeqRec(0, "", in);
	}

	private void auxSubSeqRec(int d, String prefix, char[] in) {
		if (d == in.length) {
			System.out.println(prefix);
			return;
		}

		auxSubSeqRec(d + 1, prefix, in);
		auxSubSeqRec(d + 1, prefix + in[d], in);

	}

	public void allSubSequencesRec2(char[] in) {
		auxSubSeqRec2(0, "", in);
	}

	private void auxSubSeqRec2(int d, String prefix, char[] in) {

		if (d == in.length) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i < 2; i++) {
			auxSubSeqRec2(d + 1, (i == 0) ? prefix : (prefix + in[d]), in);
		}
	}

	public static void main(String[] args) {

		AllSubSequences alsq = new AllSubSequences();
		// char[] in = { 'a', 'b', 'c' };
		char[] in = args[0].toCharArray();
		alsq.allSubSequencesRec(in);

	}

}
