
public class Manacher {

	public static char[] transformer(String inp){
		char [] res = new char[inp.length() * 2 + 2];
		res[0] = '$';
		res[1] = '#';
		
		for (int i = 0; i < inp.length(); ++i){
			res[2 * (i + 1)] = inp.charAt(i);
			res[2 * (i + 1) + 1] = '#';
		}
		return res;
	}
	
	public static int getLongestPalidrome(String inp){
		int mx = 0;
		int id = 0;
		char [] chain= transformer(inp);
		int [] p = new int [chain.length];
		for (int i = 0; i < p.length; ++i){
			p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;
			while(i + p[i] < chain.length && 
					i - p[i] >= 0 &&
					chain[i + p[i]] == chain[i - p[i]]){
				p[i] ++;
			}
			if ( i + p[i] > mx){
				mx = i + p[i];
				id = i;
			}
		}
		mx = 0;
		for (int i : p){
			mx = Math.max(mx, i - 1);
		}
		return mx;
	}
}
