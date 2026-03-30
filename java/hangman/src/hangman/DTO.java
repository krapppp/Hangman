package hangman;
public class DTO {
//	DTO : db 커넥션 후 내부 로직에 사용될 변수 관련(25/12/29 현재 수준 이해도)
	public String getId(String id) {
		return id;
	}
	public String getPw(String pw) {
		return pw;
	}
	public int getScore(int score) {
		return score;
	}
	public int getTrynum(int trynum) {
		return trynum;
	}
	public String setId(String id) {
		this.id=id;
		return id;
	}
	public String setPw(String pw) {
		this.pw=pw;
		return pw;
	}
	public int setScore(int score) {
		this.score=score;
		return score;
	}
	public int setTrynum(int trynum) {
		this.trynum=trynum;
		return trynum;
	}

}
