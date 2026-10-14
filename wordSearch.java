package tandpwork;
import java.util.*;
public class wordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char board[][]= {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		
		boolean path[][]= {
				{true,true,true,true},
				{true,true,true,true},
				{true,true,true,true}
		};
		String word="ABCCED";
		char s=word.charAt(0);
		int ptr=0;
		boolean found = false;
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(s==board[i][j]){
					if(exist(board, word, 0, path, s, i, j)) {
		                found = true;
		                break;
		            }
				}
			}
			if(found) break;
		}
		System.out.println(found);
		
		

	}
	
	static boolean exist(char maze[][], String wrd, int p, boolean track[][], char f, int r, int c) {
        
		// boundary + visited + mismatch check
		
	    if (track[r][c] == false || maze[r][c] != wrd.charAt(p)) {
	        return false;
	    }

	    // base case
	    if (p == wrd.length() - 1) {
	        return true;
	    }

	    // mark visited
	    track[r][c] = false;

	    boolean down = false;
	    boolean right = false;
	    boolean up = false;
	    boolean left = false;

	    // down
	    if (r < maze.length - 1) {
	        down = exist(maze, wrd, p + 1, track, f, r + 1, c);
	    }

	    // right
	    if (c < maze[0].length - 1) {
	        right = exist(maze, wrd, p + 1, track, f, r, c + 1);
	    }

	    // up
	    if (r > 0) {
	        up = exist(maze, wrd, p + 1, track, f, r - 1, c);
	    }

	    // left
	    if (c > 0) {
	        left = exist(maze, wrd, p + 1, track, f, r, c - 1);
	    }

	    // backtrack
	    track[r][c] = true;

	    return down || right || up || left;
	}
}
