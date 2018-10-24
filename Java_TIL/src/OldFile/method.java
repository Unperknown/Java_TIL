class method {
	static String[] str = { "Rock", "Scissor", "Paper" };
	public int isStat(int p1, int p2){
		if (p1 == p2) return -1;
		else if ((p1 == 1 || p1 == 2) && (p2 == 1 || p2 == 2))
		{
			return p1 == 1 ? 1 : 0;
		}
		else if ((p1 ==  1 || p1 == 3) && (p2 == 1 || p2 == 3))
		{
			return p1 == 1 ? 0 : 1;
		}
		else if ((p1 == 2 || p1 == 3) && (p2 == 2 || p2 == 3))
		{
			return p1 == 2 ? 1 : 0;
		}
		return -2;
	}
	public int isBoard(String tar){
		for (int i = 0; i < 3; i++){
			if (tar.equals(str[i])){
				return i + 1;
			}
		}
		return -1;
	}
	public String WinnerRet(int stat){
		String result;
		switch (stat){
		case -1:
			result = "DRAW";
			break;
		case 0:
			result = "Winner is Player2";
			break;
		case 1:
			result = "Winner is Player1";
			break;
		default:
			result = "ERROR!";
		}
		return result;
	}
}