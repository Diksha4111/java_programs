package exp_4_inheritance;

public class output {

	public static void main(String[] args) {
		Cricket_Player c= new Cricket_Player("ram",20,"cricket",48);
		Football_Player f =new Football_Player("shyam",20,"football",2);
		Hockey_Player h= new Hockey_Player("shankar",21,"hockey",2);
		c.show();
		f.show();
		h.show();

	}

}
