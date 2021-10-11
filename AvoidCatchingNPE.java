package javacodechecker;

public class AvoidCatchingNPE {
	public void catchNPE() {
		try {

			// EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_NPE
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		try {

			// EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_NPE/no-detect
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		try {

			// EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_NPE
		} catch (ArithmeticException | NullPointerException e) {
			// TODO: handle exception
		}
		try {

			// EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_NPE
		} catch (NullPointerException | ArithmeticException e) {
			// TODO: handle exception
		}
	}

}